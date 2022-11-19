package Datos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import restaurante.menus;

public class menuDB {
    Connection con;
    ConexionDB cn = new ConexionDB();
    PreparedStatement ps;
    ResultSet rs;

    public List listar() {
    List<menus> lista = new ArrayList<>();
    String sql = "select * from menu";
        try {
            con = (Connection) cn.Conectar();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                menus c = new menus();
                c.setID(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setTipo(rs.getString(3));
                c.setPrecio(rs.getDouble(4));
                c.setDisponible(rs.getString(5));
                c.setStock(rs.getInt(6));
                
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    
    public int agregar(Object[] o) {
        int r = 0;
       String sql = "INSERT INTO menu(Nom_Menu,Tipo_Menu,Precio_Menu,Disponible,Stock)values(?,?,?,?,?)";
        try {
            con = (Connection) cn.Conectar();
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setObject(1, o[0] );
            ps.setObject(2, o[1] );
            ps.setObject(3, o[2] );
            ps.setObject(4, o[3] );
            ps.setObject(5, o[4] );
            r = ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;
    }
    public int editar(Object[] o) {
        int r=0;
        String sql = "update menu set Nom_Menu=?,Tipo_Menu=?,Precio_Menu=?,Disponible=?,Stock=? where ID_menu=?";
        try {
            con=(Connection) cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setObject(1, o[0] );
            ps.setObject(2, o[1] );
            ps.setObject(3, o[2] );
            ps.setObject(4, o[3] );
            ps.setObject(5, o[4] );
            ps.setObject(6, o[5] );
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

 
    public void eliminar(int id) {
        String sql = "delete from menu where ID_menu=?";
        try {
            con=(Connection) cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
