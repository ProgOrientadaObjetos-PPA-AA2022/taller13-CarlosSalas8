/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {

    /*
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        MatriculaJardin mjardin = new MatriculaJardin();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        
        tipos.establecerMatriculaCampamento(mcamp);
        tipos.establecerMatriculaColegio(mcolegio);
        tipos.establecerPromedioTarifas();
        System.out.printf("%s\n", tipos);
    }
     */
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();

        MatriculaCampamento mc = new MatriculaCampamento();
        mc.establecerTarifa();

        MatriculaColegio mcol = new MatriculaColegio();
        mcol.establecerTarifa();

        MatriculaEscuela me = new MatriculaEscuela();

        MatriculaJardin mj = new MatriculaJardin();

        MatriculaMaternal mm = new MatriculaMaternal();

        MatriculaMaternal mm2 = new MatriculaMaternal();

        ArrayList<Matricula> lista = new ArrayList<>();
        lista.add(me);
        lista.add(mj);
        lista.add(mm);
        lista.add(mm2);
        
        tipos.establecerMatricula(lista);
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerTarifa();
            
        }

        tipos.establecerPromedioTarifas();

        System.out.printf("%s",lista);
    }
}
