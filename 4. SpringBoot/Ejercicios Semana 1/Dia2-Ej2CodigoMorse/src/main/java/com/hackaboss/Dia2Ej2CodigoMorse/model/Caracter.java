package com.hackaboss.Dia2Ej2CodigoMorse.model;

public class Caracter {
    private int id;
    private String definicion;
    private String codigo;

    public Caracter(int id, String definicion, String codigo) {
        this.id = id;
        this.definicion = definicion;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
