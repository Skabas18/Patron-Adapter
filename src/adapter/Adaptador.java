/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author estudiante
 */
public class Adaptador implements IAdaptador{
    CuentaDolares miCuentaDolares= new CuentaDolares();
    public Adaptador(){}
    public double getSaldo(){
        return this.miCuentaDolares.getSaldoDolares();
    }
    public void retirarPesos(double pesos){

    double dolares= pesos/3817;
    miCuentaDolares.retirarDolares(dolares);
    }

    public void consignarPesos(double pesos){
    double dolares= pesos/3817;
    miCuentaDolares.consignarDolares(dolares);
   }
}
