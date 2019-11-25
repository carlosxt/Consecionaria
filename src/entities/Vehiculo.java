 package entities;

import java.text.DecimalFormat;

public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected float precio;
    protected DecimalFormat df = new DecimalFormat("###,##0.00");

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public abstract String toString();

    public String getFormatPrecio() {
        String formatPrecio = df.format(this.getPrecio());
        return formatPrecio;
    }
}
