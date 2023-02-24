/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package andreaortez_lab5p2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario Autorizado
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jp_agregar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        tf_debilidad = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        tf_universo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_poder = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        tf_fuerza = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf_afisica = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        tf_amental = new javax.swing.JTextField();
        bt_agregar = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        tf_vida = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(214, 217, 224));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setText("Agregar Personajes");

        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setText("Listado de personajes");

        jButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton3.setText("Simulación de Batalla");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addComponent(jButton1)
                .addGap(68, 68, 68)
                .addComponent(jButton2)
                .addGap(84, 84, 84)
                .addComponent(jButton3)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        BG.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jp_agregar.setBackground(new java.awt.Color(214, 217, 224));
        jp_agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Poder");
        jp_agregar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 186, -1, -1));
        jp_agregar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 230, 404, 42));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre");
        jp_agregar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 97, -1, -1));
        jp_agregar.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 86, 218, 30));
        jp_agregar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 134, 404, 42));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Debilidad");
        jp_agregar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 289, -1, -1));
        jp_agregar.add(tf_debilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 278, 218, 30));
        jp_agregar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 332, 404, 42));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Universo perteneciente");
        jp_agregar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        jp_agregar.add(tf_universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 218, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Personajes");
        jp_agregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 56));
        jp_agregar.add(tf_poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 182, 218, 30));
        jp_agregar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 360, 30));
        jp_agregar.add(tf_fuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 218, 30));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Fuerza");
        jp_agregar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));
        jp_agregar.add(tf_afisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 218, 30));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Agilidad física");
        jp_agregar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));
        jp_agregar.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 350, 42));
        jp_agregar.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 410, 42));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Agilidad mental");
        jp_agregar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));
        jp_agregar.add(tf_amental, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 218, 30));
        jp_agregar.add(bt_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 360, 42));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Puntos de vida");
        jp_agregar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));
        jp_agregar.add(tf_vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 218, 30));
        jp_agregar.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 360, 42));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton4.setText("Agregar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jp_agregar.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        BG.add(jp_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 860, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try {
            personajes.add(new Personajes(tf_nombre.getText(), tf_debilidad.getText(), tf_universo.getText(), tf_poder.getText(),
                    tf_afisica.getText(), tf_fuerza.getText()));

            ff_cuenta.setText("");
            tf_nombre.setText("");
            tf_debilidad.setText("");
            tf_universo.setText("");
            tf_afisica.setText("");
            tf_fuerza.setText("");
            JOptionPane.showMessageDialog(jd_administrarA, "Alumno agregado con éxito");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    ArrayList <Personajes> personajes = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Menu;
    private javax.swing.JSeparator bt_agregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel jp_agregar;
    private javax.swing.JTextField tf_afisica;
    private javax.swing.JTextField tf_amental;
    private javax.swing.JTextField tf_debilidad;
    private javax.swing.JTextField tf_fuerza;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_poder;
    private javax.swing.JTextField tf_universo;
    private javax.swing.JTextField tf_vida;
    // End of variables declaration//GEN-END:variables
}
