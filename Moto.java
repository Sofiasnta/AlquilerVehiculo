package co.edu.uniquindio.poo.EmpresaAlquiler;

public class Moto extends Vehiculo{

    TipoCaja caja;

    public enum TipoCaja{
        Automatica, Manual
    }

    public Moto(String placa, String marca, String modelo, int AñoFabricacion, TipoCaja caja) {
        super(placa, marca, modelo, AñoFabricacion);
        this.caja = caja;
    }
    public TipoCaja getCaja() {
    return caja;
    }

    public void setCaja(TipoCaja caja) {
        this.caja = caja;
    }

    public int CalcularCostoReserva(){
        return 2;
    }
    

    

    
  @Override
    public String toString() {
        return "Moto" + super.toString() +" [caja=" + caja + "]";}


}







