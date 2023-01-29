package org.example.repositories.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "COUNTRY", schema = "Task1")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String countryName;
    @NotNull
    private Long countryPopulation;
    @NotNull
    private Long countryArea;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "country_language", schema = "task1",
            joinColumns = {@JoinColumn(name = "country_id")},
            inverseJoinColumns = {@JoinColumn(name = "language_id")}
    )
    private List<LanguageEntity> languages = new ArrayList<>();

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

    public List<LanguageEntity> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguageEntity> languages) {
        this.languages = languages;
    }

    public void addLanguage(LanguageEntity language){this.languages.add(language);}
}

