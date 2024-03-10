/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cdbm_ant;

import cinesdbmanager.Context.AppConfig;
import cinesdbmanager.Modelo.Cine;
import cinesdbmanager.Modelo.Pelicula;
import cinesdbmanager.Modelo.Sala;
import cinesdbmanager.Modelo.Sesion;
import java.awt.Color;
import java.sql.Date;
import java.sql.Time;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.table.TableColumn;

/**
 *
 * @author danie
 */
public class Interfaz extends javax.swing.JFrame {
    private DefaultTableModel tableModel = new DefaultTableModel();
    final String separator = " > Sala: ";
    String screen = "cine"; //Valores permitidos ("cine", "sala", "sesion", "pelicula")
    String cineSel = null;
    String cineIdSel = null;
    String salaSel = null;
    String salaIdSel = null;
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        btnCines.doClick();
        this.getContentPane().setBackground(new Color(255,204,95));
        //cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSalas = new javax.swing.JButton();
        btnCines = new javax.swing.JButton();
        btnPeliculas = new javax.swing.JButton();
        btnSesiones = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblCineSel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 60, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CINE DB MANAGER");

        btnSalas.setBackground(new java.awt.Color(83, 60, 65));
        btnSalas.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnSalas.setForeground(new java.awt.Color(253, 184, 75));
        btnSalas.setText("SALAS");
        btnSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalasActionPerformed(evt);
            }
        });

        btnCines.setBackground(new java.awt.Color(83, 60, 65));
        btnCines.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCines.setForeground(new java.awt.Color(253, 184, 75));
        btnCines.setText("CINES");
        btnCines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCinesActionPerformed(evt);
            }
        });

        btnPeliculas.setBackground(new java.awt.Color(83, 60, 65));
        btnPeliculas.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnPeliculas.setForeground(new java.awt.Color(253, 184, 75));
        btnPeliculas.setText("PELICULAS");
        btnPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeliculasActionPerformed(evt);
            }
        });

        btnSesiones.setBackground(new java.awt.Color(83, 60, 65));
        btnSesiones.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnSesiones.setForeground(new java.awt.Color(253, 184, 75));
        btnSesiones.setText("SESIONES");
        btnSesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionesActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(83, 60, 65));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(253, 184, 75));
        btnUpdate.setText("EDITAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(83, 60, 65));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(253, 184, 75));
        btnCreate.setText("AÑADIR");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(83, 60, 65));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(253, 184, 75));
        btnDelete.setText("BORRAR");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblCineSel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCineSel.setForeground(new java.awt.Color(83, 60, 65));
        lblCineSel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCineSel.setText("CINES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCines, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(lblCineSel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCineSel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCines, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalasActionPerformed
        // TODO add your handling code here:
        try {
            if (screen == "cine") {
                cineIdSel = Integer.toString((Integer) tableModel.getValueAt(jTable1.getSelectedRow(), 0));
                cineSel = tableModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
            }
            salaIdSel = null;
            salaSel = null;
            btnSesiones.setEnabled(true);
            screen = "sala";
            //cineSel = Integer.toString((Integer) tableModel.getValueAt(jTable1.getSelectedRow(),1));
            cargarTabla();
            lblCineSel.setText(cineSel);
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un ítem en la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnSalasActionPerformed

    private void btnCinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCinesActionPerformed
        // TODO add your handling code here:
        cineSel = ("Todos los cines");
        cineIdSel = null;
        salaIdSel = null;
        salaSel = null;
        lblCineSel.setText(cineSel);
        screen = "cine";
        btnSesiones.setEnabled(false);
        btnSalas.setEnabled(true);
        cargarTabla();

    }//GEN-LAST:event_btnCinesActionPerformed

    private void btnPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculasActionPerformed
        // TODO add your handling code here:
        screen = "pelicula";
        btnSesiones.setEnabled(false);
        btnSalas.setEnabled(false);
        cargarTabla();
    }//GEN-LAST:event_btnPeliculasActionPerformed

    private void btnSesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionesActionPerformed
        // TODO add your handling code here:
        try {
            salaIdSel = Integer.toString((Integer) tableModel.getValueAt(jTable1.getSelectedRow(), 0));
            salaSel = tableModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
            screen = "sesion";
            cargarTabla();
            lblCineSel.setText(cineSel + separator + salaSel);
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un ítem en la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSesionesActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Hay que probar, no se si esto funciona bien
        this.setVisible(false);
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        String thisItemID = Integer.toString((Integer) tableModel.getValueAt(jTable1.getSelectedRow(),0));
        switch(screen){
            case "cine":{
                String thisItemNombre = (String) tableModel.getValueAt(jTable1.getSelectedRow(),1);
                String thisItemDireccion = (String) tableModel.getValueAt(jTable1.getSelectedRow(),2);
                EditGUI egui = new EditGUI(this, screen,"Nombre: ", "Direccion: ", thisItemID,
                        thisItemNombre, thisItemDireccion);
                egui.setVisible(true);
                break;
            }
            case "sala":{
                String thisItemNumSala = tableModel.getValueAt(jTable1.getSelectedRow(),1).toString();
                Boolean thisItemVIP = (Boolean) tableModel.getValueAt(jTable1.getSelectedRow(),2);
                String thisItemButacas = tableModel.getValueAt(jTable1.getSelectedRow(),3).toString();
                EditGUI egui = new EditGUI(this, screen,"Numero de Sala: ", "VIP: ", "Butacas: ", thisItemID,
                        thisItemNumSala ,thisItemVIP, thisItemButacas, cineIdSel);
                egui.setVisible(true);
                break;
            }
            case "sesion":{
                String thisItemPrecio = Double.toString((Double) tableModel.getValueAt(jTable1.getSelectedRow(),1));
                Date thisItemDate = (Date) tableModel.getValueAt(jTable1.getSelectedRow(),2);
                Time thisItemTime = (Time) tableModel.getValueAt(jTable1.getSelectedRow(),3);
                EditGUI egui = new EditGUI(this, screen,"Precio de Entrada: ", "Fecha: " ,"Hora: ",
                        thisItemID, thisItemPrecio, thisItemDate, thisItemTime, cineIdSel, salaIdSel);
                egui.setVisible(true);
                break;
            }
            case "pelicula":{
                String thisItemNombre = (String) tableModel.getValueAt(jTable1.getSelectedRow(),1);
                String thisItemDirector = (String) tableModel.getValueAt(jTable1.getSelectedRow(),2);
                String thisItemEdadPG = Integer.toString((Integer) tableModel.getValueAt(jTable1.getSelectedRow(),3));
                EditGUI egui = new EditGUI(this, screen,"Nombre: ", "Director", "Edad PG: ", 
                        thisItemID, thisItemNombre, thisItemDirector, thisItemEdadPG);
                egui.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        switch(screen){
            case "cine":{
                CreateGUI cgui = new CreateGUI(this, screen,"Nombre: ", "Direccion: ");
                cgui.setVisible(true);
                break;
            }
            case "sala":{
                CreateGUI cgui = new CreateGUI(this, screen,"NºSala","VIP: ", "Butacas: ", cineIdSel);
                cgui.setVisible(true);
                break;
            }
            case "sesion":{
                CreateGUI cgui = new CreateGUI(this, screen,"Precio de Entrada: ",
                        "Fecha","Hora", cineIdSel, salaIdSel);
                cgui.setVisible(true);
                break;
            }
            case "pelicula":{
                CreateGUI cgui = new CreateGUI(this, screen,"Nombre: ", "Director", "Edad PG: ");
                cgui.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        String thisItemID = Integer.toString((Integer) tableModel.getValueAt(jTable1.getSelectedRow(),0));

        switch (screen) {
            case "cine":
                eliminarCineDialog(thisItemID);
                break;
            case "sala":
                eliminarSalaDialog(thisItemID);
                break;
            case "sesion":
                AppConfig.getSesionServicio().eliminarSesionPorID(Integer.parseInt(thisItemID));
                break;
            case "pelicula":
                AppConfig.getPeliculaServicio().eliminarPeliculaPorID(Integer.parseInt(thisItemID));
                break;
            default:
                System.out.println("Error");
        }
        cargarTabla();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
                   

    // TABLA
    
    protected void cargarTabla() {
        String sql = "SELECT * FROM ";
        sql = sql.concat(screen);
        tableModel = new DefaultTableModel();
        // Asignar el modelo de tabla a la JTable
        //jTable1.setModel(tableModel);
        tableModel.addColumn("ID");
        /*TableColumn columnaID = jTable1.getColumnModel().getColumn(0);
        columnaID.setPreferredWidth(10);*/  // Ancho preferido para la columna ID
        switch(screen){
            case "cine":{
                tableModel.addColumn("Nombre");
                tableModel.addColumn("Direccion");
                verCines();
                break;
            }
            case "sala":{
                tableModel.addColumn("NºSala");
                tableModel.addColumn("VIP");
                tableModel.addColumn("Butacas");
                tableModel.addColumn("idCine");
                verSalas();              
                break;
            }
            case "sesion":{
                    tableModel.addColumn("Precio de Entrada");
                    tableModel.addColumn("Fecha");
                    tableModel.addColumn("Hora");
                    tableModel.addColumn("Pelicula");
                    tableModel.addColumn("idCine");
                    tableModel.addColumn("idSala");
                    verSesion();
                break;
            }
            case "pelicula":{
                tableModel.addColumn("Nombre");
                tableModel.addColumn("Director");
                tableModel.addColumn("Edad PG");
                verPeliculas();
                break;
            }
            
        }
        
        jTable1.setModel(tableModel);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        if(screen == "sala"){
            jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(4).setMinWidth(0);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(0);
        }
        else if(screen == "sesion"){
            jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(5).setMinWidth(0);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(6).setMinWidth(0);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(0);
        }
        
    }
    private void eliminarCineDialog(String id){
        int opcion = JOptionPane.showConfirmDialog(null, "Si eliminas el cine desaparecera toda la informacion", "Confirmación", JOptionPane.YES_NO_OPTION);
        // Verifica la opción seleccionada por el usuario
        if (opcion == JOptionPane.YES_OPTION) {
            AppConfig.getCineServicio().eliminarCinePorID(Integer.parseInt(id));
            System.out.println("Cine eliminado con exito.");
        } else {
            System.out.println("Eliminar cancelado");
        }
    }
    private void eliminarSalaDialog(String id){
        int opcion = JOptionPane.showConfirmDialog(null, "Si eliminas la sala desapareceran tambien sus sesiones", "Confirmación", JOptionPane.YES_NO_OPTION);
        // Verifica la opción seleccionada por el usuario
        if (opcion == JOptionPane.YES_OPTION) {
            AppConfig.getSalaServicio().eliminarSalaPorIdCineSala(Integer.parseInt(cineIdSel),Integer.parseInt(id));
        } else {
            System.out.println("Eliminar cancelado");
        }
    }
    private void verCines(){
        ArrayList<Cine>cines= (ArrayList<Cine>) AppConfig.getCineServicio().listarTodo();
        cines.forEach(c -> {
            tableModel.addRow(new Object[]{
                    c.getIdCine(),
                    c.getNombre(),
                    c.getDireccion()
            });
        });
    }
    private void verSalas(){
            ArrayList<Sala> salas = (ArrayList<Sala>) AppConfig.getSalaServicio().listarSalasPorIdCine(Integer.valueOf(cineIdSel));
            salas.forEach(s -> {
                tableModel.addRow(new Object[]{
                        s.getIdSala(),
                        s.getNºsala(),
                        s.getVip(),
                        s.getNºbutacas()
                });
            });
    }
    private void verSesion(){
            ArrayList<Sesion> sesiones = (ArrayList<Sesion>) AppConfig.getSesionServicio().listarSesionesPorIdSala(Integer.valueOf(salaIdSel));
            sesiones.forEach(s -> {
                tableModel.addRow(new Object[]{
                        s.getIdSesion(),
                        s.getPrecio(),
                        s.getFecha(),
                        s.getHora(),
                        s.getPeliculaByIdPelicula().getNombre()
                });
            });
    }
    private void verPeliculas(){
        ArrayList<Pelicula>peliculas= (ArrayList<Pelicula>) AppConfig.getPeliculaServicio().listarTodo();
        peliculas.forEach(p -> {
            tableModel.addRow(new Object[]{
                    p.getIdPelicula(),
                    p.getNombre(),
                    p.getDirector(),
                    p.getPgEdad()
            });
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCines;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPeliculas;
    private javax.swing.JButton btnSalas;
    private javax.swing.JButton btnSesiones;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCineSel;
    // End of variables declaration//GEN-END:variables
}
