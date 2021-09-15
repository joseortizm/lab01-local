package cs.ing.software.lab01;

public class Vehiculo {
    double cantidadCombustible;
    double consumoCombustible;
    double capacidadTanque;

    Vehiculo(double _cantidadCombustible, double _consumoCombustible, double _capacidadTanque){
        this.cantidadCombustible = _cantidadCombustible;
        this.consumoCombustible = _consumoCombustible;
        this.capacidadTanque = _capacidadTanque;
    }

    String Rebastecer(double _litros){
        return "";
    }

    String Manejar(double _km){
        double combustibleRequiere = _km*this.consumoCombustible;
        if(cantidadCombustible-combustibleRequiere<0){
            return ("Vehiculo necesita reabastecimiento de combustible");
        }
        else{
            this.cantidadCombustible -=combustibleRequiere;
            return ("Vehiculo viajó " +(_km)+" km y aún tiene " +String.format("%.2f",cantidadCombustible,2)+ " de combustible");
        }
    }

}
