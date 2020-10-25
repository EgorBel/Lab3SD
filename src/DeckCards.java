public final class DeckCards {
    private DeckCards.Card[][] cards = new DeckCards.Card[4][9];
    private final String[] suitCard = new String[]{"Clubs", "Spades", "Hearts", "Diamonds"};
    private final int numberCards = 36;

    public DeckCards() {
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 9; ++j) {
                this.cards[i][j] = new DeckCards.Card(6 + j, this.suitCard[i]);
            }
        }

    }

    class Card {
        int point;
        String suit;
        String Name;

        Card(int point, String suit) {
            this.point = point;
            this.suit = suit;
            switch(point) {
                case 6:
                    this.Name = "6";
                    break;
                case 7:
                    this.Name = "7";
                    break;
                case 8:
                    this.Name = "8";
                    break;
                case 9:
                    this.Name = "9";
                    break;
                case 10:
                    this.Name = "10";
                    break;
                case 11:
                    this.Name = "Jack";
                    break;
                case 12:
                    this.Name = "Queen";
                    break;
                case 13:
                    this.Name = "King";
                    break;
                case 14:
                    this.Name = "Ace";
            }

        }
    }
}