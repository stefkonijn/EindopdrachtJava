package client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import webshop.java.client.IService1;
import webshop.java.client.Service1;

public class Inlog extends JFrame {
    private JTabbedPane pane;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton panel1button;
    private JButton panel2button;
    private JButton panel3button;
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
   
    public Inlog() {
        super("JTabbedpane Demo");
        pane = new JTabbedPane();
        add(pane);
        panel1 = new JPanel();
        label1 = new JLabel("Username");
        field1 = new JTextField(22);
        label3 = new JLabel("Password");
        field3 = new JTextField(22);

//        De button voor het inloggen
        panel1button = new JButton("Login");
        panel1button.addActionListener(
                new ActionListener () {
                    public void actionPerformed(ActionEvent event) {
                    	
                    	Service1 service = new Service1();
                		IService1 server = service.getBasicHttpBindingIService1();
                		
//                		Gekeken naar het id van de klant, als het 0 is kloppen de gegevens niet
                		if (server.inloggen(field1.getText(), field3.getText()) > 0){
//                			De store wordt geopent
                				Store store = new Store(server.inloggen(field1.getText(), field3.getText()));
                				dispose();
                		}
                		
                		else {
                            JOptionPane.showMessageDialog(null, "Uw gegevens kloppen niet");
                		}
                    }
                }               
                );
        
        panel1.add(label1, BorderLayout.NORTH);
        panel1.add(field1, BorderLayout.CENTER);
        panel1.add(label3, BorderLayout.SOUTH);
        panel1.add(field3, BorderLayout.CENTER);
        panel1.add(panel1button, BorderLayout.SOUTH);
        pane.addTab("login", panel1);
        
        
        panel2 = new JPanel();
        label2 = new JLabel("Username");
        field2 = new JTextField(22);

//        Button voor het registreren
        panel2button = new JButton("Registreer");
        panel2button.addActionListener(
                new ActionListener () {
                    public void actionPerformed(ActionEvent event) {
                    	
                    	Service1 service = new Service1();
                		IService1 server = service.getBasicHttpBindingIService1();
                		
                		
                        JOptionPane.showMessageDialog(null, "Pass is " + server.registreren(field2.getText()));
                    }
                }               
                );
        
        
        panel2.add(label2, BorderLayout.NORTH);
        panel2.add(field2, BorderLayout.CENTER);
        panel2.add(panel2button, BorderLayout.SOUTH);
        pane.addTab("registreren", panel2);
        
 
    }
}