/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author estudiante
 */
import Modelo.*;
import Servicios.Conexion;
public class Servicios {
    
    
    public void RegistrarD(Cliente d){
        
         try{
        
            ClienteServicios ds = new ClienteServicios();
            ds.guardar(Conexion.obtener(), d);
        }
        catch(Exception e){
        
        }
    
    }
    public void EliminarD(Cliente d){
    
        try{
        
            ClienteServicios ds = new ClienteServicios();
            ds.eliminar(Conexion.obtener(), d);
        }
        catch(Exception e){
        
        }
    
    }
    
    public void ActualizarD(Cliente d){
    
        try{
        
            ClienteServicios ds = new ClienteServicios();
            ds.actualizar(Conexion.obtener(), d);
        }
        catch(Exception e){
        
        }
    
    }
    
}
