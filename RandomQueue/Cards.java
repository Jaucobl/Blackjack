package RandomQueue;

public class Cards {
    private final Suit suit;
    private final Rank rank;

    public Cards(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() { return rank + " of " + suit; }
}

