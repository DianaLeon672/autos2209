/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author dlaur
 */
public class Persona {
    private String nombre;
    private int edad;
    private String comida;
    
    public Persona() {
        
    }
   
    //metodo constructor sobrecargado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //metodo de uso gral.
    public String getNombre() {
        return nombre;
    }
            
   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   public String getComer() {
       return comida;
   }
   public void setComer(String comida){
       this.comida = comida;
   }
}
