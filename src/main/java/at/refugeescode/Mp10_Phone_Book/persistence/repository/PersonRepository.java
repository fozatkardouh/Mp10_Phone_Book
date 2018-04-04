package at.refugeescode.Mp10_Phone_Book.persistence.repository;

import at.refugeescode.Mp10_Phone_Book.persistence.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}