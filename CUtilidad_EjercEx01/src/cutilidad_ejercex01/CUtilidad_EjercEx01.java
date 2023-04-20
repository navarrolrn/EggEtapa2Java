
package cutilidad_ejercex01;

import java.util.Scanner;

public class CUtilidad_EjercEx01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String entradaTeclado;
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio",
                        "agosto","septiembre","octubre","noviembre","diciembre"};
        String mesSecreto = meses[6];

        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        entradaTeclado = sc.nextLine();
        while (!entradaTeclado.equals(mesSecreto)){
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            entradaTeclado = sc.nextLine();
        }
        System.out.println("¡Ha acertado!");
    }
    
}
