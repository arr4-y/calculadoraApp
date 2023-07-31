/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class OperacionTiempoEncuentro extends OperacionTiempo {

    private double velocidad1;
    private double velocidad2;

    public OperacionTiempoEncuentro(double velocidad1, double velocidad2, double distancia, double velocidad) {
        super(distancia, velocidad);
        this.velocidad1 = velocidad1;
        this.velocidad2 = velocidad2;
    }

    

    public OperacionTiempoEncuentro() {
    }
    

    @Override
    public void calcular() {
        double tiempoEncuentro = distancia / (velocidad2 + velocidad1);
        setResultado(tiempoEncuentro);
    }
}
