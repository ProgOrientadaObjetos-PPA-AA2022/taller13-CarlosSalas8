/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

import java.io.Serializable;

/**
 *
 * @author SALA I
 */
public class DominioGobierno  implements Dominios,Serializable{
    private String dominio;
    
    @Override
    public void establecerDominio(String g){
        dominio = g;
    }
    
    @Override
    public String obtenerDominio(){
        return dominio;
    }

}
