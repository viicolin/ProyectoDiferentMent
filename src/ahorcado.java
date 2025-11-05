public class ahorcado {
    private final String[] base = {
            " +---+",
            " |   |",
            "     |",   // Cabeza
            "     |",   // Cuerpo y brazos
            "     |",   // Piernas
            "     |",
            "========="
    };

    public void mostrarAhorcado(int errores) {
        String[] dibujo = base.clone(); // copiamos la base

        if (errores >= 1) dibujo[2] = " O   |";     // 1 error: cabeza
        if (errores == 2) dibujo[3] = " |   |";     // 2 errores: cuerpo
        if (errores == 3) dibujo[3] = "/|   |";     // 3 errores: brazo izquierdo
        if (errores >= 4) dibujo[3] = "/|\\  |";    // 4 errores: ambos brazos
        if (errores == 5) dibujo[4] = "/    |";     // 5 errores: pierna izquierda
        if (errores >= 6) dibujo[4] = "/ \\  |";    // 6 errores: ambas piernas

        for (int i = 0; i < dibujo.length; i++) {
            System.out.println(dibujo[i]);
        }
    }
}
