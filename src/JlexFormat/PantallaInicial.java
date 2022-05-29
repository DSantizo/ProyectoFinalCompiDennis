package JlexFormat;

import java.io.BufferedReader;
import java.io.StringReader;
import Cod3Direcciones.CrCod3Direcciones;
import Cod3Direcciones.parser;
import Cod3Direcciones.Yylex;
/**
 *
 * @author Dennis Santizo
 */
public class PantallaInicial extends javax.swing.JFrame {

    public PantallaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_GenerarC3D = new javax.swing.JButton();
        jTextField_Expresion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Codigo3Dgenerado = new javax.swing.JTextArea();
        jButton_GenerarC3D1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_GenerarC3D.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jButton_GenerarC3D.setText("Generar Codigo_3D");
        jButton_GenerarC3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerarC3DActionPerformed(evt);
            }
        });

        jTextField_Expresion.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N

        jTextArea_Codigo3Dgenerado.setColumns(20);
        jTextArea_Codigo3Dgenerado.setFont(new java.awt.Font("Roboto Mono Light", 0, 18)); // NOI18N
        jTextArea_Codigo3Dgenerado.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Codigo3Dgenerado);

        jButton_GenerarC3D1.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jButton_GenerarC3D1.setText("Generar Lenguaje Sintactico");
        jButton_GenerarC3D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerarC3D1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
            .addComponent(jTextField_Expresion)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_GenerarC3D, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_GenerarC3D1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jButton_GenerarC3D1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_GenerarC3D, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_Expresion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GenerarC3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerarC3DActionPerformed
        String texto = jTextField_Expresion.getText();
        if(texto.isEmpty()){
            System.err.println("NO ES POSIBLE ANALIZAR ESPACIO EN BLANCO");
            return;
        }
        try {
            jTextArea_Codigo3Dgenerado.setText("");
            System.out.println("INICIA GENERIC CODIGO 3 DIRECCIONES");
            Yylex scan = new Yylex(new BufferedReader( new StringReader(texto)));
            parser parser = new parser(scan);
            parser.parse();
            jTextArea_Codigo3Dgenerado.setText(CrCod3Direcciones.getC3D());
            System.out.println("FINALIZA GENERIC CODIGO 3 DIRECCIONES");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton_GenerarC3DActionPerformed

    private void jButton_GenerarC3D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerarC3D1ActionPerformed
        try {
            JlexFormat.parser p = new JlexFormat.parser(new JlexFormat.Yylex(new java.io.FileInputStream("D:\\Dennis Santizo\\Escritorio\\\\ProyectoFinalCompiDennis\\ejempAnalizador.mlp")));
            p.parse();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton_GenerarC3D1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GenerarC3D;
    private javax.swing.JButton jButton_GenerarC3D1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Codigo3Dgenerado;
    private javax.swing.JTextField jTextField_Expresion;
    // End of variables declaration//GEN-END:variables
}
