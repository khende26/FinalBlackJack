package com.company;

public class Main {

    public static void main(String[] args) {
       Deck myDeck = new Deck();
       myDeck.deckOfCards();
       Dealer myDealer = new Dealer();
       myDealer.deal();
        myDealer.playerHit();
    }
}
