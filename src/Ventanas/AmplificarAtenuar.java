/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JFrame;
import paquete.JFrameVentana;
import paquete.OperacionesBasicas;
import paquete.ReadSound;

/**
 *
 * @author csb
 */
public class AmplificarAtenuar extends javax.swing.JFrame {

    OperacionesBasicas ob = new OperacionesBasicas(); //tiempoGrabacion = rcs.
    public double[] datan = null;
    public double[] data = null;
    ReadSound rds;

    public AmplificarAtenuar(double[] data) {
        initComponents();
        this.setVisible(true);
        this.data = data;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        reproducirEntrada = new javax.swing.JButton();
        reproducirSalida = new javax.swing.JButton();
        reproducirSalida1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        amplificarK = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        atenuarK = new javax.swing.JTextField();
        amplificarSonido = new javax.swing.JButton();
        atenuarSonido = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setTitle("Amplificación/Atenuación");
        setFocusCycleRoot(false);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));

        jPanel1.setBackground(new java.awt.Color(48, 63, 159));
        jPanel1.setPreferredSize(new java.awt.Dimension(683, 320));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Amplificación/Atenuación");

        jPanel2.setBackground(new java.awt.Color(48, 63, 159));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reproducirEntrada.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        reproducirEntrada.setText("Reproducir Entrada");
        reproducirEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproducirEntradaActionPerformed(evt);
            }
        });

        reproducirSalida.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        reproducirSalida.setText("Reproducir Salida");
        reproducirSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproducirSalidaActionPerformed(evt);
            }
        });

        reproducirSalida1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        reproducirSalida1.setText("Gráficar");
        reproducirSalida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproducirSalida1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reproducirEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(reproducirSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(reproducirSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reproducirEntrada)
                    .addComponent(reproducirSalida)
                    .addComponent(reproducirSalida1))
                .addGap(40, 40, 40))
        );

        jPanel3.setBackground(new java.awt.Color(48, 63, 159));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("K =");

        amplificarK.setText("5");
        amplificarK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amplificarKActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("K =");

        atenuarK.setText("5");
        atenuarK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenuarKActionPerformed(evt);
            }
        });

        amplificarSonido.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        amplificarSonido.setText("Amplificarlo");
        amplificarSonido.setName("amplificarBoton"); // NOI18N
        amplificarSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amplificarSonidoActionPerformed(evt);
            }
        });

        atenuarSonido.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        atenuarSonido.setText("Atenuarlo");
        atenuarSonido.setName("atenuarBoton"); // NOI18N
        atenuarSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenuarSonidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amplificarK, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(amplificarSonido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atenuarK, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(atenuarSonido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(amplificarK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(atenuarK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amplificarSonido)
                    .addComponent(atenuarSonido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(146, 146, 146))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amplificarSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amplificarSonidoActionPerformed
        int k = Integer.parseInt(amplificarK.getText());
        datan = ob.amplificacion(data, k);
        if (datan == null) {
            System.out.println("PARA REPRODUCIR TIENES QUE REALIZAR UNA OPERACION");
        } else {
            rds.play("NuevaGrabacion.wav");
        }
    }//GEN-LAST:event_amplificarSonidoActionPerformed

    private void atenuarSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenuarSonidoActionPerformed
        int k = Integer.parseInt(atenuarK.getText());
        datan = ob.atenuacion(data, k);
        if (datan == null) {
            System.out.println("PARA REPRODUCIR TIENES QUE REALIZAR UNA OPERACION");
        } else {
            rds.play("NuevaGrabacion.wav");
        }        
    }//GEN-LAST:event_atenuarSonidoActionPerformed

    private void amplificarKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amplificarKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amplificarKActionPerformed

    private void atenuarKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenuarKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atenuarKActionPerformed

    private void reproducirEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproducirEntradaActionPerformed
        rds.play("Grabacion.wav");
    }//GEN-LAST:event_reproducirEntradaActionPerformed

    private void reproducirSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproducirSalidaActionPerformed
        if (datan == null) {
            System.out.println("PARA REPRODUCIR TIENES QUE REALIZAR UNA OPERACION");
        } else {
            rds.play("NuevaGrabacion.wav");
        }
    }//GEN-LAST:event_reproducirSalidaActionPerformed

    private void reproducirSalida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproducirSalida1ActionPerformed
        JFrameVentana newv = new JFrameVentana();
        newv.setVisible(true);
    }//GEN-LAST:event_reproducirSalida1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amplificarK;
    private javax.swing.JButton amplificarSonido;
    private javax.swing.JTextField atenuarK;
    private javax.swing.JButton atenuarSonido;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton reproducirEntrada;
    private javax.swing.JButton reproducirSalida;
    private javax.swing.JButton reproducirSalida1;
    // End of variables declaration//GEN-END:variables
}
