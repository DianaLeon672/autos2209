/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.awt.Color;

/**
 *
 * @author dlaur
 */
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo java");
        
        Persona per1 = new Persona();
        per1.setNombre("Diana LI");
        System.out.println("Nombre:" + per1.getNombre());
        per1.setComer("Hamburguesa hawaiana");
        System.out.println(per1.getNombre() + " esta comiendo " + per1.getComer());
                
        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre per 2:" + per2.getNombre());
        per2.setComer("Pizza hawaiana");
        System.out.println(per2.getNombre() + " esta comiendo " + per2.getComer());
        
        Automovil bocho=new Automovil ();
        System.out.println("El automovil es un: Bocho");
        bocho.setMarca("VW");
        System.out.println("Marca " + bocho.getMarca() );
        bocho.setSubMarca("Sedan");
        System.out.println("SubMarca " +bocho.getSubMarca() );
        bocho.setModelo(1970);
        System.out.println("Modelo " +bocho.getModelo() );
        bocho.setColor(Color.BLUE);
        System.out.println("Color " +bocho.getColor() );
        
        Automovil mustang=new Automovil ();
        System.out.println("El automovil es un: Mustang");
        mustang.setMarca("Ford");
        System.out.println("Marca " + mustang.getMarca() );
        mustang.setSubMarca("Mustan");
        System.out.println("SubMarca " +mustang.getSubMarca() );
        mustang.setModelo(2010);
        System.out.println("Modelo " +mustang.getModelo() );
        mustang.setColor(Color.YELLOW);
        System.out.println("Color " +bocho.getColor() );
        
        Automovil akura=new Automovil ();
        System.out.println("El automovil es un: Akura");
        akura.setMarca("Akura");
        System.out.println("Marca " + akura.getMarca() );
        akura.setSubMarca("NSX");
        System.out.println("SubMarca " +akura.getSubMarca() );
        akura.setModelo(2013);
        System.out.println("Modelo " +akura.getModelo() );
        akura.setColor(Color.GRAY);
        System.out.println("Color " +akura.getColor() );
    }
}
