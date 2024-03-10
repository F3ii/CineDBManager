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
import java.awt.Color;
import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

/**
 *
 * @author danie
 */
public class CreateGUI extends javax.swing.JFrame {

    String entidad; //screen
    String idCineFK = null;
    String idSalaFK = null;
    Interfaz gui; // Mantener la interfaz anterior
    /**
     * Creates new form CreateGUI
     */
    public CreateGUI() {
        initComponents();
    }
    
    //Constructor para Cines
    public CreateGUI(Interfaz gui, String entidad, String label1, String label2) {
        this.gui = gui;
        initComponents();
        lblData1.setText(label1);
        lblData2.setText(label2);
        lblData3.setVisible(false);
        tfData3.setVisible(false);
        cbVIP.setVisible(false);
        datePick.setVisible(false);
        timePanel.setVisible(false);
        this.entidad = entidad;
        lblGenericMsg.setText(("Añadir " + entidad).toUpperCase());
        this.getContentPane().setBackground(new Color(255,204,95));
    }
    
    //Constructor para Salas
    public CreateGUI(Interfaz gui, String entidad,String label1, String label2, String label3, String cineFK) {
        this.gui = gui;
        initComponents();
        lblData1.setText(label1);
        lblData2.setText(label2);
        lblData3.setText(label3);
        tfData2.setVisible(false);
        cbVIP.setVisible(true);
        datePick.setVisible(false);
        timePanel.setVisible(false);
        idCineFK = cineFK;
        this.entidad=entidad;
        lblGenericMsg.setText(("Añadir " + entidad).toUpperCase());
        this.getContentPane().setBackground(new Color(255,204,95));
    }
    
    //Constructor para Sesiones
    public CreateGUI(Interfaz gui, String entidad,String label1, String label2, String label3, String cineFK, String salaFK) {
        this.gui = gui;
        initComponents();
        lblData1.setText(label1);
        lblData2.setText(label2);
        lblData3.setText(label3);
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
    
    //Constructor para peliculas
    public CreateGUI(Interfaz gui, String entidad,String label1, String label2, String label3) {
        this.gui = gui;
        initComponents();
        lblData1.setText(label1);
        lblData2.setText(label2);
        lblData3.setText(label3);
        cbVIP.setVisible(false);
        datePick.setVisible(false);
        timePanel.setVisible(false);
        this.entidad=entidad;
        lblGenericMsg.setText(("Añadir " + entidad).toUpperCase());
        this.getContentPane().setBackground(new Color(255,204,95));
    }
    
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

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
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
        cbVIP = new javax.swing.JCheckBox();
        datePick = new com.toedter.calendar.JDateChooser();
        timePanel = new javax.swing.JPanel();
        lbl_Hora = new javax.swing.JLabel();
        horaSpinner = new com.toedter.components.JSpinField();
        lbl_Minuto = new javax.swing.JLabel();
        minutoSpinner = new com.toedter.components.JSpinField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblData1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData1.setForeground(new java.awt.Color(83, 60, 65));
        lblData1.setText("Nombre");

        lblData2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData2.setForeground(new java.awt.Color(83, 60, 65));
        lblData2.setText("lblData2");

        lblData3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData3.setForeground(new java.awt.Color(83, 60, 65));
        lblData3.setText("lblData3");

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
        btnAccept.setText("AÑADIR");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        lblGenericMsg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGenericMsg.setForeground(new java.awt.Color(83, 60, 65));
        lblGenericMsg.setText("Añadir elemento");

        lbl_Hora.setText("HORA");

        horaSpinner.setMaximum(23);
        horaSpinner.setMinimum(0);

        lbl_Minuto.setText("MINUTO");

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
                .addComponent(horaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lbl_Minuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minutoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        timePanelLayout.setVerticalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timePanelLayout.createSequentialGroup()
                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timePanelLayout.createSequentialGroup()
                        .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Minuto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minutoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbl_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGenericMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblData1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfData1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfData3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(datePick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbVIP, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfData2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGenericMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblData2)
                        .addComponent(cbVIP))
                    .addComponent(datePick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfData3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblData3))
                    .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        // Desaparecer la pantalla
        this.dispose();
        gui.setVisible(true);
        System.out.println("Cancelado");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        // Llamar a crear con los datos
        switch (entidad) {
            case "cine":
                Cine cine=new Cine(tfData2.getText(),tfData1.getText());
                AppConfig.getCineServicio().insertarCine(cine);
                System.out.println("Nuevo cine insertado");
                this.dispose();
                gui.cargarTabla();
                gui.setVisible(true);
                break;
            case "sala":
                Sala sala=new Sala(Integer.valueOf(tfData3.getText()),
                        Integer.valueOf(tfData1.getText()),cbVIP.isSelected(),Integer.parseInt(idCineFK));
                AppConfig.getSalaServicio().insertarSala(sala);
                System.out.println("Nueva sala insertada");
                this.dispose();
                gui.cargarTabla();
                gui.setVisible(true);
                break;
            case "sesion":
                System.out.println(tfData2.getText());
                System.out.println(tfData1.getText());
                System.out.println(tfData3.getText());

                FechaSesion fecha = new FechaSesion();
                fecha = getValue();                
                Sesion sesion = new Sesion(fecha.getDate(), fecha.getTime(),Double.parseDouble(tfData1.getText()));

                AppConfig.getSesionServicio().insertSesion(sesion);
                System.out.println("Nueva sesion insertada");
                this.dispose();
                gui.cargarTabla();
                gui.setVisible(true);
                break;
            case "pelicula":
                Pelicula pelicula=new Pelicula(tfData1.getText(),tfData2.getText(),Integer.parseInt(tfData3.getText()));
                AppConfig.getPeliculaServicio().insertarPelicula(pelicula);
                System.out.println("Nueva pelicula insertada");
                this.dispose();
                gui.cargarTabla();
                gui.setVisible(true);
                break;
            default:
                System.err.println("Error al insertar");
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

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
            java.util.logging.Logger.getLogger(CreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JCheckBox cbVIP;
    private com.toedter.calendar.JDateChooser datePick;
    private com.toedter.components.JSpinField horaSpinner;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblData2;
    private javax.swing.JLabel lblData3;
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
