public class Entrada {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Toyota","Corola","Turbo 123",140,1100);
        Coche coche2 = new Coche("Honda","Civic","Speed 200",184,1238);

        Carrera superRace = new Carrera(1000,10);

        superRace.iniciarCarrera(coche1,coche2);



    }
}
