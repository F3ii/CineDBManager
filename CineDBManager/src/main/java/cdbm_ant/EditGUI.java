/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cdbm_ant;

import calendar.FechaSesion;
import cinesdbmanager.Context.AppConfig;
import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Pelicula;
import cinesdbmanager.Modelo.Sala;
import cinesdbmanager.Modelo.Sesion;


import javax.swing.*;
import java.awt.Color;
import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

/**
 *
 * @author danie
 */
public class EditGUI extends javax.swing.JFrame {

    String entidad; //screen
    String idCineFK = null; // Clave ajena
    String idSalaFK = null; // Clave ajena
    Interfaz gui; // Mantener la interfaz anterior
    /**
     * Creates new form CreateGUI
     */
    public EditGUI() {
        initComponents();
    }
    
    // Constructor para Cine
    public EditGUI(Interfaz gui, String entidad, String label1, String label2,
            String tf0, String tf1, String tf2) {
        this.gui = gui;
        initComponents();
        lblData1.setText(label1);
        lblData2.setText(label2);
        
        lblDataID.setText(tf0);
        tfData1.setText(tf1);
        tfData2.setText(tf2);
        
        lblData3.setVisible(false);
        tfData3.setVisible(false);
        
        cbVIP.setVisible(false);
        datePick.setVisible(false);
        timePanel.setVisible(false);
        this.entidad = entidad;
        lblGenericMsg.setText(("Actualizar " + entidad).toUpperCase());
        this.getContentPane().setBackground(new Color(255,204,95));
    }
    
    //Constructor para Sala
    public EditGUI(Interfaz gui, String entidad, String label1, String label2, String label3,
            String tf0, String tf1, Boolean tf2, String tf3, String cineFK) {
        this.gui = gui;
        initComponents();
        lblData1.setText(label1);
        lblData2.setText(label2);
        lblData3.setText(label3);
        
        lblDataID.setText(tf0);
        tfData1.setText(tf1);
        //tfData2.setText(tf2);
        cbVIP.setSelected(tf2);
        tfData3.setText(tf3);
        tfData2.setVisible(false);
        cbVIP.setVisible(true);
        datePick.setVisible(false);
        timePanel.setVisible(false);
        idCineFK = cineFK;
        this.entidad=entidad;
        lblGenericMsg.setText(("Actualizar " + entidad).toUpperCase());
        this.getContentPane().setBackground(new Color(255,204,95));
    }
    
    //Constructor para Sesion
    public EditGUI(Interfaz gui, String entidad, String label1, String label2, String label3,
            String tf0, String tf1, Date tf2, Time tf3, String cineFK, String salaFK) {
        this.gui = gui;
        initComponents();
        lblData1.setText(label1);
        lblData2.setText(label2);
        lblData3.setText(label3);
        
        lblDataID.setText(tf0);
        tfData1.setText(tf1);
        //tfData2.setText(tf2);
        datePick.setDate(tf2);
        //tfData3.setText(tf3);
        horaSpinner.setValue(tf3.getHours());
        minutoSpinner.setValue(tf3.getMinutes());
        
        idCineFK = cineFK;
        idSalaFK = salaFK;
        
        cbVIP.setVisible(false);
        datePick.setVisible(true);
        timePanel.setVisible(true);
        tfData2.setVisible(false);
        tfData3.setVisible(false);
        idCineFK = cineFK;
        idSalaFK = salaFK;
        this.entidad=entidad;
        lblGenericMsg.setText(("Añadir " + entidad).toUpperCase());
        this.getContentPane().setBackground(new Color(255,204,95));
    }
    
    //Constructor para Pelicula
    public EditGUI(Interfaz gui, String entidad, String label1, String label2, String label3,
            String tf0, String tf1, String tf2, String tf3) {
        this.gui = gui;
        initComponents();
        lblData1.setText(label1);
        lblData2.setText(label2);
        lblData3.setText(label3);
        
        lblDataID.setText(tf0);
        tfData1.setText(tf1);
        tfData2.setText(tf2);
        tfData3.setText(tf3);
        
        cbVIP.setVisible(false);
        datePick.setVisible(false);
        timePanel.setVisible(false);
        this.entidad=entidad;
        lblGenericMsg.setText(("Añadir " + entidad).toUpperCase());
        this.getContentPane().setBackground(new Color(255,204,95));
    }

