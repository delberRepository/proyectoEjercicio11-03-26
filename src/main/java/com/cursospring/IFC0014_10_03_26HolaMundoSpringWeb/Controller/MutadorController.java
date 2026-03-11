package com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Controller;
import com.cursospring.IFC0014_10_03_26HolaMundoSpringWeb.Model.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutadorController {
    @GetMapping("/mutar")
    public Animal mutar(@RequestBody(required = true) Animal animal){
        animal.setEspecie("burro");
        return animal;
    }
}
