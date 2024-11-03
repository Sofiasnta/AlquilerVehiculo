package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo{

    private int CapacidadCarga;
    private int TarifaBase;

    public Camioneta(String placa, String marca, String modelo, int AñoFabricacion, int capacidadCarga) {
        super(placa, marca, modelo, AñoFabricacion);
        this.CapacidadCarga = capacidadCarga;
        this.TarifaBase=10000;
    }

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        CapacidadCarga = capacidadCarga;
    }
    public int getTarifaBase(){
        return TarifaBase;
    }

    public void setTarifaBase(int tarifabase){
        this.TarifaBase=tarifabase;
    }

    public int CalcularCosto(int dias){
        return 2;
    }

    @Override
    public String toString() {
        return "Camioneta" + super.toString() + "[CapacidadCarga=" + CapacidadCarga + "]";
    }
}
