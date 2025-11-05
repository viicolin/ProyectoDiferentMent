import java.util.Random;

public class palabras {
    private String[] words = {
            "gato", "perro", "computadora", "montaña", "programacion", "universo",
            "sol", "luna", "estrella", "coche", "bicicleta", "tigre", "ventana",
            "avion", "ciudad", "mariposa", "pirata", "magia", "espada", "dragon",
            "castillo", "robot", "nube", "fuego", "agua", "piedra", "bosque",
            "planeta", "aventura", "reloj", "tormenta", "vampiro", "zombi", "galaxia",
            "murcielago", "pajaro", "elefante"
    };

    private Random random = new Random();

    public String obteinRandomWord() {
        int index = random.nextInt(words.length);
        return words[index];
    }
}
