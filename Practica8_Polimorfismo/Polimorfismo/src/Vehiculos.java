// Clase abstracta Vehiculo
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Métodos abstractos
    public abstract void encender();
    public abstract void apagar();
    public abstract void describir();
}

// Clase Auto que hereda de Vehiculo
class Auto extends Vehiculo {
    public Auto(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void encender() {
        System.out.println("El auto ha sido encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El auto ha sido apagado.");
    }

    @Override
    public void describir() {
        System.out.println("Este es un auto de marca " + marca + ", modelo " + modelo + ", del año " + año + ".");
    }
}

// Clase Motocicleta que hereda de Vehiculo
class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta ha sido encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La motocicleta ha sido apagada.");
    }

    @Override
    public void describir() {
        System.out.println("Esta es una motocicleta de marca " + marca + ", modelo " + modelo + ", del año " + año + ".");
    }
}

// Clase Camion que hereda de Vehiculo
class Camion extends Vehiculo {
    public Camion(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void encender() {
        System.out.println("El camión ha sido encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El camión ha sido apagado.");
    }

    @Override
    public void describir() {
        System.out.println("Este es un camión de marca " + marca + ", modelo " + modelo + ", del año " + año + ".");
    }
}

// Programa principal
public class Vehiculos {
    public static void main(String[] args) {
        // Crear una lista de vehículos
        Vehiculo[] vehiculos = {
                new Auto("Toyota", "Corolla", 2020),
                new Motocicleta("Yamaha", "YZF-R3", 2019),
                new Camion("Mercedes-Benz", "Actros", 2021)
        };

        // Operaciones con cada vehículo
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.encender();
            vehiculo.describir();
            vehiculo.apagar();
            System.out.println("------------------------------");
        }
    }
}
