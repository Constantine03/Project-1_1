package org.example;

import org.example.controllers.Controller;
import org.example.repositories.Repository;
import org.example.repositories.model.CountryEntity;
import org.example.repositories.model.LanguageEntity;

import java.util.Set;

public class Main
{

    public static void main( String[] args )
    {

        Controller controller = new Controller();

       // controller.setCountry();
        // controller.setLanguage();
      //System.out.println(controller.getCountry(2L));

        //var repo = new Repository();
        //repo.getLanguage(1L);
        //repo.getCountry(2L);
//
//        controller.setLanguage("English");
//        controller.setLanguage("Deutsch");
//        controller.setLanguage("Francais");
//        controller.setLanguage("Italiano");
        //controller.setLanguage("Arabic");
//
//        controller.setCountry("Great Britain", 3000000L, 5000L);
//        controller.setCountry("Canada", 54000000L, 275000L);
//        controller.setCountry("Germany", 964700L, 666069L);
//        controller.setCountry("Italy", 456001L, 875690L);
        //controller.setLanguageToCountryById(153L, 202L);
        CountryEntity country = controller.getCountry(153L);
        for (LanguageEntity language : country.getLanguages()){
            System.out.println(language.getLanguage());
        }

        LanguageEntity language = controller.getLanguage(152L);
        for (CountryEntity country1 : language.getCountries()) {
            System.out.println(country1.getCountryName());
        }
    }
}
