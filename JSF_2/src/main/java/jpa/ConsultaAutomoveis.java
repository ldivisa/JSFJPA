/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package jpa;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

/**
 *
 * @author luiz.souza
 */
public class ConsultaAutomoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        EntityManager em = (EntityManager) JPAUtil.getEntityManager();
        Query q= em.createQuery("select a from Automovel a", Automovel.class);
        List<Automovel> autos = q.getResultList();
        
        for(Automovel a:autos){
            System.out.println(a.getId()+"\t"+a.getMarca()+"\t"+a.getModelo()+"\t"+a.getObservacoes()+"\t"+a.getAnoFabricacao());
        }
        
    }
}
