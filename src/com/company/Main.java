package com.company;

public class Main {

    public static void main(String[] args) {
       Deck myDeck = new Deck();
       myDeck.deckOfCards();
       Dealer myDealer = new Dealer();
        System.out.println("Welcome to BlackJack  - Here is the deal");
       myDealer.deal();                                  //calling method after playerhit  if less than 21  got to dealer draw
        if (myDealer.playerHand == 21) {
            System.out.println("BLACKJACK You Win!");

        while(myDealer.playerHand <21)  {
            myDealer.playerHit();
        }
            }


        myDealer.dealerDraw();
    }
}
