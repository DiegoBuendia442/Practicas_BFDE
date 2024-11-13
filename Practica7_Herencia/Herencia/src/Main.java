class Empleado {
    private String nombre;
    private String id;
    private double salarioBase;

    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

class EmpleadoTiempoCompleto extends Empleado {
    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.10; // 10% de bono
    }
}

class EmpleadoMedioTiempo extends Empleado {
    public EmpleadoMedioTiempo(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 0.50; // 50% del salario base
    }
}

class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String id, double salarioBase, double tarifaPorHora) {
        super(nombre, id, salarioBase);
        this.tarifaPorHora = tarifaPorHora;
    }

    public void setHorasTrabajadas(int horas) {
        this.horasTrabajadas = horas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new EmpleadoTiempoCompleto("Juan", "001", 5000);
        empleados[1] = new EmpleadoMedioTiempo("Ana", "002", 4000);
        empleados[2] = new EmpleadoPorHoras("Luis", "003", 0, 50); // Tarifa de pago por hora

        // Establecer horas trabajadas para el empleado por horas
        ((EmpleadoPorHoras) empleados[2]).setHorasTrabajadas(120); // Ejemplo de horas trabajadas

        // Mostrar salarios calculados
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario Calculado: " + empleado.calcularSalario());
        }
    }
}
