
package capalogica;

import java.sql.ResultSet;
import CapaDatos.*;
import java.util.ArrayList;

public class cCompraDetalle {
    public int IdComDetalle ;
    public double PrecioUnitario;
    public int IdProducto ;
    public String DocSalida ;
    public int Cantidad ;
    CEntidadMySQL oDatos;
    public String mensaje;
    //constructor
    public cCompraDetalle(){
        oDatos= new CEntidadMySQL("dblavanderia", "localhost", "root", "", "TComprobante_Detalle");
    }
    public boolean insertar()
    {
        ArrayList<Object> datosEnvio = new ArrayList<Object>();
        datosEnvio.add(Cantidad);
        datosEnvio.add(PrecioUnitario);
        datosEnvio.add(IdProducto);
        datosEnvio.add(DocSalida);
        try {
        ResultSet oFila = oDatos.llamarProcedimiento("spuInsertarCompraDetalle",datosEnvio);
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
        try{
        return oDatos.llamarProcedimiento("spuListaCompraDetalle",null);
        } catch (Exception e) {
            System.out.println("Error insertar en cCompraDetalle");
            System.out.println(e);
            return null;
        }
    }
    public ResultSet ListarPorCompra(String doc)
    {
        try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
        datosEnvio.add(doc);
        return oDatos.llamarProcedimiento("spuListarCompraDetalle",datosEnvio);
        } catch (Exception e) {
            System.out.println("Error insertar en cCompraDetalle");
            System.out.println(e);
            return null;
        }
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
