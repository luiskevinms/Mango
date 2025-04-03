/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.entidades;

/**
 *
 * @author alumnog
 */
public abstract class DispositivoElectronico {
    
    private String marca;
    private String modelo;
    private String color;
    
    public DispositivoElectronico (String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public String encender() {
        return "El dispositivo electronico está encendido";
    }
    
    public abstract double calcularDepreciacion (double precio);
}
