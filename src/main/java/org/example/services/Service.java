package org.example.services;

import jdk.dynalink.linker.LinkerServices;
import org.example.repositories.Repository;
import org.example.repositories.model.CountryEntity;
import org.example.repositories.model.LanguageEntity;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


public class Service {
    private final Repository repository = new Repository();
    public CountryEntity getCountry(Long id){
        CountryEntity country = repository.getCountry(id);
        country.getLanguages().sort(Comparator.comparing(LanguageEntity::getLanguage));
        return country;
    }

    public void setCountry(String countryName, Long countryPopulation, Long countryArea){
        CountryEntity countryEntity = new CountryEntity();
        countryEntity.setCountryName(countryName);
        countryEntity.setCountryArea(countryArea);
        countryEntity.setCountryPopulation(countryPopulation);
        repository.saveCountry(countryEntity);
    }

    public void setLanguage(String language) {
        repository.saveLanguage(language);
    }

    public List<String> getLanguages(Long id){
        return repository.getLanguages(id);
    }

    public void setLanguagesToCountryEntity(CountryEntity country, LanguageEntity language){
        repository.setLanguagesToCountry(country, language);
    }

    public void saveCountry(CountryEntity country) {
        repository.saveCountry(country);
    }

    public void setLanguageToCountryById(Long countryId, Long languageId) {repository.setLanguageToCountryById(countryId, languageId);}

    public LanguageEntity getLanguage(Long id) {return repository.getLanguage(id);}
}
