/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.ipc1;

import com.sun.media.jfxmedia.logging.Logger;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.HashSet;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

/**
 *
 * @author BRAYAN
 */
public class JFEDITOR extends javax.swing.JFrame {
    JFENTRADABIBLIOTECA datospermanentes;
    JFBIBLIOTECA datoscategoria;
    ACCIONES_A_EJECUTAR anterior;
    byte[] matrizimageninicial = new byte[10024*1000];
    CONTROLADORDEIMAGENES imagenes = new CONTROLADORDEIMAGENES();
    FUNCIONESDEIMAGENES arrarstrar = new FUNCIONESDEIMAGENES();
    /**
     * Creates new form JFEDITOR
     */
    public JFEDITOR(ACCIONES_A_EJECUTAR anterior) {
        this.anterior = anterior;
        anterior.setVisible(false);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent ant){
                anterior.setVisible(true);
            }
        });
        setVisible(true);
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

        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLBIMAGEN = new javax.swing.JLabel();
        JLBRUTAIMAGEN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JLBLIMAGENALTERADA = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setTitle("Editor de Imagenes");

        jButton6.setText("SELECCIONAR IMAGEN ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        JLBIMAGEN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(JLBIMAGEN);

        JLBRUTAIMAGEN.setBackground(new java.awt.Color(240, 240, 80));

        jLabel2.setText("Imagen original");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("Imagen Alterada");

        JLBLIMAGENALTERADA.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jScrollPane2.setViewportView(JLBLIMAGENALTERADA);

        jMenu1.setText("Acciones a Realizar");

        jMenuItem1.setText("Convertir de jpg a bmp");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Copia jpg");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Escala de Grises");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("rotar imagen");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Sepia");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(295, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBRUTAIMAGEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBRUTAIMAGEN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        matrizimageninicial = imagenes.abririmagen();
        JLBIMAGEN.setIcon(new ImageIcon(imagenes.getImagenoriginal().getScaledInstance(JLBIMAGEN.getWidth(), JLBIMAGEN.getHeight(), Image.SCALE_DEFAULT)));
        JLBRUTAIMAGEN.setText(imagenes.getDireccion());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (imagenes.getImagenelegida().getName().endsWith("jpg")) {
            arrarstrar.convertirImagenbmp(imagenes.getImagenelegida(), matrizimageninicial);
        }else if (imagenes.getImagenelegida().getName().endsWith("bmp")) {
            arrarstrar.convertirImagenjpg(imagenes.getImagenelegida(), matrizimageninicial);
        }
{
            
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        matrizimageninicial = imagenes.getBytesImg();
        JOptionPane.showMessageDialog(null, imagenes.copiaImagenjpg(imagenes.getImagenelegida(), matrizimageninicial));
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        String nombre = imagenes.getImagenelegida().getName();
        nombre = "grises-"+nombre.replace(".jpg", "")+".jpg";
        imagenes.imagensalida = new File(nombre);
        imagenes.obteberRGB();
        imagenes.crearimagen(imagenes.getGris(),imagenes.getAncho() ,imagenes.getAltura());
        JLBLIMAGENALTERADA.setIcon(new ImageIcon(imagenes.getImagentrabajada().getScaledInstance(JLBLIMAGENALTERADA.getWidth(), JLBLIMAGENALTERADA.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String nombre=imagenes.getImagensalida().getName();
        nombre = "rotation-"+nombre.replace(".jpg", "")+".jpg";
        imagenes.imagensalida = new File(nombre);
        imagenes.rotate90(imagenes.getImagenelegida(), imagenes.imagensalida, imagenes.RORATE_90);
        matrizimageninicial= arrarstrar.abrirImagen(imagenes.imagensalida);
        ImageIcon trasladar = new ImageIcon(matrizimageninicial);
        Icon servidor = new ImageIcon(trasladar.getImage().getScaledInstance(JLBLIMAGENALTERADA.getWidth(), JLBLIMAGENALTERADA.getHeight(), Image.SCALE_DEFAULT));
        JLBLIMAGENALTERADA.setIcon(servidor);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        imagenes.obteberRGBsepia();
        JLBLIMAGENALTERADA.setIcon(new ImageIcon(imagenes.getImagentrabajada().getScaledInstance(JLBLIMAGENALTERADA.getWidth(), JLBLIMAGENALTERADA.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel JLBIMAGEN;
    private javax.swing.JLabel JLBLIMAGENALTERADA;
    private javax.swing.JLabel JLBRUTAIMAGEN;
    public javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
