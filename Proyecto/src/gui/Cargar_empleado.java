/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.Empleado;
import clases.Horario;
import clases.Asistencia;
import clases.Base;
import clases.Barras;
import java.io.IOException;
import java.math.*;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author feli
 */
public class Cargar_empleado extends javax.swing.JFrame {

    private Base db;
    private Barras barrita;

    /**
     * Creates new form Cargar_empleado
     */
    public Cargar_empleado(Base db, Barras barrita) {
        initComponents();
        this.db = db;
        this.barrita = barrita;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txbNombre = new javax.swing.JTextField();
        txbApellido = new javax.swing.JTextField();
        txbEdad = new javax.swing.JTextField();
        txbDireccion = new javax.swing.JTextField();
        txbSalario = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblSalario = new javax.swing.JLabel();
        txbEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnHoraS = new javax.swing.JSpinner();
        spnMinS = new javax.swing.JSpinner();
        spnHoraE = new javax.swing.JSpinner();
        spnMinE = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargar Empleado");
        setResizable(false);

        lblNombre.setForeground(new java.awt.Color(254, 254, 254));
        lblNombre.setText("Nombre:");

        lblApellido.setForeground(new java.awt.Color(254, 254, 254));
        lblApellido.setText("Apellido:");

        lblEdad.setForeground(new java.awt.Color(254, 254, 254));
        lblEdad.setText("Edad:");

        lblDireccion.setForeground(new java.awt.Color(254, 254, 254));
        lblDireccion.setText("Dirección:");

        lblEmail.setForeground(new java.awt.Color(254, 254, 254));
        lblEmail.setText("Email:");

        txbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbNombreActionPerformed(evt);
            }
        });

        txbApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbApellidoActionPerformed(evt);
            }
        });

        txbSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbSalarioActionPerformed(evt);
            }
        });

        btnCancelar.setText("Atrás");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar persona");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblSalario.setForeground(new java.awt.Color(254, 254, 254));
        lblSalario.setText("Salario ($):");

        txbEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbEmailActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Hora de entrada:");

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText(" : ");

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Hora salida:");

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText(" : ");

        spnHoraS.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        spnMinS.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnMinS.setToolTipText("");

        spnHoraE.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        spnHoraE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnHoraEMouseClicked(evt);
            }
        });

        spnMinE.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnMinE.setToolTipText("");

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FONDO.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spnHoraE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(spnMinE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txbSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spnHoraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(spnMinS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(51, 51, 51)
                        .addComponent(btnGuardar)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 435, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(txbSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(spnHoraE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMinE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(spnHoraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMinS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(48, 48, 48))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 465, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txbApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbApellidoActionPerformed

    private void txbSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbSalarioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String errores = "";
        String nombre = txbNombre.getText();
        String apellido = txbApellido.getText();
        
        //String edad = txbEdad.getText();
        String email = txbEmail.getText();
        String direccion = txbDireccion.getText();
        String salario = txbSalario.getText();
        int hora_entrada = Integer.parseInt("" + spnHoraE.getValue());
        int min_entrada = Integer.parseInt("" + spnMinE.getValue());
        int hora_salida = Integer.parseInt("" + spnHoraS.getValue());
        int min_salida = Integer.parseInt("" + spnMinS.getValue());

        int numRandom = (int) Math.floor(Math.random() * (000000000 - 999999999) + 999999999);
        String codigo = numRandom + "";

        if (nombre.equals("") || (apellido.equals("") || direccion.equals("") || (email.equals("") || (salario.equals(""))))) {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios");
        } else {

            try {
                float b = Float.parseFloat(salario);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ERROR - Salario no es un numero válido");
                errores += "1";
                txbSalario.setText("");
            }
            try {
                int c = Integer.parseInt(txbEdad.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ERROR - Edad no es un numero válido");
                errores += "2";
                txbEdad.setText("");

            }
            int edad = Integer.parseInt(txbEdad.getText());
            
            if (errores.length() > 0) {

            } else {
                Empleado auxEmpleado = new Empleado(nombre, apellido, direccion, edad, email, salario, codigo, 0);
                Horario auxHorario = new Horario(hora_entrada, min_entrada, hora_salida, min_salida);
                
                boolean a = this.db.guardar(auxEmpleado, auxHorario);

                txbNombre.setText("");
                txbApellido.setText("");
                txbEdad.setText("");
                txbEmail.setText("");
                txbDireccion.setText("");
                txbSalario.setText("");
                spnHoraE.setValue(0);
                spnMinE.setValue(0);
                spnHoraS.setValue(0);
                spnMinS.setValue(0);

                if (a) {
                    try {
                        this.barrita.CreateBarcode(codigo, nombre, apellido);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(this, "ERROR AL CREAR CODIGO");
                    }
                    JOptionPane.showMessageDialog(this, "Empleado cargado con exito");
                    Codigobarra codebarr = new Codigobarra(nombre, apellido);
                    codebarr.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "ERROR AL CARGAR EMPLEADO");
                }
            }
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbNombreActionPerformed

    private void txbEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbEmailActionPerformed

    private void spnHoraEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnHoraEMouseClicked
        if (spnHoraE.getValue().equals(23)) {
            spnHoraE.setValue(0);
        }
    }//GEN-LAST:event_spnHoraEMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JSpinner spnHoraE;
    private javax.swing.JSpinner spnHoraS;
    private javax.swing.JSpinner spnMinE;
    private javax.swing.JSpinner spnMinS;
    private javax.swing.JTextField txbApellido;
    private javax.swing.JTextField txbDireccion;
    private javax.swing.JTextField txbEdad;
    private javax.swing.JTextField txbEmail;
    private javax.swing.JTextField txbNombre;
    private javax.swing.JTextField txbSalario;
    // End of variables declaration//GEN-END:variables
}
