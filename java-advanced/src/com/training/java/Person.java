package com.training.java;


public class Person {

    private int    boy;
    private int    agirlik;
    private String isim;


    public String konus() {
        return "Selam";
    }


    public int getBoy() {
        return this.boy;
    }

    public void setBoy(final int boyParam) {
        this.boy = boyParam;
    }

    public int getAgirlik() {
        return this.agirlik;
    }

    public void setAgirlik(final int agirlikParam) {
        this.agirlik = agirlikParam;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(final String isimParam) {
        if (this.isim == null) {
            System.err.println("error isim null olamaz");
        }
        this.isim = isimParam;
    }


}
