/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class cDatos {
    private String aNombreBD;
    private String aHost;
    private String aUsuario;
    private String aContraseña;
    private String aConsulta;    
    private String nomClase= "com.mysql.jdbc.Driver";
    private Connection conexion ;
    private PreparedStatement PrepararConsultaSQL=null;
    // joha
    protected Object[] Titulos;// Nombre de los atributos y su tipo: Tipo_Campo,Nombre_Campo
    protected Object[][] Valores;// Datos de la tabla
    public cDatos()
    {
        aNombreBD="dblavanderia";
        aHost="localhost";
        aUsuario="root";
        aContraseña="";
        aConsulta=null;
    }
    public cDatos(String pHost,String pNombreBD,String pUsuario,String pContraseña,String pConsulta)
    {
        aNombreBD=pNombreBD;
        aHost=pHost;
        aUsuario=pUsuario;
        aContraseña=pContraseña;
        aConsulta=pConsulta;
    }
    public cDatos(String pHost,String pNombreBD,String pUsuario,String pContraseña) {
        aNombreBD=pNombreBD;
        aHost=pHost;
        aUsuario=pUsuario;
        aContraseña=pContraseña;
    }
    public void setNombreBD(String pNombreBD)
    {
        aNombreBD=pNombreBD;
    }
    public void setHost(String pHost)
    {
        aHost=pHost;
    }
    public void setUsuario(String pUsuario)
    {
        aUsuario=pUsuario;
    }
    public void setContraseña(String pContraseña)
    {
        aContraseña=pContraseña;
    }
    public void setConsulta(String pConsulta)
    {
        aConsulta=pConsulta;
    }
    public String getNombreBD()
    {
        return aNombreBD;
    }
    public String getHost()
    {
        return aHost;
    }
    public String getUsuario()
    {
        return aUsuario;
    }
    public String getContraseña()
    {
        return aContraseña;
    }
    public String getConsulta()
    {
        return aConsulta;
    }
    // joha
    public Object[] getTitulos(){
        return Titulos;
    }
    public void setTitulos(Object[] campos){
        this.Titulos= campos;
    }
    public Object[][] getValores(){
        return Valores;
    }
    public void setValores(Object[][] valores){
        this.Valores= valores;
    }
    // joha 
    public void Conectar() throws SQLException, ClassNotFoundException
    {
        Class.forName(nomClase);
        String url = "jdbc:mysql://"+aHost+"/"+aNombreBD+"";
        conexion =  DriverManager.getConnection(url, aUsuario, aContraseña);
    }
    public ResultSet llamarProcedimiento(String Nombre,ArrayList<Object> datos) throws ClassNotFoundException, SQLException
    {
        String NroInte="";
        if(datos==null||datos.size()==0)
        {
            NroInte="()";
        }
        else{
            for(int i=0;i<datos.size();i++)
            {
                NroInte+="?,";
            }
            NroInte="("+NroInte.substring(0, NroInte.length()-1)+")";
        }
        CallableStatement ConsultaCall=conexion.prepareCall("{call "+Nombre+""+NroInte+"}");
        if(datos==null||datos.size()==0);
        else{
            for(int i=0;i<datos.size();i++)
            {
                ConsultaCall.setObject(i+1,datos.get(i));
            }
        }
        ResultSet rs=ConsultaCall.executeQuery();
        return rs;
        
    }
    public void Desconectar() throws SQLException
    {
        conexion.close();
    }
    public void ProcesarConsulta() throws SQLException
    {
        Statement consultaSQL =  conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        consultaSQL.executeUpdate(aConsulta);
        ResultSet rs =  consultaSQL.getResultSet();
    }
    public ResultSet ProcesarConsultaR() throws SQLException
    {
        Statement consultaSQL =  conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        consultaSQL.executeQuery(aConsulta);
        ResultSet rs =  consultaSQL.getResultSet();
        return rs;
    }

    public Object[][] getValores(ResultSet dato) {
        try{
            ResultSet Resul = dato;
        Resul.last();
        ResultSetMetaData rsmd = Resul.getMetaData();
        int numCols = rsmd.getColumnCount();
        int numFils =Resul.getRow();
        Object obj[][]=null;
                obj=new Object[numFils][numCols];
                int j = 0;
                Resul.beforeFirst();
                //String linea="";
                while (Resul.next())
                {
                   // linea="";
                    for (int i=0;i<numCols;i++)
                    {
                        obj[j][i]=Resul.getObject(i+1);
                        //linea=linea+"|"+obj[j][i];
                    }
                    j++;
                }
                return obj;
        }
        catch(Exception e){
            System.err.println("Se encontro un error en la capa de datos.");
        }
        return null;
    }
    public void CargarCampos() {
        
        try
        {
            String consultaSQL=//"use "+ getbaseDatos()+"\n" +
                                "SELECT DATA_TYPE, COLUMN_NAME\n" +
                                "FROM INFORMATION_SCHEMA.COLUMNS\n" +
                                "WHERE TABLE_NAME = '"+"TBoleta"+"'";
            aConsulta= consultaSQL;
            
            ResultSet Resul=ProcesarConsultaR();
            Resul.last();
            ResultSetMetaData rsmd = Resul.getMetaData();
            int numCols = rsmd.getColumnCount();
            int numFils =Resul.getRow();
            Object obj[][]=null;
            obj=new Object[numFils][numCols];
            int j = 0;
            Resul.beforeFirst();

            while (Resul.next())
            {
                for (int i=0;i<numCols;i++)
                {
                    obj[j][i]=Resul.getObject(i+1);

                }
                j++;
            }                
            Valores= obj;
            //setCampos(obj);
        }
        catch(Exception e)
        {
            new Exception(e);
        }
        
    }
    public void CargarValores(){
        
        
            try
            {
                String consultaSQL=//"USE "+getbaseDatos()+
                                    " select * from "+"TBoleta"+"; ";
                aConsulta= consultaSQL;
                ResultSet Resul =ProcesarConsultaR();
                Resul.last();
                ResultSetMetaData rsmd = Resul.getMetaData();
                int numCols = rsmd.getColumnCount();
                int numFils =Resul.getRow();
                Object obj[][]=null;
                obj=new Object[numFils][numCols];
                int j = 0;
                Resul.beforeFirst();
                while (Resul.next())
                {
                    for (int i=0;i<numCols;i++)
                    {
                        obj[j][i]=Resul.getObject(i+1);
                    }
                    j++;
                }
                setValores(obj);
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        
    }
}
