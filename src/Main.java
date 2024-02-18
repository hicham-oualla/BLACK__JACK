public class Main {
    public static void main(String[] args) {
        PaquetCartes paquet = new PaquetCartes();

        // Tirer plusieurs cartes et afficher les résultats
      //  for (int i = 0; i < 2; i++) {
            String card = paquet.randomCardPlayer();
            System.out.println("Carte tirée : " + card);
            System.out.println("Total Value: " + paquet.getTotalValuePlayer());
            System.out.println();
        //}
    }
}
