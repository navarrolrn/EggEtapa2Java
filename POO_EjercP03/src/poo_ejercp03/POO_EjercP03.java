
package poo_ejercp03;

import Entidades.Operacion;


public class POO_EjercP03 {


    public static void main(String[] args) {
        Operacion oper=new Operacion();
        oper.crearOperacion();
        System.out.println("Sumar :"+oper.sumar());
        System.out.println("Restar :"+oper.restar());
        System.out.println("Multiplicar :"+oper.multiplicar());
        System.out.println("Dividir :"+oper.dividir());

    }
    
}
