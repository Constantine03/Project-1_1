package org.example.controllers;

import org.example.repositories.model.CountryEntity;
import org.example.repositories.model.LanguageEntity;
import org.example.services.Service;

import java.util.List;
import java.util.Set;

public class Controller {
    private Service service = new Service();

    public CountryEntity getCountry(Long id) {

        return this.service.getCountry(id);
    }



    public void setLanguage(String language) {this.service.setLanguage(language);}

    public void setCountry(String countryName, Long countryPopulation, Long countryArea) {this.service.setCountry(countryName,countryPopulation,countryArea);}


    public void setLanguagesToCountry(CountryEntity country, LanguageEntity language){
        this.service.setLanguagesToCountryEntity(country, language);
    }

    public void saveCountry(CountryEntity country){
        this.service.saveCountry(country);
    }

    public CountryEntity getLanguages(Long id) {return this.service.getCountry(id);}

    public LanguageEntity getLanguage(Long id) {return this.service.getLanguage(id);}

    public void setLanguageToCountryById(Long countryId, Long languageId) {this.service.setLanguageToCountryById(countryId, languageId);}

}
