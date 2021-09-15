package cs.ing.software.lab01;

import java.util.logging.Logger;

public class Laboratorio01 {
    static final Logger logger = Logger.getLogger(Laboratorio01.class.getName());
    static double combustibleConsumoVehiculo = 0.9;
    static double combustibleConsumoCamion = 1.6;
    static double tanqueCapacidad = 100;
    public static void main(String[] args) {
        //logger.info("hola mundo");
        double cantidadCombustible = 10;
        Automovil toyota = new Automovil(cantidadCombustible,combustibleConsumoVehiculo,tanqueCapacidad);
        logger.info(toyota.Manejar(12));
        Camion volvo = new Camion(cantidadCombustible,combustibleConsumoCamion,tanqueCapacidad);
        logger.info(volvo.Manejar(4));



    }
}
