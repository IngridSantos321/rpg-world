package rpg.world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingrid")
public class IngridController {

    @GetMapping
    public String mostrarNome(){
        return "Ingrid kitkat";
    }
}
