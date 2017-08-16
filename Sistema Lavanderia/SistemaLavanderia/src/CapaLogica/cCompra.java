
package capalogica;

import java.sql.ResultSet;
import java.util.Date;
import CapaDatos.*;

public class cCompra {
    public String DocSalida ;
    public String Nro ;
    public String Serie ;
    public Date Fecha ;
    public String Usaurio ;
    public String EmpresaProveedora ;
    
    cDatos oDatos = new cDatos();
    public String mensaje;
    public boolean insertar()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuInsertarCompra", DocSalida,  Nro,Serie, Fecha,  Usaurio, EmpresaProveedora);
        try {
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
        return oDatos.TraerDataTable("spuListarCompra");
    }
    public ResultSet ListarEmpleado()
    {
        return oDatos.TraerDataTable("spuListarCompraHabilitado");
    }
    public ResultSet BucarPorUsuario(String user)
    {
        return oDatos.TraerDataTable("spuBuscarCompras",user);
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
    public String generarCodigo()
    {
        return oDatos.TraerValor("spuGenerarCodigoCompra").ToString();
    }

}
