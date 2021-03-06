package com.company;

public class Card {

    String suit;
    String rank;
    int value;

    public Card(String suit, String Rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void describeCard() {
        System.out.println(rank + " of " + suit + ": value of " + value);

    }

}
