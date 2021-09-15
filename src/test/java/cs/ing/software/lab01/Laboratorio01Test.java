package cs.ing.software.lab01;

import org.testng.Assert;
import org.testng.annotations.Test;
import static cs.ing.software.lab01.Laboratorio01.*;

public class Laboratorio01Test {
    @Test
    public void test01(){
        Automovil nissan = new Automovil(10,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan.Rebastecer(500));
        Assert.assertEquals("Automovil no se puede reabastecer el tanque, esta lleno.", nissan.Rebastecer(500));
    }
}
