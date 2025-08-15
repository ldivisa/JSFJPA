/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package jpa;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author luiz.souza
 */

@Named
@ApplicationScoped
public class AutomovelBean implements Serializable {


    private Automovel automovel = new Automovel();


public Automovel getAutomovel(){
    return this.automovel;
}

public void setAutomovel(Automovel automovel){
    this.automovel = automovel;
}

public void grava(){
    System.out.println("Marca:" + automovel.getMarca());
   
}

}
