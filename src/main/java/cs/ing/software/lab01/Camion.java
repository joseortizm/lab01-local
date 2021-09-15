package cs.ing.software.lab01;

public class Camion extends Vehiculo{
    Camion(double _cantidadcombustible, double _consumocombustible, double _capacidadtanque) {
        super(_cantidadcombustible, _consumocombustible, _capacidadtanque);
    }
    String Rebastecer(double _litros){
        double espacioLibre = this.capacidadTanque - this.cantidadCombustible;
        if (_litros > espacioLibre)
        {
            return "Camion no se puede reabastecer el tanque, esta lleno";

        }
        else{
            this.cantidadCombustible += (_litros * 0.95);
            return "La cantidad de combustible del camion es: "+cantidadCombustible;
        }

    }

    @Override
    String Manejar(double _km) {
        double combustibleRequiere = _km*this.consumoCombustible;
        if(cantidadCombustible-combustibleRequiere<0){
            return "Camion necesita reabastecimiento de combustible";
        }
        else{
            this.cantidadCombustible -=combustibleRequiere;
            return ("Camion viajó " +(_km)+" km y aún tiene " +String.format("%.2f",cantidadCombustible,2)+ " de combustible");
        }
    }

}
