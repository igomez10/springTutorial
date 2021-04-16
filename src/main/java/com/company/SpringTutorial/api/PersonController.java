package com.company.SpringTutorial.api;

import com.company.SpringTutorial.model.Person;
import com.company.SpringTutorial.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(HttpServletResponse response, @RequestBody Person person){
        personService.addPerson(person);
        response.addHeader("demo","ignacio");
    }

    @GetMapping
    public List<Person> GetAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping(path="{id}")
    public Person getPersonById(@PathVariable("id") UUID id) {
        return personService.getPersonById(id);

    }
}


