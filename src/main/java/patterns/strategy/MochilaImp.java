package patterns.strategy;

public class MochilaImp implements I3PL {

    @Override
    public void generateLabel() {
        crearLabel();
    }

    private void crearLabel() {
        System.out.printf("%s --> Creando la etiqueta\n", this.getClass());
    }
}
