/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    //private double promedioMatriculas;
    //private MatriculaCampamento campamento;
    //private MatriculaColegio colegio;
    
    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;
    /*
    public void establecerMatriculaCampamento(MatriculaCampamento c){
        campamento = c;
    }
    
    public void establecerMatriculaColegio(MatriculaColegio c){
        colegio = c;
    }
    
    public MatriculaCampamento obtenerMatriculaCampamento(){
        return campamento;
    }
    
    public MatriculaColegio obtenerMatriculaColegio(){
        return colegio;
    }
    
    public void establecerPromedioTarifas(){
        promedioMatriculas = (obtenerMatriculaCampamento().obtenerTarifa() + 
                obtenerMatriculaColegio().obtenerTarifa())/2;
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }
*/
    
    private ArrayList <Matricula> lista;
    private double promedioTarifas;

    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;
    
    public void establecerMatriculas(ArrayList <Matricula> m){
        lista = m;
    }
    
    public ArrayList <Matricula> obtenerMatriculas(){
        return lista;
    }
        
    public void establecerPromedioTarifas(){
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).obtenerTarifa();
        }
        promedioTarifas = suma/lista.size();
    }
    
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
    public String toString(){
        String cadena = String.format("Lista Matriculas\n\n");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n",cadena,lista.get(i));
        }
        cadena = String.format("%s\n"
                + "Promedio tarifas: %.2f\n",cadena,
                promedioTarifas);
        return cadena;
    }
}
