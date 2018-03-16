package oop;


//konstantos

public enum Countries {

    LT("lt"), EE("ee"), LV("lv");

    private String locale;

    Countries(String locale) {
        this.locale = locale;
    }

    public String getLocale() {
        return locale;
    }
}
