package at.refugeescode.Mp10_Phone_Book.endpoint;

import at.refugeescode.Mp10_Phone_Book.persistence.model.Address;
import at.refugeescode.Mp10_Phone_Book.persistence.model.Person;
import at.refugeescode.Mp10_Phone_Book.persistence.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
public class ContactsEndpoint {

    private final PersonRepository personRepository;

    @GetMapping
    List<Person> finaAll() {
        return personRepository.findAll();
    }

    @PostMapping
    Person saveOne(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/addnew")
    Person addOne() {
        Person person = new Person();
        person.setName("Fozat");
        person.setLastName("Kardouh");
        Address address = new Address();
        address.setAddress("Just Home");
        person.setAddress(address);
        return personRepository.save(person);
    }

    @DeleteMapping("/{id}")
    void deleteOne(@PathVariable Long id) {
        personRepository.deleteById(id);
    }

}
