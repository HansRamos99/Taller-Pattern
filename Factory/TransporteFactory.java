/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpatterns;

/**
 *
 * @author Hp
 */
public class TransporteFactory {
    
    public interface Transporte{
        public void enviarPaquete(String producto, String direccion);
    }
    
    public class Terrestre implements Transporte{
        String[] productos;
        String direccion;

        @Override
        public void enviarPaquete(String producto, String direccion) {
            System.out.println("Agregando paquete a envio"); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    public abstract class CreadorTransporte{   
        Transporte transporte;       
        public abstract Transporte crearTransporte();
    }
    
    public class CreadorTerrestre extends CreadorTransporte{

        @Override
        public Transporte crearTransporte() {
            System.out.println("Creando nuevo transporte terrestre"); 
            return null;//To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    
    
}
