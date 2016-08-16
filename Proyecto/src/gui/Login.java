/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.Base;
import clases.Reloj;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.InputMap;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author feli
 */
public class Login extends javax.swing.JFrame{

    private Base db;
    Thread timer = null;
    String dateToDisplay;
    int hr; 
    	Date d; 
    	JLabel datetoDisplay=new JLabel();	 
    	int hour; 
    	 int minute; 
    	 int second; 
    	 String amPm="AM";

    /**
     * Creates new form Login
     */
    public Login(Base db) {
        initComponents();
        this.db = db;
        this.btnVerificar.setFocusPainted(true);
        InputMap map = new InputMap();
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        btnVerificar.setInputMap(0, map);
        Reloj reloj = new Reloj();
        Date d = new Date();
        lbl1.setText(reloj.getFormatedDate(d));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txbVerificar = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        lblHoraActual = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Log in");

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/feli/Escritorio/SI/Proyecto/Proyecto/src/Images/madera4.jpg")); // NOI18N

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        btnVerificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVerificarKeyPressed(evt);
            }
        });

        btnatras.setText("Atrás");
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        lblHoraActual.setText("Hora Actual: ");

        lbl1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txbVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHoradeEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHoraActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbl1)
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnatras))))
>>>>>>> c2ec1c22581ab1549a4d80b6e3608fb9f0b2143a
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txbVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnVerificar)
<<<<<<< HEAD
                .addGap(18, 18, 18)
                .addComponent(lblHoradeEntrada)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblHoraActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl1)
                        .addGap(5, 5, 5)))
=======
                .addGap(31, 31, 31)
                .addComponent(lblHoraActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
>>>>>>> c2ec1c22581ab1549a4d80b6e3608fb9f0b2143a
                .addComponent(btnatras)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        String Numero_a_verificar = txbVerificar.getText();
        String empleadoLog = this.db.entrar(Numero_a_verificar)[0];
        String empleado_tiempo = this.db.entrar(Numero_a_verificar)[1];
        if (empleadoLog == (null)) {
            JOptionPane.showMessageDialog(this, "No hay empleados cargados", "Empleado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, empleadoLog, "Empleado", JOptionPane.INFORMATION_MESSAGE);
            if (empleado_tiempo == (null)) {

            } else {
                JOptionPane.showMessageDialog(this, empleado_tiempo, "Horario", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnVerificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVerificarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarKeyPressed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        dispose();
    }//GEN-LAST:event_btnatrasActionPerformed

    /**
     * @param args the command line arguments
     */
    
     
    	 
     
    	 
     
    	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton btnatras;
<<<<<<< HEAD
    private javax.swing.JLabel lbl1;
=======
    private javax.swing.JLabel jLabel1;
>>>>>>> c2ec1c22581ab1549a4d80b6e3608fb9f0b2143a
    private javax.swing.JLabel lblHoraActual;
    private javax.swing.JTextField txbVerificar;
    // End of variables declaration//GEN-END:variables
}
