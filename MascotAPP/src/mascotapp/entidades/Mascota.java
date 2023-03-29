package mascotapp.entidades;

public class Mascota {

    // Atributos
    private String nombre;
    private String apodo;
    //Conejo, Gato, Perro, Loro, Carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    
    private int energia;
    

    //Constructores
        //Constructor sin parámetros
    public Mascota(){
        energia=1000;
    }

        //Constructor con varios parámetros
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre=nombre;
        this.apodo=apodo;
        this.tipo=tipo;
        energia=1000;

    }
    
            //Constructor con todos parámetros
        public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        
        if(tipo.equals("Perro")||tipo.equals("Gato")||tipo.equals("Loro")||tipo.equals("Conejo")||tipo.equals("Carpincho")){
            this.tipo=tipo;
        }
        
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        energia=1000;

    }

       
    //Geter y Seter
    
    //Esto va a permitir el cambio del contenido de este atributo cuando tos los atributos son privados o estan encapsulados
    public void setNombre(String nombre){
        //puede ser así 
        //this.nombre=nombre;
        
        //o usando validación, po ejemplo según la longitud de contenido de atributo lo permito cambiar o no, así
        if(nombre.length()>0){
            this.nombre=nombre;
        }
    }

    // SETERS
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    //GETERS
    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    //Metrodos funcionales
    /**
     * 
     * @param energiaRestar
     * @return 
     */
    public int pasear(int energiaRestar){
        // energia-=energiaResar; Tambien se puede usar así
        energia=energia-energiaRestar;
        return energia;
    }
    
    //To String    
    //genera una funcion que devuelve un mensaje formateado y armado según cada mascota 

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
    
}
