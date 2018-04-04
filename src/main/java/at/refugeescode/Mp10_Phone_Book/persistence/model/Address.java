package at.refugeescode.Mp10_Phone_Book.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor // not needed
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private String address;

}
