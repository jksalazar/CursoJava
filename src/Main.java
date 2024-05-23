//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Crear domicilios
        Domicilio domicilio1 = new Domicilio("Calle A", 123, "Colonia A", "Estado A", 12345);
        Domicilio domicilio2 = new Domicilio("Calle B", 456, "Colonia B", "Estado B", 67890);

        // Crear clientes
        Cliente cliente1 = new Cliente(1, "Cliente Uno", domicilio1, "RFC1", "1111111111", "1991-01-01");
        Cliente cliente2 = new Cliente(2, "Cliente Dos", domicilio2, "RFC2", "2222222222", "1992-02-02");

        // Crear cuentas
        CuentaDeAhorro cuentaAhorro1 = new CuentaDeAhorro(1001, 5000, 0.02);
        CuentaDeCheque cuentaCheque1 = new CuentaDeCheque(1002, 3000, 50.0);
        CuentaDeAhorro cuentaAhorro2 = new CuentaDeAhorro(1003, 7000, 0.03);
        CuentaDeCheque cuentaCheque2 = new CuentaDeCheque(1004, 4000, 60.0);

        // Asignar cuentas a clientes
        cliente1.getCuentas().add(cuentaAhorro1);
        cliente1.getCuentas().add(cuentaCheque1);
        cliente2.getCuentas().add(cuentaAhorro2);
        cliente2.getCuentas().add(cuentaCheque2);

        // Crear banco y agregar clientes
        Domicilio domicilioBanco = new Domicilio("Calle Banco", 789, "Colonia Banco", "Estado Banco", 54321);
        Banco banco = new Banco("Banco XYZ", domicilioBanco, "RFCB", "3333333333");
        banco.getClientes().add(cliente1);
        banco.getClientes().add(cliente2);

        //Validar funcionamiento Taller clase 2
        banco.agregarCliente(cliente1);
        cliente1.abonarCuenta(1001, 1000);
        banco.agregarCliente(cliente2);
        cliente2.abonarCuenta(1003, 2000);

        // Imprimir información
        System.out.println(banco);
        for (Cliente cliente : banco.getClientes()) {
            System.out.println(cliente);
            for (Cuenta cuenta : cliente.getCuentas()) {
                System.out.println(cuenta);
            }
        }
    }
}