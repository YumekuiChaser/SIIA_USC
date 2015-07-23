package modelo;

import com.mysql.jdbc.exceptions.MySQLDataException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/universidad";
    private static final String DB_USER = "siia_usc";
    private static final String DB_PASS = "siia_usc";
    private static Connection CON = null;
    
    public boolean iniciarConexion() throws ClassNotFoundException, SQLException{
        boolean correcto = false;
        
        Class.forName(DB_DRIVER);
        CON = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        correcto = true;
        
        return correcto;
    }
    
    public boolean finalizarConexion() throws SQLException{
        boolean correcto = false;
        
        if(CON != null){
            CON.close();
            correcto = true;
        }
        return correcto;
    }
    
    public void cambiarAutoCommit(boolean estatus) throws SQLException{
        CON.setAutoCommit(estatus);
    }
    
    public void realizarTransaccion() throws SQLException{
        CON.commit();
    }
    
    public void cancelarTransacion() throws SQLException{
        CON.rollback();
    }
    
    public int modificarRegistros(String query) throws SQLException{
        Statement pstmt = CON.createStatement();
        int cantAfectados = -1;
        cantAfectados = pstmt.executeUpdate(query);
        return cantAfectados;
    }
    
    public ResultSet seleccionarRegistros(String query) throws SQLException{
        ResultSet registros = null;
        
        return registros;
    }
    /*private Connection con = null;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/UNIVERSIDAD";
            String usuario = "root";
            String contrase = "root";
            con= (Connection)DriverManager.getConnection(servidor,usuario,contrase);
           // con = DriverManager.getConnection("jdbc:mysql://localhost:test", "root", "");
        } catch (ClassNotFoundException ex) {// No encuentre software de datos
            System.out.println(ex.getMessage());
        } catch (MySQLDataException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            //Imprima excepcion que ha capturado getMessage
            System.out.println(ex.getMessage());
    }
    }
    public Connection getConexion() {
        return con;
    }

    public void cerrarConexion() {
        try {
            con.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }*/
}
