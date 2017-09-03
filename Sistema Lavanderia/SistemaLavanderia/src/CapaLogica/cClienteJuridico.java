
package capalogica;

import java.sql.ResultSet;
import CapaDatos.*;
import java.util.ArrayList;

public class cClienteJuridico {
    public String IdCliente ;
    public String RUC ;
    public String RazonSocial ;
    public String Direccion ;
    public String Telefono ;
    public String Rubro ;
    cDatos oDatos;// = new cDatos();
    public String mensaje;
    public cClienteJuridico(cDatos pDatos){
        
        if(!pDatos.getConectadoBD()){
            pDatos.Conectar();
        }
        oDatos=pDatos;
    }
    public boolean insertar(){
        try {
            ArrayList<Object> lis=new ArrayList<>();
            lis.add(IdCliente);
            lis.add(RUC);
            lis.add(RazonSocial);
            lis.add(Telefono);
            lis.add(Direccion);
            lis.add(Rubro);
            ResultSet oFila = oDatos.llamarProcedimiento("spuInsertarClJuridico", lis);
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 1)
                return true;
            else{
                new Exception(mensaje);
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error insertar en cClienteJuridico");
            System.out.println(e);
            return false;
        }
    }
    public ResultSet Listar(){
        try{
        return oDatos.llamarProcedimiento("spuListarClJuridico",null);
        } catch (Exception e) {
            System.out.println("Error insertar en cClienteJuridico");
            System.out.println(e);
            return null;
        }
    }//spuListarClJuridicoEmpleado
    public ResultSet ListarEmpleado()
    {
        try{
            return oDatos.llamarProcedimiento("spuListarClJuridicoEmpleado",null);
        } catch (Exception e) {
            System.out.println("Error insertar en cClienteJuridico");
            System.out.println(e);
            return null;
        }
    }
    public ResultSet Buscar(String Campo, String Contenido)
    {
        try{
            ArrayList<Object> lis=new ArrayList<>();
            lis.add(Campo);
            lis.add(Contenido);
            return oDatos.llamarProcedimiento("spuBuscarClJuridico", lis);
        } catch (Exception e) {
            System.out.println("Error insertar en cClienteJuridico");
            System.out.println(e);
            return null;
        }
    }
    public boolean deshabilitar()
    {
        try {
            ArrayList<Object> lis=new ArrayList<>();
            lis.add(IdCliente);
            ResultSet oFila = oDatos.llamarProcedimiento("spuDeshabilitarClienteJuridico", lis);
        
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
                return true;
            else
                return false;
        } catch (Exception e) {
            System.out.println("Error deshabilitar en cClienteJuridico");
            System.out.println(e);
            return false;
        }
    }
    public boolean modificar()
    {
        try {
            ArrayList<Object> lis=new ArrayList<>();
            lis.add(IdCliente);
            lis.add(RUC);
            lis.add(RazonSocial);
            lis.add(Telefono);
            lis.add(Direccion);
            lis.add(Rubro);
            ResultSet oFila = oDatos.llamarProcedimiento("spuModificarClJuridico", lis);
        
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
                return true;
            else
                return false;
        } catch (Exception e) {
            System.out.println("Error modificar en cClienteJuridico");
            System.out.println(e);
            return false;
        }
    }
    public String generarCodigo()
    {
        try{
            ResultSet oFila= oDatos.llamarProcedimiento("spuGenerarCodigoClJuridico",null);
            oFila.next();
            mensaje = oFila.getString("Mensaje");
            return mensaje;
        } catch (Exception e) {
            System.out.println("Error modificar en cClienteJuridico");
            System.out.println(e);
            return null;
        }
    }
}
