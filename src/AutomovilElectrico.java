public class AutomovilElectrico extends AutomovilDecorador {

    public AutomovilElectrico(Automovil auto) {
        super(auto);
    }

    @Override
    public void accel() {
        System.out.println("Acelerando carro electico");
        getAuto().accel();
    }

    @Override
    public void stop() {
        System.out.println("Frenando carro electrico");
        getAuto().stop();
    }

    @Override
    public void start() {
        System.out.println("Encendiendo carro electrico");
        getAuto().start();
    }
}
