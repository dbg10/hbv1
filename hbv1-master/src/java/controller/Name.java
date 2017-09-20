package controller;

/**
 * Getters og setters fyrir nafn notanda
 * @author Viktor Jón Helgason vjh2@hi.is
 */
public class Name {

    private String value;
    private String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}