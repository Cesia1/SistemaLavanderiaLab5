package CapaDatos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Joha
 */
public class CEntidadMySQL extends CConexionMySQL{
    protected String nombreTabla;
    protected Object[][] Campos;// Nombre de los atributos y su tipo: Tipo_Campo,Nombre_Campo
    protected Object[][] Valores;// Datos de la tabla
    protected String PrimaryKey;
    boolean campos_cargados=false;
    public CEntidadMySQL(String bd, String host, String usuario, String contrasenia,String tabla) {
        super( bd,  host,  usuario,  contrasenia);
        if(!tabla.equals(""))
            setNombreTabla(tabla);
    }
    public String getPrimaryKey()
    {
        return PrimaryKey;
    }
    public void setPrimaryKey(String PK)
    {
        this.PrimaryKey= PK;
    }
    public String getNombreTabla()
    {
        return nombreTabla;
    }
    public void setNombreTabla(String nombreTabla)
    {
        this.nombreTabla= nombreTabla;
    }
    public Object[][] getCampos(){
        return Campos;
    }
    public void setCampos(Object[][] campos){
        this.Campos= campos;
    }
    public Object[][] getValores(){
        return Valores;
    }
    public void setValores(Object[][] valores){
        this.Valores= valores;
    }
    public boolean ExisteTabla(String tabla) {
        if(conectado_bd)
        {
            try
            {
                String d= getbaseDatos();
                ProcesarConsulta("use "+getbaseDatos()+";");
                String consultaSQL=
                                   "SELECT COUNT(*) AS count\n" +
                                   "FROM information_schema.tables\n" +
                                   "WHERE table_schema = '"+getbaseDatos()+"' AND table_name = '"+tabla+"';";
                ResultSet Resul=ProcesarConsultaRS(consultaSQL);
                Resul.last();
                Resul.beforeFirst();
                //String linea;
                while (Resul.next())
                {
                    if(Resul.getString(1).equals("1"))
                    {
                        return true;
                    }
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return false;
    }
    public boolean ExisteRegistroPorAtributo(String nombreCampo, String valor) {
        if(ExisteTabla(getNombreTabla()) & conectado_bd & ExisteCampo(nombreCampo))
        {
            try
            {
                String consulta="Use "+getbaseDatos()+"\n"+
                                "SELECT * \n" +
                                "FROM "+ getNombreTabla()+"\n" ;
                if(EsVarchar(nombreCampo))
                {
                    consulta=consulta+"WHERE "+nombreCampo+"='"+ valor+"' ";
                }
                else
                    consulta=consulta+"WHERE "+nombreCampo+"="+ valor+" ";
                
                ResultSet Resul = ProcesarConsultaRS(consulta);
                Resul.last();
                int numFils =Resul.getRow();
                if(numFils>0)
                {
                    return true;
                }                
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return false;
    }
    public Object[] getRegistro(String Atributo, String valor) {
        if(ExisteTabla(getNombreTabla()) & conectado_bd)
        {
            try
            {
                String consultaSQL="use "+getbaseDatos()+"\n"+
                                    "SELECT * \n" +
                                    "FROM "+ getNombreTabla()+"\n" ;
                if(EsVarchar(Atributo))
                {
                    consultaSQL=consultaSQL+"WHERE "+Atributo+"='"+ valor+"' ";
                }
                else
                    consultaSQL=consultaSQL+"WHERE "+Atributo+"="+ valor+" ";
                ResultSet Resul = ProcesarConsultaRS(consultaSQL);
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
                    }
                    j++;
                    break;
                }
                return obj[0];
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return null;
    }
    public void insertarDatos(String datos){
        if(conectado_bd)
        {
            String consulta=//"use "+getbaseDatos()+"\n"+
                            "INSERT INTO "+getNombreTabla()+"(";

            for(int i=0;i<getCampos().length;i++)
            {
                String at = (String) getCampos()[i][1];
//                if(!EsIdentity(at))
//                {
                    consulta =consulta+getCampos()[i][1]+",";
//                }
            }
            consulta = consulta.substring(0, consulta.length()-1);
            consulta= consulta+") VALUES ("+datos+")";
            ProcesarConsulta(consulta);
            
        }
        else
            new Exception("No se puede conectar a la base de datos");
    }
    public void actualizarDatos(String[] datos) {
        try
        {
            if(conectado_bd)
            {
                String set ="";
                String k=getPrimaryKey();
                
                for(int i=0; i<getCampos().length;i++)
                {
                    boolean b=!getCampos()[i][1].equals(k);
                    if(b)
                    {
                        if(getCampos()[i][0].equals("int"))
                        {
                            set =set+" "+getCampos()[i][1]+"="+datos[i]+",";
                        }
                        else
                            set =set+" "+getCampos()[i][1]+"='"+datos[i]+"',";
                    }
                    
                }
                set=set.substring(0, set.length()-1);
                String consulta=//"use "+getbaseDatos()+"\n"+
                                "UPDATE "+getNombreTabla()+" "
                                    + "SET "+set+"\n";
                
                if(EsVarchar(getPrimaryKey()))
                    consulta=consulta+"WHERE "+k+"='"+datos[0]+"';";
                else
                    consulta=consulta+"WHERE "+k+"="+datos[0]+";";
                
                ProcesarConsulta(consulta);        
            }
        }
        catch(Exception e)
        {
            new Exception(e);
        }
    }
    public void eliminarRegistro(String Atributo, String valor) {
        if(conectado_bd)
        {
            boolean es_varchar=true;
            for(int i=0; i<getCampos().length;i++)
            {
                if(getCampos()[i][1].equals(Atributo))
                {
                    if(getCampos()[i][0].equals("int")){
                        es_varchar=false;
                        break;
                    }
                }
            }
            String consulta=//"use "+getbaseDatos()+"\n"+
                            "DELETE FROM "+getNombreTabla()+" "
                            + " WHERE "+Atributo+"=";
            if(es_varchar)
            {
                consulta= consulta+"'"+valor+"';";
            }
            else
                consulta= consulta+valor+";";
            ProcesarConsulta(consulta);
        }
        else
        {
            new Exception("No se puede eliminar el registro.");
        }
    }
    public Object[] getAtributosTabla(String tabla) {
        if(conectado_bd)
        {
            try
            {
                
                String consultaSQL="SELECT COLUMN_NAME\n" +
                                    "FROM INFORMATION_SCHEMA.COLUMNS\n" +
                                    "WHERE TABLE_NAME = '"+getNombreTabla()+"';";
                ResultSet Resul=ProcesarConsultaRS(consultaSQL);
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
                
                return obj;
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        
        return null;
    }
    Object[] getPrimerRegistro() {
        if(ExisteTabla(getNombreTabla()) & conectado_bd)
        {
            try
            {
                String consultaSQL="SELECT TOP 1 *  \n" +
                                                            "FROM "+ getNombreTabla()+"\n" +
                                                            "ORDER BY "+getValores()[0]+" ASC";
                ResultSet Resul =ProcesarConsultaRS(consultaSQL);
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
                    //JOptionPane.showMessageDialog(null,linea);
                    //System.out.println(linea);
                }
                return obj[0];
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return null;
    }
    Object[] getAnteriorRegistro(String primaryKey) {
        if(ExisteTabla(getNombreTabla()) & conectado_bd)
        {
            try
            {
                String consultaSQL="SELECT * \n" +
                                                            "FROM "+ getNombreTabla()+"\n" +
                                                            "WHERE "+getValores()[0]+"<"+ primaryKey+" ";
                ResultSet Resul = ProcesarConsultaRS(consultaSQL);
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
                    //JOptionPane.showMessageDialog(null,linea);
                    //System.out.println(linea);
                }
                return obj[numFils-1];
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return null;
    }
    public Object UltimoRegistroInsertado()
    {
        if(ExisteTabla(getNombreTabla()) & conectado_bd)
        {
            try
            {
                String consultaSQL="select "+getPrimaryKey()+"\n" +
                                    "  from "+getNombreTabla()+"\n" +
                                    " order by "+getPrimaryKey()+ " desc\n" +
                                    " limit 1;";
                ResultSet Resul = ProcesarConsultaRS(consultaSQL);
                Resul.last();
                Object obj=null;
                int j = 0;
                Resul.beforeFirst();
                while (Resul.next())
                {                    
                    obj=Resul.getObject(1);
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
    Object[] getUltimoRegistro() {
        if(ExisteTabla(getNombreTabla()) & conectado_bd)
        {
            try
            {
                CargarPrimaryKey();
                String consultaSQL=//"use "+ getbaseDatos()+"\n"+
                                    "select *\n" +
                                    "  from "+getNombreTabla()+"\n" +
                                    " order by "+getPrimaryKey()+" desc\n" +
                                    " limit 1;";
                ResultSet Resul = ProcesarConsultaRS(consultaSQL);
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
                    //JOptionPane.showMessageDialog(null,linea);
                    //System.out.println(linea);
                }
                return obj[0];
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return null;
    }
    Object[] getSiguienteRegistro( String primaryKey) {
        if(ExisteTabla(getNombreTabla()) & conectado_bd)
        {
            try
            {
                String consultaSQL="use "+ getbaseDatos()+"\n"+
                                    "SELECT * \n" +
                                    "FROM "+ getNombreTabla()+"\n" +
                                    "WHERE "+getPrimaryKey()+">"+ primaryKey+" ";
                ResultSet Resul = ProcesarConsultaRS(consultaSQL);
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
                    //JOptionPane.showMessageDialog(null,linea);
                    //System.out.println(linea);
                }
                return obj[0];
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return null;
    }

    private int getNumeroRegistros() throws SQLException {
        String PK = getPrimaryKey();
        String consulta= "Select COUNT("+PK+") FROM "+getNombreTabla()+" ";
        ResultSet Resul =ProcesarConsultaRS(consulta);
        
        int numFils =Resul.getRow();
        return numFils;
    }
    private int getNumeroColumnas() throws SQLException {
        return getCampos().length;
    }
    public boolean ExisteCampo(String nombreCampo) {
        if(conectado_bd & getNombreTabla()!=null & !getNombreTabla().equals(""))
        {
            try
            {
                if(!campos_cargados)
                {
                    CargarCampos();
                    campos_cargados=true;
                }
                
                
                for(int i=0; i<Campos.length;i++)
                {
                    if(Campos[i][1].equals(nombreCampo))
                    {
                        return true;
                    }
                }
            }
            catch(Exception e)
            {
                new Exception("No se encuentra el campo. "+e);
                //return false;
            }
        }
        return false;
    }
    
    public void CargarCampos() {
        if(conectado_bd)
        {
            try
            {
                String consultaSQL=//"use "+ getbaseDatos()+"\n" +
                                    "SELECT DATA_TYPE, COLUMN_NAME\n" +
                                    "FROM INFORMATION_SCHEMA.COLUMNS\n" +
                                    "WHERE TABLE_NAME = '"+getNombreTabla()+"'";
                ResultSet Resul=ProcesarConsultaRS(consultaSQL);
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
                setCampos(obj);
            }
            catch(Exception e)
            {
                new Exception(e);
            }
        }
        else
            setCampos(null);
    }
    public void CargarValores(){
        if(conectado_bd)
        {
            try
            {
                String consultaSQL=//"USE "+getbaseDatos()+
                                    " select * from "+getNombreTabla()+"; ";
                ResultSet Resul =ProcesarConsultaRS(consultaSQL);
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

    public void CargarPrimaryKey() {
        if(conectado_bd)
        {
            try
            {
                String consultaSQL=//"use "+getbaseDatos()+"\n"+
                                    "SELECT COLUMN_NAME\n" +
                                    "FROM INFORMATION_SCHEMA.COLUMNS\n" +
                                    "WHERE TABLE_NAME = '"+getNombreTabla()+"'\n" +
                                    "	AND COLUMN_KEY='PRI'";
                ResultSet Resul =ProcesarConsultaRS(consultaSQL);
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
                    break;
                }
                setPrimaryKey((String) obj[0][0]);
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }        
    }

    private boolean EsIdentity(String campo) {
        if(conectado_bd)
        {
            try
            {
                String consultaSQL=//"use "+getbaseDatos()+"\n"+
                                    "SELECT COLUMN_NAME\n" +
                                    "FROM INFORMATION_SCHEMA.COLUMNS\n" +
                                    "WHERE TABLE_NAME = '"+getNombreTabla()+"'\n" +
                                    "    AND COLUMN_NAME = '"+campo+"'\n" +
                                    "    AND DATA_TYPE = 'int'\n" +
                                    "    AND COLUMN_DEFAULT IS NULL\n" +
                                    "    AND IS_NULLABLE = 'NO'\n" +
                                    "    AND EXTRA like '%auto_increment%'";
                ResultSet Resul =ProcesarConsultaRS(consultaSQL);
                Resul.last();          
                
                Resul.beforeFirst();
                while (Resul.next())
                {
                    String dato =(String) Resul.getObject(1);
                    boolean i =dato.equals(campo);
                    if(i)
                    {
                        return true;
                    }
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }        
        return false;
    }

    public boolean EsVarchar(String Atributo) {
        try{
            if(ExisteCampo(Atributo))
            {
                for (Object[] Campo : Campos) {
                    if (Campo[1].equals(Atributo)) {
                        if (Campo[0].equals("varchar")) {
                            return true;
                        }
                    }
                }
            }
        }
        catch(Exception e){
            new Exception(e);
        }
        return false;
    }

    public void insertarFoto(String nombres, String ruta) {
        try{
        PreparedStatement ps = conexion.prepareStatement("insert into +" + getNombreTabla()+" ("+""
                                                            + "Nombres,Foto) values(?,?)");
        String INSERT_PICTURE = "INSERT INTO tpersona (Nombres, Foto) VALUES (?,?)";

        FileInputStream fis = null;
        
        try {
          conexion.setAutoCommit(false);
          File file = new File(ruta);
          fis = new FileInputStream(file);
          ps = conexion.prepareStatement(INSERT_PICTURE);
          ps.setString(1, nombres);
          ps.setBinaryStream(2, fis, (int) file.length());
          ps.executeUpdate();
          conexion.commit();
        } finally {
          ps.close();
          fis.close();
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error insertando\n"+e);
        }
    }
    public void EjecutarProcedimiento(String nombre_procedimiento, Object[][] datos) throws SQLException
    {
        String  sentencia= "{call "+nombre_procedimiento+" (";
        if(datos != null){
            for(int i=0; i<datos.length;i++){
                sentencia=sentencia+"?,";
            }
        sentencia= sentencia.substring(0,sentencia.length()-1)+")}";
        }
        else sentencia= sentencia+")}";
        CallableStatement cst = conexion.prepareCall(sentencia);

        for(int i=0; i<datos.length;i++)
        {
            if(EsVarchar((String) datos[i][1]))
            {
                cst.setString(i, (String) datos[i][0]);
            }
            else
            {
                cst.setInt(i, (int) datos[i][0]);
            }
        }
                           
                
        // Ejecuta el procedimiento almacenado
        cst.execute();
    }
}
