package day33exceptionsenumiterator;

import javax.swing.plaf.PanelUI;

public enum Cities {

    ADANA(1,"Adana","01000"),
    HATAY(31,"Hatay","31000"),
    ADIYAMAN(2,"Adiyaman","02000");

    private final int plateCode;
    private final String cityName;
    private final String postalCode;

    Cities(int plateCode, String cityName, String postalCode) {
        this.plateCode = plateCode;
        this.cityName = cityName;
        this.postalCode = postalCode;
    }

    public int getPlateCode() {
        return plateCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
