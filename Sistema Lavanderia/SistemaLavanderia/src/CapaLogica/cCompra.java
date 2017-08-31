
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
    
    CEntidadMySQL oDatos;
    public cCompra(){
        oDatos= new CEntidadMySQL("dblavanderia", "localhost", "root", "", "TCompra");
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
        ResultSet oFila = oDatos.llamarProcedimiento("spuInsertarCompra",datosEnvio);
        
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
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
    /*public DataTable Buscar(string Campo, string Contenido)
    {
        return oDatos.TraerDataTable("spuBuscarCompra", Campo, Contenido);
    }
    public bool modificar()
    {
        DataRow oFila = oDatos.TraerDataRow("spuModificarCompra", IdCompra,  DNI,Nombres, Apellidos, Telefono,  Direccion);
        int CodError = int.Parse(oFila["CodError"].ToString());
        mensaje = oFila["Mensaje"].ToString();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    public bool deshabilitar()
    {
        DataRow oFila = oDatos.TraerDataRow("spuDeshabilitarCompra", IdCompra);
        int CodError = int.Parse(oFila["CodError"].ToString());
        mensaje = oFila["Mensaje"].ToString();
        if (CodError == 0)
            return true;
        else
            return false;
    }*/
    public String generarCodigo() throws ClassNotFoundException, SQLException
    {
        return (String) oDatos.ejecutarProcedimiento("spuGenerarCodigoCompra",null)[0][0];
    }

}
