/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpatterns;

import java.util.Date;

/**
 *
 * @author Hp
 */
public class Visitor {
    
    public interface Producto{
        public void aceptarVisualizacion();
    }
   
    private class ProductoDisponible implements Producto{
        int Stock;
        Visitante v;

        @Override
        public void aceptarVisualizacion() {
            System.out.println("Aceptando la visualizacion para visitante"); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class ProductoDisponibleTienda implements Producto {
        int stock;
        String tienda;

        @Override
        public void aceptarVisualizacion() {
            System.out.println("Aceptando la visualizacion para visitante"); //To change body of generated methods, choose Tools | Templates.
        }

       
    }

    private class ProductoReparacion implements Producto{
        int diasParaSalir;
        double costo;
       
        @Override
        public void aceptarVisualizacion() {
            System.out.println("Aceptando la visualizacion para visitante"); //To change body of generated methods, choose Tools | Templates.
        }

        
    }
    
    public interface Visitante{
        public void visitar(ProductoDisponible producto);
        public void  visitar(ProductoDisponibleTienda producto);
        public void visitar(ProductoReparacion producto);
    }
    
    public class CompradorWeb{
        String direccion;
        String[] compras;
        
        public void visitar(ProductoDisponible producto){      
            producto.aceptarVisualizacion();
            
            
        }
        public void  visitar(ProductoDisponibleTienda producto){
            System.out.println("no puede visualizar esta pagina");
            
        }
        public void visitar(ProductoReparacion producto){
            System.out.println("no puede visitar esta pagina");
            
        }
        
    }
    public class VendedorTienda{
        Date fechaEntrega;
        String [] compras;
        
        public void visitar(ProductoDisponible producto){
            System.out.println("no puede visualizar esta pagina");
            
        }
        public void  visitar(ProductoDisponibleTienda producto){
            producto.aceptarVisualizacion();  
        }
        public void visitar(ProductoReparacion producto){
            System.out.println("no puede visualizar esta pagina");
        }
        
    }
    public class Proveedor{
        String[] productos;
        
        public void visitar(ProductoDisponible producto){
            System.out.println("no puede visualizar esta pagina");
            
        }
        public void  visitar(ProductoDisponibleTienda producto){
            System.out.println("no puede visualizar esta pagina");
            
        }
        public void visitar(ProductoReparacion producto){
            producto.aceptarVisualizacion();  
            
        }
        
    }
 
    
    
}
