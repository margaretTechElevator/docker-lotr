package com.techelevator.models;

public class Quote {
    private int quoteId;
    private String theOneQuoteId;
    private String dialog;
    private String theOneCharacterId;

    public int getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(int quoteId) {
        this.quoteId = quoteId;
    }

    public String getTheOneQuoteId() {
        return theOneQuoteId;
    }

    public void setTheOneQuoteId(String theOneQuoteId) {
        this.theOneQuoteId = theOneQuoteId;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    public String getTheOneCharacterId() {
        return theOneCharacterId;
    }

    public void setTheOneCharacterId(String theOneCharacterId) {
        this.theOneCharacterId = theOneCharacterId;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "quoteId=" + quoteId +
                ", theOneQuoteId='" + theOneQuoteId + '\'' +
                ", dialog='" + dialog + '\'' +
                ", theOneCharacterId='" + theOneCharacterId + '\'' +
                '}';
    }
}