    // Guardar la fecha con el jDateChooser
    public FechaSesion getValue(){
        Calendar calendar = datePick.getJCalendar().getCalendar();
        int hora = (Integer) horaSpinner.getValue();
        int minuto = (Integer) minutoSpinner.getValue();
        return new FechaSesion(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.YEAR),hora, minuto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfData1 = new javax.swing.JTextField();
        tfData2 = new javax.swing.JTextField();
        tfData3 = new javax.swing.JTextField();
        lblData1 = new javax.swing.JLabel();
        lblData2 = new javax.swing.JLabel();
        lblData3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        lblGenericMsg = new javax.swing.JLabel();
        lblData0 = new javax.swing.JLabel();
        lblDataID = new javax.swing.JLabel();
        cbVIP = new javax.swing.JCheckBox();
        timePanel = new javax.swing.JPanel();
        lbl_Hora = new javax.swing.JLabel();
        horaSpinner = new com.toedter.components.JSpinField();
        lbl_Minuto = new javax.swing.JLabel();
        minutoSpinner = new com.toedter.components.JSpinField();
        datePick = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfData1ActionPerformed(evt);
            }
        });
        tfData1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfData1KeyTyped(evt);
            }
        });

        tfData2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfData2KeyTyped(evt);
            }
        });

        tfData3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfData3KeyTyped(evt);
            }
        });

        lblData1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData1.setForeground(new java.awt.Color(83, 60, 65));
        lblData1.setText("Nombre");

        lblData2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData2.setForeground(new java.awt.Color(83, 60, 65));
        lblData2.setText("lblData2");

        lblData3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData3.setForeground(new java.awt.Color(83, 60, 65));
        lblData3.setText("lblData3");

        jLabel1.setBackground(new java.awt.Color(253, 184, 75));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 60, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CINE DB MANAGER");

        btnCancel.setBackground(new java.awt.Color(83, 60, 65));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(253, 184, 75));
        btnCancel.setText("CANCELAR");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAccept.setBackground(new java.awt.Color(83, 60, 65));
        btnAccept.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(253, 184, 75));
        btnAccept.setText("ACTUALIZAR");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        lblGenericMsg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGenericMsg.setForeground(new java.awt.Color(83, 60, 65));
        lblGenericMsg.setText("Actualizar elemento");

        lblData0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData0.setForeground(new java.awt.Color(83, 60, 65));
        lblData0.setText("ID");

        lblDataID.setForeground(new java.awt.Color(83, 60, 65));
        lblDataID.setText("ID");

        timePanel.setBackground(new java.awt.Color(255, 204, 95));

        lbl_Hora.setText("HORA");

        horaSpinner.setBackground(new java.awt.Color(255, 204, 95));
        horaSpinner.setMaximum(23);
        horaSpinner.setMinimum(0);

        lbl_Minuto.setText("MINUTO");

        minutoSpinner.setBackground(new java.awt.Color(255, 204, 95));
        minutoSpinner.setMaximum(59);
        minutoSpinner.setMinimum(0);

        javax.swing.GroupLayout timePanelLayout = new javax.swing.GroupLayout(timePanel);
        timePanel.setLayout(timePanelLayout);
        timePanelLayout.setHorizontalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Hora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(horaSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(lbl_Minuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minutoSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        timePanelLayout.setVerticalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timePanelLayout.createSequentialGroup()
                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(horaSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lbl_Hora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minutoSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Minuto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnAccept, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(63, 63, 63)
                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenericMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblData1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfData1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(datePick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfData2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfData3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblData0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDataID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGenericMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData0)
                    .addComponent(lblDataID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblData2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(datePick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbVIP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfData3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblData3))
                    .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Volver a la pantalla principal sin guardar los cambios
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        // Desaparecer la pantalla
        this.dispose();
        gui.setVisible(true);
        System.out.println("Cancelado");
    }//GEN-LAST:event_btnCancelActionPerformed

    // Guardar los cambios en la instancia de la entidad y volver a la pantalla principal
    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        // Llamar a crear con los datos
        switch (entidad) {
            case "cine":
                actualizarCine();
                // Insertar codigo para cine
                System.out.println("Se ha actualizado el cine");
                this.dispose();
                gui.cargarTabla();
                gui.setVisible(true);
                break;
            case "sala":
                // Insertar codigo para sala
                actualizarSala();
                System.out.println("Se ha actualizado la sala");
                this.dispose();
                gui.cargarTabla();
                gui.setVisible(true);
                break;
            case "sesion":
                FechaSesion fecha = new FechaSesion();
                fecha = getValue(); //fecha.getDate() y fecha.getTime() para obtener la fecha
                actualizarSesion(fecha);
                // Insertar codigo para sesion
                System.out.println("Se ha actualizado la sesion");
                this.dispose();
                gui.cargarTabla();
                gui.setVisible(true);
                break;
            case "pelicula":
                actualizarPelicula();
                System.out.println("Se ha actualizado la pelicula");
                this.dispose();
                gui.cargarTabla();
                gui.setVisible(true);
                break;
            default:
                System.err.println("Error al actualizar");
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void tfData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfData1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfData1ActionPerformed

    // Tipado del texto de entrada y límite de carácteres
    private void tfData1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfData1KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if("sala".equals(entidad)){
            if (!Character.isDigit(caracter)) {
                evt.consume();
            }
        }else if("sesion".equals(entidad)){
            if (!Character.isDigit(caracter) && caracter != '.' || (tfData1.getText().length() >= 25) 
                    || (tfData1.getText().contains(".") && caracter == '.')) {
                evt.consume();
            }
        }else if("cine".equals(entidad)){
            if (tfData1.getText().length() >= 25) {
                evt.consume();
            }
        }else if("peliculas".equals(entidad)){
             if (tfData1.getText().length() >= 25) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfData1KeyTyped

    private void tfData2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfData2KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        
        if("cine".equals(entidad)){
            if (tfData2.getText().length() >= 50) {
                evt.consume();
            }
        }else if("peliculas".equals(entidad)){
             if (tfData2.getText().length() >= 25) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfData2KeyTyped

    private void tfData3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfData3KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if("sala".equals(entidad)){
            if (!Character.isDigit(caracter)) {
                evt.consume();
            }
        }else if("pelicula".equals(entidad)){
            if (!Character.isDigit(caracter)) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfData3KeyTyped

    private void actualizarCine(){
        Cine cine=AppConfig.getCineServicio().buscarCine(Integer.parseInt((lblDataID.getText())));
        cine.setNombre(tfData1.getText());
        cine.setDireccion(tfData2.getText());
        AppConfig.getCineServicio().actualizarCine(cine);
    }
    
    private void actualizarSala(){
        Sala sala = AppConfig.getSalaServicio().buscarSalaporIds(Integer.parseInt(idCineFK),
                Integer.parseInt(lblDataID.getText()));
        sala.setVip(cbVIP.isSelected());
        sala.setNºbutacas(Integer.valueOf(tfData3.getText()));
        sala.setNºsala(Integer.valueOf(tfData1.getText()));
        AppConfig.getSalaServicio().actualizarSala(sala);
    }
    
    private void actualizarSesion(FechaSesion fecha){
        Sesion sesion=AppConfig.getSesionServicio().buscarSesionPorId(Integer.parseInt(lblDataID.getText()));
        sesion.setPrecio(Double.parseDouble(tfData1.getText()));
        sesion.setFecha(fecha.getDate());
        sesion.setHora(fecha.getTime());
        AppConfig.getSesionServicio().actualizarSesion(sesion);
    }
    private void actualizarPelicula(){
        Pelicula pelicula=AppConfig.getPeliculaServicio().buscarPelicula(Integer.parseInt(lblDataID.getText()));
        pelicula.setNombre(tfData1.getText());
        pelicula.setPgEdad(Integer.parseInt(tfData3.getText()));
        pelicula.setDirector(tfData2.getText());
        AppConfig.getPeliculaServicio().actualizarPelicula(pelicula);
    }
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
            java.util.logging.Logger.getLogger(EditGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JCheckBox cbVIP;
    private com.toedter.calendar.JDateChooser datePick;
    private com.toedter.components.JSpinField horaSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData0;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblData2;
    private javax.swing.JLabel lblData3;
    private javax.swing.JLabel lblDataID;
    private javax.swing.JLabel lblGenericMsg;
    private javax.swing.JLabel lbl_Hora;
    private javax.swing.JLabel lbl_Minuto;
    private com.toedter.components.JSpinField minutoSpinner;
    private javax.swing.JTextField tfData1;
    private javax.swing.JTextField tfData2;
    private javax.swing.JTextField tfData3;
    private javax.swing.JPanel timePanel;
    // End of variables declaration//GEN-END:variables
}
