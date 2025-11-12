import java.util.Random;

public class palabras {
    private String[] palabras = {
            "gato", "perro", "ordenador", "montaña", "programacion", "universo",
            "sol", "luna", "estrella", "coche", "bicicleta", "tigre", "ventana",
            "avion", "ciudad", "mariposa", "pirata", "magia", "espada", "dragon",
            "castillo", "robot", "nube", "fuego", "agua", "piedra", "bosque",
            "planeta", "aventura", "reloj", "tormenta", "vampiro", "zombi", "galaxia",
            "murcielago", "pajaro", "elefante"
    };

    private Random random = new Random();

    public String obtenerPalabraAleatoria() {
        int lista = random.nextInt(palabras.length);
        return palabras[lista];
    }
}
