/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.ipc1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author BRAYAN
 */
public class JFCONVERTIDOR extends javax.swing.JFrame{
    ACCIONES_A_EJECUTAR anterior;
    HILOS paralelo = new HILOS();
    String temporal[], colatemporal[], imagenestemporales[];
    byte[] bytesImg = new byte[1024*100];
    FUNCIONESDEIMAGENES imagen = new FUNCIONESDEIMAGENES();
    CONTROLADORDEIMAGENES imagenes = new CONTROLADORDEIMAGENES();
    private Timer t;
    private ActionListener ac;
    private int x=0;
    LinkedList datos;
    Stack datospila;
    String consola;
    /**
     * Creates new form JFCONVERTIDOR
     */
    public JFCONVERTIDOR(ACCIONES_A_EJECUTAR anterior) {
        this.anterior = anterior;
        anterior.setVisible(false);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent ant){
                anterior.setVisible(true);
            }
        });
        setVisible(true);
        initComponents();
        
        boolean respuesta = anterior.anterior.listadousuario.buscardato(anterior.anterior.valor);
        temporal = new String[anterior.anterior.listadousuario.getCabeza().categoria.contador];
        if (respuesta=true) {
            temporal = anterior.anterior.listadousuario.getCabeza().categoria.mostrarContenido();
                for (int i = 0; i < anterior.anterior.listadousuario.getCabeza().categoria.contador; i++) {
                    JCBCATEGORIA.addItem(temporal[i]);
                    
                }
                imagenestemporales = anterior.anterior.listadousuario.getCabeza().categoria.inicio.imagenes.mostrardatos();
                String imagenesdatos = null;
                for (int i = 0; i < anterior.anterior.listadousuario.getCabeza().categoria.inicio.imagenes.contador; i++) {
                    imagenesdatos = imagenesdatos + "\n" + imagenestemporales[i]+"\n";
                    JTXTImagenes.setText(imagenesdatos.replace("null", ""));
               }
            }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JCBCATEGORIA = new javax.swing.JComboBox<>();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTXTCONSOLA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTXTImagenes = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JRBCONVERTIR = new javax.swing.JRadioButton();
        JRBCOPIA = new javax.swing.JRadioButton();
        JRBROTAR = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CONVERTIDOR DE PROCESOS POR LOTES");

        JCBCATEGORIA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        JTXTCONSOLA.setColumns(20);
        JTXTCONSOLA.setRows(5);
        JTXTCONSOLA.setText("\n");
        jScrollPane1.setViewportView(JTXTCONSOLA);

        JTXTImagenes.setColumns(20);
        JTXTImagenes.setRows(5);
        jScrollPane2.setViewportView(JTXTImagenes);

        jLabel2.setText("IMAGENES DE LA CATEGORIA");

        jButton3.setText("EJECUCION EN PARALELO ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("EJECUTAR EN SECUENCIA FIFO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("EJECUTAR EN SECUENCIA LIFO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("CONSOLA DE EJECUCION");

        buttonGroup2.add(JRBCONVERTIR);
        JRBCONVERTIR.setText("Convertir jpg a bmp y viceversa");

        buttonGroup2.add(JRBCOPIA);
        JRBCOPIA.setText("COPIA JPG");

        buttonGroup2.add(JRBROTAR);
        JRBROTAR.setText("ROTAR IMAGEN A 90°");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBCOPIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRBCONVERTIR)
                            .addComponent(JRBROTAR))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRBCONVERTIR)
                .addGap(18, 18, 18)
                .addComponent(JRBCOPIA)
                .addGap(18, 18, 18)
                .addComponent(JRBROTAR)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JCBCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(110, 110, 110))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(147, 147, 147))))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(JCBCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(39, 39, 39)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!JRBCONVERTIR.isSelected() && !JRBCOPIA.isSelected() && !JRBROTAR.isSelected()) {
                            consola = "no se ha elegido ningun filtro a realizar \n";
                            JTXTCONSOLA.setText(consola);
                            t.stop();
                            hide();
                            anterior.setVisible(true);
                }
                    x = x+1;
                    jProgressBar1.setValue(x);
                if (jProgressBar1.getValue()==1) {
                    String[] contenidoFIFO = new String[anterior.anterior.listadousuario.getCabeza().categoria.inicio.imagenes.contador];
                    boolean respuesta = anterior.anterior.listadousuario.getCabeza().categoria.buscarnodoregresivo(JCBCATEGORIA.toString());
                    if (respuesta=true) {
                    contenidoFIFO = anterior.anterior.listadousuario.getCabeza().categoria.inicio.imagenes.mostrardatos();
                    datos = new LinkedList();
                    for (int i = 0; i < anterior.anterior.listadousuario.getCabeza().categoria.inicio.imagenes.contador; i++) {
                        datos.offer(contenidoFIFO[i]);
                        consola = "se estan cargando los archivos ... espere por favor \n";
                    }
                    }
                }
                JTXTCONSOLA.setText(consola);
                if (jProgressBar1.getValue()==50) {
                    while (datos.peek()!=null) {
                    colatemporal = new String[anterior.anterior.listadousuario.getCabeza().categoria.inicio.imagenes.contador];
                    for (int i = 0; i < datos.size(); i++) {
                    colatemporal[i]=(String) datos.poll();
                        sentencias(i);
                    }    
            }
                }
                if (jProgressBar1.getValue()==100) {
                    t.stop();
                    consola = consola + "Los datos al sido modificados \n";
                    JTXTCONSOLA.setText(consola);
                    x=0;
                }
                }
        };
        t = new Timer(50, ac);
        t.start();    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!JRBCONVERTIR.isSelected() && !JRBCOPIA.isSelected() && !JRBROTAR.isSelected()) {
                    consola = "no se ha elegido ninguna accion a realizar \n";
                    JTXTCONSOLA.setText(consola);
                    t.stop();
                    hide();
                    anterior.setVisible(true);
                }
                x=x+1;
                jProgressBar1.setValue(x);
                if (jProgressBar1.getValue()==1) {
                    String[] contenidoFIFO = new String[anterior.anterior.listadousuario.getCabeza().categoria.inicio.imagenes.contador];
                    boolean respuesta = anterior.anterior.listadousuario.getCabeza().categoria.buscarnodoregresivo(JCBCATEGORIA.toString());
                    if (respuesta=true) {
                    contenidoFIFO = anterior.anterior.listadousuario.getCabeza().categoria.inicio.imagenes.mostrardatos();
                    datospila = new Stack();
                    for (int i = 0; i < anterior.anterior.listadousuario.getCabeza().categoria.inicio.imagenes.contador; i++) {
                        datospila.push(contenidoFIFO[i]);
                        consola = "se estan cargando los archivos ... espere por favor \n";
                    }
                    }
                }
                JTXTCONSOLA.setText(consola);
                try {
                    if (jProgressBar1.getValue()==50) {
                    while (datospila.peek()!=null) {
                    colatemporal = new String[anterior.anterior.listadousuario.getCabeza().categoria.inicio.imagenes.contador];
                    for (int i = 0; i < datospila.size(); i++) {
                    colatemporal[i]=(String) datospila.pop();
                        sentencias(i);
                    }    
                    }
                    }
                } catch (Exception q) {
                    
                }
                if (jProgressBar1.getValue()==100) {
                    t.stop();
                    consola = consola + "Los datos al sido modificados \n";
                    JTXTCONSOLA.setText(consola);
                    x=0;
                }
            }
        };
        t = new Timer(50, ac);
        t.start();
    }//GEN-LAST:event_jButton5ActionPerformed
    public void sentencias(int i){
        if (JRBCONVERTIR.isSelected()) {
            File temporal = new File(colatemporal[i]);
            bytesImg = imagen.abrirImagen(temporal);
            if (temporal.getName().endsWith("jpg")) {
                imagen.convertirImagenbmp(temporal, bytesImg);
            }else{
                imagen.convertirImagenjpg(temporal, bytesImg);
            }
            consola=consola + "converted- "+temporal.getName()+"\n";
        }else if (JRBCOPIA.isSelected()) {
//          JOptionPane.showMessageDialog(null, "Los datos se estan copiando");
                File temporal = new File(colatemporal[i]);
                bytesImg = imagen.abrirImagen(temporal);
                imagenes.copiaImagenjpg(temporal, bytesImg);
                consola=consola + "copy- "+temporal.getName()+"\n";
        }else if (JRBROTAR.isSelected()) {
                File temporal = new File(colatemporal[i]);
                bytesImg = imagen.abrirImagen(temporal);
                imagenes.imagensalida = temporal;
                String nombre=imagenes.getImagensalida().getName();
                nombre = "rotation-"+nombre.replace(".jpg", "")+".jpg";
//              JOptionPane.showMessageDialog(null, "Los datos se estan rotando");
                imagenes.imagensalida = new File(nombre);
                imagenes.rotate90(temporal, imagenes.imagensalida, imagenes.RORATE_90);
                consola=consola + "rotation- "+temporal.getName()+"\n";
        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBCATEGORIA;
    public javax.swing.JRadioButton JRBCONVERTIR;
    public javax.swing.JRadioButton JRBCOPIA;
    public javax.swing.JRadioButton JRBROTAR;
    private javax.swing.JTextArea JTXTCONSOLA;
    private javax.swing.JTextArea JTXTImagenes;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
