
package capalogica;

import java.sql.ResultSet;
import java.util.Date;
import CapaDatos.*;

public class cFactura {
    public String DocEntrada ;
    public String NroFactura ;
    public Date FechaEmision ;
    public Date FechaCancelacion ;
    public boolean Entregado ;
    public String Usuario ;
    public String IdCliente ,
    cDatos oDatos = new cDatos();
    public String mensaje;
    public boolean EntregarTicket()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuFactura_Insertar", DocEntrada, Usuario, IdCliente, NroFactura);
        try {
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
                return true;
            else
                return false;
        } catch (Exception e) {
            System.out.println("Error EntregarTicket en cFactura");
            System.out.println(e);
            return false;
        }
    }
    public ResultSet Listar()
    {
        return oDatos.TraerDataTable("spuListarFactura");
    }
    public ResultSet Buscar(String campo, String contenido)
    {
        return oDatos.TraerDataTable("spuBuscarFactura", campo, contenido);
    }
    public void EntregarComprobante()
    {
        oDatos.Ejecutar("spuEntregarComprobante_Factura", DocEntrada, NroFactura, FechaEmision);

    }
    public void Cancelar()
    {
        oDatos.Ejecutar("spuCancelarComprobante_Factura", DocEntrada, NroFactura, FechaCancelacion);
    }
    public ResultSet BuscarPorCliente(String nomCliente)
    {
        return oDatos.TraerDataTable("spuBuscarFacturaPorCliente", nomCliente);
    }
}
