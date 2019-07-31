package abstract_clases;

/*
    Pueden tener tanto métodos abstractos que serán definidos en las clases hijas o métodos normales que se definen en esta clase.

    Una clase abstracta podría no tener métodos abstractos, pero al definirla como abstracta no puede ser instanciada y prevengo
    que nadie cree una instancia de Figura ya que por si sola la clase no tiene sentido
 */
public abstract class Figura {

    String name;

    public String getName() {
        return name;
    }

    public abstract Double getArea();
}
