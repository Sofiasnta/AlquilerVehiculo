package co.edu.uniquindio.poo.EmpresaAlquiler;

public class Auto extends Vehiculo{

    private int Puertas;

    public Auto(String placa, String marca, String modelo, int AñoFabricacion, int puertas) {
        super(placa, marca, modelo, AñoFabricacion);
        this.Puertas = puertas;
    }

    public int getPuertas(){
        return Puertas;
    }

    public void setPuertas(int puertas){
        this.Puertas=puertas;
    }

    public int CalcularCostoReserva(){
        return 2;
    }

    @Override
    public String toString() {
        return "Auto" + super.toString() +" [Puertas=" + Puertas + "]";
    }
}
