
package capalogica;

import CapaDatos.cDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public boolean EntregarTicket() throws ClassNotFoundException, SQLException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(DocEntrada);
        lis.add(Cantidad);
        lis.add(PrecioUnitario);
        lis.add(IdPrenda);
        lis.add(Observacion);
        lis.add(NroBoleta);
        oDatos.Conectar();
        ResultSet oFila = oDatos.llamarProcedimiento("spuBoleta_Detalle_Insertar",lis);
        oDatos.Desconectar();
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        Mensaje = oFila.getString("Mensaje");
        if (CodError == 0)
            return true;
        else
            return false;
    }
}
