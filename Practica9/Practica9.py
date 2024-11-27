# Excepciones personalizadas
class DepositoInvalidoException(Exception):
    def __init__(self, message="El monto a depositar no puede ser negativo."):
        super().__init__(message)


class RetiroInvalidoException(Exception):
    def __init__(self, message="El monto a retirar no puede ser negativo."):
        super().__init__(message)


class FondosInsuficientesException(Exception):
    def __init__(self, message="Fondos insuficientes para realizar el retiro."):
        super().__init__(message)


# Clase CuentaBancaria
class CuentaBancaria:
    def __init__(self, numero_cuenta, saldo_inicial):
        self.numero_cuenta = numero_cuenta
        self.saldo = saldo_inicial

    def depositar(self, cantidad):
        if cantidad < 0:
            raise DepositoInvalidoException()
        self.saldo += cantidad
        print(f"Depósito exitoso. Nuevo saldo: {self.saldo:.2f}")

    def retirar(self, cantidad):
        if cantidad < 0:
            raise RetiroInvalidoException()
        if cantidad > self.saldo:
            raise FondosInsuficientesException(f"Saldo actual: {self.saldo:.2f}")
        self.saldo -= cantidad
        print(f"Retiro exitoso. Nuevo saldo: {self.saldo:.2f}")

    def obtener_saldo(self):
        return self.saldo


# Programa principal
def main():
    print("Bienvenido al sistema de gestión de transacciones bancarias.")
    cuenta = CuentaBancaria("123456789", 1000.0)
    print(f"Saldo inicial: {cuenta.obtener_saldo():.2f}")

    while True:
        print("\nSeleccione una operación:")
        print("1. Depositar")
        print("2. Retirar")
        print("3. Salir")
        opcion = input("Opción: ")

        if opcion == "3":
            print("Gracias por usar el sistema. ¡Adiós!")
            break

        cantidad = float(input("Ingrese la cantidad: "))

        try:
            if opcion == "1":
                cuenta.depositar(cantidad)
            elif opcion == "2":
                cuenta.retirar(cantidad)
            else:
                print("Opción no válida. Intente nuevamente.")
        except (DepositoInvalidoException, RetiroInvalidoException, FondosInsuficientesException) as e:
            print(f"Error: {e}")


# Ejecutar el programa
if __name__ == "__main__":
    main()
