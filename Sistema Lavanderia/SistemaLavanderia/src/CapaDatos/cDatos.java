//package capaDatos;
//import java.io.Serializable;
//import java.sql.*;
//import javax.swing.JOptionPane;
//
//public abstract class cDatos
//{
//    //----------------------------------------------------
//    //------------atributos
//    //-------------------------------------------------
//    //----nombre del servidor
//    protected String aServidor = "";
//    //----nombre de la base de datos
//    protected String aBase = "";
//    //---cadena de conexion completa
//    protected String aCadenaConexion = "";
//    protected String nomClase;
//    protected String servidor;
//    protected String baseDatos;
//    protected String usuario ;
//    protected String password ;
//    protected Connection conexion;
//    protected boolean conectado_bd;
//    protected boolean existe_bd;
//    //---interfaz,  que permite el  objeto de conexion desde la clase base 
//    protected Connection aConexion;
//
//    //----------------------------
//    //---metodos
//    //-------------------------------------------
//
//    //-----------------------constructores-------------------
//    public cDatos()
//    {
//
//    }
//
//    //--------------------propiedades------------------
//    public String getServidor()
//    {
//        return aServidor;
//    }
//    public void setServidor(String Servidor)
//    {
//        this.aServidor= Servidor;
//    }
//    public String getbaseDatos()
//    {
//        return baseDatos;
//    }
//    public void setbaseDatos(String baseDatos)
//    {
//        this.baseDatos= baseDatos;
//    }
//    public String getusuario()
//    {
//        return usuario;
//    }
//    public void setusuario(String usuario)
//    {
//        this.usuario= usuario;
//    }
//    public String getPassword()
//    {
//        return password;
//    }
//    public void setPassword(String Password)
//    {
//        this.password= Password;
//    }
//    public String getBase()
//    {
//        return aBase; 
//    }
//    public void setBase(String Base)
//    {
//        aBase = Base; 
//    }
//    public abstract String CadenaConexion();
//
//
//    //---crea y obtiene un objeto para conectarse a la base de datos.
//    protected Connection conexion() throws SQLException
//    {
//        if (null == aConexion)
//        {
//            aConexion = CrearConexion(this.CadenaConexion());
//        }
//        if (aConexion.isClosed())
//            conectado_bd= ConectarSQL();
//        return aConexion;
//    }
//        public boolean ConectarSQL()
//    {
//        try {
//            existe_bd= ExisteBD();
//            if(existe_bd)
//            {
//                conectado_bd=true;
//                return true;
//            }
//            else
//            {
//                new Exception("No se encuentra la base de datos.");
//                return false;     
//            }
//
//        } 
//        catch (Exception e2) {
//            JOptionPane.showMessageDialog(null,e2);
//            return false;
//        }
//        }
//        private boolean ExisteBD() {
//        try {
//
//            Class.forName(nomClase);
//            String url = "jdbc:mysql://"+ getServidor() + "/"+getbaseDatos();
//
//            conexion = DriverManager.getConnection(url, getusuario(), getPassword());
//            java.sql.Statement consultaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//            consultaSQL.executeQuery("SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA \n"+
//                                    "WHERE SCHEMA_NAME = '"+baseDatos+"';");
//            ResultSet rs = consultaSQL.getResultSet();
//            while (rs.next()) {
//                if(rs.getString(1).equals(baseDatos))
//                {
//                    //conexion.close();// aqui
//                    return true;
//                }
//            }
//            return false;
//        } 
//        catch (Exception e1) {
//            JOptionPane.showMessageDialog(null,e1);
//            return false;
//        }
//    }
//
//    /// <summary>
//    /// Obtiene un DataSet a partir de una consulta.
//    /// </summary>
//    /// <param name="Consulta">Cadena de consulta</param>
//    /// <returns>DataSet</returns>
//    public ResultSet TraerDataSet_Consulta(String Consulta)
//    {
//        ResultSet mDataSet = null;
//        this.CrearDataAdapter_Consulta(Consulta).Fill(mDataSet);
//        return mDataSet;
//    }
//
//
//    /// <summary>
//    /// Obtiene un DataSet a partir de un procedimiento almacenado.
//    /// </summary>
//    /// <param name="ProcedimientoAlmacenado">Procedimiento Almacenado</param>
//    /// <returns>DataSet</returns>
//    public ResultSetMetaData TraerDataSet(String ProcedimientoAlmacenado)
//    {
//        ResultSetMetaData mDataSet = null;
//        this.CrearDataAdapter(ProcedimientoAlmacenado).Fill(mDataSet);
//        return mDataSet;
//    }
//
//    /// <summary>
//    /// Obtiene un Dataset a partir de un procedimiento almacenado y sus parametros.
//    /// </summary>
//    /// <param name="ProcedimientoAlmacenado">Procedimiento Almacenado</param>
//    /// <param name="Parametros">Parametros</param>
//    /// <returns>DataSet</returns>
//    public ResultSetMetaData TraerDataSet(String ProcedimientoAlmacenado, Object[]... Parametros)
//    {
//        ResultSetMetaData mDataSet = null;
//        this.CrearDataAdapter(ProcedimientoAlmacenado, Parametros).Fill(mDataSet);
//        return mDataSet;
//    }
//
//    /// <summary>
//    /// Obiene un DataTable a partir de una consulta.
//    /// </summary>
//    /// <param name="Consulta">Consulta</param>
//    /// <returns></returns>
//    public ResultSet TraerDataTable_Consulta(String Consulta)
//    {
//        return TraerDataSet_Consulta(Consulta).getObject(0);
//    }
//
//    /// <summary>
//    /// Obiene un DataTable a partir de un procedimiento almacenado.
//    /// </summary>
//    /// <param name="ProcedimientoAlmacenado">Procedimiento Almacenado</param>
//    /// <returns></returns>
//    public ResultSet TraerDataTable(String ProcedimientoAlmacenado)
//    {   
//        return TraerDataSet(ProcedimientoAlmacenado).Tables[0].Copy();
//    }
//
//    /// <summary>
//    /// Obtiene un DataTable a partir de un procedimiento almacenado y sus parametros.
//    /// </summary>
//    /// <param name="ProcedimientoAlmacenado">Procedimiento Almacenado</param>
//    /// <param name="Parametros">Parametros</param>
//    /// <returns>DataTable</returns>
//    /// 
//    public ResultSet TraerDataTable(String ProcedimientoAlmacenado, Object[]... Parametros)
//    {
//        return TraerDataSet(ProcedimientoAlmacenado, Parametros).Tables[0].Copy();
//    }
//
//    /// <summary>
//    /// Obtiene un DataRow a partir de un procedimiento almacenado
//    /// </summary>
//    /// <param name="ProcedimientoAlmacenado">Procedimiento Almacenado</param>
//    /// <returns>DataRow</returns>
//    public Object[] TraerDataRow(String ProcedimientoAlmacenado)
//    {
//        return TraerDataSet(ProcedimientoAlmacenado).Tables[0].Rows[0];
//    }
//
//    /// <summary>
//    /// Obtiene un DataRow a partir de un procedimiento almacenado y sus parametros
//    /// </summary>
//    /// <param name="ProcedimientoAlmacenado">Procedimiento Almacenado</param>
//    /// <param name="Parametros">Parametros</param>
//    /// <returns>DataRow</returns>
//    public Object[] TraerDataRow(String ProcedimientoAlmacenado, Object[] Parametros...)
//    {
//        return TraerDataSet(ProcedimientoAlmacenado,Parametros).Tables[0].Rows[0];
//    }
//
//    /// <summary>
//    /// Obtiene un valor a partir de un procedimiento almacenado.
//    /// </summary>
//    /// <param name="ProcedimientoAlmacenado">Procedimiento Almacenado</param>
//    /// <returns>Valor Escalar de tipo String</returns>
//    public String TraerValor(String ProcedimientoAlmacenado)
//    {
//        return TraerDataSet(ProcedimientoAlmacenado).Tables[0].Rows[0][0].ToString();
//    }
//
//    /// <summary>
//    /// obtiene un valor a partir de un procedimiento almacenado y sus parametros
//    /// </summary>
//    /// <param name="ProcedimientoAlmacenado">Procedimiento Almacenado</param>
//    /// <param name="Parametros">Parametros</param>
//    /// <returns>valor Escalar de tipo String</returns>
//    public System.String TraerValor(String ProcedimientoAlmacenado, params System.Object[] Parametros)
//    {
//        return TraerDataSet(ProcedimientoAlmacenado,Parametros).Tables[0].Rows[0][0].ToString();
//    }
//
//
//    //-----------------------metodos abstractos------------------------
//    protected abstract System.Data.IDbConnection CrearConexion(string Cadena);
//    protected abstract System.Data.IDbCommand Comando(string ProcedimientoAlmacenado);
//    protected abstract System.Data.IDataAdapter CrearDataAdapter(string ProcedimientoAlmacenado, params System.Object[] Parametros);
//    protected abstract void CargarParametros(System.Data.IDbCommand Comando, System.Object[] Parametros);
//
//    protected abstract System.Data.IDbCommand Comando_Consulta(string Consulta);
//    protected abstract System.Data.IDataAdapter CrearDataAdapter_Consulta(string Consulta, params System.Object[] Parametros);
//
//    //-----------------------mas metodos 1-----------------------
//    /// <summary>
//    /// Ejecuta un procedimiento almacenado en la base de datos.
//    /// </summary>
//    /// <param name="ProcedimientoAlmacenado">Procedimiento Almacenado</param>
//    /// <returns>Nro de instrucciones realizadas</returns>
//    public int Ejecutar(string ProcedimientoAlmacenado)
//    {
//        return Comando(ProcedimientoAlmacenado).ExecuteNonQuery();
//    }
//
//    /// <summary>
//    /// Ejecuta un procedimiento almacenado en la base de datos,utilizando los parametros.
//    /// </summary>
//    /// <param name="ProcedimientoAlmacenado">Procedimiento Almacenado</param>
//    /// <param name="Parametros">Parametros</param>
//    /// <returns>Nro de instrucciones realizadas</returns>
//    public int Ejecutar(string ProcedimientoAlmacenado, params System.Object[] Parametros)
//    {
//        System.Data.IDbCommand Com = Comando(ProcedimientoAlmacenado);
//        CargarParametros(Com, Parametros);
//        int Resp = Com.ExecuteNonQuery();
//        for (int i = 0; i < Com.Parameters.Count; i++)
//        {
//            System.Data.IDbDataParameter Par =
//                (System.Data.IDbDataParameter)Com.Parameters[i];
//            if (Par.Direction == System.Data.ParameterDirection.InputOutput ||
//        Par.Direction == System.Data.ParameterDirection.Output)
//                Parametros.SetValue(Par.Value, i);
//        }
//        return Resp;
//    }
//
//    //------------------------- mas atributos----------------
//
//    protected System.Data.IDbTransaction mTransaccion;
//    protected bool EnTranssaccion = false;
//
//    //--------------------mas metodos 2----------------------------
//
//    /// <summary>
//    /// Comienza un transaccion en la base en uso.
//    /// </summary>
//    public void IniciarTransaccion()
//    {
//        mTransaccion = this.conexion.BeginTransaction();
//        EnTranssaccion = true;
//    }
//    /// <summary>
//    /// Confirma la transaccion activa.
//    /// </summary>
//    public void TerminarTransaccion()
//    {
//        try
//        {
//            mTransaccion.Commit();
//        }
//        catch (System.Exception Ex)
//        {
//            throw Ex;
//        }
//        finally
//        {
//            mTransaccion = null;
//            EnTranssaccion = false;
//        }
//    }
//
//    /// <summary>
//    /// Aborta la transaccion activa.
//    /// </summary>
//    public void AbortarTransaccion()
//    {
//        try
//        {
//            mTransaccion.Rollback();
//        }
//        catch (System.Exception Ex)
//        {
//            throw Ex;
//        }
//        finally
//        {
//            mTransaccion = null;
//            EnTranssaccion = false;
//        }
//    }
//}
