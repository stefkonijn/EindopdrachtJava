package client;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import webshop.java.client.ArrayOfProduct;
import webshop.java.client.Customer;
import webshop.java.client.IService1;
import webshop.java.client.Order;
import webshop.java.client.Product;
import webshop.java.client.Service1;

public class Store extends JFrame {

	int customer_id = 0;
	
	Service1 service = new Service1();
	IService1 server = service.getBasicHttpBindingIService1();
	
	Customer cust;
	
	public Store(Integer customer_id) {

		JFrame f = new JFrame("Store");
		this.customer_id = customer_id;

		JPanel upperPanel = new JPanel();
		JPanel buttons = new JPanel();

		f.getContentPane().add(upperPanel, "North");
		f.getContentPane().add(buttons, "South");

//		Combobox met alle producten
		JComboBox<Product> store = new JComboBox<>();
		getProducts(store);

//		Textarea met de inventory van de klant
		JTextArea inv = new JTextArea("", 6, 10);
		JScrollPane scroll = new JScrollPane(inv);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		cust = server.getCustomerById(customer_id);

		getOrders(inv, cust);

		upperPanel.add(scroll);
		upperPanel.add(store);
		
//		Tekstarea voor het huidige buget
		JTextArea mon = new JTextArea();
		getSaldo(mon, cust);
		buttons.add(mon);
		
//		Butten voor het kopen
		JButton buy = new JButton("buy");
		buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Product p = (Product) store.getSelectedItem();
//				Check of er genoeg saldo is
				if(cust.getSaldo() > p.getPrice()) {
					server.buy(p.getId(), customer_id);
				}
				else {
					JOptionPane.showMessageDialog(f, "Je hebt te weinig saldo");
				}
				inv.setText("");
				getOrders(inv, cust);
			}
		});

		buttons.add(buy);

//		Button voor het refreshen, alles wordt opnieuw opgehaald
		JButton refresh = new JButton("refresh");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				inv.setText("");
				store.removeAllItems();
				mon.setText("");
				cust = server.getCustomerById(customer_id);
				getSaldo(mon, cust);
				getOrders(inv, cust);
				getProducts(store);
			}
		});

		buttons.add(refresh);

		f.pack();
		f.setVisible(true);
	}
	

//	Alle orders van een klant worden opgehaald en neergezet in de juiste textarea
	public void getOrders(JTextArea inv, Customer cust) {
		for (Order o : server.getAllOrdersByCustomer(cust.getId()).getOrder()) {
			for (Product p : server.getAllProducts().getProduct()) {
				if (o.getProductId() == p.getId() && o.getCustomerId() == cust.getId()) {
					inv.append(p.getName().getValue() + "\n");
				}
			}
		}
	}

//	Alle producten worden opgehaald en in de juiste combobox gezet
	public void getProducts(JComboBox<Product> store) {
		for (Product item : server.getAllProducts().getProduct()) {
			if (item.getStock() > 0){
			store.addItem(item);}
		}
	}
	
//	Het huidige saldo wordt opgehaald en in de juiste textarea gezet
	public void getSaldo(JTextArea mon, Customer cust) {
		
	    mon.setText("Huidige budget €");
	    mon.append(cust.getSaldo().toString());
	    mon.setEditable(false);
	    mon.setBackground(getBackground());	

	}

}