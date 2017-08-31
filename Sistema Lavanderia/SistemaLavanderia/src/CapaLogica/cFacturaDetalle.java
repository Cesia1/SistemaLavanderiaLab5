/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDatos.CEntidadMySQL;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author joha
 */
public class cFacturaDetalle {
    // entidades
    public String DocEntrada;
    public String NroFactura;
    public int IdComDetalle;
    public double Cantidad;
    public double PrecioUnitario;
    public int IdPrenda;
    public String Observacion;
    CEntidadMySQL oDatos;
    public String Mensaje;
    // 
    public String getDocEntrada() {
        return DocEntrada; 
    }
    public void setDocEntrada(String pDocEntrada) { 
        DocEntrada= pDocEntrada;
    }
    public String getNroFactura() {
        return NroFactura;
    }
    public void setNroFactura(String pNroFactura) {
        NroFactura=pNroFactura;
    }
    public int IdComDetalle() { return IdComDetalle;}
    public void IdComDetalle(int pIdComDetalle) { IdComDetalle= pIdComDetalle;}
    public double getCantidad() { return Cantidad;}
    public void Cantidad(double pCantidad) {Cantidad= pCantidad;}
    public double PrecioUnitario() { return PrecioUnitario;}
    public void PrecioUnitario(double pPrecioUnitario) { PrecioUnitario= pPrecioUnitario;}
    public int IdPrenda() { return IdPrenda;}
    public void IdPrenda(int IdPrenda) { this.IdPrenda = IdPrenda;}
    public String Observacion() { return Observacion;}
    public void Observacion(String Observacion) {this.Observacion= Observacion;}

    public boolean EntregarTicket()
    {
        ArrayList<Object> datosEnvio = new ArrayList<Object>();
        datosEnvio.add(DocEntrada);
        datosEnvio.add(Cantidad);
        datosEnvio.add(PrecioUnitario);
        datosEnvio.add(IdPrenda);
        datosEnvio.add(Observacion);
        datosEnvio.add(NroFactura);
        try{
            Object[][] Resultado = oDatos.ejecutarProcedimiento("spuFactura_Detalle_Insertar",datosEnvio);
            
            Mensaje = (String) Resultado[0][0];
            return Resultado[0][1] == "0";
        }catch(Exception e){
            System.err.println("Error en la capa Logica: "+e);
        }
        return false;
    }
    public ResultSet recuperarFactura()
    {
        try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(DocEntrada);
            datosEnvio.add(NroFactura);
            return oDatos.llamarProcedimiento("spuFactura_Detalle_Recuperar", datosEnvio);
        }catch(Exception e){
            System.err.println("Error en la capa Logica: "+e);
        }
        return null;
    }
}
