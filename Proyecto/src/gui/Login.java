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
import javax.swing.KeyStroke;

/**
 *
 * @author feli
 */
public class Login extends javax.swing.JFrame {

    private Base db;

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
        lblHoraNow.setText(reloj.getFormatedDate(d));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txbVerificar = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        lblHoradeEntrada = new javax.swing.JLabel();
        lblHoraActual = new javax.swing.JLabel();
        lblHoraNow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Log in");

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

        lblHoradeEntrada.setText("Hora de Entrada: 8:00");

        lblHoraActual.setText("Hora Actual: ");

        lblHoraNow.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txbVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnatras)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHoradeEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHoraActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHoraNow)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txbVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnVerificar)
                .addGap(18, 18, 18)
                .addComponent(lblHoradeEntrada)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraActual)
                    .addComponent(lblHoraNow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnatras)
                .addContainerGap())
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
    private javax.swing.JLabel lblHoraActual;
    private javax.swing.JLabel lblHoraNow;
    private javax.swing.JLabel lblHoradeEntrada;
    private javax.swing.JTextField txbVerificar;
    // End of variables declaration//GEN-END:variables
public void setTimer(String text) {
    lblHoraActual.setText(text);
    }
}
