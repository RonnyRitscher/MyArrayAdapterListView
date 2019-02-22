package de.proneucon.myarrayadapterlistview;

import android.media.Image;
import android.widget.CheckBox;

public class MyItem {

    //MEMBER
    private String name;
    private String beschreibung;
    private String icon;
    private boolean isKunde;

    //CONSTRUCTOR
    public MyItem(String name, String beschreibung, String icon, boolean isKunde) {
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isKunde() {
        return isKunde;
    }

    public void setKunde(boolean kunde) {
        isKunde = kunde;
    }
}
