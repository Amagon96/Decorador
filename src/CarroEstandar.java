
/**
 * Created by Andree
 */

public class CarroEstandar implements Automovil {

    public String nombre;

    public CarroEstandar(String s){
        nombre = s;
    }

    @Override
    public void accel() {
        System.out.println("acelerando el auto");
    }

    @Override
    public void stop() {
        System.out.println("deteniendo el auto");
    }

    @Override
    public void start() {
        System.out.println("prendiendo el carro");
    }
}
