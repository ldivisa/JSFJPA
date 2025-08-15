/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
*/
/**
 *
 * @author luiz.souza
 */
public class JPAUtil {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("default");


    public static EntityManager getEntityManager(){
            return emf.createEntityManager();
    }
}
