package Animals.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Animals.demo.model.WildAnimal;

public interface WildAnimalRepository extends JpaRepository<WildAnimal, Long> {
    
}