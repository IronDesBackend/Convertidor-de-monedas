package com.aluracursos.convetidor_monedas.service;

import com.google.gson.annotations.SerializedName;

public class LectorListaMonedas {
    @SerializedName("Currency Code")
    private String currencyCode;

    @SerializedName("Currency Name")
    private String currencyName;

    @SerializedName("Country")
    private String country;
    // Constructor vacío
    public LectorListaMonedas() {
    }

    // Getters y setters
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}