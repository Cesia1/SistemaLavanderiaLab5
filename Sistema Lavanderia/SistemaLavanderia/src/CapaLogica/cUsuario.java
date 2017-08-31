/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDatos.cDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class cUsuario {
    public String Usuario=null;
    public String Contrasenia=null;
    public boolean Habilitado ;
    public String DNI ;
    public String Apellidos ;
    public String Nombres ;
    public String Telefono ;
    public String Direccion ;
    public String Cargo ;
    public String Correo ;
    public cDatos oDatos = new cDatos("localhost","dblavanderia","root","");
    public String mensaje;
    public boolean insertar() throws ClassNotFoundException, SQLException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(DNI);
        lis.add(Nombres);
        lis.add(Apellidos);
        lis.add(Telefono);
        lis.add(Direccion);
        lis.add(Cargo);
        lis.add(Contrasenia);
        lis.add(Correo);
        lis.add(Usuario);
        oDatos.Conectar();
        ResultSet oFila=oDatos.llamarProcedimiento("spuInsertarUsuario",lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    public boolean verificarusuario() throws ClassNotFoundException, SQLException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        lis.add(Contrasenia);
        oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuVerificarUsuario", lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false; 
    }
    public boolean bienvenidausuario() throws ClassNotFoundException, SQLException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        lis.add(Contrasenia);
        oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuBienvenidaUsuario",lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    public ResultSet Listar() throws ClassNotFoundException, SQLException
    {
        oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuListarUsuario",null);
        oDatos.Desconectar();
        return rs;
    }
    public ResultSet ListadoEspecial() throws ClassNotFoundException, SQLException
    {
        oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuListarUsuarioEspecial",null);
        oDatos.Desconectar();
        return rs;
    }
    public ResultSet Buscar(String Campo, String Contenido) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Campo);
        lis.add(Contenido);  
        oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuBuscarUsuario",lis);
        oDatos.Desconectar();
        return rs;
    }
    public boolean deshabilitar() throws ClassNotFoundException, SQLException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuDeshabilitarUsuario", lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    public boolean modificar() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        lis.add(Nombres);
        lis.add(Apellidos);
        lis.add(Telefono);
        lis.add(Direccion);
        lis.add(Habilitado);
        ResultSet oFila = oDatos.llamarProcedimiento("spuModificarUsuario",lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    public String devolverCargo() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuDevolverCargo", lis);
        rs.next();
        String Cargo=rs.getString("Cargo");
        oDatos.Desconectar();
        return Cargo;
    }
    public boolean cambiarusuario() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        lis.add(Contrasenia);
        ResultSet oFila = oDatos.llamarProcedimiento("spuModificarContrasenia",lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
    }
}
