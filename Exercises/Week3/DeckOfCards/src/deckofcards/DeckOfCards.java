/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

import java.util.Random;

/**
 *
 * @author grade
 */
public class DeckOfCards {

    private Card deck[]; // array of Card objects
    private int currentCard; // index of next Card to be dealt
    private final int NUMBER_OF_CARDS = 52; // constant number of Cards
    private Random randomNumbers; // random number generator

    // constructor fills deck of Cards
    public DeckOfCards() {
        String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
        currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]
        randomNumbers = new Random(); // create random number generator

        // populate deck with Card objects
        for (int count = 0; count < deck.length; count++) {
            deck[count]
                    = new Card(faces[count % 13], suits[count / 13]);
        }
    } // end DeckOfCards constructor

    // shuffle deck of Cards with one-pass algorithm
    public void shuffle() {
        // after shuffling, dealing should start at deck[ 0 ] again
        currentCard = 0; // reinitialize currentCard

        // for each Card, pick another random Card and swap them
        for (int first = 0; first < deck.length; first++) {
            // select a random number between 0 and 51 
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        } // end for
    } // end method shuffle

    // deal one Card
    public Card dealCard() {
        // determine whether Cards remain to be dealt
        if (currentCard < deck.length) {
            return deck[currentCard++]; // return current Card in array
        } else {
            return null; // return null to indicate that all Cards were dealt
        }
    } // end method dealCard

    private int[] totalHand(Card hand[]) {
        int[] arrayOfCards = new int[13];
        for (int i = 0; i < arrayOfCards.length; i++) {
            arrayOfCards[i] = 0;
        }
        for (int i = 0; i < hand.length; i++) {
            String face = hand[i].getFace();
            switch (face) {
                case "Ace":
                    arrayOfCards[0]++;
                    break;
                case "Deuce":
                    arrayOfCards[1]++;
                    break;
                case "Three":
                    arrayOfCards[2]++;
                    break;
                case "Four":
                    arrayOfCards[3]++;
                    break;
                case "Five":
                    arrayOfCards[4]++;
                    break;
                case "Six":
                    arrayOfCards[5]++;
                    break;
                case "Seven":
                    arrayOfCards[6]++;
                    break;
                case "Eight":
                    arrayOfCards[7]++;
                    break;
                case "Nine":
                    arrayOfCards[8]++;
                    break;
                case "Ten":
                    arrayOfCards[9]++;
                    break;
                case "Jack":
                    arrayOfCards[10]++;
                    break;
                case "Queen":
                    arrayOfCards[11]++;
                    break;
                case "King":
                    arrayOfCards[12]++;
                    break;
            }
        }
        return arrayOfCards;
    }

    private int[] suitsArray(Card[] hand) {
        int[] arrayOfCards = new int[4];
        for (int i = 0; i < arrayOfCards.length; i++) {
            arrayOfCards[i] = 0;
        }
        for (int i = 0; i < hand.length; i++) {
            String suit = hand[i].getSuit();
            switch (suit) {
                case "Hearts":
                    arrayOfCards[0]++;
                    break;
                case "Diamonds":
                    arrayOfCards[1]++;
                    break;
                case "Clubs":
                    arrayOfCards[2]++;
                    break;
                case "Spades":
                    arrayOfCards[3]++;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return arrayOfCards;
    }

    public boolean pair(Card hand[]) {
        int[] array = totalHand(hand);
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                result = !result;
            }
        }
        return result;
    }

    public boolean twoPair(Card hand[]) {
        int[] array = totalHand(hand);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                count++;
            }
        }
        return count == 2;
    }

    public boolean threeOfAKind(Card hand[]) {
        int[] array = totalHand(hand);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean fourOfAKind(Card hand[]) {
        int[] array = totalHand(hand);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean flush(Card hand[]) {
        int[] array = suitsArray(hand);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                return true;
            }
        }
        return false;
    }

    public boolean straight(Card[] hand) {
        int[] array = totalHand(hand);
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] == 1) {
                    count++;
                }
                if (count == 5) {
                    return true;
                }
                if (array[j] != 1) {
                    count = 0;
                }
            }
        }
        return false;
    }
    
    public boolean fullHouse(Card[] hand) {
        int[] array = totalHand(hand);
        return pair(hand) && threeOfAKind(hand);
    }

    //WET much...
} // end class DeckOfCards

