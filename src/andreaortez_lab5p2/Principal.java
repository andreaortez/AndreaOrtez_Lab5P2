package andreaortez_lab5p2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        pn_agregar.setVisible(false);
        pn_listado.setVisible(false);
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
        pn_listado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_universos = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        pn_agregar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        tf_debilidad = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
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
        jSeparator_14 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        tf_vida = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        bt_agregar = new javax.swing.JButton();
        cb_universo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(214, 217, 224));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setText("Agregar Personajes");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setText("Listado de personajes");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

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

        pn_listado.setBackground(new java.awt.Color(214, 217, 224));
        pn_listado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Listado de Personajes");
        pn_listado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 56));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personajes");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("DC");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Marvel");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Capcom");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mortal Kombat");
        treeNode1.add(treeNode2);
        jt_universos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_universos);

        pn_listado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        pn_listado.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 280, 360));

        BG.add(pn_listado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 860, 500));

        pn_agregar.setBackground(new java.awt.Color(214, 217, 224));
        pn_agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Poder");
        pn_agregar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 186, -1, -1));
        pn_agregar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 230, 404, 42));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre");
        pn_agregar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 97, -1, -1));
        pn_agregar.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 86, 218, 30));
        pn_agregar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 134, 404, 42));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Debilidad");
        pn_agregar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 289, -1, -1));
        pn_agregar.add(tf_debilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 278, 218, 30));
        pn_agregar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 332, 404, 42));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Universo perteneciente");
        pn_agregar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Personajes");
        pn_agregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 56));
        pn_agregar.add(tf_poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 182, 218, 30));
        pn_agregar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 360, 30));
        pn_agregar.add(tf_fuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 218, 30));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Fuerza");
        pn_agregar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));
        pn_agregar.add(tf_afisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 218, 30));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Agilidad física");
        pn_agregar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));
        pn_agregar.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 350, 42));
        pn_agregar.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 410, 42));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Agilidad mental");
        pn_agregar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));
        pn_agregar.add(tf_amental, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 218, 30));
        pn_agregar.add(jSeparator_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 360, 42));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Puntos de vida");
        pn_agregar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));
        pn_agregar.add(tf_vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 218, 30));
        pn_agregar.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 360, 42));

        bt_agregar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bt_agregar.setText("Agregar");
        bt_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarMouseClicked(evt);
            }
        });
        pn_agregar.add(bt_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        cb_universo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DC", "Marvel", "Capcom", "Mortal Kombat" }));
        pn_agregar.add(cb_universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 220, -1));

        BG.add(pn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 860, 500));

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

    private void bt_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarMouseClicked
        try {
            personajes.add(new Personajes(tf_nombre.getText(), tf_debilidad.getText(), cb_universo.getSelectedItem().toString(),
                    tf_poder.getText(), Double.parseDouble(tf_fuerza.getText()),
                    Double.parseDouble(tf_afisica.getText()), Double.parseDouble(tf_amental.getText()),
                    Double.parseDouble(tf_vida.getText())));

            tf_nombre.setText("");
            tf_debilidad.setText("");
            tf_poder.setText("");
            tf_fuerza.setText("");
            tf_afisica.setText("");
            tf_amental.setText("");
            tf_vida.setText("");

            JOptionPane.showMessageDialog(this, "Personaje agregado con éxito");
            LlenarTree();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_bt_agregarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        pn_agregar.setVisible(true);
        pn_listado.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        pn_listado.setVisible(true);
        pn_agregar.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

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

    private void LlenarTree() {
        DefaultTreeModel m = (DefaultTreeModel) jt_universos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodo_personaje;
        
        nodo_personaje = new DefaultMutableTreeNode(new Personajes(tf_nombre.getText(), tf_debilidad.getText(),
                cb_universo.getSelectedItem().toString(), tf_poder.getText(), Double.parseDouble(tf_fuerza.getText()),
                Double.parseDouble(tf_afisica.getText()), Double.parseDouble(tf_amental.getText()),
                Double.parseDouble(tf_vida.getText())));
        
        for (int i = 0; i < raiz.getChildCount(); i++) {
            if (cb_universo.getSelectedItem().toString().equals(raiz.getChildAt(i).toString())) {
                 ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(nodo_personaje);
            }
        }
        
        m.reload();
    }

    ArrayList<Personajes> personajes = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton bt_agregar;
    private javax.swing.JComboBox<String> cb_universo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSeparator jSeparator_14;
    private javax.swing.JTree jt_universos;
    private javax.swing.JPanel pn_agregar;
    private javax.swing.JPanel pn_listado;
    private javax.swing.JTextField tf_afisica;
    private javax.swing.JTextField tf_amental;
    private javax.swing.JTextField tf_debilidad;
    private javax.swing.JTextField tf_fuerza;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_poder;
    private javax.swing.JTextField tf_vida;
    // End of variables declaration//GEN-END:variables
}
