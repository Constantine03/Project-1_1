package org.example.repositories;

import org.example.repositories.model.CountryEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.repositories.model.LanguageEntity;

import java.util.List;
import java.util.Set;

public class Repository {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.example.task_one");


    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void closeEntityManager(EntityManager entityManager){
        entityManager.close();

    }

    public void saveCountry(CountryEntity country) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();




        em.persist(country);
        em.getTransaction().commit();

    }

    public CountryEntity getCountry(Long id){
        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        CountryEntity countryEntity = em.find(CountryEntity.class, id);
        var n = countryEntity.getLanguages();
        System.out.println(n);

        em.close();

        return countryEntity;
    }

    public void saveLanguage(String language){
        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        LanguageEntity languageEntity = new LanguageEntity();
        languageEntity.setLanguage(language);


        em.persist(languageEntity);
        em.getTransaction().commit();

    }

    public List<String> getLanguages(Long countryId){
        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        List<String> languages = em.createQuery("select countryName, languages from CountryEntity where id=" + countryId.toString()).getResultList();

        em.close();
        return languages;
    }

    public LanguageEntity getLanguage(Long countryId){
        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        LanguageEntity language = em.find(LanguageEntity.class, countryId);

        em.close();
        return language;
    }

    public void setLanguagesToCountry(CountryEntity country, LanguageEntity language){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        country.setLanguages(List.of(language));
        em.close();

    }

    public void setLanguageToCountryById(Long countryId, Long languageId){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        CountryEntity country = em.find(CountryEntity.class, countryId);
        LanguageEntity language = em.find(LanguageEntity.class, languageId);
        country.addLanguage(language);
        em.persist(country);
        em.getTransaction().commit();
    }






}
