package com.company;

import jdk.nashorn.internal.runtime.arrays.ContinuousArrayData;

import java.util.ArrayList;
import java.util.List;

public class Deck {
   Card cards = new Card();

   public void deckOfCards() {
      List<String> suits = new ArrayList<>();
      suits.add("Diamonds");
      suits.add("Hearts");
      suits.add("Spades");
      suits.add("Clubs");

      List<String> ranks = new ArrayList<>();
      ranks.add("Ace");
      ranks.add("2");
      ranks.add("3");
      ranks.add("4");
      ranks.add("5");
      ranks.add("6");
      ranks.add("7");
      ranks.add("8");
      ranks.add("9");
      ranks.add("10");
      ranks.add("Jack");
      ranks.add("Queen");
      ranks.add("King");

      List<Integer> values = new ArrayList<>();
      values.add(1);
      values.add(2);
      values.add(3);
      values.add(4);
      values.add(5);
      values.add(6);
      values.add(7);
      values.add(8);
      values.add(9);
      values.add(10);
      values.add(10);
      values.add(10);
      values.add(10);

      List<Card> deck = new ArrayList<>();

      for (int i = 0; i < suits.size(); i++) {
         for (int j = 0; j < ranks.size(); i++) {
            for (int k = 0; k < values.size(); i++) {
               String suit = suits.get(i);
               String rank = ranks.get(j);
               int value = values.get(k);
               System.out.println(suit + rank + value);

            }

         }
      }
   }
}



