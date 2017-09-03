/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

public class Main {
  
    
    public static void main(String[] args) {
        // TODO code application logic here
      
     
            FrmLogin OfmLogin = new FrmLogin();
//            if (OfmLogin.ShowDialog() == DialogResult.OK)
//                Application.Run(new frmPresentacion(OfmLogin.Cargo,OfmLogin.Usuario));
            OfmLogin.setVisible(true);
            
            //Application.Run(new frmPresentacion("Administrador", "carla"));
            //Application.Run(new CapaPresentacion.Mantenimientos.Compra.frmBuscarCompra());
        }
    
}
