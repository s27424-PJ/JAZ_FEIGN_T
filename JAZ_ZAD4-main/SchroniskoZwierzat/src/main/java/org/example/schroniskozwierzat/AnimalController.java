package org.example.schroniskozwierzat;

import io.swagger.client.api.AnimalApi;

import io.swagger.client.model.AnimalRequest;
import io.swagger.client.model.AnimalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/animals")
public class AnimalController extends AnimalApi {
    private final AnimalService animalService;
    private final MessageService messageService;
    @Autowired
    public AnimalController(AnimalService animalService, MessageService messageService) {
        this.animalService = animalService;
        this.messageService = messageService;
    }


    @GetMapping("/test")
    public String testReq() {
        return messageService.testReq();
    }

    @GetMapping
    public ResponseEntity<List<AnimalResponse>> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/{id}")
    public AnimalResponse getAnimalById(@PathVariable UUID id) {
        return animalService.getAnimalById(id);
    }

    @PostMapping
    public ResponseEntity<AnimalResponse> createAnimal(@RequestBody AnimalRequest animalRequest) {
        return animalService.saveAnimal(animalRequest);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnimalResponse> updateAnimal(@PathVariable UUID id, @RequestBody AnimalRequest animalRequest) {
        return animalService.updateAnimal(id, animalRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable UUID id) {
        return animalService.deleteAnimal(id);
    }
}