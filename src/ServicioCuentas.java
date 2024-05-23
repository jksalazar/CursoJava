public interface ServicioCuentas {
    boolean agregarCuenta(Cuenta cuenta);
    boolean cancelarCuenta(int numero);
    void abonarCuenta(int numero, double abono);
    void retirarCuenta(int numero, double retiro);
    Cuenta[] obtenerCuentas();
}
