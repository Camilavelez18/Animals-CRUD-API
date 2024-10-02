package Animals.demo.controllers;

import Animals.demo.model.WildAnimal;
import Animals.demo.service.WildAnimalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class WildAnimalController {

    @Autowired
    private WildAnimalService service;

    @GetMapping("/test")
   public String testing(){
    return "ok";
   }    

    @GetMapping
    public List<WildAnimal> getAllAnimals() {
        return service.getAllAnimals();
    }

    @GetMapping("/{id}")
    public WildAnimal getAnimalById(@PathVariable Long id) {
        return service.getAnimalById(id);
    }

    @PostMapping
    public WildAnimal createAnimal(@RequestBody WildAnimal animal) {
        return service.createAnimal(animal);
    }

    @PutMapping("/{id}")
    public WildAnimal updateAnimal(@PathVariable Long id, @RequestBody WildAnimal animal) {
        return service.updateAnimal(id, animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable Long id) {
        service.deleteAnimal(id);
    }
}