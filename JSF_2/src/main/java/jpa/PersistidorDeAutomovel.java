/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa;

import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;

/**
 *
 * @author luiz.souza
 */
public class PersistidorDeAutomovel {
    public static void main(String[] args) {
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("default"); --> criado por JPAUtil.java
        //EntityManager em = emf.createEntityManager();--> criado por JPAUtil.java
        EntityManager em = JPAUtil.getEntityManager();
        
        Automovel auto = new Automovel();
        auto.setAnoFabricacao(2010);
        auto.setModelo("Ferrari");
        auto.setObservacoes("Nunca foi batido");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        em.persist(auto);
        
        tx.commit();
        
        em.close();
        //emf.close();--> criado por JPAUtil.java
    }
    
}
