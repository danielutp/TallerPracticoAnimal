package utilities.abstracts;
import java.util.logging.Logger;

/**
 * CLase Abstracta animal.
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public abstract class Animal {

    protected Logger logger = Logger.getLogger(Animal.class.getName());
    private String name;
    private String color;

    /**
     * Constructor de la clase animal.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    protected Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * Metodo accesor de name.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo modificador de name.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo accesor de color.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo modificador de color.
     *
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     */
    public void setColor(String color) {
        this.color = color;
    }
}