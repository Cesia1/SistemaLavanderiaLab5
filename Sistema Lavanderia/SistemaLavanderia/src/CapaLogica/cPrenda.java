/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDatos.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author joha
 */
public class cPrenda {
    public int IdPrenda ;
    public String Descripcion;
    CEntidadMySQL oDatos;
    public String mensaje;
    // metodos
    public int IdPrenda() { return IdPrenda; }
    public void IdPrenda(int IdPrenda) { this.IdPrenda=IdPrenda;}
    public String Descripcion() { return Descripcion;}
    public void Descripcion(String Descripcion) { this.Descripcion= Descripcion; }
    public cPrenda(){
        oDatos = new CEntidadMySQL("dblavenderia", "localhost", "root", "", "TPrenda");        
    }
    
        public boolean insertar()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Descripcion);
            Object [][]oFila = oDatos.ejecutarProcedimiento("spuInsertarPrenda", datosEnvio);
            
            int CodError = Integer.parseInt((String)oFila[0][1]);
            mensaje = (String) oFila[0][0];
            return CodError == 0;
            }catch(Exception e){
                System.err.println("error al insertar: "+e);
            }
            return false;
        }
        public Object[][] Listar()
        {
            try{
            return oDatos.ejecutarProcedimiento("spuListarPrenda",null);
            }catch(Exception e){
                System.err.println("error al listar: "+e);
            }
            return null;
        }
        public Object[][] ListarEmpleado()
        {
            try{
                return oDatos.ejecutarProcedimiento("spuListarPrendaEmpleado",null);
            }catch(Exception e){
            System.err.println("error al listar: "+e);
        }
            return null;
        }
        public Object[][] Buscar(String Campo, String Contenido)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Campo);
            datosEnvio.add(Contenido);
            return oDatos.ejecutarProcedimiento("spuBuscarPrenda", datosEnvio);
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
            Object[][] oFila = oDatos.ejecutarProcedimiento("spuDeshabilitarPrenda", datosEnvio);
            int CodError = Integer.parseInt((String) oFila[0][1]);
            mensaje = (String) oFila[0][1];
            if (CodError == 0)
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
            Object[][] oFila = oDatos.ejecutarProcedimiento("spuModificarPrenda", datosEnvio);
            int CodError = Integer.parseInt((String) oFila[0][1]);
            mensaje = (String) oFila[0][0];
            if (CodError == 0)
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
            Object[][] oFila = oDatos.ejecutarProcedimiento("spuRecuperarIdPrenda", datosEnvio);
            
            return Integer.parseInt((String) oFila[0][0]);
            }catch(Exception e){
                System.err.println("error al listar: "+e);
            }
            return -1;
        }
}
