/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package jpa;

import jakarta.persistence.*;
import java.util.List;
import org.hibernate.*;
import org.jboss.logging.Logger;

/*
import com.mysql.cj.*;
import jakarta.transaction.HeuristicMixedException;
import jakarta.transaction.HeuristicRollbackException;
import jakarta.transaction.RollbackException;
import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

*/
/**
 *
 * @author luiz.souza
 */
public class HibernateAutomovelDAO implements AutomovelDAO{

  
   @Override
   public void salva(Automovel a) {
/*        Session s = abreConexao();
        Transaction tx = s.beginTransaction();
        s.save(a);
        
        try {
            tx.commit();
        } catch (RollbackException ex) {
            Logger.getLogger(HibernateAutomovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeuristicMixedException ex) {
            Logger.getLogger(HibernateAutomovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeuristicRollbackException ex) {
            Logger.getLogger(HibernateAutomovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(HibernateAutomovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(HibernateAutomovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SystemException ex) {
            Logger.getLogger(HibernateAutomovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        s.close();
  */  }

    @Override
    public List<Automovel> lista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
