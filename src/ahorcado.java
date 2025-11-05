public class ahorcado {
    private final String[] drawComplet = {
        " +---+",
        " |   |",
        " O   |",
        "/|\\ |",
        "/ \\ |",
        "     |",
        "========="
    };

    public void showAhorcado(int fallos){
        for (int i = 0; i < drawComplet.length; i++){
            if (i == 2 && fallos < 1)      System.out.println("     |");
            else if (i == 3 && fallos < 3) System.out.println("     |");
            else if (i == 4 && fallos < 5) System.out.println("     |");
            else if (i == 3 && fallos == 3) System.out.println(" /|  |");
            else if (i == 3 && fallos >= 4) System.out.println(" /|\\ |");
            else if (i == 4 && fallos == 5) System.out.println(" /    |");
            else if (i == 4 && fallos >= 6) System.out.println(" / \\ |");
            else System.out.println(drawComplet[i]);
        }
    }
}
