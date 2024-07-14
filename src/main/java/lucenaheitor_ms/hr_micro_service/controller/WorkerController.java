package lucenaheitor_ms.hr_micro_service.controller;

import lucenaheitor_ms.hr_micro_service.repository.WorkerRepository;
import lucenaheitor_ms.hr_micro_service.worker.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {
    @Autowired
    private WorkerRepository repository;

    @GetMapping
    private ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = repository.findAll();
        return  ResponseEntity.ok(list);
    }

    @GetMapping("{id}")
    private ResponseEntity<Worker> findById(@PathVariable Long id ){
        Worker workObj = repository.findById(id).get();
        return  ResponseEntity.ok(workObj);
    }



}
