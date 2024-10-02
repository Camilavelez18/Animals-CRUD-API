package Animals.demo.service;

import Animals.demo.model.WildAnimal;
import Animals.demo.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WildAnimalService {

    @Autowired
    private WildAnimalRepository repository;

    public List<WildAnimal> getAllAnimals() {
        return repository.findAll();
    }

    public WildAnimal getAnimalById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public WildAnimal createAnimal(WildAnimal animal) {
        return repository.save(animal);
    }

    public WildAnimal updateAnimal(Long id, WildAnimal animalDetails) {
        WildAnimal animal = repository.findById(id).orElse(null);
        if (animal != null) {
            animal.setName(animalDetails.getName());
            animal.setAge(animalDetails.getAge());
            animal.setFood(animalDetails.getFood());
            return repository.save(animal);
        }
        return null;
    }

    public void deleteAnimal(Long id) {
        repository.deleteById(id);
    }
}
