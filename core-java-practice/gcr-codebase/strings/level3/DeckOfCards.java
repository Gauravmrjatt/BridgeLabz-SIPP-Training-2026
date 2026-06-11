import java.util.Scanner;
public class DeckOfCards {

public static String[] initializeDeck() {
String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
String[] deck = new String[52];
int index = 0;
for (int s = 0; s < 4; s++) {
for (int r = 0; r < 13; r++) {
deck[index++] = ranks[r] + " of " + suits[s];
}
}
return deck;
}

public static String[] shuffleDeck(String[] deck) {
int n = deck.length;
for (int i = 0; i < n; i++) {
int randomCardNumber = i + (int) (Math.random() * (n - i));
String temp = deck[i];
deck[i] = deck[randomCardNumber];
deck[randomCardNumber] = temp;
}
return deck;
}

public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
int cardsPerPlayer = numCards;
if (numPlayers * cardsPerPlayer > 52) {
System.out.println("Not enough cards!");
return null;
}
String[][] players = new String[numPlayers][cardsPerPlayer];
int index = 0;
for (int p = 0; p < numPlayers; p++) {
for (int c = 0; c < cardsPerPlayer; c++) {
players[p][c] = deck[index++];
}
}
return players;
}

public static void printPlayers(String[][] players) {
for (int p = 0; p < players.length; p++) {
System.out.println("Player " + (p + 1) + ":");
for (int c = 0; c < players[p].length; c++) {
System.out.println("  " + players[p][c]);
}
}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of cards per player: ");
int numCards = sc.nextInt();
System.out.print("Enter number of players: ");
int numPlayers = sc.nextInt();
String[] deck = initializeDeck();
deck = shuffleDeck(deck);
String[][] players = distributeCards(deck, numCards, numPlayers);
if (players != null) {
printPlayers(players);
}
sc.close();
}
}