public abstract class Cuenta implements Comparable<Cuenta> {

    protected int numero;
    protected String fechaApertura;
    protected double saldo;
    protected String fechaCancelacion;

    public Cuenta(double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
        this.fechaApertura = "2020-01-01";
        this.fechaCancelacion = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cuenta cuenta) {
        return Double.compare(this.saldo, cuenta.saldo);
    }
}
