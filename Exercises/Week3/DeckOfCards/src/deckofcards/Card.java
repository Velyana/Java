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
public class Card {

    private String face; // face of card ("Ace", "Deuce", ...)
    private String suit; // suit of card ("Hearts", "Diamonds", ...)

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    // two-argument constructor initializes card's face and suit

    public Card(String cardFace, String cardSuit) {
        face = cardFace; // initialize face of card
        suit = cardSuit; // initialize suit of card
    } // end two-argument Card constructor

    // return String representation of Card
    public String toString() {
        return face + " of " + suit;
    } // end method toString

} // end class Card
