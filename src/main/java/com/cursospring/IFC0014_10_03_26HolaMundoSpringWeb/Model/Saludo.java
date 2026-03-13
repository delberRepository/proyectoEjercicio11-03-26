package com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Model;

public record Saludo(String mensaje) {

    @Override
    public String toString() {
        return "Saludo{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
