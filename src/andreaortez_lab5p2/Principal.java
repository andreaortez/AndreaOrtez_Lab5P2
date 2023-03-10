package andreaortez_lab5p2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        pn_agregar.setVisible(false);
        pn_listado.setVisible(false);
        pn_simulacion.setVisible(false);
        ta_ataques.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pm_crud = new javax.swing.JPopupMenu();
        jmi_modificar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        jmi_listar = new javax.swing.JMenuItem();
        pm_listar = new javax.swing.JPopupMenu();
        jmi_tabla = new javax.swing.JMenuItem();
        BG = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bt_listado = new javax.swing.JButton();
        bt_simulacion = new javax.swing.JButton();
        pn_simulacion = new javax.swing.JPanel();
        cb_jugador1 = new javax.swing.JComboBox<>();
        cb_jugador2 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_jugador2 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_jugador1 = new javax.swing.JList<>();
        bt_batalla = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pn_batalla = new javax.swing.JPanel();
        tf_jugador = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_ataques = new javax.swing.JTextArea();
        bt_resistencia = new javax.swing.JButton();
        bt_mental = new javax.swing.JButton();
        bt_fisico = new javax.swing.JButton();
        pn_listado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_universos = new javax.swing.JTree();
        pn_tabla = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_atributos = new javax.swing.JTable();
        pn_lista = new javax.swing.JPanel();
        tf_personaje = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_atributos = new javax.swing.JList<>();
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

        jmi_modificar.setText("Modificar");
        jmi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarActionPerformed(evt);
            }
        });
        pm_crud.add(jmi_modificar);

        jmi_eliminar.setText("Eliminar");
        jmi_eliminar.setToolTipText("");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        pm_crud.add(jmi_eliminar);

        jmi_listar.setText("Listar");
        jmi_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarActionPerformed(evt);
            }
        });
        pm_crud.add(jmi_listar);

        jmi_tabla.setText("Listar");
        jmi_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_tablaActionPerformed(evt);
            }
        });
        pm_listar.add(jmi_tabla);

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

        bt_listado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bt_listado.setText("Listado de personajes");
        bt_listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_listadoMouseClicked(evt);
            }
        });

        bt_simulacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bt_simulacion.setText("Simulaci??n de Batalla");
        bt_simulacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_simulacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(bt_listado)
                    .addComponent(bt_simulacion))
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
                .addComponent(bt_listado)
                .addGap(84, 84, 84)
                .addComponent(bt_simulacion)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        BG.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pn_simulacion.setBackground(new java.awt.Color(214, 217, 224));
        pn_simulacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_jugador1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DC", "Marvel", "Capcom", "Mortal Kombat" }));
        cb_jugador1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_jugador1ItemStateChanged(evt);
            }
        });
        pn_simulacion.add(cb_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 170, -1));

        cb_jugador2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DC", "Marvel", "Capcom", "Mortal Kombat" }));
        cb_jugador2.setSelectedIndex(1);
        cb_jugador2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_jugador2ItemStateChanged(evt);
            }
        });
        pn_simulacion.add(cb_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 180, -1));

        jl_jugador2.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jl_jugador2);

        pn_simulacion.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 180, 290));

        jl_jugador1.setModel(new DefaultListModel());
        jScrollPane5.setViewportView(jl_jugador1);

        pn_simulacion.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 290));

        bt_batalla.setText("Batalla");
        bt_batalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_batallaMouseClicked(evt);
            }
        });
        pn_simulacion.add(bt_batalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Jugador 2");
        pn_simulacion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Jugador 1");
        pn_simulacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Simulaci??n");
        pn_simulacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 56));

        pn_batalla.setBackground(new java.awt.Color(214, 217, 224));
        pn_batalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_jugador.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pn_batalla.add(tf_jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 30));

        ta_ataques.setColumns(20);
        ta_ataques.setRows(5);
        jScrollPane6.setViewportView(ta_ataques);

        pn_batalla.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 370, 360));

        bt_resistencia.setText("Resistencia");
        bt_resistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_resistenciaMouseClicked(evt);
            }
        });
        pn_batalla.add(bt_resistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        bt_mental.setText("Mental");
        bt_mental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mentalMouseClicked(evt);
            }
        });
        pn_batalla.add(bt_mental, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        bt_fisico.setText("F??sico");
        bt_fisico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_fisicoMouseClicked(evt);
            }
        });
        pn_batalla.add(bt_fisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        pn_simulacion.add(pn_batalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 430, 500));

        BG.add(pn_simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 860, 500));

        pn_listado.setBackground(new java.awt.Color(214, 217, 224));
        pn_listado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Listado de Personajes");
        pn_listado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 56));

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
        jt_universos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_universosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_universos);

        pn_listado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, -1));

        pn_tabla.setBackground(new java.awt.Color(214, 217, 224));

        tb_atributos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Poder", "Debilidad", "Universo", "Fuerza", "Agilidad F??sica", "Agilidad Mental", "Puntos de vida"
            }
        ));
        jScrollPane3.setViewportView(tb_atributos);

        javax.swing.GroupLayout pn_tablaLayout = new javax.swing.GroupLayout(pn_tabla);
        pn_tabla.setLayout(pn_tablaLayout);
        pn_tablaLayout.setHorizontalGroup(
            pn_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_tablaLayout.setVerticalGroup(
            pn_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tablaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pn_listado.add(pn_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 580, 500));

        pn_lista.setBackground(new java.awt.Color(214, 217, 224));
        pn_lista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_personaje.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pn_lista.add(tf_personaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 26, 113, 31));

        jl_atributos.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_atributos);

        pn_lista.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 350, 360));

        pn_listado.add(pn_lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 450, 500));

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
        jLabel18.setText("Agilidad f??sica");
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
            personajes.add(new Personaje(tf_nombre.getText(), tf_debilidad.getText(), cb_universo.getSelectedItem().toString(),
                    tf_poder.getText(), Double.parseDouble(tf_fuerza.getText()),
                    Double.parseDouble(tf_afisica.getText()), Double.parseDouble(tf_amental.getText()),
                    Double.parseDouble(tf_vida.getText())));

            DefaultTreeModel m = (DefaultTreeModel) jt_universos.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

            nodo_personaje = new DefaultMutableTreeNode(new Personaje(tf_nombre.getText(), tf_debilidad.getText(),
                    cb_universo.getSelectedItem().toString(), tf_poder.getText(), Double.parseDouble(tf_fuerza.getText()),
                    Double.parseDouble(tf_afisica.getText()), Double.parseDouble(tf_amental.getText()),
                    Double.parseDouble(tf_vida.getText())));

            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (cb_universo.getSelectedItem().toString().equals(raiz.getChildAt(i).toString())) {
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(nodo_personaje);
                }
            }

            m.reload();

            tf_nombre.setText("");
            tf_debilidad.setText("");
            tf_poder.setText("");
            tf_fuerza.setText("");
            tf_afisica.setText("");
            tf_amental.setText("");
            tf_vida.setText("");

            JOptionPane.showMessageDialog(this, "Personaje agregado con ??xito");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurri?? un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_bt_agregarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        pn_agregar.setVisible(true);
        pn_listado.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void bt_listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listadoMouseClicked
        pn_listado.setVisible(true);
        pn_agregar.setVisible(false);
        pn_lista.setVisible(false);
        pn_tabla.setVisible(false);
    }//GEN-LAST:event_bt_listadoMouseClicked

    private void jt_universosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_universosMouseClicked
        if (evt.isMetaDown()) {
            int row = jt_universos.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_universos.setSelectionRow(row);
            Object v1 = jt_universos.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;

            if (nodo_seleccionado.getUserObject() instanceof Personaje) {
                personaje_seleccionado = (Personaje) nodo_seleccionado.getUserObject();
                pm_crud.show(evt.getComponent(), evt.getX(), evt.getY());
            } else {
                pm_listar.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_universosMouseClicked

    private void bt_simulacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_simulacionMouseClicked
        pn_simulacion.setVisible(true);
        pn_batalla.setVisible(false);

        DefaultListModel modelo1 = (DefaultListModel) jl_jugador1.getModel();
        DefaultListModel modelo2 = (DefaultListModel) jl_jugador2.getModel();

        for (Personaje p : personajes) {
            if (p.getUniverso().equals(cb_jugador1.getSelectedItem().toString())) {
                modelo1.addElement(p.getNombre());
            }
            if (p.getUniverso().equals(cb_jugador2.getSelectedItem().toString())) {
                modelo2.addElement(p.getNombre());
            }
        }
    }//GEN-LAST:event_bt_simulacionMouseClicked

    private void jmi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarActionPerformed
        
    }//GEN-LAST:event_jmi_modificarActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        if (jt_universos.getSelectionCount() >= 0) {
            int response = JOptionPane.showConfirmDialog(this, "Seguro de Eliminar?", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.OK_OPTION) {
                DefaultTreeModel modelo = (DefaultTreeModel) jt_universos.getModel();
                modelo.removeNodeFromParent(nodo_seleccionado);
                jt_universos.setModel((TreeModel) modelo);
                JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            }
        }
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmi_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarActionPerformed
        pn_lista.setVisible(true);
        pn_tabla.setVisible(false);

        DefaultListModel modelo = (DefaultListModel) jl_atributos.getModel();
        modelo.addElement(personaje_seleccionado.toStringAtributos());
        jl_atributos.setModel(modelo);
        tf_personaje.setText(personaje_seleccionado.getNombre());
    }//GEN-LAST:event_jmi_listarActionPerformed

    private void jmi_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_tablaActionPerformed
        pn_tabla.setVisible(true);
        pn_lista.setVisible(false);
        try {
            tb_atributos.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},
                    new String[]{"Nombre", "Poder", "Debilidad", "Universo", "Poder", "Fuerza", "Agilidad F??sica", "Agilidad Mental", "Poder de Vida"}));

            for (Personaje p : personajes) {
                if (p.getUniverso().equals(personaje_seleccionado.getUniverso())) {
                    Object[] row = {p.getNombre(), p.getPoder(), p.getDebilidad(), p.getUniverso(), p.getPoder(), p.getFuerza(), p.getAfisica(),
                        p.getAmental(), p.getVida()};
                    DefaultTableModel tabla = (DefaultTableModel) tb_atributos.getModel();
                    tabla.addRow(row);
                    tb_atributos.setModel(tabla);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jmi_tablaActionPerformed

    private void cb_jugador1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_jugador1ItemStateChanged
        if (evt.getStateChange() == 2) {
            DefaultListModel modelo = (DefaultListModel) jl_jugador1.getModel();
            modelo.removeAllElements();

            for (Personaje p : personajes) {
                if (p.getUniverso().equals(cb_jugador1.getSelectedItem().toString())) {
                    modelo.addElement(p.getNombre());
                }
            }
        }
    }//GEN-LAST:event_cb_jugador1ItemStateChanged

    private void cb_jugador2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_jugador2ItemStateChanged
        if (evt.getStateChange() == 2) {
            DefaultListModel modelo = (DefaultListModel) jl_jugador2.getModel();
            modelo.removeAllElements();

            for (Personaje p : personajes) {
                if (p.getUniverso().equals(cb_jugador2.getSelectedItem().toString())) {
                    modelo.addElement(p.getNombre());
                }
            }
        }
    }//GEN-LAST:event_cb_jugador2ItemStateChanged

    private void bt_batallaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_batallaMouseClicked
        ta_ataques.removeAll();
        pn_batalla.setVisible(true);

        for (Personaje p : personajes) {
            if (p.getNombre().equals(jl_jugador1.getSelectedValue())) {
                jugador1 = p;
                jugador_actual = p;
            }
            if (p.getNombre().equals(jl_jugador2.getSelectedValue())) {
                jugador2 = p;
            }
        }

        tf_jugador.setText(jugador_actual.getNombre());
        tf_jugador.setBackground(Color.GREEN);
    }//GEN-LAST:event_bt_batallaMouseClicked

    private void bt_resistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_resistenciaMouseClicked
        double puntos = jugador_actual.getVida();
        double puntosF = puntos * 1.15;
        jugador_actual.setVida(puntosF);

        String text = jugador_actual.getNombre() + " us?? Ataque de Resistencia"
                + "\nSu vida actual " + puntosF;

        ta_ataques.setForeground(tf_jugador.getBackground());
        ta_ataques.append(text + "\n");

        turno = 1;
        Jugador();
    }//GEN-LAST:event_bt_resistenciaMouseClicked

    private void bt_mentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mentalMouseClicked
        Rival();
        double ataque;
        int prob = 1 + random.nextInt(100);

        if (prob <= 15) { //ataque cr??tico
            double mental = jugador_actual.getAmental();
            
            ataque = mental / .33;
            rival.setVida(rival.getVida() - (ataque * 2));
        } else {//ataque normal
            double mental = jugador_actual.getAmental();
            ataque = mental / .33;
            rival.setVida(rival.getVida() - ataque);
        }

        String text = jugador_actual.getNombre() + " us?? Ataque Mental"
                + "\nSe quit?? " + ataque + " puntos a la vida del rival";

        ta_ataques.setForeground(tf_jugador.getBackground());
        ta_ataques.append(text + "\n");

        if (rival.getVida() <= 0) {
            JOptionPane.showMessageDialog(this, jugador_actual.getNombre() + " gan?? el juego");
            pn_batalla.setVisible(false);
        } else {
            Jugador();
        }
    }//GEN-LAST:event_bt_mentalMouseClicked

    private void bt_fisicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_fisicoMouseClicked
        Rival();
        String aux;

        double fisico = jugador_actual.getAfisica();
        double ataque = fisico / 2;
        rival.setVida(rival.getVida() - ataque);

        String text = jugador_actual.getNombre() + " us?? Ataque F??sico"
                + "\nSe quit?? " + ataque + " vida al rival";

        int prob = 1 + random.nextInt(100);
        if (prob <= 8) {
            double vida = jugador_actual.getVida();
            double aumento = vida / .25;
            jugador_actual.setVida(vida + aumento);
            aux = "Se le aument?? " + aumento + " a la vida de " + jugador_actual.getNombre() + ", dejandola en " + jugador_actual.getVida();
            text += "\n" + aux;
        }

        ta_ataques.setForeground(tf_jugador.getBackground());
        ta_ataques.append(text + "\n");

        if (rival.getVida() <= 0) {
            JOptionPane.showMessageDialog(this, jugador_actual.getNombre() + " gan?? el juego");
            pn_batalla.setVisible(false);
        } else {
            Jugador();
        }
    }//GEN-LAST:event_bt_fisicoMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private void Jugador() {
        if (turno == 0) {
            if (tf_jugador.getText().equals(jugador1.getNombre())) {
                jugador_actual = jugador2;
                tf_jugador.setText(jugador_actual.getNombre());
                tf_jugador.setBackground(Color.CYAN);
            } else if (tf_jugador.getText().equals(jugador2.getNombre())) {
                jugador_actual = jugador1;
                tf_jugador.setText(jugador_actual.getNombre());
                tf_jugador.setBackground(Color.GREEN);
            }
        } else {
            if (turno == 1) {
                if (tf_jugador.getText().equals(jugador1.getNombre())) {
                    jugador_actual = jugador2;
                    tf_jugador.setText(jugador_actual.getNombre());
                    tf_jugador.setBackground(Color.CYAN);
                } else if (tf_jugador.getText().equals(jugador2.getNombre())) {
                    jugador_actual = jugador1;
                    tf_jugador.setText(jugador_actual.getNombre());
                    tf_jugador.setBackground(Color.GREEN);
                }
                turno = 2;
            } else {
                turno = 0;
            }
        }

    }

    private void Rival() {
        if (jugador_actual.getNombre().equals(jugador1)) {
            rival = jugador2;
        } else {
            rival = jugador1;
        }
    }

    ArrayList<Personaje> personajes = new ArrayList();
    Personaje personaje_seleccionado, jugador_actual, jugador1, jugador2, rival;
    DefaultMutableTreeNode nodo_seleccionado, nodo_personaje;
    Random random = new Random();
    int turno = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_batalla;
    private javax.swing.JButton bt_fisico;
    private javax.swing.JButton bt_listado;
    private javax.swing.JButton bt_mental;
    private javax.swing.JButton bt_resistencia;
    private javax.swing.JButton bt_simulacion;
    private javax.swing.JComboBox<String> cb_jugador1;
    private javax.swing.JComboBox<String> cb_jugador2;
    private javax.swing.JComboBox<String> cb_universo;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSeparator jSeparator_14;
    private javax.swing.JList<String> jl_atributos;
    private javax.swing.JList<String> jl_jugador1;
    private javax.swing.JList<String> jl_jugador2;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_listar;
    private javax.swing.JMenuItem jmi_modificar;
    private javax.swing.JMenuItem jmi_tabla;
    private javax.swing.JTree jt_universos;
    private javax.swing.JPopupMenu pm_crud;
    private javax.swing.JPopupMenu pm_listar;
    private javax.swing.JPanel pn_agregar;
    private javax.swing.JPanel pn_batalla;
    private javax.swing.JPanel pn_lista;
    private javax.swing.JPanel pn_listado;
    private javax.swing.JPanel pn_simulacion;
    private javax.swing.JPanel pn_tabla;
    private javax.swing.JTextArea ta_ataques;
    private javax.swing.JTable tb_atributos;
    private javax.swing.JTextField tf_afisica;
    private javax.swing.JTextField tf_amental;
    private javax.swing.JTextField tf_debilidad;
    private javax.swing.JTextField tf_fuerza;
    private javax.swing.JTextField tf_jugador;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_personaje;
    private javax.swing.JTextField tf_poder;
    private javax.swing.JTextField tf_vida;
    // End of variables declaration//GEN-END:variables
}
