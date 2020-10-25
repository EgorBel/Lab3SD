import DeckCards.DeckCards;

public class Main {
    public static void main(String[] args) {
        DeckCards deckCards = new DeckCards();
        System.out.println(deckCards.getCard(2,4));
        System.out.println();
        System.out.println(deckCards);

    }
}
