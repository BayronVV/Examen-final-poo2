/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author estudiante
 */
import java.sql.*;
public class ClienteServicios {
    
    
    public void guardar(Connection conexion, Cliente d) throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("INSERT INTO cliente (Cedula, Nombre, Apellido, Genero, Profesion, Ciudad, Museo)"+"VALUES(?,?,?,?,?,?,?)");
           consulta.setInt(1, d.getCedula());
           consulta.setString(2, d.getNombre());
           consulta.setString(3, d.getApellido());
           consulta.setString(4, d.getGenero());
           consulta.setString(5, d.getProfesion());
           consulta.setString(6, d.getCiudad());
           consulta.setInt(7, d.getMuseo());
      
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    }  
       public void eliminar(Connection conexion, Cliente d)throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("DELETE FROM cliente WHERE `cliente`.`Cedula`=?");
           consulta.setInt(1, d.getCedula());
       
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
      }
      public void actualizar(Connection conexion, Cliente d) throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("UPDATE cliente set Ciudad=? where Cedula=?");
          
           consulta.setString(1, d.getCiudad());
           consulta.setInt(2, d.getCedula());
          
           consulta.executeUpdate();
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    
    
  } 
}
