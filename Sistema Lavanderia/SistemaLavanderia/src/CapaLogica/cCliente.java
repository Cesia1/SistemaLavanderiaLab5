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
import javax.swing.JOptionPane;

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
    cDatos oDatos;
    public String mensaje;
    public cCliente(cDatos oDatos){
        if(oDatos.getConectadoBD()){
            oDatos.Conectar();
        }
        this.oDatos=oDatos;
    }
    public boolean insertar(){
        try{
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(IdCliente);
        lis.add(DNI);
        lis.add(Nombres);
        lis.add(Apellidos);
        lis.add(Telefono);
        lis.add(Direccion);
        //oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuInsertarCliente", lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        //oDatos.Desconectar();
        if (CodError == 1)
            return true;
        else{
            new Exception(mensaje);
            return false;
        }
        }catch(Exception e){
            new Exception("Error al insertar cliente.\nDetalle: "+e);
            return false;
        }
    }
    public ResultSet Listar(){
        try{
        //oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuListarCliente",null);
        //oDatos.Desconectar();
        return rs;
        }catch(Exception e){
            new Exception("Error al listar clientes.\nDetalle: "+e);
            return null;
        }
    }
    public ResultSet ListarEmpleado(){
        try{
        //oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuListarClienteHabilitado",null);
        //oDatos.Desconectar();
        return rs;
        }catch(Exception e){
            new Exception("Error al insertar cliente.\nDetalle: "+e);
            return null;
        }
    }
    public ResultSet Buscar(String Campo,String Contenido){
        try{
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(Campo);
        lis.add(Contenido);  
        //oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuBuscarCliente",lis);
        //oDatos.Desconectar();
        return rs;
        }catch(Exception e){
            new Exception("Error al buscar cliente.\nDetalle: "+e);
            return null;
        }
    }
    public boolean modificar(){
        try{
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(IdCliente);
        lis.add(DNI);
        lis.add(Nombres);
        lis.add(Apellidos); 
        lis.add(Telefono);  
        lis.add(Direccion);
        //oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuModificarCliente", lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        //oDatos.Desconectar();
        if (CodError == 1)
            return true;
        else{
            new Exception(mensaje);
            return false;
        }
        }catch(Exception e){
            new Exception("Error al modificar cliente.\nDetalle: "+e);
            return false;
        }
    }
    public boolean deshabilitar(){
        try{
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(IdCliente);
        ResultSet oFila = oDatos.llamarProcedimiento("spuDeshabilitarCliente", lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        //oDatos.Desconectar();
        if (CodError == 1)
            return true;
        else{
            new Exception(mensaje);
            return false;
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al insertar cliente.\nDetalle: "+e);
            return false;
        }
    }
    public String generarCodigo() throws SQLException, ClassNotFoundException{
        try{
        //oDatos.Conectar();
        ResultSet rs=oDatos.llamarProcedimiento("spuGenerarCodigoCliente", null);
        //oDatos.Desconectar();
        rs.next();
        String Codigo=rs.getString("@Sgte");
        return Codigo;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al generar codigo del cliente.\nDetalle: "+e);
            return null;
        }
    }
    public Object[][] getDatos() {
        oDatos.CargarDatosTabla();
        return oDatos.getValores();
    }

    public String[] getTitulos(){
        try{
        oDatos.CargarTitulos();
        String [] result = new String[oDatos.getTitulos().length];
        for(int i=0; i<oDatos.getTitulos().length;i++){
            result[i]= (String) oDatos.getTitulos()[i];
        }
        return result;
        }catch(Exception e){
            new Exception("Eror:\n"+e);
            return null;
        }
    }
    public Object[][] getDatos(ResultSet dato) {
        try{
            return oDatos.getValores(dato);
        }catch(Exception e){
            new Exception("Error:\n"+e);
            return null;
        }
    }
}
