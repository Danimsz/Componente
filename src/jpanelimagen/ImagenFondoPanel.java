/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jpanelimagen;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Dani
 */
public class ImagenFondoPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImagenFondoPanel
     */
    public ImagenFondoPanel() {
        initComponents();
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
        jButtonAbrirRuta = new javax.swing.JButton();
        jTextFieldRuta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSliderOpacidad = new javax.swing.JSlider();

        jLabel1.setText("Imagen:");

        jButtonAbrirRuta.setText("...");
        jButtonAbrirRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirRutaActionPerformed(evt);
            }
        });

        jTextFieldRuta.setEditable(false);
        jTextFieldRuta.setText("jTextField1");
        jTextFieldRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRutaActionPerformed(evt);
            }
        });

        jLabel2.setText("Opacidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSliderOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAbrirRuta)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAbrirRuta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSliderOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRutaActionPerformed

    private void jButtonAbrirRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirRutaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION)
        {
            File file = fileChooser.getSelectedFile();
            jTextFieldRuta.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_jButtonAbrirRutaActionPerformed

    public ImagenFondo getSelectedValue()
    {
        File f = new File(jTextFieldRuta.getText());
        Float opacidad = jSliderOpacidad.getValue()/100f;
        return new ImagenFondo(f, opacidad);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSliderOpacidad;
    private javax.swing.JTextField jTextFieldRuta;
    // End of variables declaration//GEN-END:variables
}
