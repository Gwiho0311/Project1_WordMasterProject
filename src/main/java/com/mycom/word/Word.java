package com.mycom.word;

public class Word { // class Word
    private int id; // 단어 목록을 표시하는 수?
    private int level; // 단어의 난이도
    private String word; // 단어
    private String meaning; // 단어의 뜻
    Word(){} // constructor
    Word(int id, int level, String word, String meaning){ // constructor
        this.id=id;
        this.level=level;
        this.word=word;
        this.meaning=meaning;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {

        String slevel = "";
        for(int i=0; i< level; i++){
            slevel+="*";
        }
        String str = String.format("%-3s", slevel) + String.format("%15s", word) + "  " + meaning;
        return str;
    }
    public String toFileString(){
        return this.level + "|" + this.word + "|" + this.meaning;

    }
}

