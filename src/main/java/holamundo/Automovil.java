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
public class Automovil {
    private String marca;
    private String submarca;
    private int modelo;
    private Color color;
    
    public Automovil() {
    }
    public Automovil(String marca, String submarca, int modelo, Color color){
       this.marca = marca;
       this.submarca = submarca;
       this.modelo = modelo;
       this.color = color;
        
      }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setSubMarca(String submarca){
        this.submarca = submarca;
    }
    public void setModelo(int modelo){
        this.modelo = modelo;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public String getMarca(){
        return marca;
    }
    public String getSubMarca(){
        return submarca;
    }
    public int getModelo() {
        return modelo;
    }
    public Color getColor() {
        return color;
    }
}
