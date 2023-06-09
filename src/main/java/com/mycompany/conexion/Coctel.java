/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conexion;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList; /**
 *
 * @author noelia
 */

public class Coctel extends javax.swing.JFrame {
	public Conexion con;
	public String nombreCoctel;
	/**
 	* Creates new form Login
 	*/
	public Coctel() {
    	initComponents();
    	Conexion conexion = new Conexion();
    	conexion.establecerConexion();
    	con=conexion;
    	setLocationRelativeTo(null);
	}

	/**
 	* This method is called from within the constructor to initialize the form.
 	* WARNING: Do NOT modify this code. The content of this method is always
 	* regenerated by the Form Editor.
 	*/
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                     	 
	private void initComponents() {

    	jPanel1 = new javax.swing.JPanel();
    	jLabel1 = new javax.swing.JLabel();
    	jLabel2 = new javax.swing.JLabel();
    	jTextField1 = new javax.swing.JTextField();
    	Aceptar = new javax.swing.JButton();
    	jButton2 = new javax.swing.JButton();
    	jTextField2 = new javax.swing.JTextField();

    	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    	jPanel1.setBackground(new java.awt.Color(102, 102, 102));

    	jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
    	jLabel1.setText("COCTEL");

    	jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
    	jLabel2.setText("NOMBRE DEL COCTEL");

    	jTextField1.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
    	jTextField1.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jTextField1ActionPerformed(evt);
        	}
    	});

    	Aceptar.setBackground(new java.awt.Color(204, 204, 204));
    	Aceptar.setText("ACEPTAR");
    	Aceptar.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
            	AceptarActionPerformed(evt);
        	}
    	});

    	jButton2.setBackground(new java.awt.Color(204, 204, 204));
    	jButton2.setText("CANCELAR");
    	jButton2.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton2ActionPerformed(evt);
        	}
    	});

    	jTextField2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
    	jTextField2.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jTextField2ActionPerformed(evt);
        	}
    	});

    	javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    	jPanel1.setLayout(jPanel1Layout);
    	jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(jPanel1Layout.createSequentialGroup()
            	.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                	.addGroup(jPanel1Layout.createSequentialGroup()
                    	.addGap(135, 135, 135)
                    	.addComponent(Aceptar)
                    	.addGap(18, 18, 18)
                    	.addComponent(jButton2))
                	.addGroup(jPanel1Layout.createSequentialGroup()
                    	.addGap(179, 179, 179)
                    	.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                	.addGroup(jPanel1Layout.createSequentialGroup()
                    	.addGap(165, 165, 165)
                    	.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        	.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        	.addComponent(jLabel2))))
            	.addContainerGap(194, Short.MAX_VALUE))
        	.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            	.addGroup(jPanel1Layout.createSequentialGroup()
                	.addGap(161, 161, 161)
                	.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addContainerGap(198, Short.MAX_VALUE)))
    	);
    	jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(jPanel1Layout.createSequentialGroup()
            	.addContainerGap()
            	.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            	.addGap(39, 39, 39)
            	.addComponent(jLabel2)
            	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
            	.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            	.addGap(55, 55, 55)
            	.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                	.addComponent(Aceptar)
                	.addComponent(jButton2))
            	.addGap(27, 27, 27))
        	.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            	.addGroup(jPanel1Layout.createSequentialGroup()
                	.addGap(137, 137, 137)
                	.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addContainerGap(160, Short.MAX_VALUE)))
    	);

    	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    	getContentPane().setLayout(layout);
    	layout.setHorizontalGroup(
        	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            	.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            	.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            	.addContainerGap())
    	);
    	layout.setVerticalGroup(
        	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            	.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            	.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            	.addContainerGap())
    	);

    	pack();
	}// </editor-fold>                   	 

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                    	 
    	// TODO add your handling code here:
   	 
    	int respuesta=JOptionPane.showConfirmDialog(this, "desea salir");
    	if(respuesta==JOptionPane.YES_OPTION){
        	System.exit(0);
    	}
	}                                   	 

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                       	 
    	// TODO add your handling code here:
	}                                      	 

	private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {                                   	 
    	if(jTextField1.getText().isEmpty()){
        	JOptionPane.showMessageDialog(null, "falta algun dato");
    	}else{
        	nombreCoctel=jTextField1.getText();
        	String equivale = jTextField2.getText();
        	String query="insert into coctel values('"+equivale+"','"+nombreCoctel+"');";
        	try {
            	PreparedStatement ps=con.getConexion().prepareStatement(query);
            	ps.execute();
            	ps.close();
            	jTextField1.setText("");
            	JOptionPane.showMessageDialog(null, "se inserto correctamente");
        	} catch (Exception e) {
            	System.out.println(e);
            	JOptionPane.showMessageDialog(null, "ese coctel ya existe");

        	}

       	 
    	}
	}                                  	 

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                       	 
    	// TODO add your handling code here:
	}                                      	 

    
	/**
 	* @param args the command line arguments
 	*/
	public static void main(String args[]) {
    	/* Set the Nimbus look and feel */
    	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     	* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     	*/
    	try {
        	for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            	if ("Nimbus".equals(info.getName())) {
                	javax.swing.UIManager.setLookAndFeel(info.getClassName());
                	break;
            	}
        	}
    	} catch (ClassNotFoundException ex) {
        	java.util.logging.Logger.getLogger(Coctel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    	} catch (InstantiationException ex) {
        	java.util.logging.Logger.getLogger(Coctel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    	} catch (IllegalAccessException ex) {
        	java.util.logging.Logger.getLogger(Coctel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	java.util.logging.Logger.getLogger(Coctel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    	}
    	//</editor-fold>
    	//</editor-fold>
    	//</editor-fold>
    	//</editor-fold>

    	/* Create and display the form */
    	java.awt.EventQueue.invokeLater(new Runnable() {
        	public void run() {
            	new Coctel().setVisible(true);
        	}
    	});
	}

	// Variables declaration - do not modify                	 
	private javax.swing.JButton Aceptar;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration              	 
}
