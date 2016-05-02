package vista;

import AccesoDatos.DAOClienteImplementado;
import negocio.Comunas;
import negocio.Provincias;
import negocio.Persona;
import negocio.Regiones;
import java.util.EnumSet;
import negocio.Cliente;

/**
 *
 * @author Sebastian Pavez
 */
public class VentanaRegistroCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistroCliente
     */
    public VentanaRegistroCliente() {
        initComponents();        
        cmbRegion.setModel(new javax.swing.DefaultComboBoxModel(Regiones.values()));
        cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(Provincias.values()));
        cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(Comunas.values()));       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpGenero = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombresCliente = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtRutCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnRegistrarInformacion = new javax.swing.JButton();
        btnCancelarRegistro = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        cmbRegion = new javax.swing.JComboBox();
        cmbProvincia = new javax.swing.JComboBox();
        cmbComuna = new javax.swing.JComboBox();
        rdbMasculino = new javax.swing.JRadioButton();
        rdbFemenino = new javax.swing.JRadioButton();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtNumeroTelefonico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombres:");

        jLabel2.setText("Apellido Paterno:");

        jLabel3.setText("Apellido Materno:");

        jLabel4.setText("Rut:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Región:");

        jLabel7.setText("Provincia:");

        jLabel8.setText("Comuna:");

        jLabel9.setText("Género:");

        jLabel10.setText("Fecha de Nacimiento:");

        jLabel11.setText("Correo Electrónico:");

        jLabel12.setText("Número telefónico:");

        btnRegistrarInformacion.setText("Registrar");
        btnRegistrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarInformacionActionPerformed(evt);
            }
        });

        btnCancelarRegistro.setText("Cancelar");
        btnCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroActionPerformed(evt);
            }
        });

        cmbRegion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRegionActionPerformed(evt);
            }
        });

        cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGrpGenero.add(rdbMasculino);
        rdbMasculino.setText("Masculino");

        btnGrpGenero.add(rdbFemenino);
        rdbFemenino.setText("Femenino");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombresCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellidoPaterno)
                    .addComponent(txtApellidoMaterno)
                    .addComponent(txtRutCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDireccion)
                    .addComponent(cmbRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbComuna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFechaNacimiento)
                    .addComponent(txtCorreoElectronico)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbFemenino))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrarInformacion)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarRegistro))
                            .addComponent(txtNumeroTelefonico))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rdbMasculino)
                    .addComponent(rdbFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarInformacion)
                    .addComponent(btnCancelarRegistro))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarInformacionActionPerformed
        try{
            Cliente personaRegistrada = new Cliente();
            personaRegistrada.setApellidoMaterno(this.txtApellidoMaterno.getText());
            personaRegistrada.setApellidoPaterno(this.txtApellidoPaterno.getText());
            personaRegistrada.setComuna(this.cmbComuna.getSelectedItem().toString());
            personaRegistrada.setCorreoElectronico(this.txtCorreoElectronico.getText());
            personaRegistrada.setDireccion(this.txtDireccion.getText());
            personaRegistrada.setFechaNacimiento(this.txtFechaNacimiento.getText());
            if(this.rdbFemenino.isSelected())
                personaRegistrada.setGenero("femenino");
            else if (this.rdbMasculino.isSelected()) 
                personaRegistrada.setGenero("masculino");
            else
                personaRegistrada.setGenero(null);
            personaRegistrada.setNombres(this.txtNombresCliente.getText());
            personaRegistrada.setNumeroTelefono(this.txtNumeroTelefonico.getText());
            personaRegistrada.setProvincia(this.cmbProvincia.getSelectedItem().toString());
            personaRegistrada.setRegion(this.cmbProvincia.getSelectedItem().toString());
            personaRegistrada.setRut(this.txtRutCliente.getText());
            DAOClienteImplementado maquina = new DAOClienteImplementado();
            if (maquina.agregar(personaRegistrada))
                javax.swing.JOptionPane.showMessageDialog(this, "Cliente agregado con éxito");
            else
                javax.swing.JOptionPane.showMessageDialog(this, "falla en el registro del cliente");
            System.out.println(personaRegistrada.toString());
            
        }
        catch(Exception e)
        {
            System.out.println("Error en registro: "+e.getMessage());            
        }        
    }//GEN-LAST:event_btnRegistrarInformacionActionPerformed

    private void btnCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroActionPerformed
        DialogoEstaRegistrado dialogo = new DialogoEstaRegistrado();
        dialogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarRegistroActionPerformed

    private void cmbRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRegionActionPerformed
        int opcionRegion = Regiones.valueOf(this.cmbRegion.getSelectedItem().toString()).ordinal();        
        EnumSet<Provincias> set;
        EnumSet<Comunas> setComunas;
        switch(opcionRegion){
            case 0:                
                set = EnumSet.range(Provincias.Santiago, Provincias.Talagante);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Santiago, Comunas.Peñaflor);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 1:
                set = EnumSet.range(Provincias.Arica, Provincias.Parinacota);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Arica, Comunas.GeneralLagos);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 2:
                set = EnumSet.range(Provincias.Iquique, Provincias.Tamarugal);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Iquique, Comunas.Pica);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 3:
                set = EnumSet.range(Provincias.Antofagasta, Provincias.Tocopilla);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Antofagasta, Comunas.MariaElena);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 4:
                set = EnumSet.range(Provincias.Copiapo, Provincias.Huasco);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Copiapo, Comunas.Huasco);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 5:
                set = EnumSet.range(Provincias.Elqui, Provincias.Limari);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.LaSerena, Comunas.RioHurtado);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 6:
                set = EnumSet.range(Provincias.Valparaiso, Provincias.MargaMarga);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Valparaiso, Comunas.Olmué);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 7: 
                set = EnumSet.range(Provincias.Cachapoal, Provincias.Colchagua);                                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Rancagua, Comunas.SantaCruz);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;                    
            case 8:
                set = EnumSet.range(Provincias.Talca, Provincias.Linares);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Talca, Comunas.YerbasBuenas);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 9:
                set = EnumSet.range(Provincias.Concepcion, Provincias.Ñuble);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Concepcion, Comunas.Yungay);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 10:
                set = EnumSet.range(Provincias.Cautin, Provincias.Malleco);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Temuco, Comunas.Victoria);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 11:
                set = EnumSet.range(Provincias.Valdivia, Provincias.Ranco);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Valdivia, Comunas.RioBueno);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 12:
                set = EnumSet.range(Provincias.Llanquihue, Provincias.Palena);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.PuertoMontt, Comunas.Palena);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 13:
                set = EnumSet.range(Provincias.Coihaique, Provincias.GeneralCarrera);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.Coihaique, Comunas.RíoIbanez);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;
            case 14:
                set = EnumSet.range(Provincias.Magallanes, Provincias.UltimaEsperanza);                 
                cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(set.toArray()));
                setComunas = EnumSet.range(Comunas.PuntaArenas, Comunas.TorresDelPaine);                
                cmbComuna.setModel(new javax.swing.DefaultComboBoxModel(setComunas.toArray()));                      
                break;            
        }
    }//GEN-LAST:event_cmbRegionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarRegistro;
    private javax.swing.ButtonGroup btnGrpGenero;
    private javax.swing.JButton btnRegistrarInformacion;
    private javax.swing.JComboBox cmbComuna;
    private javax.swing.JComboBox cmbProvincia;
    private javax.swing.JComboBox cmbRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rdbFemenino;
    private javax.swing.JRadioButton rdbMasculino;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombresCliente;
    private javax.swing.JTextField txtNumeroTelefonico;
    private javax.swing.JTextField txtRutCliente;
    // End of variables declaration//GEN-END:variables
}
