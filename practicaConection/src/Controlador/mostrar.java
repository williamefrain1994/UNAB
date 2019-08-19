/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.entidades;
import ModeloBasedeDatos.bD;
import java.sql.*;

import java.util.ArrayList;

/**
 *
 * @author WILLIAM PC
 */
public class mostrar {
    
    private final Connection con = new bD().getCon();
    
    public ArrayList <entidades> listar (){
    ArrayList <entidades> ens = new ArrayList<>();
        try {
        CallableStatement cb = con.prepareCall("select * from personas");
        ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                entidades en= new entidades() ;
                en.setId(rs.getInt("id"));
                en.setNombre(rs.getString("nombre"));
                en.setApellido(rs.getString("apellido"));
                ens.add(en);
                
            }
        
            
        } catch (Exception e) {
            System.err.println(e);
        }
    
        
    return ens;
    }
    
}
