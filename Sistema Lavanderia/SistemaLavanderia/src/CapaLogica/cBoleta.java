/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;


import CapaDatos.cDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UNSAAC
 */
public class cBoleta {
    public String DocEntrada;
    public String NroBoleta;
    public Date FechaEmision;
    public boolean Entregado;
    public String Usuario;
    public String IdCliente;

    cDatos oDatos;// = new cDatos();
    public String Mensaje;

    public cBoleta(cDatos oConexion) {
        this.oDatos = oConexion;
    }
    
    public String generarCodigo() throws SQLException, ClassNotFoundException
    {
        oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuGenerarCodigoEntrada",null);
        oDatos.Desconectar();
        oFila.next();
        return oFila.getString("Codigo");
    }
    public ResultSet Listar() throws SQLException, ClassNotFoundException
    {
        oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuListarBoleta",null);
        oDatos.Desconectar();
        return oFila;
    }
    public ResultSet Caja(LocalTime inicio, LocalTime fin ) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(inicio);
        lis.add(fin);
        oDatos.Conectar();
        ResultSet rs= oDatos.llamarProcedimiento("spuCaja",lis);
        oDatos.Desconectar();
        return rs;
    }
    public ResultSet Buscar(String campo, String contenido) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(campo);
        lis.add(contenido);
        oDatos.Conectar();
        ResultSet rs= oDatos.llamarProcedimiento("spuBuscarBoleta",lis);
        oDatos.Desconectar();
        return rs;
    }

    public boolean EntregarTicket() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(DocEntrada);
        lis.add(Usuario);
        lis.add(IdCliente);
        lis.add(NroBoleta);
        oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuBoleta_Insertar", lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        Mensaje = oFila.getString("Mensaje");
        oDatos.Desconectar();
        if (CodError == 0)
            return true;
        else
            return false;
        
    }
    public void EntregarComprobante() throws ClassNotFoundException, SQLException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(DocEntrada);
        lis.add(NroBoleta);
        lis.add(FechaEmision);
        oDatos.Conectar();
        oDatos.llamarProcedimiento("spuEntregarComprobante_Boleta", lis);
        oDatos.Desconectar();
    }
    public ResultSet BuscarPorCliente(String nomCliente) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(nomCliente);
        oDatos.Conectar();
        ResultSet rs= oDatos.llamarProcedimiento("spuBuscarBoletaPorCliente", lis);
        oDatos.Desconectar();
        return rs;
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
