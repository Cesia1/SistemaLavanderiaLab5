/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDatos.CEntidadMySQL;
import java.util.ArrayList;

/**
 *
 * @author joha
 */
public class cSeguridad {
    CEntidadMySQL oDatos;
    public cSeguridad(){
        oDatos= new CEntidadMySQL("dblavanderia", "localhost", "root", "", "TProducto");
    }
        public void SacarBackup(String Direccion, String Nombres)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Direccion);
            datosEnvio.add(Nombres);
            oDatos.llamarProcedimiento("spuSacarBackup",datosEnvio);
            }catch(Exception e){
                System.err.println("error al listar: "+e);
            }
        }    
}
