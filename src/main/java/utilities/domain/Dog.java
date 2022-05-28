package utilities.domain;
import utilities.abstracts.Animal;
import utilities.interfaces.IDog;
import java.util.logging.Logger;

/**
 * CLase de perro que extiende de la animal y a la vez implementa la interfaz de Dog.
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Dog extends Animal implements IDog {
    Logger log = Logger.getLogger(Dog.class.getName());
    private String raza;

    /**
     * Constructor de la clase dog.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    public Dog(String name, String color,String raza) {
        super(name, color);
        this.raza = raza;
    }

    /**
     * Metodo accesor de raza.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Metodo modificador.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Metodo que hace ladrar al perro.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    @Override
    public void ladrar() {
        log.info("Gua gua ");
    }

    /**
     * Metodo que hace saltar al perro.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    @Override
    public void saltar() {
        log.info("Saltando");
    }
}