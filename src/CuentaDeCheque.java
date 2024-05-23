public class CuentaDeCheque extends Cuenta {
    private double costoManejoMensual;

    public CuentaDeCheque(double saldo, int numero, double costoManejoMensual) {
        super(saldo, numero);
        this.costoManejoMensual = costoManejoMensual;
    }

    public double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeCheque{" +
                "costoManejoMensual=" + costoManejoMensual +
                ", numero=" + numero +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }
}
