package com.example.autos;

import java.time.LocalDate;

import javax.swing.text.StyledEditorKit;

public class auto {
    String modelo;
    String marca;
    Integer an;

    //constructor con paso de parametros
    public auto(String mod, String mar, Integer ani){
        this.modelo = mod;
        this.marca = mar;
        this.an = ani;
    }

    //constructor sin paso de parametros
    public auto(){
        this.modelo = "vw";
        this.marca = "sedan";
        this.an = 1968;
    }

    @Override
    public String toString() {
        String cadena = "\nmarca: " + this.marca + "\nmodelo: " + this.modelo + "\nan: " + this.an;
                return cadena;
    }

    public Boolean isPreowned(){
        LocalDate date = LocalDate.now();
        Integer year = date.getYear();
        if(this.an<year){
            return Boolean.TRUE;
        }
        else {
            return Boolean.FALSE;
        }

    }
}

