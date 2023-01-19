package org.example;

/*import org.example.controllers.Controller;
import org.example.repositories.model.Country;*/
import org.example.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
        HibernateUtil.close();
    }
}
