
package Servicio;

import Entidades.ParDeNumeros;

public class ParDeNumerosServicio {
    ParDeNumeros par=new ParDeNumeros(0,0);
    public void mostrarValores(ParDeNumeros par){
        System.out.println("El primer número es: "+par.getNumero1());
        System.out.println("El segundo número es: "+par.getNumero2());
    }
    
    public double devolverMayor(ParDeNumeros par){
        if (par.getNumero1()>par.getNumero2()){
            return par.getNumero1();
        }else {
            return par.getNumero2();
        }
    }
    
    public double calcularPotencia(ParDeNumeros par){
        double mayor=devolverMayor(par);
        double menor=(mayor==par.getNumero1())?par.getNumero2():par.getNumero1();
        mayor=Math.round(mayor);
        menor=Math.round(menor);
        return Math.pow(mayor,menor);
    }

    public double calcularRaiz(ParDeNumeros par){
        double menor=(par.getNumero1()<par.getNumero2())?par.getNumero1():par.getNumero2();
        menor=Math.abs(menor);
        return Math.sqrt(menor);
    }
}
