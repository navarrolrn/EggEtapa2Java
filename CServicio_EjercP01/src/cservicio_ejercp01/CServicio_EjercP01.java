
package cservicio_ejercp01;

import Servicios.CuentaBancariaServicios;
import java.util.Scanner;



public class CServicio_EjercP01 {


    public static void main(String[] args) {
       CuentaBancariaServicios cuentas = new CuentaBancariaServicios();
       Scanner leer=new Scanner(System.in);
       boolean salir=false;
       while (!salir){
           System.out.println("Banco Automático");
           System.out.println("\nSELECCIONA una opcion(numero): "
           + "\n1.Crear Cuenta "
           + "\n2.Ingresar Dinero"
           + "\n3.Retirar Dinero"
           + "\n4.Extracción Rápida"
           + "\n5.Consultar Saldo"
           + "\n6.Consultar Datos"
           + "\n7.Salir \n");

           int varRespuesta = leer.nextInt();
           switch (varRespuesta) {
               case 1:
                   cuentas.crearCuenta();
                   break;
               case 2:
                   cuentas.ingresar();
                   break;
               case 3:
                   cuentas.retirar();
                   break;
               case 4:
                   cuentas.extraccionRapda();
                   break;
               case 5:
                   cuentas.consultarSaldo();
                    break;
               case 6:
                   cuentas.consultarDatos();
                    break;
               case 7:
                   salir=true;
                   break;
               default:
                   System.out.println("INGRESO UNA OPCION INCORRECTA");
            }
       }
       
    }
    
}
