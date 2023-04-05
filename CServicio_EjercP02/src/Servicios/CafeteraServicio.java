
package Servicios;

import Entidades.Cafetera;

public class CafeteraServicio {
    Cafetera cafe=new Cafetera(1500, 500);
    
    
    public void llenarCafetera(){
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }
    
    public void servirTaza(int ctdad){
        if(cafe.getCantidadActual()>=ctdad){
            cafe.setCantidadActual(cafe.getCantidadActual()-ctdad);
            System.out.println("Servido, se llenó la taza");
        }else{
            System.out.println("No se lleno la taza, solo "+cafe.getCantidadActual()+"ml");
            cafe.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(){
        cafe.setCantidadActual(0);
    }
    
    public void agregarCafe(int ctdad){
        if(cafe.getCapacidadMaxima()>=ctdad){
            cafe.setCantidadActual(cafe.getCapacidadMaxima());
            System.out.println("Se agregó la cantidad de cafe solicitada");
        }else{
            System.out.println("No se agregó porque excede la capacidad de la cafetera");
        }
    }
    
    public void mostrarCtdad(){
        System.out.println(cafe);
    }
    
}
