import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoy es día de carreras");

        System.out.println("Introduce la información del primer corredor.");
        System.out.println();
        System.out.println("Introduce la marca del coche 1:");
        String marca1 = scanner.nextLine();
        System.out.println();
        System.out.println("Introduce el modelo del coche 1:");
        String modelo1 = scanner.nextLine();
        System.out.println();
        System.out.println("Introduce la matrícula del coche 1:");
        String matricula1 = scanner.nextLine();
        System.out.println();
        System.out.println("Introduce la potencia (CV) del coche 1:");
        int cv1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.println("Introduce el cubicaje del motor (CC) del coche 1:");
        int cc1 = scanner.nextInt();
        scanner.nextLine();

        Coche coche1 = new Coche(marca1,modelo1,matricula1,cv1,cc1);

        System.out.println("Introduce la información del segundo corredor.");
        System.out.println();
        System.out.println("Introduce la marca del coche 2:");
        String marca2 = scanner.nextLine();
        System.out.println();
        System.out.println("Introduce el modelo del coche 2:");
        String modelo2 = scanner.nextLine();
        System.out.println();
        System.out.println("Introduce la matrícula del coche 2:");
        String matricula2 = scanner.nextLine();
        System.out.println();
        System.out.println("Introduce la potencia (CV) del coche 2:");
        int cv2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.println("Introduce el cubicaje del motor (CC) del coche 2:");
        int cc2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        Coche coche2 = new Coche(marca2,modelo2,matricula2,cv2,cc2);

        //Coche cocheA = new Coche("Toyota","Corola","Turbo 123",140,1100);
        //Coche cocheB = new Coche("Honda","Civic","Speed 200",184,1238);

        System.out.println("Introduce los datos de la carrera.");
        System.out.println();
        System.out.println("Introduce los kilómetros de la carrera:");
        int kmTotales = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.println("Introduce el número de vueltas:");
        int numVueltas = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        Carrera carrera = new Carrera(kmTotales,numVueltas);

        //Carrera superRace = new Carrera(1000,10);
        //superRace.iniciarCarrera(coche1,coche2);

        carrera.iniciarCarrera(coche1,coche2);

    }
}
