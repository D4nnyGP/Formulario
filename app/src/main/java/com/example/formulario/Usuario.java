package com.example.formulario;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombre;
    private long tel;
    private String contra;
    private String correo;

    public Usuario(String nombre, long tel, String correo, String contra) {
        this.nombre = nombre;
        this.tel = tel;
        this.contra = contra;
        this.correo = correo;
    }

    public Usuario(){

    }

    public String getNombre() {
        return nombre;
    }

    public long getTel() {
        return tel;
    }

    public String getContra() {
        return contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
