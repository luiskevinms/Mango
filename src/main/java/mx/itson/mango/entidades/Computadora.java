/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.entidades;

/**
 *
 * @author alumnog
 */
public class Computadora extends DispositivoElectronico {
    
    private int memoriaRam;
    private int espacioDisco;
    
    public Computadora(String marca, String modelo, String color, int memoriaRam, int espacioDisco){
        super(marca,modelo,color);
        this.memoriaRam = memoriaRam;
        this.espacioDisco = espacioDisco;
    }
    
    public String disminuirEspacio (int cantidad) {
        if (cantidad > espacioDisco){
            return "El tamaño del archivo excede el espacio disponible";
        }else {
            this.espacioDisco -= cantidad;
            return "La cantidad total del espacio actualizado es " + this.espacioDisco;
            
        }
              
    }
    
    @Override
    public double calcularDepreciacion(double precio){
        return precio * 0.12;
}
    
}
