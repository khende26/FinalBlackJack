package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dealer {
    Deck myDeck = new Deck();
    int playerHand = 0;
    List<Card> playingCards = myDeck.deckOfCards();             // import a deck of cards from Deck class
    private List<Card> player = new ArrayList<>();
    private List<Card> dealer = new ArrayList<>();

    public void deal() {                                        //create a deal method
        Collections.shuffle(playingCards);                      //shuffle cards
        player.add(playingCards.get(0));                        //pull two cards for player from the deck
        playingCards.remove(0);                           //remove the two player cards from the deck
        player.add(playingCards.get(0));
        playingCards.remove(0);
        dealer.add(playingCards.get(0));                        //pull two cards for dealer from the deck
        playingCards.remove(0);                                //remove the two dealer cards from the deck
        dealer.add(playingCards.get(0));
        playingCards.remove(0);                               //loop over play to get actual card description to string method wich gives a string representation of the object
        for (int i = 0; i < player.size(); i++) {
            player.get(i).describeCard();
            playerHand = playerHand + player.get(i).getValue();
            if (playerHand == 21) {
                System.out.println("BLACKJACK You Win!");
            }
        }
        System.out.println(" Player total = " + playerHand);
        int dealerHand = 0;
        for (int i = 0; i < dealer.size(); i++) {
            dealerHand = dealerHand + dealer.get(i).getValue();
        }
        System.out.println("Dealer shows:  " + dealer.get(0).getRank() + " of " + dealer.get(0).getSuit() + ": value of " + dealer.get(0).getValue());
        if (playerHand == 21) {
            System.out.println("BLACKJACK You Win!!! - GAME OVER");
        }
    }

    public void playerHit() {                           //Create a method name Hit
        Scanner input = new Scanner(System.in);
        System.out.println("Does player wish to Hit or Stay?  Press 1 for hit  - Press 2 for Stay");
        int play = input.nextInt();
        if (play == 1) {
            player.add(playingCards.get(0));                      //add another card to player list
            playingCards.remove(0);
            player.get(2).describeCard();
            playerHand = playerHand + player.get(2).getValue();
            if (playerHand == 21) {
                System.out.println(" Player total = " + playerHand);
                System.out.println("BLACKJACK You Win!!! - GAME OVER");
            } else if (playerHand > 21) {
                System.out.println(" Player total = " + playerHand);
                System.out.println("Player is Over 21 - You Lose");
            } else if (playerHand < 21) {
                System.out.println(" Player total = " + playerHand);
                System.out.println("Does player wish to Hit or Stay?  Press 1 for hit  - Press 2 for Stay");
                play = input.nextInt();
                if (play == 1) {
                    player.add(playingCards.get(0));                      //add another card to player list
                    playingCards.remove(0);
                    player.get(3).describeCard();
                    playerHand = playerHand + player.get(3).getValue();
                    if (playerHand == 21) {
                        System.out.println(" Player total = " + playerHand);
                        System.out.println("BLACKJACK You Win!!! - GAME OVER");
                    } else if (playerHand > 21) {
                        System.out.println(" Player total = " + playerHand);
                        System.out.println("Player is Over 21 - You Lose");
                    } else if (playerHand < 21) {
                        System.out.println(" Player total = " + playerHand);
                        System.out.println("Does player wish to Hit or Stay?  Press 1 for hit  - Press 2 for Stay");
                        play = input.nextInt();
                        if (play == 1) {
                            player.add(playingCards.get(0));                      //add another card to player list
                            playingCards.remove(0);
                            player.get(4).describeCard();
                            playerHand = playerHand + player.get(4).getValue();
                            if (playerHand == 21) {
                                System.out.println("Player total = " + playerHand);
                                System.out.println("BLACKJACK You Win!!! - GAME OVER");
                            } else if (playerHand > 21) {
                                System.out.println(" Player total = " + playerHand);
                                System.out.println("Player is Over 21 - You Lose");
                            } else if (playerHand < 21) {
                                System.out.println(" Player total = " + playerHand);
                                System.out.println("Does player wish to Hit or Stay?  Press 1 for hit  - Press 2 for Stay");
                                play = input.nextInt();
                                if (play == 1) {
                                    player.add(playingCards.get(0));                      //add another card to player list
                                    playingCards.remove(0);
                                    player.get(5).describeCard();
                                    playerHand = playerHand + player.get(5).getValue();
                                    if (playerHand == 21) {
                                        System.out.println("Player total = " + playerHand);
                                        System.out.println("BLACKJACK You Win!!! - GAME OVER");
                                    } else if (playerHand > 21) {
                                        System.out.println(" Player total = " + playerHand);
                                        System.out.println("Player is Over 21 - You Lose");
                                    } else if (playerHand < 21) {
                                        System.out.println(" Player total = " + playerHand);
                                        System.out.println("Does player wish to Hit or Stay?  Press 1 for hit  - Press 2 for Stay");
                                        play = input.nextInt();
                                        System.out.println(" Player total = " + playerHand);
                                        System.out.println("Player has maximum Cards allowed - Press 2 to see Dealer's Hand");
                                        play = input.nextInt();
                                    }
                                } else if (play == 2) {
                                    System.out.println("move to dealer play");
                                }

                            } else if (play == 2) {
                                System.out.println("move to dealer play");
                            }
                        }
                    }
                } else if (play == 2) {
                    System.out.println("move to dealer play");
                }
            } else {
                System.out.println("move to dealer play");
            }
        } else {
            System.out.println("move to dealer play");
        }
    }
}





    //public dealerPlay









