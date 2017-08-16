
package capalogica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import java.time.*;
import CapaDatos.*;

public class cBoleta {
    
    public String DocEntrada;
    public String NroBoleta;
    public Date FechaEmision;
    public boolean Entregado;
    public String Usuario;
    public String IdCliente;

    
    cDatos oDatos = new cDatos();
    public String Mensaje;
    public String generarCodigo()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuGenerarCodigoEntrada");
        try {
            oFila.next();
            return (String.valueOf(oFila.getInt("codigo")));
        } catch (SQLException ex) {
            Logger.getLogger(cBoleta.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error clase cboleta generar codigo");
            System.out.println(ex);
            return null;
        }
    }
    public ResultSet Listar()
    {
        return oDatos.TraerDataTable("spuListarBoleta");
    }
    public ResultSet Caja(LocalTime inicio, LocalTime fin )
    {
        return oDatos.TraerDataTable("spuCaja",inicio,fin);
    }
    public ResultSet Buscar(String campo, String contenido)
    {
        return oDatos.TraerDataTable("spuBuscarBoleta", campo, contenido);
    }

    public boolean EntregarTicket()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuBoleta_Insertar", DocEntrada, Usuario, IdCliente,NroBoleta);
        try {
            Mensaje = oFila.getString("Mensaje");
            return oFila.getString("codError")=="0";
        } catch (Exception e) {
            System.out.println("Error en clase cBoleta en Entregar ticket");
            System.out.println(e);
        }
        
    }
    public void EntregarComprobante()
    {
        oDatos.Ejecutar("spuEntregarComprobante_Boleta", DocEntrada, NroBoleta, FechaEmision);
    }
    public ResultSet BuscarPorCliente(string nomCliente)
    {
        return oDatos.TraerDataTable("spuBuscarBoletaPorCliente", nomCliente);
    }
}
