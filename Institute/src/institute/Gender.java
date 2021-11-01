/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institute;

/**
 *
 * @author Shwartskopff
 */
public enum Gender {
    M("He", "His"),
    F("She", "Her");
    
    private final String pron;
    private final String pronG;

    private Gender(String pron, String pronG) {
        this.pron = pron;
        this.pronG = pronG;
    }

    public String getPron() {
        return pron;
    }

    public String getPronG() {
        return pronG;
    }
}
