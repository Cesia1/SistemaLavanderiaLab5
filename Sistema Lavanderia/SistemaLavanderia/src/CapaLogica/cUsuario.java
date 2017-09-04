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
    public cDatos oDatos;
    public String mensaje;
    public cUsuario(){
        oDatos=  new cDatos("localhost","dblavanderia","root","123456");
    }
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
    public boolean verificarusuario()
    {
        try{
            ArrayList<Object> lis=new ArrayList<>();
            lis.add(Usuario);
            lis.add(Contrasenia);
            if(!oDatos.getConectadoBD()){
                oDatos.Conectar();
            }
            ResultSet oFila = oDatos.llamarProcedimiento("spuVerificarUsuario", lis);
            oFila.next();
            int CodError = Integer.parseInt(oFila.getString("CodError"));
            mensaje = oFila.getString("Mensaje");
            //oDatos.Desconectar();
            if (CodError == 0)
                return true;
            else{
                new Exception("Error al verificar el usuario:"+mensaje);
                return false; 
            }
        }catch(Exception e){
            new Exception("Error al verificar el usuario.\nDetalle: "+e);
            return false;
        }
    }
    public boolean bienvenidausuario() throws ClassNotFoundException, SQLException
    {
        try{
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        lis.add(Contrasenia);
        //oDatos.Conectar();
        if(!oDatos.getConectadoBD()){
            oDatos.Conectar();
        }
        ResultSet oFila = oDatos.llamarProcedimiento("spuBienvenidaUsuario",lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        //oDatos.Desconectar();
        if (CodError == 1)
            return true;
        else
            return false;
        }catch(Exception e){
            new Exception("Error al dar la bienvenida al usuario.\nDetalle: "+e);
            return false;
        }
    }
    public ResultSet Listar() throws ClassNotFoundException, SQLException
    {
        try{
            if(!oDatos.getConectadoBD()){
                oDatos.Conectar();
            }
        //oDatos.Conectar();
            ResultSet rs=oDatos.llamarProcedimiento("spuListarUsuario",null);
        //oDatos.Desconectar();
            return rs;
        }catch(Exception e){
            new Exception("Error al listar usuarios.\nDetalle: "+e);
            return null;
        }
    }
    public ResultSet ListadoEspecial() throws ClassNotFoundException, SQLException
    {
        try{
            if(!oDatos.getConectadoBD()){
                oDatos.Conectar();
            }
        //oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuListarUsuarioEspecial",null);
        //oDatos.Desconectar();
        return rs;
        }catch(Exception e){
            new Exception("Error al listar usuarios especiales.\nDetalle: "+e);
            return null;
        }
    }
    public ResultSet Buscar(String Campo, String Contenido)
    {
        try{
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Campo);
        lis.add(Contenido);  
        if(!oDatos.getConectadoBD()){
                oDatos.Conectar();
            }
        //oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuBuscarUsuario",lis);
        //oDatos.Desconectar();
        return rs;
        }catch(Exception e){
            new Exception("Error al buscar usuarios especiales.\nDetalle: "+e);
            return null;
        }
    }
    public boolean deshabilitar() throws ClassNotFoundException, SQLException
    {
        try{
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        //oDatos.Conectar();
        if(!oDatos.getConectadoBD()){
                oDatos.Conectar();
            }
        ResultSet oFila = oDatos.llamarProcedimiento("spuDeshabilitarUsuario", lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        //oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
        }catch(Exception e){
            new Exception("Error al deshabilitar usuario.\nDetalle: "+e);
            return false;
        }
    }
    public boolean modificar(){
        try{
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        lis.add(Nombres);
        lis.add(Apellidos);
        lis.add(Telefono);
        lis.add(Direccion);
        lis.add(Habilitado);
        if(!oDatos.getConectadoBD()){
                oDatos.Conectar();
        }
        ResultSet oFila = oDatos.llamarProcedimiento("spuModificarUsuario",lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        //oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
        }catch(Exception e){
            new Exception("Error al modificar usuario.\nDetalle: "+e);
            return false;
        }
    }
    public String devolverCargo(){
        try{
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        if(!oDatos.getConectadoBD()){
                oDatos.Conectar();
        }
        //oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuDevolverCargo", lis);
        rs.next();
        String Cargo=rs.getString("Cargo");
        //oDatos.Desconectar();
        return Cargo;
        }catch(Exception e){
            new Exception("Error al devolver cargo de  usuario.\nDetalle: "+e);
            return null;
        }
    }
    public boolean cambiarusuario() throws SQLException, ClassNotFoundException
    {
        try{
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Usuario);
        lis.add(Contrasenia);
        if(!oDatos.getConectadoBD()){
                oDatos.Conectar();
        }
        ResultSet oFila = oDatos.llamarProcedimiento("spuModificarContrasenia",lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        //oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
        }catch(Exception e){
            new Exception("Error al cambiar de usuario.\nDetalle: "+e);
            return false;
        }
    }
}
