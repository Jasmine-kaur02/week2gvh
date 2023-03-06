package com.example.week2;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private final ArrayList<Card> deck;

    /**
     * This is the constructor , it is a special type of "method" that does not have a return type
     * and must be named identically to the class name.When this is called , the system will allocate
     * space in memory for a new DeckOfCards object
     **/

    public DeckOfCards() {
        deck = new ArrayList<>();
        List<String> suits = Card.getListOfValidSuits();
        List<String> faceNames = Card.getValidFaceNames();

        for (int i = 0; i < suits.size(); i++) {
            for (int j = 0; j < faceNames.size(); j++)
                deck.add(new Card(suits.get(i), faceNames.get(j)));
        }
    }

    /**
     * this method will shuffle the deck of cards
     */
    public void shuffle()
    {
        Collections.shuffle(deck);
    }


}
