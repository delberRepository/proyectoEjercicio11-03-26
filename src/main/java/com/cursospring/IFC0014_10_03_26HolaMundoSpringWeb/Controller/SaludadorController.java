package com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Controller;

import com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Model.Resultado;
import com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Model.Saludo;
import com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Service.ServicioCalculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SaludadorController {

  @Autowired
  private ServicioCalculadora servicioCalculadora;


  @GetMapping("/sumar")
  public Resultado suma(@RequestParam Integer num1, @RequestParam Integer num2){
    Integer resultado = (int) ServicioCalculadora.sumar(num1,num2);
    Resultado objResultado= new Resultado(resultado);
    return objResultado;

  }
  @GetMapping("/restar")
  public Resultado resta(@RequestParam Integer num1, @RequestParam Integer num2){
    Integer resultado = (int) ServicioCalculadora.restar(num1,num2);
    Resultado objResultado= new Resultado(resultado);
    if(num1==0&&num2==0){

    }

    return objResultado;

  }
}

