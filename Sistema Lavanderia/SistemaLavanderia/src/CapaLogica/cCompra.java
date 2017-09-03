
package capalogica;

import java.sql.ResultSet;
import java.util.Date;
import CapaDatos.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class cCompra {
    public String DocSalida ;
    public String Nro ;
    public String Serie ;
    public Date Fecha ;
    public String Usaurio ;
    public String EmpresaProveedora ;
    
    cConexion oDatos;
    public cCompra(){
        oDatos= new cConexion("localhost", "dblavanderia", "root", "12345");        
    }
    public String mensaje;
    public boolean insertar()
    {
        ArrayList<Object> datosEnvio = new ArrayList<Object>();
        datosEnvio.add(DocSalida);
        datosEnvio.add(Nro);
        datosEnvio.add(Serie);
        datosEnvio.add(Fecha);
        datosEnvio.add(Usaurio);
        datosEnvio.add(EmpresaProveedora);
        try {
        ResultSet rs = oDatos.llamarProcedimiento("spuInsertarCompra",datosEnvio);
        
            rs.next();
            String CodError = rs.getString(0);
            mensaje = rs.getString(1);
            if (CodError == "1")
                return true;
            else
                return false;
        } catch (Exception e) {
            System.out.println("Error insertar en cCompra");
            System.out.println(e);
            return false;
        }
    }
    public ResultSet Listar()
    {
        try{
        return oDatos.llamarProcedimiento("spuListarCompra",null);
        } catch (Exception e) {
            System.out.println("Error insertar en cCompra");
            System.out.println(e);
            return null;
        }
    }
    public ResultSet ListarEmpleado() throws ClassNotFoundException, SQLException
    {
        return oDatos.llamarProcedimiento("spuListarCompraHabilitado",null);
    }
    public ResultSet BucarPorUsuario(String user) throws ClassNotFoundException, SQLException
    {
        ArrayList<Object> datosEnvio = new ArrayList<Object>();
        datosEnvio.add(user);
        return oDatos.llamarProcedimiento("spuBuscarCompras",datosEnvio);
    }
   
    public ResultSet generarCodigo() throws ClassNotFoundException, SQLException
    {
        return oDatos.llamarProcedimiento("spuGenerarCodigoCompra",null);
    }

}
