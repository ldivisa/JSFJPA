/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.Transaction;


/**
 *
 * @author luiz.souza
 */
public class ExclusaoAutomovel {
    
    public static void main(String[] args) {


        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        Automovel auto = em.getReference(Automovel.class,1);
        //Automovel auto = new Automovel();
        auto.setId(1);
        tx.begin();
        em.remove(auto);
        tx.commit();

    
        
    }
    
    
}
