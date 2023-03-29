
package Entidades;

import java.util.Scanner;


public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    

    public void crearRectangulo(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo : ");
        base=leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo : ");
        altura=leer.nextInt();    
    }
    
    public int superficie(){
        return base*altura;
    }
    
    public int perimetro(){
        return (base+altura)*2;
    }
    
    public void dibujaRectangulo(){
        for(int a=0;a<altura;a++){
            for(int b=0;b<base;b++){
                if(a==0||a==altura-1){
                    System.out.print("*");
                }else if(a>0&&b==0||b==base-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
