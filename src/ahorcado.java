public class ahorcado {
    private final String[] base = {
            " +---+",
            " |   |",
            "     |",
            "     |",
            "     |",
            "     |",
            "========="
    };

    public void mostrarAhorcado(int errores) {
        String[] dibujo = base.clone(); // copiamos la base

        if (errores >= 1) dibujo[2] = " O   |";
        if (errores == 2) dibujo[3] = " |   |";
        if (errores == 3) dibujo[3] = "/|   |";
        if (errores >= 4) dibujo[3] = "/|\\  |";
        if (errores == 5) dibujo[4] = "/    |";
        if (errores >= 6) dibujo[4] = "/ \\  |";

        for (int i = 0; i < dibujo.length; i++) {
            System.out.println(dibujo[i]);
        }
    }
}
