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
public class cDatos extends cConexion{

    private PreparedStatement PrepararConsultaSQL=null;
    private String aNombreTabla;
    // joha
    protected Object[] Titulos;// Nombre de los atributos de la tabla
    protected Object[][] Valores;// Datos de la tabla
        
    protected String PrimaryKey;
    protected boolean aTitulosCargados=false;
    protected boolean aValoresCargados=false;
    protected String aConsulta;
   
    public cDatos(String pHost,String pNombreBD,String pUsuario,String pContrasenia) {
        super(pHost,pNombreBD, pUsuario, pContrasenia);
    }
    public cDatos(String pHost,String pNombreBD,String pUsuario,String pContrasenia,String pTabla){
        super(pHost,pNombreBD, pUsuario, pContrasenia);
        if(pTabla!= null){
            aNombreTabla= pTabla;
        }
    }
    public cDatos(String pHost,String pUsuario,String pContrasenia,String pNombreBD,String pTabla,String pConsulta){
        super(pHost,pNombreBD, pUsuario, pContrasenia);
        if(pTabla!= null){
            aNombreTabla= pTabla;
        }
        aConsulta=pConsulta;
    }
    
    public String getNombreTabla()
    {
        return aNombreTabla;
    }
    public void setNombreTabla(String pNombreTabla)
    {
        aNombreTabla=pNombreTabla;
    }
    
    public String getConsulta()
    {
        return aConsulta;
    }
    public void setConsulta(String pConsulta)
    {
        aConsulta=pConsulta;
    }
    
    // joha
    public Object[] getTitulos(){
        if(aTitulosCargados){
            return Titulos;
        }
        else{
            new Exception("No se ha cargado los atributos de la tabla.");
            return null;
        }
    }
    public void setTitulos(Object[] campos){
        this.Titulos= campos;
    }
    public Object[][] getValores(){
        if(aValoresCargados){
            return Valores;
        }
        else{
            new Exception("No se ha cargado los datos de la tabla.");
            return null;
        }
    }
    public void setValores(Object[][] valores){
        this.Valores= valores;
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
    public void CargarTitulos() {
        try
        {
            if(getConectadoBD()){
                aConsulta= "SELECT COLUMN_NAME\n" +
                                "FROM INFORMATION_SCHEMA.COLUMNS\n" +
                                "WHERE TABLE_NAME = '"+"TBoleta"+"'";
            
                ResultSet Resul=ProcesarConsultaR(aConsulta);
                Resul.last();
                int numFils =Resul.getRow();
                Object obj[]=null;
                obj=new Object[numFils];
                int j = 0;
                Resul.beforeFirst();
                while (Resul.next())
                {
                    obj[j]=Resul.getObject(1);
                    j++;
                }                
                setTitulos(obj);
                aTitulosCargados=true;
            }
            else{
                new Exception("Error al cargar los atributos de la tabla.");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error a nievel de la capa logica.\nDetalle:\n"+e);
        }
        
    }
    public void CargarDatosTabla(){
        try
        {
            if(getConectadoBD() & getNombreTabla()!= null){
                String consultaSQL= " select * from "+getNombreTabla()+"; ";
                aConsulta= consultaSQL;
                ResultSet Resul =ProcesarConsultaR(aConsulta);
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
                aValoresCargados=true;
            }
            else{
                new Exception("Error al cargar los datos de la tabla.");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
}
