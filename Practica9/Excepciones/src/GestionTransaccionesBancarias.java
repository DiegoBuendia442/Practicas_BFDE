import java.util.Scanner;

// Excepciones personalizadas
class DepositoInvalidoException extends Exception {
    public DepositoInvalidoException(String message) {
        super(message);
    }
}

class RetiroInvalidoException extends Exception {
    public RetiroInvalidoException(String message) {
        super(message);
    }
}

class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String message) {
        super(message);
    }
}

// Clase CuentaBancaria
class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double cantidad) throws DepositoInvalidoException {
        if (cantidad < 0) {
            throw new DepositoInvalidoException("El monto a depositar no puede ser negativo.");
        }
        saldo += cantidad;
        System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
    }

    // Método para retirar
    public void retirar(double cantidad) throws RetiroInvalidoException, FondosInsuficientesException {
        if (cantidad < 0) {
            throw new RetiroInvalidoException("El monto a retirar no puede ser negativo.");
        }
        if (cantidad > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes. Saldo actual: " + saldo);
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }

    // Obtener saldo actual
    public double getSaldo() {
        return saldo;
    }
}

// Programa principal
public class GestionTransaccionesBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear cuenta bancaria con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0);
        System.out.println("Bienvenido al sistema de gestión de transacciones bancarias.");
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        // Menú de operaciones
        while (true) {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 3) {
                System.out.println("Gracias por usar el sistema. ¡Adiós!");
                break;
            }

            System.out.print("Ingrese la cantidad: ");
            double cantidad = scanner.nextDouble();

            try {
                switch (opcion) {
                    case 1: // Depósito
                        cuenta.depositar(cantidad);
                        break;
                    case 2: // Retiro
                        cuenta.retirar(cantidad);
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }1
            } catch (DepositoInvalidoException | RetiroInvalidoException | FondosInsuficientesException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
