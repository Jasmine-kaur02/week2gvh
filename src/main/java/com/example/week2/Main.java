package com.example.week2;

public class Main {


    
    public static void main(String[] args) {
        //create an instance of a Card object
        Card card1 = new Card("spades","ace");
        Card card2 = new Card("hearts","7");
        System.out.println(card1);
        System.out.println(card2);

        //an ace should have a value 14
        System.out.println("value of ace: " + card1.getFaceValue());

        System.out.println("ace of spades is: " +card1.getColour());
        System.out.println("7 of hearts is: "+card2.getColour());

        System.out.println(card1.getSuit());

        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();
        System.out.println(deckOfCards);

    }
}
