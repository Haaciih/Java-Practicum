package Praktikum2;

public class PemainBola {
    public static void main(String[] args) {
        String[][] player = {
                {"Ronaldo", "Arab"},
                {"Yamal", "Spain"},
                {"Mbappe", "France"},
                {"Beckham", "indo"}
        };
        for (int i = 0; i < player.length; i++) {
            System.out.println("Pemain :" + player[i][0] + " Negara :" + player[i][1]);
        }
    }
}
