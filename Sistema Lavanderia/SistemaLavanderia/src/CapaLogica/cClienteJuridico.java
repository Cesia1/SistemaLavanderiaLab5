
package capalogica;

import java.sql.ResultSet;
import CapaDatos.*;

public class cClienteJuridico {
    public String IdCliente ;
    public String RUC ;
    public String RazonSocial ;
    public String Direccion ;
    public String Telefono ;
    public String Rubro ;
    cDatos oDatos = new cDatos();
    public String mensaje;
    public boolean insertar()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuInsertarClJuridico", IdCliente, RUC, RazonSocial, Telefono, Direccion,Rubro);
        try {
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
                return true;
            else
                return false;
        } catch (Exception e) {
            System.out.println("Error insertar en cClienteJuridico");
            System.out.println(e);
            return false;
        }
    }
    public ResultSet Listar()
    {
        return oDatos.TraerDataTable("spuListarClJuridico");
    }//spuListarClJuridicoEmpleado
    public ResultSet ListarEmpleado()
    {
        return oDatos.TraerDataTable("spuListarClJuridicoEmpleado");
    }
    public ResultSet Buscar(String Campo, String Contenido)
    {
        return oDatos.TraerDataTable("spuBuscarClJuridico", Campo, Contenido);
    }
    public boolean deshabilitar()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuDeshabilitarClienteJuridico", IdCliente);
        try {
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
        ResultSet oFila = oDatos.TraerDataRow("spuModificarClJuridico", IdCliente,RUC, RazonSocial, Telefono, Direccion,Rubro);
        try {
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
    public String generarCodigo()
    {
        return oDatos.TraerValor("spuGenerarCodigoClJuridico").ToString();
    }
}
