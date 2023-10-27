package com.techelevator.models;

public class Character {
    private int characterId;
    private String theOneChar;
    private String height;
    private String race;
    private String wikiUrl;

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getTheOneChar() {
        return theOneChar;
    }

    public void setTheOneChar(String theOneChar) {
        this.theOneChar = theOneChar;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    @Override
    public String toString() {
        return "Character{" +
                "characterId=" + characterId +
                ", theOneChar='" + theOneChar + '\'' +
                ", height='" + height + '\'' +
                ", race='" + race + '\'' +
                ", wikiUrl='" + wikiUrl + '\'' +
                '}';
    }
}
