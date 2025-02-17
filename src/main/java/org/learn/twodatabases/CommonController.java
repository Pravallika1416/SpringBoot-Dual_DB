package org.learn.twodatabases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.learn.twodatabases.Author.Author;
import  org.learn.twodatabases.Person.Person;

@RestController
@RequestMapping("/v1")
public class CommonController {
    @Autowired
    private CommonService commonService;

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person) {
        return commonService.addPerson(person);
    }

    @PostMapping("/addAuthor")
    public Author addAuthor(@RequestBody Author author) {
        return commonService.addAuthor(author);
    }



}
