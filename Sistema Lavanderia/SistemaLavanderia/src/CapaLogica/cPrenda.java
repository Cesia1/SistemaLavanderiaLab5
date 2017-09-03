/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDatos.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author joha
 */
public class cPrenda {
    public int IdPrenda ;
    public String Descripcion;
    cConexion oDatos;
    public String mensaje;
    // metodos
    public int IdPrenda() { return IdPrenda; }
    public void IdPrenda(int IdPrenda) { this.IdPrenda=IdPrenda;}
    public String Descripcion() { return Descripcion;}
    public void Descripcion(String Descripcion) { this.Descripcion= Descripcion; }
    public cPrenda(){
        oDatos = new cConexion("localhost:3306", "dblavanderia", "root", "12345");        
    }
    
        public boolean insertar()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Descripcion);
            ResultSet rs = oDatos.llamarProcedimiento("spuInsertarPrenda", datosEnvio);
            
            String CodError =rs.getString(0);
            mensaje = rs.getString(1);
            return CodError == "1";
            }catch(Exception e){
                System.err.println("error al insertar: "+e);
            }
            return false;
        }
        //devuelve un arraylist para agregarlo ya en el frm a la tabla
        public ArrayList<Object []> Listar()
        {
            try{
                ResultSet r=oDatos.llamarProcedimiento("spuListarPrenda",null);
                ArrayList<Object []> a=new ArrayList<Object []>();
                //se le pone el tamaño de columnas de la tabla
                a=oDatos.DevolverTabla(r, 2);
                return a;
            }
            catch(Exception e){
                System.err.println("error al listar: "+e);
            }
            return null;
        }
        public ArrayList<Object[]> ListarEmpleado()
        {
            try{
                ResultSet r= oDatos.llamarProcedimiento("spuListarPrendaEmpleado",null);
                return oDatos.DevolverTabla(r,4);
            }catch(Exception e){
            System.err.println("error al listar: "+e);
        }
            return null;
        }
        public ResultSet Buscar(String Campo, String Contenido)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Campo);
            datosEnvio.add(Contenido);
            return oDatos.llamarProcedimiento("spuBuscarPrenda", datosEnvio);
            }catch(Exception e){
                System.err.println("error al listar: "+e);
            }
            return null;
        }
        public boolean deshabilitar()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(IdPrenda);
            ResultSet rs = oDatos.llamarProcedimiento("spuDeshabilitarPrenda", datosEnvio);
            String CodError =rs.getString(0);
            mensaje = rs.getString(1);
            if (CodError == "1")
                return true;
            else
                return false;
            }catch(Exception e){
                System.err.println("error al listar: "+e);
            }
            return false;
        }
        public boolean modificar()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(getIdPrenda());
            datosEnvio.add(Descripcion());
            ResultSet rs = oDatos.llamarProcedimiento("spuModificarPrenda", datosEnvio);
            String CodError = rs.getString(0);
            mensaje = rs.getString(1);
            if (CodError == "1")
                return true;
            else
                return false;
            }catch(Exception e){
                System.err.println("error al listar: "+e);
            }
            return false;
        }
        public int getIdPrenda()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Descripcion);
            ResultSet rs  = oDatos.llamarProcedimiento("spuRecuperarIdPrenda", datosEnvio);
            
            return Integer.parseInt(rs.getString(0));
            }catch(Exception e){
                System.err.println("error al listar: "+e);
            }
            return -1;
        }
}
