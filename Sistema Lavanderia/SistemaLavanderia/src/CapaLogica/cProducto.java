/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

/**
 *
 * @author joha
 */
import CapaDatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class cProducto {
    
    //atributos
    public int IdProducto;
    public String Descripcion;
    CEntidadMySQL oDatos;
    public String mensaje;
    //constructor
    public cProducto(){
        oDatos= new CEntidadMySQL("dblavanderia", "localhost", "root", "", "TProducto");
    }
    //metodos
    public int IdProducto() { return IdProducto;}
    public void IdProducto(int IdProducto) {this.IdProducto=IdProducto;}
    public String Descripcion() { return Descripcion;}
    public void Descripcion(String Descripcion) { this.Descripcion=Descripcion;}
    
    // metodos    
    public boolean insertar()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Descripcion);
            Object[][] oFila = oDatos.ejecutarProcedimiento("spuInsertarProducto", datosEnvio);
            int CodError = Integer.parseInt((String) oFila[0][1]);
            mensaje = (String) oFila[0][0];
            return CodError == 0;
            }catch(Exception e){
                System.err.println("error al listar: "+e);
            }
            return false;
        }
        public Object[][] Listar() throws SQLException
        {
        try {
            return oDatos.ejecutarProcedimiento("spuListarProducto",null);
        } catch (Exception ex) {
            System.err.println("error al listar: "+ex);
        }
        return null;
        }
        
        public Object[][] ListarEmpleado()
        {
        try {
            return oDatos.ejecutarProcedimiento("spuListarProductoEmpleado",null);
        } catch (Exception ex) {
            System.err.println("error al listar: "+ex);
        
        }
        return null;
        }
        public Object[][] Buscar(String Campo, String Contenido)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Campo);
            datosEnvio.add(Contenido);
            return oDatos.ejecutarProcedimiento("spuBuscarProducto",datosEnvio);
            } catch (Exception ex) {
            System.err.println("error al listar: "+ex);
        
        }
        return null;
        }
        public int BuscarId()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Descripcion);
            Object[][] oFila = oDatos.ejecutarProcedimiento("spuBuscarIdProducto",datosEnvio);
            int CodError = Integer.parseInt((String) oFila[0][0]);
            return CodError;
            } catch (Exception ex) {
            System.err.println("error al listar: "+ex);
        
        }
        return -1;
        }
        public boolean deshabilitar()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(IdProducto);
            Object[][] oFila = oDatos.ejecutarProcedimiento("spuDeshabilitarProducto", datosEnvio);
            int CodError = Integer.parseInt((String) oFila[0][1]);
            mensaje = (String) oFila[0][1];
            if (CodError == 0)
                return true;
            else
                return false;
            } catch (Exception ex) {
            System.err.println("error al listar: "+ex);
        
        }
        return false;
        }
        public boolean modificar()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(IdProducto);
            datosEnvio.add(Descripcion);
            Object[][] oFila = oDatos.ejecutarProcedimiento("spuModificarProducto",  datosEnvio);
            int CodError = Integer.parseInt((String) oFila[0][1]);
            mensaje = (String) oFila[0][0];
            if (CodError == 0)
                return true;
            else
                return false;
            } catch (Exception ex) {
            System.err.println("error en producto: "+ex);
        
        }
        return false;
        }
        /**
        public DataSet getEA(DateTime beg, DateTime end)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
        
            return oDatos.TraerDataSet("spuEntradaSalida", beg, end);
        }**/
        public Object[][] salida(Date beg, Date end)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
        datosEnvio.add(beg);
        datosEnvio.add(end);
            return oDatos.ejecutarProcedimiento("spuSalida", datosEnvio);
            } catch (Exception ex) {
            System.err.println("error e productos: "+ex);
        
        }
        return null;
        }
        public Object[][]EntradaBoleta(Date beg, Date end)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(beg);
            datosEnvio.add(end);
            return oDatos.ejecutarProcedimiento("spuEntradaBoleta", datosEnvio);
            } catch (Exception ex) {
            System.err.println("error e productos: "+ex);
        
        }
        return null;
        }
        public Object[][] EntradaFactura(Date beg, Date end)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(beg);
            datosEnvio.add(end);
            return oDatos.ejecutarProcedimiento("spuEntradaFactura", datosEnvio);
            } catch (Exception ex) {
            System.err.println("error e productos: "+ex);
        
        }
        return null;
        }
}
