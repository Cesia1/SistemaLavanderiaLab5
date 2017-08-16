
package capalogica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import CapaDatos.*;

public class cCliente {
    public String IdCliente ;
    public String Nombres ;
    public String DNI ;
    public String Apellidos ;
    public String Direccion ;
    public String Telefono ;
    cDatos oDatos = new cDatos();
    public String mensaje;
    
    public boolean insertar()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuInsertarCliente", IdCliente,  DNI,Nombres, Apellidos,  Telefono, Direccion);
        try {
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
                return true;
            else
                return false;
        } catch (Exception e) {
            System.out.println("Error insertar en cCliente");
            System.out.println(e);
            return false;
        }
        
    }
    public ResultSet Listar()
    {
        return oDatos.TraerDataTable("spuListarCliente");
    }
    public ResultSet ListarEmpleado()
    {
        return oDatos.TraerDataTable("spuListarClienteHabilitado");
    }
    public ResultSet Buscar(String Campo,String Contenido)
    {
        return oDatos.TraerDataTable("spuBuscarCliente", Campo, Contenido);
    }
    public boolean modificar()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuModificarCliente", IdCliente,  DNI,Nombres, Apellidos, Telefono,  Direccion);
        try {
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
                return true;
            else
                return false;
        } catch (SQLException ex) {
            System.out.println("Error modificar en cCliente");
            System.out.println(ex);
            Logger.getLogger(cCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      
    }
    public boolean deshabilitar()
    {
        ResultSet oFila = oDatos.TraerDataRow("spuDeshabilitarCliente", IdCliente);
        try {
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
                return true;
            else
                return false;
        } catch (SQLException ex) {
            System.out.println("Error deshabilitar en cCliente");
            System.out.println(ex);
            Logger.getLogger(cCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    public String generarCodigo()
    {
        return oDatos.TraerValor("spuGenerarCodigoCliente").ToString();
    }
}
