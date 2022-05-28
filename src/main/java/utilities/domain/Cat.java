package utilities.domain;
import utilities.abstracts.Animal;
import utilities.interfaces.ICat;
import java.util.logging.Logger;

/**
 * CLase de gato que extiende de la animal y a la vez implementa la interfaz de Dog.
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Cat extends Animal implements ICat {
    Logger logger = Logger.getLogger(Animal.class.getName());

    private int peso;

    /**
     * Constructor de la clase cat.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    public Cat(String name, String color,int peso) {
        super(name, color);
        this.peso = peso;
    }

    /**
     * Metodo accesor de raza.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Metodo modificador de peso.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Metodo que hace cazar al gato.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    @Override
    public void cazar() {
        logger.info("cazando ");
    }

    /**
     * Metodo que hace bañarse al gato.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    @Override
    public void banarse() {
        logger.info("bañandose ");
    }
}