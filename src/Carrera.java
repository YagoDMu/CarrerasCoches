import java.util.Scanner;

public class Carrera {

    Coche coche1 = new Coche();
    Coche coche2 = new Coche();

    Coche ganador = new Coche();

    int kmTotales,numVueltas;

    public Carrera(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta el número de Km totales:");
        this.kmTotales = scanner.nextInt();
        System.out.println("Inserta el número de vueltas:");
        this.numVueltas = scanner.nextInt();

    }

    public Carrera(int kmTotales,int numVueltas){
        this.kmTotales = kmTotales;
        this.numVueltas = numVueltas;

    }

    public void setKmTotales(int kmTotales){
        this.kmTotales = kmTotales;
    }
    public void setNumVueltas(int numVueltas){
        this.numVueltas = numVueltas;
    }
    public int getKmTotales(int kmTotales){
        return kmTotales;
    }
    public int getNumVueltas(int numVueltas){
        return numVueltas;
    }

    public void iniciarCarrera(Coche coche1,Coche coche2){
        Scanner scanner = new Scanner(System.in);

        String reset = "\u001B[0m";
        String cian = "\u001B[36m";
        String verde = "\u001B[32m";

        this.coche1 = coche1;
        this.coche2 = coche2;
        System.out.println(cian+"Información del primer corredor:");
        coche1.mostrarDatos();
        System.out.println();
        System.out.println();
        System.out.println(verde+"Información del segudo corredor:");
        coche2.mostrarDatos();
        System.out.println();
        System.out.println();
        System.out.println(reset+"¡INICIA LA CARRERA!");

        for (int i = 0; i < numVueltas; i++) {

            coche1.acelerar();
            coche2.acelerar();
            System.out.println(reset+"Vuelta número "+(i+1));
            System.out.printf(cian+"El participante 1 ha recorrido %.2f Km y va a %.2f Km/h",coche1.getKmRecorrido(),coche1.getVelocidad());
            System.out.println();
            System.out.printf(verde+"El participante 2 ha recorrido %.2f Km y va a %.2f Km/h",coche2.getKmRecorrido(),coche2.getVelocidad());
            System.out.println();
            scanner.nextLine();
        }

        if(coche1.getKmRecorrido() < kmTotales && coche2.getKmRecorrido() < kmTotales){
            int vueltasRealizadas = numVueltas;
            do{
                coche1.acelerar();
                coche2.acelerar();
                vueltasRealizadas++;
                System.out.println(reset+"Vuelta número "+vueltasRealizadas);
                System.out.printf(cian+"El participante 1 ha recorrido %.2f Km y va a %.2f Km/h",coche1.getKmRecorrido(),coche1.getVelocidad());
                System.out.println();
                System.out.printf(verde+"El participante 2 ha recorrido %.2f Km y va a %.2f Km/h",coche2.getKmRecorrido(),coche2.getVelocidad());
                System.out.println();
                scanner.nextLine();

            }while(coche1.getKmRecorrido() < kmTotales && coche2.getKmRecorrido() < kmTotales);
        }

        if(coche1.getKmRecorrido() > coche2.getKmRecorrido()){
            ganador = coche1;
            System.out.println(cian+"El ganador ha sido el Coche 1!!");
            coche1.mostrarDatos();
        }else if(coche1.getKmRecorrido() < coche2.getKmRecorrido()){
            ganador = coche2;
            System.out.println(verde+"El ganador ha sido el Coche 2!!");
            coche2.mostrarDatos();
        } else {
            System.out.println(reset+"Hubo un empate!!!");
        }




    }





}
