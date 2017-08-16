
package capalogica;

import java.sql.ResultSet;
import CapaDatos.*;

public class cBoletaDetalle {
    public String DocEntrada ;
    public String NroBoleta ;
    public int IdComDetalle ;
    public String Observacion ;
    public double Cantidad  ;
    public double PrecioUnitario;
    public int IdPrenda ;
 
    cDatos oDatos = new cDatos();
    public String Mensaje;
    
    public boolean EntregarTicket()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuBoleta_Detalle_Insertar", DocEntrada, Cantidad, PrecioUnitario, IdPrenda, Observacion, NroBoleta);
        try {
             Mensaje = oFila.getString("Mensaje");
             return oFila.getString("codError")=="0";
         } catch (Exception e) {
             System.out.println("Error en clase cBoletaDetalle en Entregar ticket");
             System.out.println(e);
         }
        }
