package abstract_clases;

public class Cuadrado extends Figura {

    private Double lado;

    @Override
    public Double getArea() {
        return lado*lado;
    }
}
