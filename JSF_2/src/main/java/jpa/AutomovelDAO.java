/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package jpa;

import java.util.List;

/**
 *
 * @author luiz.souza
 */
public interface AutomovelDAO {

    /**
     * @param a
     * @param args the command line arguments
     */
    public void salva(Automovel a);
    List<Automovel> lista();
}
