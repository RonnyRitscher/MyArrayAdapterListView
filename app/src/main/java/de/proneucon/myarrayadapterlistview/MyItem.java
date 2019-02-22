package de.proneucon.myarrayadapterlistview;

public class MyItem {

    //MEMBER
    private String name;
    private String beschreibung;
    private int icon;
    private boolean isKunde;

    //CONSTRUCTOR
    public MyItem(String name, String beschreibung, int icon, boolean isKunde) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.icon = icon;
        this.isKunde = isKunde;
    }

    //GETTER und SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public boolean isKunde() {
        return isKunde;
    }

    public void setKunde(boolean kunde) {
        isKunde = kunde;
    }
}
