/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion.Mantenimientos.Factura;
import capalogica.cFactura;
import CapaLogica.cFacturaDetalle;
import CapaLogica.cPrenda;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Luis Angel
 */
public class FrmMostrarFacturaDetalle extends javax.swing.JPanel {

    public FrmMostrarFacturaDetalle() {
        initComponents();
        model=(DefaultTableModel)tFactura.getModel();
    }
    DefaultTableModel model;
    cFactura ofactura=new cFactura();
    cFacturaDetalle ofacturadetalle =new cFacturaDetalle();
    cPrenda oprenda=new cPrenda();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNro = new javax.swing.JTextField();
        docEntrada = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tFactura = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("NRO SALIDA");

        jLabel4.setText("DOCUMENTO DE ENTRADA: ");

        jLabel5.setText("CLIENTE");

        txtNro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroActionPerformed(evt);
            }
        });

        docEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docEntradaActionPerformed(evt);
            }
        });

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        tFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Descripcion", "Observacion", "PrecioUnitario", "Cantidad", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tFactura);

        jButton1.setText("Cerrar");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel6.setText("TOTAL:");

        jButton2.setText("Entregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(docEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addComponent(txtCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(25, 25, 25))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BUSCAR FACTURA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("BUSCAR FACTURA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(jLabel1)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(220, 220, 220)
                    .addComponent(jLabel1)
                    .addContainerGap(229, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroActionPerformed

    private void docEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docEntradaActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           if(txtCliente.getText()!=""&&txtNro.getText()!=""&&docEntrada.getText()!=""){
                txtTotal.setText("0");
                ofacturadetalle.DocEntrada = ofactura.DocEntrada = docEntrada.getText();
                ofacturadetalle.NroFactura = ofactura.NroFactura = txtNro.getText();
                ofactura.IdCliente = txtCliente.getText();
               try {
                   cargarDatos(ofacturadetalle.recuperarFactura());
               } catch (Exception ex) {
                   Logger.getLogger(FrmMostrarFacturaDetalle.class.getName()).log(Level.SEVERE, null, ex);
               }
                docEntrada.setText(ofactura.DocEntrada);
                txtNro.setText(ofactura.NroFactura);
                gettotal();
           }
           else
               JOptionPane.showMessageDialog(null, "Se sugiere llenar todos los campos solicitados2");
    }//GEN-LAST:event_jButton2ActionPerformed
    public void cargarDatos(ResultSet r) throws Exception{
        if(r.next()){
            Object[]a={r.getObject(0),r.getObject(1),r.getObject(2),r.getObject(3)};
            model.addRow(a);
            while(r.next()){
                Object[]b={r.getObject(0),r.getObject(1),r.getObject(2),r.getObject(3)};
                model.addRow(b);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
        }
            
    }
    private void gettotal(){
        double total = 0.0;
        for (int i = 0; i < model.getRowCount(); i++)
        {
            if (model.getValueAt(i, 2) == "" || model.getValueAt(i, 3) == "")
            {
                model.setValueAt("0",i, 4) ;
                continue;
            }
            double tmp = Double.parseDouble(model.getValueAt(i, 2).toString()) * Double.parseDouble(model.getValueAt(i, 3).toString());
            total += tmp;
            model.setValueAt(tmp,i, 4) ;
        }
        txtTotal.setText(String.valueOf(total));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField docEntrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tFactura;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtNro;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
