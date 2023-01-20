package org.example.repositories;

import org.example.repositories.model.Country;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Repository {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.example.repositories.Repository");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void saveCountry() {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        Country country = new Country();
        country.setCountryName("Norway");
        country.setCountryPopulation(400000L);
        country.setCountryArea(80000L);

        em.persist(country);
        em.getTransaction().commit();

    }


}
