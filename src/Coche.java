import java.util.Scanner;

public class Coche {

    private String marca, modelo, matricula;
    private int cv, cc;
    private double velocidad, kmRecorrido;


    public Coche(){}

    public Coche(String marca, String modelo, String matricula, int cv, int cc){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = 0;
        this.kmRecorrido = 0;
    }

    // GETTERS

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMatricula(){
        return matricula;
    }
    public int getCv(){
        return cv;
    }
    public int getCc(){
        return cc;
    }
    public double getVelocidad(){
        return velocidad;
    }
    public double getKmRecorrido(){
        return kmRecorrido;
    }

    // SETTERS

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public void setKmRecorrido(double kmRecorrido) {
        this.kmRecorrido = kmRecorrido;
    }



    public void acelerar(int aceleracion){ // Aceleracion pedida al llamar al metodo

        // Aceleración mínima 10????
        if (aceleracion < 10) {
            aceleracion = 10;
        }

        if(cv < 100){
            velocidad += (Math.random()*aceleracion);
            kmRecorrido += velocidad*0.5;
        } else {
            velocidad += (Math.random()*aceleracion)+10;
            kmRecorrido += velocidad*0.5;
        }
    }

    public void acelerar(){ // Aceleración pedida por consola al llamar al metodo


        double aceleracion = (Math.random()*50)+25;

        if (aceleracion < 10) {
            aceleracion = 10;
        }

        if(cv < 100){
            velocidad += (Math.random()*aceleracion);
            kmRecorrido += velocidad*0.5;
        } else {
            velocidad += (Math.random()*aceleracion)+10;
            kmRecorrido += velocidad*0.5;
        }
    }

    public void mostrarDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Matricula: "+matricula);
        System.out.println("CV: "+cv);
        System.out.println("CC: "+cc);
        System.out.printf("Velocidad: %.2f Km/h",velocidad);
        System.out.println();
        System.out.printf("Kilometros recorridos: %.2f Km",kmRecorrido);

    }

}
