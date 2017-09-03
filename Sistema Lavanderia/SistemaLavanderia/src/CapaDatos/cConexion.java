/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joha
 */
public class cConexion {
    private String aNomClase;
    private String aServidor;
    private String aNombreBD;
    private String aUsuario ;
    private String aContrasenia ;
    protected Connection aConexion;
    protected boolean aConectadoBD;
    protected boolean aExisteBD;
    //private String aBDPadre="mysql";
    
    public cConexion(String pHost, String pNombreBD,String pUsuario, String pContrasenia){
        aNomClase = "com.mysql.jdbc.Driver";
        setNombreBD(pNombreBD);
        setServidor(pHost);
        setUsuario(pUsuario);
        setContrasenia(pContrasenia);
        aConectadoBD=false;
    }
    public String getNombreBD(){
        return aNombreBD;
    }
    public void setNombreBD(String pNombreBD){
        this.aNombreBD= pNombreBD;
    }
    public String getServidor(){
        return aServidor;
    }
    public void setServidor(String Servidor){
        this.aServidor= Servidor;
    }   
    public String getUsuario(){
        return aUsuario;
    }
    public void setUsuario(String usuario){
        this.aUsuario= usuario;
    }
    public String getContrasenia(){
        return aContrasenia;
    }
    public void setContrasenia(String pContrasenia){
        this.aContrasenia= pContrasenia;
    }
    public boolean getConectadoBD(){
        return aConectadoBD;
    }
    public void setConectadoBD(boolean pConectadoBD){
        this.aConectadoBD= pConectadoBD;
    }
    public void Conectar(){
        try {
            Class.forName(aNomClase);
            String url = "jdbc:mysql://"+ getServidor() + "/"+getNombreBD();
            aConexion = DriverManager.getConnection(url, getUsuario(), getContrasenia());
            
            aExisteBD= ExisteBD();
            if(aExisteBD){
                aConectadoBD = true;                
            }else{
                aConectadoBD=false;
                new Exception("No se encuentra la base de datos.");
            }
        } 
        catch (Exception e2) {
            JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos.\nDetalle\n"+e2);
        }
    }
    public void Desconectar() throws SQLException
    {
        aConexion.close();
        setConectadoBD(false);
    }
    /***
     * Metodo que devuelve todas las tablas pertenecientes a la BD.
     * @return 
     */
    public Object[] getListaTablasBD(){
        if(getConectadoBD())
        {
            try
            {
                java.sql.Statement consultaSQL = aConexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                                          ResultSet.CONCUR_READ_ONLY);
                ResultSet Resul=consultaSQL.executeQuery("show tables;");
                Resul.last();
                Object obj[]=null;
                int numFils =Resul.getRow();
                if(numFils>0){
                    obj= new Object[numFils];
                    int i=0;
                    Resul.beforeFirst();
                    while (Resul.next()) 
                    {
                        obj[i]=Resul.getObject(1);
                        i++;
                    }
                }else{
                    new Exception("La base de datos no cuenta con tablas.");
                }
                
                return obj;
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Error al momento de listar las tablas de la bd.\nDetalle:\n"+e);
            }
        }
        return null;
    }
    
    private boolean ExisteBD() {
        try {            
            java.sql.Statement consultaSQL = aConexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            consultaSQL.executeQuery("SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA \n"+
                                    "WHERE SCHEMA_NAME = '"+getNombreBD()+"';");
            ResultSet rs = consultaSQL.getResultSet();
            rs.next();
            String Resultado = rs.getString("SCHEMA_NAME");
            if(Resultado.equals(getNombreBD()))
                return true;
            else
                return false;
        } 
        catch (Exception e1) {
            JOptionPane.showMessageDialog(null,"Error en la Capa de Datos.\nDetalle:\nNo se puede verificar la existencia de la tabla.\n"+e1);
            return false;
        }
    }
    
    public ResultSet ProcesarConsultaR(String Consulta)
    {
        if(aConectadoBD){
            try{
                Statement consultaSQL =  aConexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                consultaSQL.executeQuery(Consulta);
                ResultSet rs =  consultaSQL.getResultSet();
                return rs;
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Error al procesar la consulta.\nDetalle:\n"+e);
            }
        }
        else{
            new Exception("Error al conectar con la base de datos.");
        }
        return null;
    }
    public void ProcesarConsulta(String Consulta)
    {
        if(aConectadoBD){
            try{
                Statement consultaSQL =  aConexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                consultaSQL.executeQuery(Consulta);
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Error al procesar la consulta.\nDetalle:\n"+e);
            }
        }
        else{
            new Exception("Error al conectar con la base de datos.");
        }
    }

    public Object[] getListaBDs() {
        try {            
            String consultaSQL ="show databases;";
                                        
            ResultSet Resul = ProcesarConsultaR(consultaSQL);
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
            new Exception("Error al listar las bases de datos, en el cliente.\nDetalle:\n"+e2);
            return null;
        }
    }
    public ResultSet llamarProcedimiento(String Nombre,ArrayList<Object> datos) throws SQLException
    {
        try{
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
            if(aConexion==null){
                System.err.println("Se encontro un error en la capa de datos.");
            }
            CallableStatement ConsultaCall=aConexion.prepareCall("{call "+Nombre+""+NroInte+"}");
            if(datos==null||datos.size()==0);
            else{
                for(int i=0;i<datos.size();i++)
                {
                    ConsultaCall.setObject(i+1,datos.get(i));
                }
            }
            ResultSet rs=ConsultaCall.executeQuery();
            return rs;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al llamar al procedimiento "+Nombre+"\nDetalle:\n"+ex);
        }
        return null;
    }
    
    
    // devuelve una lista de objetos que lo esto agregando en la parte de frmprenda, especificamente en mostrar prenda, checalo
    public ArrayList<Object []> DevolverTabla(ResultSet r, int a)throws SQLException{
        ArrayList<Object []> R=new ArrayList<Object []>();
        int j=0;
        while(r.next()){
            Object[] A=new Object[a];
            for (int i = 0; i < a; i++) {
                A[j]=(Object)r.getString(i);
            }
            R.add(A);
        }    
        return R;
    }
}
