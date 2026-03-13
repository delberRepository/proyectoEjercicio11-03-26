package com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Service;

import com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Model.Saludo;

import java.util.ArrayList;
import java.util.List;

public class SaludadorServicio {
    public List<Saludo> getSaludos(String nombre){
        List<Saludo> saludos = new ArrayList<>();
        saludos.add(new Saludo("Hola"+ nombre));
        saludos.add(new Saludo("Hi"+ nombre));
        saludos.add(new Saludo("Merhaba (en turco)"+ nombre));

        return saludos;
    }

}
