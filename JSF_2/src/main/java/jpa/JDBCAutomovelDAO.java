package jpa;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jpa.Automovel;
import jpa.AutomovelDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luiz.souza
 */
public class JDBCAutomovelDAO implements AutomovelDAO{

    @Override
    public void salva(Automovel a) {
        String sql = "insert into automoveis " +
                "(anoFabricacao, anoModelo, marca, modelo, observacoes)" +
                "values (?,?,?,?,?)";
        
        //Connection cn = abreConexao();
        
        try{
            PreparedStatement pst = null;
//            pst = cn.prepareStatement(sql);
            
            pst.setInt(1, a.getAnoFabricacao());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCAutomovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Automovel> lista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
