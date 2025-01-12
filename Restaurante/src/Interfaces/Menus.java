package Interfaces;

import Datos.ConexionDB;
import Datos.menuDB;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import restaurante.menus;

public class Menus extends javax.swing.JInternalFrame {

    menuDB md = new menuDB();
    menus m = new menus();
    Connection con;
    ConexionDB cn = new ConexionDB();
    ResultSet rs;
    PreparedStatement ps;

    DefaultTableModel modelo = new DefaultTableModel();
    int id;
    int fila = -1;

    private void limpiartextos() {
        nomb.setText(null);
        Tipo.setSelectedIndex(0);
        preci.setText(null);
        dispo.setSelectedItem(null);
        sto.setText(null);

    }

    public Menus() {
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

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nomb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Tipo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        preci = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        dispo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 16)); // NOI18N
        jLabel1.setText("Inventario  de MENUS:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 220, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 90, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 80, 20));
        jPanel1.add(nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tipo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 40, 20));

        Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clasico", "Variado", "Mixto" }));
        jPanel1.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Precio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        jPanel1.add(preci, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Disponible:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Stock:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));
        jPanel1.add(sto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 140, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nature-white-restaurant-dish-meal-food-760717-pxhere.com.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 150, 90));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Nuevo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 80, 30));

        dispo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        jPanel1.add(dispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 140, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 290, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo", "Precio", "Disponible", "Stock"
            }
        ));
        TABLA.setAutoscrolls(false);
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
        });
        TABLA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TABLAKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TABLA);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 400, 140));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 30, 30));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Mostrar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 80, 30));

        jLabel6.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MENUS Registrados:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 270, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 80, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("Modificar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 30));

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        jPanel2.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar Menu");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/table-wood-floor-restaurant-home-cottage-1179731-pxhere.com.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, 450));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 440, 460));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 720, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        limpiartextos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        int fila = TABLA.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            id = Integer.parseInt(TABLA.getValueAt(fila, 0).toString());
            String nombre = TABLA.getValueAt(fila, 1).toString();
            String tipo = TABLA.getValueAt(fila, 2).toString();
            String precio = TABLA.getValueAt(fila, 3).toString();
            String disponible = TABLA.getValueAt(fila, 4).toString();
            String stock = TABLA.getValueAt(fila, 5).toString();
            nomb.setText(nombre);
            Tipo.setSelectedItem(tipo);
            preci.setText(precio);
            dispo.setSelectedItem(disponible);
            sto.setText(stock);

        }
    }//GEN-LAST:event_TABLAMouseClicked

    private void TABLAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLAKeyReleased

    }//GEN-LAST:event_TABLAKeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir de la ventana ", "Exit", dialog);
        if (result == 0) {
            dispose();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        actualizar();
        limpiarTabla();
        listar();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        modificar();
        limpiartextos();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        String palabra = buscar.getText();
        buscar(palabra);

    }//GEN-LAST:event_buscarKeyReleased

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed
    void listar() {
        List<menus> lista = md.listar();
        modelo = (DefaultTableModel) TABLA.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getID();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getTipo();
            ob[3] = lista.get(i).getPrecio();
            ob[4] = lista.get(i).getDisponible();
            ob[5] = lista.get(i).getStock();
            modelo.addRow(ob);

        }
        TABLA.setModel(modelo);
    }

    void actualizar() {

    }

    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;

        }
    }

    void agregar() {
        String nom = nomb.getText();
        String tip = Tipo.getSelectedItem().toString();
        String pre = preci.getText();
        String dis = dispo.getSelectedItem().toString();
        String stock = sto.getText();

        if (nomb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese categoria");

        } else if (Tipo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese presentacion");

        } else if (preci.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese precio unitario");

        } else if (dispo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese presentacion");

        } else if (sto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese presentacion");
        } else {
            double dpre = Double.parseDouble(pre);
            int Isto = Integer.parseInt(stock);
            Object[] ob = new Object[5];
            ob[0] = nom;
            ob[1] = tip;
            ob[2] = dpre;
            ob[3] = dis;
            ob[4] = Isto;
            md.agregar(ob);
            JOptionPane.showMessageDialog(this, "Menu agregado correctamente");
        }
    }

    void modificar() {
        String nom = nomb.getText();
        String tip = Tipo.getSelectedItem().toString();
        String pre = preci.getText();
        String dis = dispo.getSelectedItem().toString();
        String stock = sto.getText();

        if (nomb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese categoria");

        } else if (Tipo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese presentacion");

        } else if (preci.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese precio unitario");

        } else if (Tipo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese presentacion");

        } else if (sto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese presentacion");
        } else {
            double dpre = Double.parseDouble(pre);

            int Isto = Integer.parseInt(stock);
            Object[] ob = new Object[6];
            ob[0] = nom;
            ob[1] = tip;
            ob[2] = dpre;
            ob[3] = dis;
            ob[4] = Isto;
            ob[5] = id;
            md.editar(ob);
            limpiarTabla();
            listar();

            JOptionPane.showMessageDialog(this, "Menu modificado");
        }
    }

    void eliminar() {

        fila = TABLA.getSelectedRow();
        int id = Integer.parseInt(TABLA.getValueAt(fila, 0).toString());
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila a eliminar");
        } else {

            int mensaje = JOptionPane.showConfirmDialog(this, "¿Eliminar menu? ", "Eliminar", JOptionPane.YES_NO_OPTION);
            UIManager.put("OptionPane.yesButtonText", "Si");
            if (mensaje == 0) {
                md.eliminar(id);
                limpiartextos();
                JOptionPane.showMessageDialog(this, "Menu eliminado");
            }
        }

    }

    public void buscar(String abuscar) {
        String[] nomColumnas = {"ID", "nombre", "tipo", "precio", "disponible", "stock"};
        String[] fila1 = new String[6];
        con = null;
        String sql = "SELECT * FROM menu WHERE Nom_Menu LIKE '%" + abuscar + "%'";
        modelo = new DefaultTableModel(null, nomColumnas);
        try {

            con = (Connection) cn.Conectar();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery(sql);

            while (rs.next()) {
                fila1[0] = rs.getString("ID_menu");
                fila1[1] = rs.getString("Nom_Menu");
                fila1[2] = rs.getString("Tipo_Menu");
                fila1[3] = rs.getString("Precio_Menu");
                fila1[4] = rs.getString("Disponible");
                fila1[5] = rs.getString("Stock");
                modelo.addRow(fila1);
            }
            TABLA.setModel(modelo);
            rs.close();
        } catch (Exception e) {
            System.err.println("" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLA;
    private javax.swing.JComboBox Tipo;
    private javax.swing.JTextField buscar;
    private javax.swing.JComboBox dispo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomb;
    private javax.swing.JTextField preci;
    private javax.swing.JTextField sto;
    // End of variables declaration//GEN-END:variables
}
