/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.Empleado;
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

        jFileChooser1 = new javax.swing.JFileChooser();
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
        txbHora = new javax.swing.JTextField();
        txbMin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargar Empleado");

        lblNombre.setText("Nombre:");

        lblApellido.setText("Apellido:");

        lblEdad.setText("Edad:");

        lblDireccion.setText("Dirección:");

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

        lblSalario.setText("Salario ($):");

        txbEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbEmailActionPerformed(evt);
            }
        });

        jLabel1.setText("Hora de entrada:");

        txbHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbHoraActionPerformed(evt);
            }
        });

        txbMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbMinActionPerformed(evt);
            }
        });

        jLabel2.setText(" : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(txbNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnCancelar)
                        .addGap(44, 44, 44)
                        .addComponent(btnGuardar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addComponent(txbMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addContainerGap())
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
        String edad = txbEdad.getText();
        String email = txbEmail.getText();
        String direccion = txbDireccion.getText();
        String salario = txbSalario.getText();
        int numRandom = (int) Math.floor(Math.random() * (000000000 - 999999999) + 999999999);
        String codigo = numRandom + "";

        if (nombre.equals("") || (apellido.equals("") || direccion.equals("") || (email.equals("") || (salario.equals(""))))) {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios");
        } else {
            Empleado auxEmpleado = new Empleado(nombre, apellido, direccion, edad, email, salario, codigo);
            try {
                float b = Float.parseFloat(salario);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ERROR - Salario no es un numero válido");
                errores += "1";
                txbSalario.setText("");
            }
            try {
                float c = Integer.parseInt(edad);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ERROR - Edad no es un numero válido");
                errores += "2";
                txbEdad.setText("");

            }
            if (errores.length() > 0) {

            } else {
                boolean a = this.db.guardar(auxEmpleado.getCodigo(), auxEmpleado.getNombre(), auxEmpleado.getApellido(), auxEmpleado.getEdad(), auxEmpleado.getEmail(), auxEmpleado.getDireccion(), auxEmpleado.getSalario());
                txbNombre.setText("");
                txbApellido.setText("");
                txbEdad.setText("");
                txbEmail.setText("");
                txbDireccion.setText("");
                txbSalario.setText("");

                if (a) {
                    try {
                        this.barrita.CreateBarcode(codigo, nombre, apellido);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(this, "ERROR AL CREAR CODIGO");
                    }
                    JOptionPane.showMessageDialog(this, "Empleado cargado con exito");
                    
                }else {
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

    private void txbHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbHoraActionPerformed

    private void txbMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbMinActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField txbApellido;
    private javax.swing.JTextField txbDireccion;
    private javax.swing.JTextField txbEdad;
    private javax.swing.JTextField txbEmail;
    private javax.swing.JTextField txbHora;
    private javax.swing.JTextField txbMin;
    private javax.swing.JTextField txbNombre;
    private javax.swing.JTextField txbSalario;
    // End of variables declaration//GEN-END:variables
}
