package com.example.week2;

import java.util.Arrays;
import java.util.List;

public class Card {
    //creating instance variables
    private String suit;
    private String faceName;

    /**creating constructors: It creates a space in system memory to hold card object
     * to create constructors press alt insert
     */
    public Card(String suitArgument, String faceName) {
        setSuit(suitArgument);
        setFaceName(faceName);
    }

    /**
     * This method returns a List of string objects that represent the
     * valid suits for c Card in lower case
     * @return "hearts","spades","diamonds","clubs"
     */

    public static List<String> getListOfValidSuits()
    {
        return Arrays.asList("hearts","spades","diamonds","clubs");
    }
    //validation
    public void setSuit(String suitArgument) {
        suitArgument = suitArgument.toLowerCase();
        if (getListOfValidSuits().contains(suitArgument))
        this.suit = suitArgument;
        else
            throw new IllegalArgumentException(suitArgument + "received , but must be from" + "the list" + getListOfValidSuits());
    }
    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack,","queen","king","ace");
    }

    /**
     * This method will validate that the argument is a valid face name for a card
     * @param faceName "2","3","4",....."10","jack","queen","king","ace"
     */

    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        if(getValidFaceNames().contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + "received, but not in list" + getValidFaceNames());
    }

    //This will overwrite the object class toString() method
    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", faceName='" + faceName + '\'' +
                '}';
    }
    /**
     * This method evaluates and returns the value of the card
     * index        0   1   2   3   4   5   6   7    8     9      10      11     12
     * faceName -> "2","3","4","5","6","7","8","9","10","jack,","queen","king","ace"
     * value    ->  2   3   4   5   6   7   8   9   10    11      12      13     14
     */
    public int getFaceValue()
    {
        List<String> faceNames = getValidFaceNames();
        int indexOfFaceNames = faceNames.indexOf(faceName);
        return indexOfFaceNames+2;
    }

    public String getColour()
    {
        if(suit.equals("hearts") || suit.equals("diamonds"))
            return "red";
        else
            return "black";
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceName() {
        return faceName;
    }
}

