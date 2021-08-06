package src.ventanas;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import src.manejo_cadenas.ManejadorToken;
import src.token.TipoToken;
import src.token.Token;

/**
 *
 * @author Manuel Rojas
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private DefaultListModel modeloId = new DefaultListModel();
    private DefaultListModel modeloEntero = new DefaultListModel();
    private DefaultListModel modeloDecimal = new DefaultListModel();
    private DefaultListModel modeloSimbolo = new DefaultListModel();
    private DefaultListModel modeloError = new DefaultListModel();

    public VentanaPrincipal() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void listarElementos(ArrayList<Token> tokens) {
        for (int i = 0; i < tokens.size(); i++) {
            switch (tokens.get(i).getTipo()) {
                case IDENTIFICADOR -> {
                    modeloId.addElement(tokens.get(i));
                }
                case NUMERO_ENTERO -> {
                    modeloEntero.addElement(tokens.get(i));
                }
                case NUMERO_DECIMAL -> {
                    modeloDecimal.addElement(tokens.get(i));
                }
                case SIMBOLO -> {
                    modeloSimbolo.addElement(tokens.get(i));
                }
                case ERROR -> {
                    modeloError.addElement(tokens.get(i));
                }
            }

        }
        jListId.setModel(modeloId);
        jListEntero.setModel(modeloEntero);
        jListDecimal.setModel(modeloDecimal);
        jListSimbolo.setModel(modeloSimbolo);
        jListError.setModel(modeloError);
    }

    private void limpiarModelos() {
        modeloId.removeAllElements();
        modeloEntero.removeAllElements();
        modeloDecimal.removeAllElements();
        modeloSimbolo.removeAllElements();
        modeloError.removeAllElements();
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
        jListId = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListEntero = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListDecimal = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListSimbolo = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListError = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        botonValidar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 400));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VALIDADOR DE TOKENS");
        jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

        panelListas.setMinimumSize(new java.awt.Dimension(500, 200));
        panelListas.setPreferredSize(new java.awt.Dimension(500, 200));
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

        jListId.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(jListId);

        jPanel5.add(jScrollPane3);

        jListEntero.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(jListEntero);

        jPanel5.add(jScrollPane4);

        jListDecimal.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jScrollPane5.setViewportView(jListDecimal);

        jPanel5.add(jScrollPane5);

        jListSimbolo.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jScrollPane6.setViewportView(jListSimbolo);

        jPanel5.add(jScrollPane6);

        jListError.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jScrollPane7.setViewportView(jListError);

        jPanel5.add(jScrollPane7);

        panelListas.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelListas, java.awt.BorderLayout.LINE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Poppins ExtraLight", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        botonValidar.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        botonValidar.setText("VALIDAR");
        botonValidar.setMaximumSize(new java.awt.Dimension(77, 50));
        botonValidar.setMinimumSize(new java.awt.Dimension(77, 50));
        botonValidar.setPreferredSize(new java.awt.Dimension(77, 50));
        botonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonValidarActionPerformed(evt);
            }
        });
        jPanel2.add(botonValidar);

        botonLimpiar.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.setMaximumSize(new java.awt.Dimension(75, 50));
        botonLimpiar.setMinimumSize(new java.awt.Dimension(75, 50));
        botonLimpiar.setPreferredSize(new java.awt.Dimension(75, 50));
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(botonLimpiar);

        jPanel3.add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonValidarActionPerformed
        limpiarModelos();
        if (!jTextArea2.getText().isBlank()) {
            ManejadorToken manejador = new ManejadorToken(jTextArea2.getText());
            listarElementos(manejador.getTokens());
        } else {
            JOptionPane.showMessageDialog(this, "No hay texto para procesar", "No hay texto", JOptionPane.WARNING_MESSAGE);
            jTextArea2.setText("");
        }
    }//GEN-LAST:event_botonValidarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarModelos();
        jTextArea2.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListDecimal;
    private javax.swing.JList<String> jListEntero;
    private javax.swing.JList<String> jListError;
    private javax.swing.JList<String> jListId;
    private javax.swing.JList<String> jListSimbolo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
