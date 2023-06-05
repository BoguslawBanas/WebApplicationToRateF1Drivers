package com.boguslawbanas.ratingDrivers.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Driver {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastname;
    private String nationality;

    public Driver(String name, String lastname, String nationality) {
        this.name = name;
        this.lastname = lastname;
        this.nationality = nationality;
    }
}
