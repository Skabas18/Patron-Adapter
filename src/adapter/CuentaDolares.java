/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author estudiante
 */
public class CuentaDolares {
    private double dolares =0;

public CuentaDolares(){}
    public double getSaldoDolares(){
    return this.dolares;
    }
    public void retirarDolares(double dolares){
    this.dolares -= dolares;
    }
    public void consignarDolares(double dolares){
    this.dolares += dolares;
    }


}
