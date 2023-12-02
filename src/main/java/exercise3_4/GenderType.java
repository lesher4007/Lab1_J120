package exercise3_4;

public enum GenderType{
    M("He","His","male"),F("She","Her","female");

    GenderType(String pronoun, String pronoun2, String pronoun3) {
        this.pronoun = pronoun;
        this.pronoun2 = pronoun2;
        this.pronoun3 = pronoun3;
    }

    public String getPronoun() {
        return pronoun;
    }

    public String getPronoun2() {
        return pronoun2;
    }

    public String getPronoun3() {
        return pronoun3;
    }

    private String pronoun;

    private String pronoun2;

    private String pronoun3;

}