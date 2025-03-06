import java.util.Scanner;

public class DeckofCards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();
        
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        distributeCards(deck, players, cardsPerPlayer);
        
        sc.close();
    }

    // initialize the deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // shuffle the deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // distribute cards to players
    public static void distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return;
        }
        
        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;
        
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }
        
        // Display the cards of each player
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(playerCards[i][j]);
            }
            System.out.println();
        }
    }
}

