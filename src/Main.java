public class Main {
    public static void main(String[] args) {
        String name1 = "A";
        String name2 = "B";
        Player player1 = new Player(name1, XOXO.SYMBOL_X);
        Player player2 = new Player(name2, XOXO.SYMBOL_0);
        XOXO XOXO = new XOXO(player1,player2);
        XOXO.playGame();
    }
}
