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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UNSAAC
 */
public class cCliente {
    public String IdCliente ;
    public String Nombres ;
    public String DNI ;
    public String Apellidos ;
    public String Direccion ;
    public String Telefono ;
    cDatos oDatos = new cDatos();
    public String mensaje;
    
    public boolean insertar() throws ClassNotFoundException, SQLException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(IdCliente);
        lis.add(DNI);
        lis.add(Nombres);
        lis.add(Apellidos);
        lis.add(Telefono);
        lis.add(Direccion);
        oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuInsertarCliente", lis);
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
        ResultSet rs=oDatos.llamarProcedimiento("spuListarCliente",null);
        oDatos.Desconectar();
        return rs;
    }
    public ResultSet ListarEmpleado() throws SQLException, ClassNotFoundException
    {
        oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuListarClienteHabilitado",null);
        oDatos.Desconectar();
        return rs;
    }
    public ResultSet Buscar(String Campo,String Contenido) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Campo);
        lis.add(Contenido);  
        oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuBuscarCliente",lis);
        oDatos.Desconectar();
        return rs;
    }
    public boolean modificar() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(IdCliente);
        lis.add(DNI);
        lis.add(Nombres);
        lis.add(Apellidos); 
        lis.add(Telefono);  
        lis.add(Direccion);
        oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuModificarCliente", lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
      
    }
    public boolean deshabilitar() throws ClassNotFoundException, SQLException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(IdCliente);
        ResultSet oFila = oDatos.llamarProcedimiento("spuDeshabilitarCliente", lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
        
    }
    public String generarCodigo() throws SQLException, ClassNotFoundException
    {
        oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuGenerarCodigoCliente", null);
        oDatos.Desconectar();
        rs.next();
        String Codigo=rs.getString("@Sgte");
        return Codigo;
    }
}
