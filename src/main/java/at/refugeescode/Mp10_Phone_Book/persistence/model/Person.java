package at.refugeescode.Mp10_Phone_Book.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor // not needed
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}
