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
public class ProductFactory {
    
    public interface EquipoElectronico{
        public void mostrarPrecio();
        public void mostrarDescripcion();
        public void cambiarPrecio(double nuevoPrecio);
    }
    
    public class SmartPhone implements EquipoElectronico{
        double precio;
        String descripcion;
        String imagen;
        //ignorando constructor y metodos getters and setter para simplificacion del codigo

        @Override
        public void mostrarPrecio() {
           System.out.println("precio es: "+precio) ; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mostrarDescripcion() {
            System.out.println("su smartphone contiene: "+descripcion); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void cambiarPrecio(double nuevoPrecio) {
            this.precio=nuevoPrecio;
          System.out.println("Precio cambiado")  ; //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public class Computadora implements EquipoElectronico{
        double precio;
        String descripcion;
        String imagen;
        //ignorando constructor y metodos getters and setter para simplificacion del codigo

        @Override
        public void mostrarPrecio() {
           System.out.println("precio es: "+precio) ; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mostrarDescripcion() {
            System.out.println("su smartphone contiene: "+descripcion); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void cambiarPrecio(double nuevoPrecio) {
            this.precio=nuevoPrecio;
          System.out.println("Precio cambiado")  ; //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public class Electrodomestico implements EquipoElectronico{
        double precio;
        String descripcion;
        String imagen;
        //ignorando constructor y metodos getters and setter para simplificacion del codigo

        @Override
        public void mostrarPrecio() {
           System.out.println("precio es: "+precio) ; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mostrarDescripcion() {
            System.out.println("su smartphone contiene: "+descripcion); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void cambiarPrecio(double nuevoPrecio) {
            this.precio=nuevoPrecio;
          System.out.println("Precio cambiado")  ; //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public abstract class EquipoFabrica{
        private EquipoElectronico equipo;
        
        public abstract EquipoElectronico crearEquipoElectronico();
    }    
    
    public class CreadorSmartphone extends EquipoFabrica{

        @Override
        public EquipoElectronico crearEquipoElectronico() {
            System.out.println("Se creó un smartphone");
            return null;//To change body of generated methods, choose Tools | Templates.
        }   
    }
    public class CreadorComputadora extends EquipoFabrica{

        @Override
        public EquipoElectronico crearEquipoElectronico() {
            System.out.println("Se creó una computadora");
            return null;//To change body of generated methods, choose Tools | Templates.
        }   
    }
    public class CreadorElectrodomestico extends EquipoFabrica{

        @Override
        public EquipoElectronico crearEquipoElectronico() {
            System.out.println("Se creó un electrodomestico");
            return null;//To change body of generated methods, choose Tools | Templates.
        }   
    }
    
    
    
}
