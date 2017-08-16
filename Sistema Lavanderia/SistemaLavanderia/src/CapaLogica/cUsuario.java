/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDatos.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class cUsuario {
    public String Usuario;
    public String Contrasenia ;
    public boolean Habilitado ;
    public String DNI ;
    public String Apellidos ;
    public String Nombres ;
    public String Telefono ;
    public String Direccion ;
    public String Cargo ;
    public String Correo ;
    CEntidadMySQL oDatos = new CEntidadMySQL("dblavanderia","localhost","root","123456","tusuario");
    public String mensaje;
    public boolean insertar() throws SQLException
    {
        Object[][] oFila={{DNI,"varchar"}, {Nombres,"varchar"},{Apellidos,"varchar"},{Telefono,"varchar"},{Direccion,"varchar"},{Cargo,"varchar"},{Contrasenia,"varchar"},{Correo,"varchar"},{Usuario,"varchar"}};
        oDatos.EjecutarProcedimiento("spuInsertarUsuario",oFila);
        int CodError = Integer.parseInt(oFila[0][0].toString());
        mensaje = oFila[1][0].toString();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    public boolean verificarusuario() throws SQLException
    {
        Object[][] oFila={{Usuario,"varchar"}, {Contrasenia,"varchar"}};
        oDatos.EjecutarProcedimiento("spuVerificarUsuario",oFila);
        int CodError = Integer.parseInt(oFila[0][0].toString());
        mensaje = oFila[1][0].toString();
        if (CodError == 0)
            return true;
        else
            return false; 
    }
    public boolean bienvenidausuario() throws SQLException
    {
        Object[][] oFila={{Usuario,"varchar"}, {Contrasenia,"varchar"}};
        oDatos.EjecutarProcedimiento("spuBienvenidaUsuario", oFila);
        int CodError = Integer.parseInt(oFila[0][0].toString());
        mensaje = oFila[1][0].toString();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    //public ResultSet Listar() throws SQLException
    //{
        //return oDatos.EjecutarProcedimiento("spuListarUsuario");
   // }
    //public ResultSet ListadoEspecial() throws SQLException
    //{
        //return oDatos.EjecutarProcedimiento("spuListarUsuarioEspecial");
    //}
    /*public ResultSet Buscar(String Campo, String Contenido)
    {
        return oDatos.("spuBuscarUsuario", Campo, Contenido);
    }*/
    public boolean deshabilitar() throws SQLException
    {
        Object[][] oFila={{Usuario,"varchar"}};
        oDatos.EjecutarProcedimiento("spuDeshabilitarUsuario", oFila);
        int CodError = Integer.parseInt(oFila[0][0].toString());
        mensaje = oFila[1][0].toString();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    public boolean modificar() throws SQLException
    {
        Object[][] oFila={{Usuario,"varchar"}, {Nombres,"varchar"},{Apellidos,"varchar"},{Telefono,"varchar"},{Direccion,"varchar"},{Habilitado,"boolean"}};
        oDatos.EjecutarProcedimiento("spuModificarUsuario", oFila);
        int CodError = Integer.parseInt(oFila[0][0].toString());
        mensaje = oFila[1][0].toString();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    public String devolverCargo() throws SQLException
    {
        Object[][] oFila={{Usuario,"varchar"}};
        oDatos.EjecutarProcedimiento("spuDevolverCargo", oFila);
        return oFila[0][0].toString();
    }
    public boolean cambiarusuario()
    {
        Object[][] oFila={{Usuario,"varchar"}, {Contrasenia,"varchar"}};
      //  oDatos.EjecutarProcedimiento("spuModificarContrasenia", Usuario, Contrasenia);
        int CodError = Integer.parseInt(oFila[0][0].toString());
        mensaje = oFila[1][0].toString();
        if (CodError == 0)
            return true;
        else
            return false;
    }
}
