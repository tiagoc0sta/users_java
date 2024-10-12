package com.tiagotfc.users.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/runs") //every method falls under this path
public class RunController {

    private final RunRepository runRepository;  //access list in RunRepository

    public RunController(RunRepository runRepository){
        this.runRepository = runRepository;
    }

    //GET (read in CRUD)
    @GetMapping("")
    List<Run> findAll() {
        return runRepository.findAll();
    }

    //GET (read in CRUD)
    @GetMapping("/{id}")
        //@PathVariable to reach the current id typed by user
    Run findById(@PathVariable Integer id) {
        Optional<Run> run = runRepository.findById(id);
        if(run.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return  run.get();
    }

    //post - (Create in CRUD)
    @ResponseStatus(HttpStatus.CREATED)  //Informs that run was created
    @PostMapping("")
    void create(@RequestBody Run run) {  //pass a body in a form of request
        runRepository.create(run);
    }

    //put
    // PUT (create and update),

    //delete


}
