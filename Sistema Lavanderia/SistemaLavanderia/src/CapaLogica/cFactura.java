
package capalogica;

import java.sql.ResultSet;
import java.util.Date;
import CapaDatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cFactura {
    public String DocEntrada ;
    public String NroFactura ;
    public Date FechaEmision ;
    public Date FechaCancelacion ;
    public boolean Entregado ;
    public String Usuario ;
    public String IdCliente ;
    CEntidadMySQL oDatos;
    public String mensaje;
    public boolean EntregarTicket()
    {
        ArrayList<Object> datosEnvio = new ArrayList<Object>();
        datosEnvio.add(DocEntrada);
        datosEnvio.add(Usuario);
        datosEnvio.add(IdCliente);
        datosEnvio.add(NroFactura);
        try {
        ResultSet oFila = oDatos.llamarProcedimiento("spuFactura_Insertar", datosEnvio);
        
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
        try {
            return oDatos.llamarProcedimiento("spuListarFactura",null);
        } catch (Exception ex) {
            System.out.println("Error EntregarTicket en cFactura");
        }
        return null;
    }
    public ResultSet Buscar(String campo, String contenido)
    {
        try{
        ArrayList<Object> datosEnvio = new ArrayList<Object>();
        datosEnvio.add(campo);
        datosEnvio.add(contenido);
        return oDatos.llamarProcedimiento("spuBuscarFactura", datosEnvio);
        } catch (Exception ex) {
            System.out.println("Error EntregarTicket en cFactura");
        }
        return null;
    }
    public void EntregarComprobante()
    {
        try {
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(DocEntrada);
            datosEnvio.add(NroFactura);
            datosEnvio.add(FechaEmision);
            oDatos.llamarProcedimiento("spuEntregarComprobante_Factura",datosEnvio);
        } catch (Exception ex) {
            System.out.println("Error EntregarTicket en cFactura:\n"+ex);
        }
        

    }
    public void Cancelar()
    {
        try {
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(DocEntrada);
            datosEnvio.add(NroFactura);
            datosEnvio.add(FechaCancelacion);
            oDatos.llamarProcedimiento("spuCancelarComprobante_Factura", datosEnvio);
        } catch (Exception ex) {
            System.out.println("Error EntregarTicket en cFactura:\n"+ex);
        }
    }
    public ResultSet BuscarPorCliente(String nomCliente)
    {
        try {
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(nomCliente);
        return oDatos.llamarProcedimiento("spuBuscarFacturaPorCliente", datosEnvio);
        } catch (Exception ex) {
            System.out.println("Error EntregarTicket en cFactura:\n"+ex);
        }
        return null;
    }
}
