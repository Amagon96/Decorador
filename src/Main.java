/**
 * Created by Andree
 */

public class Main {
    public static void main(String[] args) {


        /*

        Funcionalidad original de un carro estandar

        Automovil auto = new CarroEstandar("Chevy");

        auto.start();
        auto.accel();
        auto.stop();
        */

        /**
         * Auto estandar decorado con auto electrico
         */

        /*

        Sin encapsular los new

        Automovil auto = new CarroEstandar("Chevy");

        auto = new AutomovilElectrico(auto);
        auto.start();
        auto.accel();
        auto.stop();
        */

        /**
         * Encapsulando new
         */

        Automovil auto = new AutomovilElectrico(new CarroEstandar("Chevy"));
        auto.start();
        auto.accel();
        auto.stop();

    }
}
