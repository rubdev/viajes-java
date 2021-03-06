/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionviajes;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author rubensegura
 */
public class NuevoPaquete extends javax.swing.JDialog {
    
    // Variables propias
    private Border bordeDef;
    private BaseDeDatos con;
    private Paquetes ventanaPaquete;

    /**
     * Creates new form NuevoPaquete
     */
    public NuevoPaquete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(770,471);
        this.bordeDef = textoNombre.getBorder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNPaq = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        idPaquete = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        labelPrecio = new javax.swing.JLabel();
        labelDestino = new javax.swing.JLabel();
        textoDestino = new javax.swing.JTextField();
        labelDuracion = new javax.swing.JLabel();
        comboDuracion = new javax.swing.JComboBox<>();
        labelHospedaje = new javax.swing.JLabel();
        textoHospedaje = new javax.swing.JTextField();
        labelTransporte = new javax.swing.JLabel();
        textoTransporte = new javax.swing.JTextField();
        textoPrecio = new javax.swing.JFormattedTextField();
        textoDuracion = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo paquete");

        labelNPaq.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        labelNPaq.setText("Nuevo paquete");
        labelNPaq.setToolTipText("Nuevo paquete");
        labelNPaq.setPreferredSize(new java.awt.Dimension(750, 500));

        btnCancelar.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar y volver a gestión de paquetes");
        btnCancelar.setPreferredSize(new java.awt.Dimension(170, 80));
        btnCancelar.setSelected(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Modificar paquete");
        btnModificar.setPreferredSize(new java.awt.Dimension(170, 80));
        btnModificar.setSelected(true);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        idPaquete.setToolTipText("");
        idPaquete.setEnabled(false);
        idPaquete.setFocusable(false);
        idPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPaqueteActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar nuevo paquete");
        btnGuardar.setPreferredSize(new java.awt.Dimension(170, 80));
        btnGuardar.setSelected(true);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        labelNombre.setText("Nombre:");
        labelNombre.setToolTipText("Nombre del paquete");

        textoNombre.setToolTipText("Introduce aquí el nombre del paquete");
        textoNombre.setNextFocusableComponent(textoPrecio);
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });

        labelPrecio.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        labelPrecio.setText("Precio:");
        labelPrecio.setToolTipText("Precio del paquete (en €)");

        labelDestino.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        labelDestino.setText("Destino:");
        labelDestino.setToolTipText("Destino del paquete");

        textoDestino.setToolTipText("Introduce aquí el destino del paquete");
        textoDestino.setNextFocusableComponent(textoDuracion);
        textoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDestinoActionPerformed(evt);
            }
        });

        labelDuracion.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        labelDuracion.setText("Duración:");
        labelDuracion.setToolTipText("Duración del paquete");

        comboDuracion.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        comboDuracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Días", "Semanas", "Meses" }));
        comboDuracion.setToolTipText("Selecciona el parámetro de duración para el paquete");
        comboDuracion.setMinimumSize(new java.awt.Dimension(500, 40));
        comboDuracion.setNextFocusableComponent(textoHospedaje);
        comboDuracion.setPreferredSize(new java.awt.Dimension(150, 40));
        comboDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDuracionActionPerformed(evt);
            }
        });

        labelHospedaje.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        labelHospedaje.setText("Hospedaje:");
        labelHospedaje.setToolTipText("Indica si hay hospedaje o no y cuál en el caso de que si lo incluya");

        textoHospedaje.setToolTipText("Introduce aquí el hospedaje del paquete");
        textoHospedaje.setNextFocusableComponent(textoTransporte);
        textoHospedaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoHospedajeActionPerformed(evt);
            }
        });

        labelTransporte.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        labelTransporte.setText("Transporte:");
        labelTransporte.setToolTipText("Indica si hay transporte o no y cuál en el caso de que si lo incluya");

        textoTransporte.setToolTipText("Introduce aquí el transporte del paquete");
        textoTransporte.setNextFocusableComponent(btnGuardar);
        textoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTransporteActionPerformed(evt);
            }
        });

        textoPrecio.setNextFocusableComponent(textoDestino);
        textoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPrecioActionPerformed(evt);
            }
        });

        textoDuracion.setNextFocusableComponent(comboDuracion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNPaq, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelDestino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                        .addComponent(textoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelNombre)
                                                .addGap(69, 69, 69))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelPrecio)
                                                .addGap(86, 86, 86)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                            .addComponent(textoPrecio))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelTransporte)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelHospedaje)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 2, Short.MAX_VALUE)
                                                .addComponent(labelDuracion)
                                                .addGap(69, 69, 69)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(textoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(comboDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(textoHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelNPaq, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDuracion)
                        .addComponent(comboDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNombre)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelHospedaje)
                                .addComponent(textoHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelPrecio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTransporte)
                        .addComponent(textoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDestino)
                        .addComponent(textoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.out.println("Cancelar pulsado, se sale a gestión de paquetes");
        ventanaPaquete.desactivarBotones();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        System.out.println("Modificar paquete pulsado");
        int idPaquete = Integer.parseInt(this.idPaquete.getText());
        String nombre = textoNombre.getText();
        String precio = textoPrecio.getText().trim();
        String destino = textoDestino.getText();
        String duracion = textoDuracion.getText().trim();
        String hospedaje = textoHospedaje.getText();
        String transporte = textoTransporte.getText();
        int precioBD=0,duracionBD=0;
        boolean todoCorrecto = true;
        // compruebo campo nombre
        if (nombre.equals("")) {
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "El nombre no puede quedar vacío","Error", JOptionPane.WARNING_MESSAGE);
            textoNombre.setBorder(new LineBorder(Color.RED));
            todoCorrecto = false;
        } else if(nombre.length()>200){ 
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "El texto nombre no puede ser tan largo","Error", JOptionPane.WARNING_MESSAGE);
            textoNombre.setBorder(new LineBorder(Color.RED));
            todoCorrecto = false;
        }else {
            textoNombre.setBorder(new LineBorder(Color.GREEN));
        }
        // compruebo campo destino
        if (destino.equals("")) {
            this.setVisible(false);
            textoDestino.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El destino no puede quedar vacío","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else if (destino.length()>200) {
            this.setVisible(false);
            textoDestino.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El texto destino no puede ser tan larto","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        }else {
            textoDestino.setBorder(new LineBorder(Color.GREEN));
        }
        // compruebo campo hospedaje
        if (hospedaje.equals("")) {
            this.setVisible(false);
            textoHospedaje.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El hospedaje no puede quedar vacío. Indique 'No tiene' si no incluye ","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else if(hospedaje.length()>200) {
            this.setVisible(false);
            textoHospedaje.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El texto hospedaje no puede ser tan largo","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else {
            textoHospedaje.setBorder(new LineBorder(Color.GREEN));
        }
        // compruebo campo transporte
        if (transporte.equals("")) {
            this.setVisible(false);
            textoTransporte.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El transporte no puede quedar vacío. Indique 'No tiene' si no incluye ","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else if(transporte.length()>200) {
            textoTransporte.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El texto transporte no puede ser tan largo","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else {
            textoTransporte.setBorder(new LineBorder(Color.GREEN));
        }
        // compruebo campo precio
        if (precio.equals("")) {
            this.setVisible(false);
            textoPrecio.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El precio no puede quedar vacío","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else {
            textoPrecio.setBorder(new LineBorder(Color.GREEN));
        }
        // compruebo campo duración
        if (duracion.equals("")) {
            this.setVisible(false);
            textoDuracion.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "La duración no puede quedar vacía","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else {
            textoDuracion.setBorder(new LineBorder(Color.GREEN));
            //duracion = duracion+" "+comboDuracion.getSelectedItem();
        }
        try {
            duracionBD = Integer.parseInt(duracion);
            duracion = duracionBD+" "+comboDuracion.getSelectedItem();
        } catch(NumberFormatException ex) {
            this.setVisible(false);
            textoDuracion.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "La duración debe ser un entero. Ej: 4","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        }
        try {
            precioBD = Integer.parseInt(precio);
        } catch(NumberFormatException ex) {
            this.setVisible(false);
            textoPrecio.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El precio debe ser un número entero. Ej: 500","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        }
        this.setVisible(true);
        if (todoCorrecto) {
            try {
                PreparedStatement consulta;
                consulta=this.con.dameConexion().prepareStatement("UPDATE Paquete SET nombre = ?, precio = ?, hospedaje = ?, duracion = ?, destino = ?, transporte = ? WHERE paqueteID = ?");
                consulta.setString(1, nombre);
                consulta.setInt(2, precioBD);
                consulta.setString(3, hospedaje);
                consulta.setString(4, duracion);
                consulta.setString(5, destino);
                consulta.setString(6, transporte);
                consulta.setInt(7, idPaquete);
                consulta.executeUpdate();
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "El paquete ha sido modificado correctamente","Paquete modificado", JOptionPane.INFORMATION_MESSAGE);
                ventanaPaquete.listarPaquetes("","",false);
                ventanaPaquete.desactivarBotones();
            } catch(SQLException e) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, e.getMessage(),"Error SQL", JOptionPane.WARNING_MESSAGE);
                this.setVisible(true);
            }
        } else {
            System.out.println("LOS DATOS PARA MODIFICAR PAQUETE NO ESTAN BIEN DEFINIDOS");
        }
        ventanaPaquete.desactivarBotones();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void idPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPaqueteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPaqueteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        System.out.println("Guardar nuevo paquete pulsado");
        String nombre = textoNombre.getText();
        String precio = textoPrecio.getText().trim();
        String destino = textoDestino.getText();
        String duracion = textoDuracion.getText().trim();
        String hospedaje = textoHospedaje.getText();
        String transporte = textoTransporte.getText();
        int precioBD=0,duracionBD=0;
        
        boolean todoCorrecto = true;
        // compruebo campo nombre
        if (nombre.equals("")) {
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "El nombre no puede quedar vacío","Error", JOptionPane.WARNING_MESSAGE);
            textoNombre.setBorder(new LineBorder(Color.RED));
            todoCorrecto = false;
        } else if(nombre.length()>200){ 
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "El texto nombre no puede ser tan largo","Error", JOptionPane.WARNING_MESSAGE);
            textoNombre.setBorder(new LineBorder(Color.RED));
            todoCorrecto = false;
        }else {
            textoNombre.setBorder(new LineBorder(Color.GREEN));
        }
        // compruebo campo destino
        if (destino.equals("")) {
            this.setVisible(false);
            textoDestino.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El destino no puede quedar vacío","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else if (destino.length()>200) {
            this.setVisible(false);
            textoDestino.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El texto destino no puede ser tan largo","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        }else {
            textoDestino.setBorder(new LineBorder(Color.GREEN));
        }
        
        // compruebo campo hospedaje
        if (hospedaje.equals("")) {
            this.setVisible(false);
            textoHospedaje.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El hospedaje no puede quedar vacío. Indique 'No tiene' si no incluye ","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else if(hospedaje.length()>200) {
            this.setVisible(false);
            textoHospedaje.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El texto hospedaje no puede ser tan largo","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else {
            textoHospedaje.setBorder(new LineBorder(Color.GREEN));
        }
        // compruebo campo transporte
        if (transporte.equals("")) {
            this.setVisible(false);
            textoTransporte.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El transporte no puede quedar vacío. Indique 'No tiene' si no incluye ","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else if(transporte.length()>200) {
            textoTransporte.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El texto transporte no puede ser tan largo","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else {
            textoTransporte.setBorder(new LineBorder(Color.GREEN));
        }
        // compruebo campo precio
        if (precio.equals("")) {
            this.setVisible(false);
            textoPrecio.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El precio no puede quedar vacío","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else {
            textoPrecio.setBorder(new LineBorder(Color.GREEN));
        }
        // compruebo campo duración
        if (duracion.equals("")) {
            this.setVisible(false);
            textoDuracion.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "La duración no puede quedar vacía","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        } else {
            textoDuracion.setBorder(new LineBorder(Color.GREEN));
            //duracion = duracion+" "+comboDuracion.getSelectedItem();
        }
        try {
            duracionBD = Integer.parseInt(duracion);
            duracion = duracionBD+" "+comboDuracion.getSelectedItem();
        } catch(NumberFormatException ex) {
            this.setVisible(false);
            textoDuracion.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "La duración debe ser un entero. Ej: 4","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        }
        try {
            precioBD = Integer.parseInt(precio);
        } catch(NumberFormatException ex) {
            this.setVisible(false);
            textoPrecio.setBorder(new LineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "El precio debe ser un número entero. Ej: 500","Error", JOptionPane.WARNING_MESSAGE);
            todoCorrecto = false;
        }
        this.setVisible(true);
        if (todoCorrecto) {
            try {
                PreparedStatement consulta;
                consulta=this.con.dameConexion().prepareStatement("INSERT INTO Paquete (nombre,precio,hospedaje,duracion,destino,transporte) VALUES (?,?,?,?,?,?)");
                consulta.setString(1, nombre);
                consulta.setInt(2, precioBD);
                consulta.setString(3, hospedaje);
                consulta.setString(4, duracion);
                consulta.setString(5, destino);
                consulta.setString(6, transporte);
                consulta.executeUpdate();
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "El paquete ha sido añadido correctamente","Paquete añadido", JOptionPane.INFORMATION_MESSAGE);
                ventanaPaquete.listarPaquetes("", "",false);
            } catch(SQLException e) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, e.getMessage(),"Error SQL", JOptionPane.WARNING_MESSAGE);
                this.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDestinoActionPerformed

    private void comboDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDuracionActionPerformed
        System.out.println("Selecciono elemento del combobox para la duración del paquete en "+comboDuracion.getSelectedItem().toString());
    }//GEN-LAST:event_comboDuracionActionPerformed

    private void textoHospedajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoHospedajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoHospedajeActionPerformed

    private void textoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTransporteActionPerformed

    private void textoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPrecioActionPerformed

    /**
     * Cuando se quiere añadir un nuevo paquete se prepara el formulario
     * limpiando sus campos, cambiando el título del formulario y desactivando
     * la casilla del id del paquete
     */
    public void preparaFormularioNuevoPaquete() {
        System.out.println("Preparo el formulario para la creación de un nuevo paquete");
        labelNPaq.setText("Nuevo paquete");
        textoNombre.setText("");
        textoNombre.setBorder(bordeDef);
        textoPrecio.setText("");
        textoPrecio.setBorder(bordeDef);
        textoDestino.setText("");
        textoDestino.setBorder(bordeDef);
        textoHospedaje.setText("");
        textoHospedaje.setBorder(bordeDef);
        textoTransporte.setText("");
        textoTransporte.setBorder(bordeDef);
        textoDuracion.setText("");
        textoDuracion.setBorder(bordeDef);
        comboDuracion.setSelectedIndex(0);
        btnCancelar.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
        idPaquete.setVisible(false);
        textoNombre.requestFocus();
    }
    
    public void preparaFormularioModificarPaquete(int id,String nombre,int precio,String destino, String hospedaje, String duracionNum, String duracionCombo, String transporte) {
        System.out.println("Preparo formulario modificar paquete");
        labelNPaq.setText("Modificar paquete");
        btnCancelar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnGuardar.setEnabled(false);
        idPaquete.setText(Integer.toString(id));
        idPaquete.setVisible(false);
        textoNombre.setText(nombre);
        textoNombre.setBorder(bordeDef);
        textoPrecio.setText(Integer.toString(precio));
        textoPrecio.setBorder(bordeDef);
        textoDestino.setText(destino);
        textoDestino.setBorder(bordeDef);
        textoDuracion.setText(duracionNum);
        textoDuracion.setBorder(bordeDef);
        textoHospedaje.setText(hospedaje);
        textoHospedaje.setBorder(bordeDef);
        textoTransporte.setText(transporte);
        textoTransporte.setBorder(bordeDef);
        switch (duracionCombo) {
            case "Días":
                comboDuracion.setSelectedIndex(0);
                break;
            case "Semanas":
                comboDuracion.setSelectedIndex(1);
                break;
            case "Meses":
                comboDuracion.setSelectedIndex(2);
                break;
            default:
                System.out.println("El combo d/s/m no se ha identificado bien, pongo días por defecto");
                comboDuracion.setSelectedIndex(0);
                break;
        }
        textoNombre.requestFocus();
    }
    
    /**
     * Devuelve un string con la duración escogida en el combo
     * @return 
     */
    private String obtenerTipoDuracion() {
        return comboDuracion.getSelectedItem().toString();
    }
    
    /**
     * Me permite pasar la conexión con la base de datos entre la ventana
     * cliente y la de nuevo clientes
     *
     * @param con
     */
    public void darConexionAbierta(BaseDeDatos con) {
        System.out.println("Paso la conexión BD a nuevo paquete");
        this.con = con;
    }
    
    /**
     * Me permite pasar la ventana de clientes actual abierta  entre la ventana
     * cliente y la de nuevo cliente
     *
     * @param ventanaPaquete 
     */
    public void dameVentanaPaquetes(Paquetes ventanaPaquete) {
        System.out.println("Paslo la ventana paquetes a nuevo paquete");
        this.ventanaPaquete = ventanaPaquete;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> comboDuracion;
    private javax.swing.JTextField idPaquete;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelHospedaje;
    private javax.swing.JLabel labelNPaq;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelTransporte;
    private javax.swing.JTextField textoDestino;
    private javax.swing.JFormattedTextField textoDuracion;
    private javax.swing.JTextField textoHospedaje;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JFormattedTextField textoPrecio;
    private javax.swing.JTextField textoTransporte;
    // End of variables declaration//GEN-END:variables
}
