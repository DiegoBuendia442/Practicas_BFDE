// Clase base
class Animal {
    private String color;

    public Animal() {
        this.color = "No especificado";
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void comer() {
        System.out.println("El animal está comiendo");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

// Clase derivada Perro
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo croquetas");
    }
}

// Clase derivada Gato
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo pescado");
    }
}

// Clase derivada Pajaro
class Pajaro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El pájaro canta");
    }

    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo semillas");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Pajaro pajaro = new Pajaro();

        // Usando métodos de cada clase
        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();

        perro.comer();
        gato.comer();
        pajaro.comer();

        // Manipulando el color
        perro.setColor("Marrón");
        gato.setColor("Negro");
        pajaro.setColor("Amarillo");

        System.out.println("El color del perro es " + perro.getColor());
        System.out.println("El color del gato es " + gato.getColor());
        System.out.println("El color del pájaro es " + pajaro.getColor());
    }
}
