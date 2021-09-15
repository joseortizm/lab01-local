package cs.ing.software.lab01;

public class Automovil extends Vehiculo {
    Automovil(double _cantidadCombustible, double _consumoCombustible, double _capacidadTanque) {
        super(_cantidadCombustible, _consumoCombustible, _capacidadTanque);
    }

    @Override
    String  Rebastecer(double _litros) {
        double espacioLibre = this.capacidadTanque - this.cantidadCombustible;

        if (_litros > espacioLibre)
        {
            return "Automovil no se puede reabastecer el tanque, esta lleno.";

        }
        else{
            cantidadCombustible += _litros;
            return "La cantidad de combustible del vehiculo es: "+cantidadCombustible;
        }
    }

}
