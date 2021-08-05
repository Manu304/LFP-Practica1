package src.ventanas;

/**
 *
 * @author Manuel Rojas
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelListas = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        labelEntero = new javax.swing.JLabel();
        labelDecimal = new javax.swing.JLabel();
        labelSimbolo = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 400));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VALIDADOR DE TOKENS");
        jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

        panelListas.setMinimumSize(new java.awt.Dimension(500, 161));
        panelListas.setPreferredSize(new java.awt.Dimension(500, 161));
        panelListas.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        labelId.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        labelId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelId.setText("ID");
        jPanel6.add(labelId);

        labelEntero.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        labelEntero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEntero.setText("Entero");
        jPanel6.add(labelEntero);

        labelDecimal.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        labelDecimal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDecimal.setText("Decimal");
        jPanel6.add(labelDecimal);

        labelSimbolo.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        labelSimbolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSimbolo.setText("Simbolo");
        jPanel6.add(labelSimbolo);

        labelError.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError.setText("Error");
        jPanel6.add(labelError);

        panelListas.add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jList1.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jPanel5.add(jScrollPane3);

        jList2.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList2);

        jPanel5.add(jScrollPane4);

        jList3.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList3);

        jPanel5.add(jScrollPane5);

        jList4.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList4);

        jPanel5.add(jScrollPane6);

        jList5.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(jList5);

        jPanel5.add(jScrollPane7);

        panelListas.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelListas, java.awt.BorderLayout.LINE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jButton1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton1.setText("VERIFICAR");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel3.add(jButton1, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel labelDecimal;
    private javax.swing.JLabel labelEntero;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelSimbolo;
    private javax.swing.JPanel panelListas;
    // End of variables declaration//GEN-END:variables
}
