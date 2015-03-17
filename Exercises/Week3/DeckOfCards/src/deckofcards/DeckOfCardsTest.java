/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

/**
 *
 * @author grade
 */
public class DeckOfCardsTest {

    // execute application
    public static void main(String args[]) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order   
        Card[] card = new Card[5];
        for (int i = 0; i < 5; i++) {
            card[i] = myDeckOfCards.dealCard();
            System.out.printf("%20s", card[i]);
        }
        System.out.println("\nPair: " + myDeckOfCards.pair(card));
        System.out.println("twoPair: " + myDeckOfCards.twoPair(card));
        System.out.println("ThreeOfAKind: " + myDeckOfCards.threeOfAKind(card));
        System.out.println("FourOfAKind: " + myDeckOfCards.fourOfAKind(card));
        System.out.println("Flush: " + myDeckOfCards.flush(card));
        System.out.println("Straight: " + myDeckOfCards.straight(card));
        System.out.println("FullHouse: " + myDeckOfCards.fullHouse(card));
                
       

    } // end main
} // end class DeckOfCardsTest
