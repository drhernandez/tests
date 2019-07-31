package patterns.strategy;

public class SinostarImp implements I3PL{

    @Override
    public void generateLabel() {
        createLabel();
        postearEtiqueta();
    }

    private void createLabel() {
        System.out.printf("%s --> Creando la etiqueta\n", this.getClass());
    }

    private void postearEtiqueta() {
        System.out.printf("%s --> Posteando etiqueta\n", this.getClass());
    }
}
