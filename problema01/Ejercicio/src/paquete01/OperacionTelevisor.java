/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class OperacionTelevisor {

    private ArrayList<Televisor> lista;
    private double totalPrecioTvs;
    private double televisorMasCaro;
    private String listaMarcasVendidas;

    public void establecerTelevisor(ArrayList<Televisor> t) {
        lista = t;
    }

    public ArrayList<Televisor> obtenerTelevisor() {
        return lista;
    }

    public void establecerTotalPrecioTvs() {
        for (int i = 0; i < lista.size(); i++) {
            totalPrecioTvs = totalPrecioTvs + lista.get(i).obtenerPrecio();
        }
    }

    public double obtenerTotalPrecioTvs() {
        return totalPrecioTvs;
    }

    public void establecerTelevisorMasCaro() {
        televisorMasCaro = lista.get(0).obtenerPrecio();
        for (int i = 0; i < lista.size(); i++) {
            if (televisorMasCaro < lista.get(i).obtenerPrecio()) {
                televisorMasCaro = lista.get(i).obtenerPrecio();
            }
        }
    }

    public double obtenerTelevisorMasCaro() {
        return televisorMasCaro;
    }

    public void establecerListaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < lista.size(); i++) {
            s = String.format("%s%s\n", s, lista.get(i).obtenerMarca());
        }
        listaMarcasVendidas = s;
    }

    public String obtenerListaMarcasVendidas() {
        return listaMarcasVendidas;
    }

    public String toString() {
        String cadena = String.format("Televisores\n");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s", cadena, lista.get(i));
        }
        cadena = String.format("%s"
                + "Precio Televisor: %.2f\n"
                + "Televisor mas Caro: %.2f\n"
                + "Lista Marcas Vendidas:\n"
                + "%s\n",
                cadena,
                totalPrecioTvs,
                televisorMasCaro,
                listaMarcasVendidas);
        return cadena;
    }
}


