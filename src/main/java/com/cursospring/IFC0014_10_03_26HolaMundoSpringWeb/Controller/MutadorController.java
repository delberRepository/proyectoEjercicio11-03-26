package com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Controller;
import com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Model.Animalo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutadorController {
    @GetMapping("/mutar")
    public Animalo mutar(@RequestBody(required = true) Animalo animal){
        animal.setEspecie("burro");
        return animal;
    }
}
