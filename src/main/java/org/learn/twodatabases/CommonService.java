package org.learn.twodatabases;

import org.learn.twodatabases.Author.AuthorRepository;
import org.learn.twodatabases.Person.Person;
import org.learn.twodatabases.Author.Author;
import org.learn.twodatabases.Person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private AuthorRepository authorRepository;
    public Person addPerson(Person person)
    {
       // System.out.println("Person name before saving: " + person.toString());
        //System.out.println("Person name before saving: " + person.getId());

        Person save = personRepository.save(person);
        return save;
    }

    public Author addAuthor(Author author){
return authorRepository.save(author);
    }
}
