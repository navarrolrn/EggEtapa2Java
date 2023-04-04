
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicios {
    Scanner leer=new Scanner(System.in);
    CuentaBancaria cuentaClte = new CuentaBancaria();
    
    public void crearCuenta(){
        System.out.println("Aperturas de cuenta");
        System.out.print("Ingrese el número de cuenta: ");
        cuentaClte.setNumCuenta(leer.nextInt());
        System.out.print("Ingrese el DNI             : ");
        cuentaClte.setDniCliente(leer.nextLong());
        System.out.print("Ingrese Saldo Inicial      : ");
        cuentaClte.setSaldoActual(leer.nextDouble());
    }
    
    public void ingresar(){
        double ingMonto;
        System.out.println("Ingreso de Dinero");
        System.out.print("Indique el monto a Ingresar:");
        ingMonto=leer.nextDouble();
        cuentaClte.setSaldoActual(cuentaClte.getSaldoActual()+ingMonto);
    }
    
    public void retirar(){
        double retMonto;
        System.out.println("Retiro de Dinero");
        System.out.print("Indique el monto a Retirar:");
        retMonto=leer.nextDouble();
        if(cuentaClte.getSaldoActual()<retMonto){
            System.out.println("Saldo insuficiente, solo puede retirar "+cuentaClte.getSaldoActual());
            cuentaClte.setSaldoActual(0);
        }else{
            cuentaClte.setSaldoActual(cuentaClte.getSaldoActual()-retMonto);
        }
        System.out.println("Retiro procesado...");
    }
    
    public void extraccionRapda(){
        do{
            double retMonto;
            System.out.println("Extración Rápida (Máximo 20% del Saldo)");
            System.out.print("Indique el monto a Retirar:");
            retMonto=leer.nextDouble();
            if((cuentaClte.getSaldoActual()*0.2)<retMonto){
                System.out.println("El retiro no puede exceder el 20% de su saldo "+(cuentaClte.getSaldoActual()*0.20));
            }else{
                cuentaClte.setSaldoActual(cuentaClte.getSaldoActual()-retMonto);
                System.out.println("Retiro procesado...");
                break;
            }
        }while(true);
    }
    
    public void consultarSaldo(){
        System.out.print("Saldo disponible: "+cuentaClte.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println(cuentaClte);
    }
}
