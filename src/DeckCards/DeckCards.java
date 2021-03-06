package DeckCards;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public final class DeckCards implements Cloneable, Serializable {
    private DeckCards.Card[][] cards = new DeckCards.Card[4][9];
    private final int numberCards = 36;
    private final String[] Names = {"6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public DeckCards() {
        for (int row = 0; row < 4; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.cards[row][col] = new DeckCards.Card(6 + col, SuitCard.values()[row], Names[col]);
            }
        }
    }

    class Card {
        private int point;
        private SuitCard suit;
        private String Name;

        Card(int point, SuitCard suit, String Name) {
            this.point = point;
            this.suit = suit;
            this.Name = Name;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "point=" + point +
                    ", suit=" + suit +
                    ", Name='" + Name + '\'' +
                    '}';
        }
    }

    public Card getCard(int SuitCard, int Card) {
        return cards[SuitCard][Card];
    }

    public int getNumberCards() {
        return numberCards;
    }

    public String[] getNames() {
        return Names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        DeckCards deckCards = (DeckCards) o;

        return numberCards == deckCards.numberCards &&
                Arrays.equals(cards, deckCards.cards) &&
                Arrays.equals(Names, deckCards.Names);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numberCards);
        result = 31 * result + Arrays.hashCode(cards);
        result = 31 * result + Arrays.hashCode(Names);
        return result;
    }

    @Override
    public String toString() {
        String str = "";
        for (Card[] SuitCard : cards) {
            for (Card card : SuitCard) {
                str += card.suit + "   " + card.Name + "\n";
            }
        }
        return str;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

