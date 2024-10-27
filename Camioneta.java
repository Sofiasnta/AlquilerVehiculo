package co.edu.uniquindio.poo.EmpresaAlquiler;

public class Camioneta extends Vehiculo{

    private int CapacidadCarga;

    public Camioneta(String placa, String marca, String modelo, int AñoFabricacion, int capacidadCarga) {
        super(placa, marca, modelo, AñoFabricacion);
        CapacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        CapacidadCarga = capacidadCarga;
    }

    public int CalcularCostoReserva(){
        return 2;
    }

    @Override
    public String toString() {
        return "Camioneta" + super.toString() + "[CapacidadCarga=" + CapacidadCarga + "]";
    }


}
