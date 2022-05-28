package utilities;
import utilities.abstracts.Animal;
import utilities.domain.Cat;
import utilities.domain.Dog;
import java.util.logging.Logger;

/**
 * Ejercicio practico en clase para el manejo de clases abstractas e interfaces.
 *
 * @version 1.0.0 2022-05-27
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Animal.class.getName());
        Dog dog = new Dog("Firulais","Gris","pastor");
        Cat cat = new Cat("michi","cafe",23);

        logger.info("El Perro ladra : \n");
        dog.ladrar();
        logger.info("Firulais salta... \n");
        dog.saltar();
        logger.info("michi ve a cazar... \n");
        cat.cazar();
        logger.info("llegaste muy sucio a bañarse... \n");
        cat.banarse();
    }
}