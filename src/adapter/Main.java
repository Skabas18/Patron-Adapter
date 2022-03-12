/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

/**
 *
 * @author estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Adaptador miAdaptador = new Adaptador();

        miAdaptador.consignarPesos(5000000);
        System.out.println("Saldo de la cuenta: "+miAdaptador.getSaldo() +" Dolares");
        miAdaptador.retirarPesos(3000000);
        System.out.println("Saldo de la cuenta: "+miAdaptador.getSaldo() +" Dolares");
}
    
}
