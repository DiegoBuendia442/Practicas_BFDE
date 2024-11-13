class Empleado:
    def __init__(self, nombre, id, salarioBase):
        self.__nombre = nombre
        self.__id = id
        self.__salarioBase = salarioBase

    def calcularSalario(self):
        return self.__salarioBase

    # Getters y Setters
    def getNombre(self):
        return self.__nombre

    def setNombre(self, nombre):
        self.__nombre = nombre

    def getId(self):
        return self.__id

    def setId(self, id):
        self.__id = id

    def getSalarioBase(self):
        return self.__salarioBase

    def setSalarioBase(self, salarioBase):
        self.__salarioBase = salarioBase


class EmpleadoTiempoCompleto(Empleado):
    def calcularSalario(self):
        return self.getSalarioBase() * 1.10  # 10% de bono


class EmpleadoMedioTiempo(Empleado):
    def calcularSalario(self):
        return self.getSalarioBase() * 0.50  # 50% del salario base


class EmpleadoPorHoras(Empleado):
    def __init__(self, nombre, id, salarioBase, tarifaPorHora):
        super().__init__(nombre, id, salarioBase)
        self.__tarifaPorHora = tarifaPorHora
        self.__horasTrabajadas = 0

    def setHorasTrabajadas(self, horas):
        self.__horasTrabajadas = horas

    def calcularSalario(self):
        return self.__horasTrabajadas * self.__tarifaPorHora


# Programa Principal
empleados = [
    EmpleadoTiempoCompleto("Juan", "001", 5000),
    EmpleadoMedioTiempo("Ana", "002", 4000),
    EmpleadoPorHoras("Luis", "003", 0, 50)  # Tarifa de pago por hora
]

# Establecer horas trabajadas para el empleado por horas
empleados[2].setHorasTrabajadas(120)  # Ejemplo de horas trabajadas

# Mostrar salarios calculados
for empleado in empleados:
    print(f"Empleado: {empleado.getNombre()}, Salario Calculado: {empleado.calcularSalario()}")
