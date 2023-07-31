/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

public class OperacionTiempoAlcance extends OperacionTiempo {

    private double velocidad1;
    private double velocidad2;

    public OperacionTiempoAlcance(double velocidad1, double velocidad2, double distancia, double velocidad) {
        super(distancia, velocidad);
        this.velocidad1 = velocidad1;
        this.velocidad2 = velocidad2;
    }
    
    
    


    public OperacionTiempoAlcance() {
    }
    
    @Override
    public void calcular() {
        // Calcular el tiempo de alcance
        double tiempoAlcance = distancia / (velocidad2 - velocidad1);
        setResultado(tiempoAlcance);
    }
}
