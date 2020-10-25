
public class Main {
    public static void main(String[] args) {
       DeckCards deckCards = new DeckCards();
        System.out.println(deckCards.getCards()[0][0]);
       DeckCards.Card[][] ds = deckCards.getCards();
       ds[0][0]=null;
        System.out.println(deckCards.getCards()[0][0]);
    }
}
