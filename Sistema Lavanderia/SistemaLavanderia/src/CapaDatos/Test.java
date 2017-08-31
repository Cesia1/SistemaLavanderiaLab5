/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.sql.SQLException;

/**
 *
 * @author joha
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        
        CEntidadMySQL conexion = new CEntidadMySQL("dblavanderia", "localhost", "root", "", "tusuario");
        conexion.ConectarSQL();
        conexion.EjecutarProcedimiento("spuListarUsuario", null);
        //conexion.EjecutarProcedimiento("verificar", datos);
    }
}
