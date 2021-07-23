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
public class ChainOfResponsability {
    
    public class Comprador{
        private String[] productosComprados;
        private String direccion;
        private String cedula;

        public Comprador(String[] productosComprados, String direccion, String cedula) {
            this.productosComprados = productosComprados;
            this.direccion = direccion;
            this.cedula = cedula;
        }
        
        private void realizarCambio(String producto){
            System.out.println("Realizando cambio de:  "+ producto);
        }
    }
    
    public interface ManejadorCambio{
        public void delegarCambio(ManejadorCambio manejador);
    }
    
    public class TrabajadorCambio implements ManejadorCambio{
        String posicion, departamento, codigo;

        @Override
        public void delegarCambio(ManejadorCambio manejador) {
            System.out.println("delegando cambio a manejador en parametro:  ");
        }
        
        
    }
    public class AsistenteProducto extends TrabajadorCambio{
        
        private Boolean verificarPeriodoGarantia(){
            System.out.println("verificando periodo de garantia");
            
            return true;
        }
        @Override
        public void delegarCambio(ManejadorCambio manejador) {
            System.out.println("delegando cambio a manejador en parametro:  "); 
        }
    }
    public class TrabajadorTecnico extends TrabajadorCambio{
        
        private Boolean verificarTipoDeFallo(){
            System.out.println("verificando periodo de garantia");
            
            return true;
        }
        @Override
        public void delegarCambio(ManejadorCambio manejador) {
            System.out.println("delegando cambio a manejador en parametro:  "); 
        }
    }
    public class JefeInventario extends TrabajadorCambio{
        
        private Boolean verificarStock(){
            System.out.println("verificando periodo de garantia");
            
            return true;
        }
        @Override
        public void delegarCambio(ManejadorCambio manejador) {
            System.out.println("delegando cambio a manejador en parametro:  "); 
        }
        private Boolean AprobarCambio(){
            System.out.println("Cambio Aprovado");
            return true;
        }
        
        
    }
    public class GerenteTienda extends TrabajadorCambio{
       
        @Override
        public void delegarCambio(ManejadorCambio manejador) {
            System.out.println("delegando cambio a manejador en parametro:  "); 
        }
        private Boolean AprobarCambio(){
            System.out.println("Cambio Aprovado");
            return true;
        }
    }
    
}
