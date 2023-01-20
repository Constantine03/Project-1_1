package org.example.repositories.model;

import jakarta.persistence.*;


@Entity
@Table(name = "COUNTRY", schema = "Task1")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String countryName;

    private Long countryPopulation;

    private Long countryArea;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Long getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(Long countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public Long getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(Long countryArea) {
        this.countryArea = countryArea;
    }

}

