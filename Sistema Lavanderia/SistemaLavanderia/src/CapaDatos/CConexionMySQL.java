package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joha
 */
public class CConexionMySQL {
    private String nomClase;
    private String servidor;
    private String baseDatos;
    private String usuario ;
    private String password ;
    protected Connection conexion;
    protected boolean conectado_bd;
    public CConexionMySQL(String bd, String host, String usuario, String contrasenia){
        nomClase = "com.mysql.jdbc.Driver";
        setbaseDatos(bd);
        setServidor(host);
        setusuario(usuario);
        setPassword(contrasenia);
        conectado_bd=false;
    }
    public String getServidor()
    {
        return servidor;
    }
    public void setServidor(String Servidor)
    {
        this.servidor= Servidor;
    }
    public String getbaseDatos()
    {
        return baseDatos;
    }
    public void setbaseDatos(String baseDatos)
    {
        this.baseDatos= baseDatos;
    }
    public String getusuario()
    {
        return usuario;
    }
    public void setusuario(String usuario)
    {
        this.usuario= usuario;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String Password)
    {
        this.password= Password;
    }
    
    public boolean ConectarSQL()
    {
        try {
            //baseDatos = nombreBD;
            if(ExisteBD())
            {

                conectado_bd=true;
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No se encuentra la base de datos.");
                return false;     
            }
            
        } 
        catch (Exception e2) {
            JOptionPane.showMessageDialog(null,e2);
            return false;
        }
    }
    public Object[] getListaTablas()
    {
        if(conectado_bd)
        {
            try
            {
                java.sql.Statement consultaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                                          ResultSet.CONCUR_READ_ONLY);
                ResultSet Resul=consultaSQL.executeQuery("show tables;");
                Resul.last();
                Object obj[]=null;
                int numFils =Resul.getRow();
                obj= new Object[numFils];
                int i=0;
                Resul.beforeFirst();
                while (Resul.next()) 
                {
                    obj[i]=Resul.getObject(1);
                    i++;
                }
                return obj;
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return null;
    }
    public void CerrarConexion() throws SQLException
    {
        conexion.close();
        conectado_bd=false;
    }
    private boolean ExisteBD() {
        try {
            
            Class.forName(nomClase);
            String url = "jdbc:mysql://"+ getServidor() + "/"+getbaseDatos();
            
            conexion = DriverManager.getConnection(url, getusuario(), getPassword());
            java.sql.Statement consultaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            consultaSQL.executeQuery("SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA \n"+
                                    "WHERE SCHEMA_NAME = '"+baseDatos+"';");
            ResultSet rs = consultaSQL.getResultSet();
            while (rs.next()) {
                if(rs.getString(1).equals(baseDatos))
                {
                    //conexion.close();// aqui
                    return true;
                }
            }
            return false;
        } 
        catch (Exception e1) {
            JOptionPane.showMessageDialog(null,e1);
            return false;
        }
    }
    public ResultSet ProcesarConsultaRS(String Consulta)
    {
        if(ExisteBD() & conectado_bd)
        {
            try
            {
                java.sql.Statement consultaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                                          ResultSet.CONCUR_READ_ONLY);
                ResultSet Resul =consultaSQL.executeQuery(Consulta);
                
                return Resul;
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return null;
    }
    public void ProcesarConsulta(String Consulta)
    {
        //if(ExisteBD() & conectado_bd)
            if(conectado_bd)
        {
            try
            {
                java.sql.Statement consultaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                                          ResultSet.CONCUR_UPDATABLE);
                consultaSQL.executeUpdate(Consulta);
                consultaSQL.close();// aqui
            }
            catch(SQLException e)
            {
                new Exception(e);
            }
        }
    }

    public Object[] getListaBDs() {
        try {            
            String consultaSQL ="show databases;";
                                        
            ResultSet Resul = ProcesarConsultaRS(consultaSQL);
            Resul.last();

            int numFils =Resul.getRow();
            Object obj[]= null;
            obj=new Object[numFils];
            int j = 0;
            Resul.beforeFirst();
            while (Resul.next())
            {
                obj[j]=Resul.getObject(1);
                j++;
            }
            return obj;
        } 
        catch (Exception e2) {
            new Exception(e2);
            return null;
        }
    }
}
