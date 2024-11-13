// Clase base: Personaje
class Personaje {
    String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    // Sobrecarga: ataque sobrecargado para distintos tipos de enemigos
    public void atacar(String enemigo) {
        System.out.println(nombre + " ataca a " + enemigo);
    }

    public void atacar(String enemigo, int distancia) {
        System.out.println(nombre + " ataca a " + enemigo + " desde una distancia de " + distancia + " metros");
    }

    // Método que será sobreescrito en subclases
    public void habilidadEspecial() {
        System.out.println(nombre + " usa una habilidad especial genérica.");
    }
}

// Subclase: Guerrero
class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre);
    }

    // Sobreescritura: habilidad especial específica del Guerrero
    @Override
    public void habilidadEspecial() {
        System.out.println(nombre + " desata un poderoso ataque con su espada.");
    }
}

// Subclase: Mago
class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre);
    }

    // Sobreescritura: habilidad especial específica del Mago
    @Override
    public void habilidadEspecial() {
        System.out.println(nombre + " lanza una bola de fuego.");
    }
}

// Ejecución del ejemplo en el juego de rol
public class JuegoRol {
    public static void main(String[] args) {
        // Sobrecarga de métodos
        Personaje guerrero = new Guerrero("Arthas");
        guerrero.atacar("Orco");
        guerrero.atacar("Orco", 5);

        // Sobreescritura y enlace dinámico
        Personaje personaje1 = new Guerrero("Leonidas");
        Personaje personaje2 = new Mago("Gandalf");

        personaje1.habilidadEspecial(); // Llama a la habilidad del Guerrero (enlace dinámico)
        personaje2.habilidadEspecial(); // Llama a la habilidad del Mago (enlace dinámico)
    }
}
