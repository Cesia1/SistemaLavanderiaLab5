
package capalogica;

import java.sql.ResultSet;
import CapaDatos.*;

public class cCompraDetalle {
    public int IdComDetalle ;
    public double PrecioUnitario;
    public int IdProducto ;
    public String DocSalida ;
    public int Cantidad ;
    cDatos oDatos = new cDatos();
    public String mensaje;
    public boolean insertar()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuInsertarCompraDetalle", Cantidad, PrecioUnitario, IdProducto, DocSalida);
        try {
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
                return true;
            else
                return false;
        } catch (Exception e) {
            System.out.println("Error insertar en cCompraDetalle");
            System.out.println(e);
            return false;
        }
    }
    public ResultSet Listar()
    {
        return oDatos.TraerDataTable("spuListaCompraDetalle");
    }
    public ResultSet ListarPorCompra(String doc)
    {
        return oDatos.TraerDataTable("spuListarCompraDetalle",doc);
    }
    /*public DataTable ListarEmpleado()
    {
        return oDatos.TraerDataTable("spuListarCompraDetalleHabilitado");
    }
    public DataTable Buscar(string Campo, string Contenido)
    {
        return oDatos.TraerDataTable("spuBuscarCompraDetalle", Campo, Contenido);
    }
    public bool modificar()
    {
        DataRow oFila = oDatos.TraerDataRow("spuModificarCompraDetalle", IdCompraDetalle,  DNI,Nombres, Apellidos, Telefono,  Direccion);
        int CodError = int.Parse(oFila["CodError"].ToString());
        mensaje = oFila["Mensaje"].ToString();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    public bool deshabilitar()
    {
        DataRow oFila = oDatos.TraerDataRow("spuDeshabilitarCompraDetalle", IdCompraDetalle);
        int CodError = int.Parse(oFila["CodError"].ToString());
        mensaje = oFila["Mensaje"].ToString();
        if (CodError == 0)
            return true;
        else
            return false;
    }
    public string generarCodigo()
    {
        return oDatos.TraerValor("spuGenerarCodigoCompraDetalle").ToString();
    }*/
}
