public class CuentaDeAhorro extends Cuenta{
    private double tasaInteresMensual;

    public CuentaDeAhorro(double saldo, int numero, double tasaInteresMensual) {
        super(saldo, numero);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double calcularIntereses(){
        return saldo * tasaInteresMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "numero=" + numero +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }
}
