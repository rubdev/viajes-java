/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionviajes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rubensegura
 */
public class BuscarClientePaquete extends javax.swing.JDialog {

    // Variables propias
    private BaseDeDatos con;
    private DefaultTableModel modeloTabla;
    private NuevaVenta ventanaNuevaVenta;

    /**
     * Creates new form BuscarClientePaquete
     */
    public BuscarClientePaquete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(600, 700);
        jTableBuscaCliPaq.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTiulo = new javax.swing.JLabel();
        comboSeleccionBusqueda = new javax.swing.JComboBox<>();
        textoBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPaneBuscaCliPaq = new javax.swing.JScrollPane();
        jTableBuscaCliPaq = new javax.swing.JTable();
        esCliPaqVar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                obtenValorTrasBusqueda(evt);
            }
        });

        labelTiulo.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        labelTiulo.setText("Búsqueda de ");
        labelTiulo.setToolTipText("Nueva venta");
        labelTiulo.setPreferredSize(new java.awt.Dimension(750, 500));

        comboSeleccionBusqueda.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        comboSeleccionBusqueda.setToolTipText("");
        comboSeleccionBusqueda.setMinimumSize(new java.awt.Dimension(500, 40));
        comboSeleccionBusqueda.setPreferredSize(new java.awt.Dimension(150, 40));
        comboSeleccionBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focoBuscar(evt);
            }
        });
        comboSeleccionBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSeleccionBusquedaActionPerformed(evt);
            }
        });

        textoBusqueda.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        textoBusqueda.setText("Introduce término de búsqueda...");
        textoBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focoBuscarGanado(evt);
            }
        });
        textoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBusquedaActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.setPreferredSize(new java.awt.Dimension(170, 80));
        btnCancelar.setSelected(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnGuardar.setText("Seleccionar");
        btnGuardar.setToolTipText("");
        btnGuardar.setPreferredSize(new java.awt.Dimension(170, 80));
        btnGuardar.setSelected(true);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jTableBuscaCliPaq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableBuscaCliPaq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activaBotonGuardar(evt);
            }
        });
        jScrollPaneBuscaCliPaq.setViewportView(jTableBuscaCliPaq);

        esCliPaqVar.setEnabled(false);
        esCliPaqVar.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPaneBuscaCliPaq, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(esCliPaqVar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(61, 61, 61))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboSeleccionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoBusqueda))
                            .addGap(100, 100, 100)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelTiulo, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTiulo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(comboSeleccionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(textoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPaneBuscaCliPaq, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esCliPaqVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboSeleccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSeleccionBusquedaActionPerformed
        System.out.println("Activo el botón de buscar");
        btnBuscar.setEnabled(true);
    }//GEN-LAST:event_comboSeleccionBusquedaActionPerformed

    private void textoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBusquedaActionPerformed

    }//GEN-LAST:event_textoBusquedaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String seleccionCombo = comboSeleccionBusqueda.getSelectedItem().toString().toLowerCase();
        String buscar = textoBusqueda.getText();
        if (esCliente()) {
            System.out.println("Se pulsa en buscar clliente por " + seleccionCombo + " y " + buscar);
            listarClienteBuscado(seleccionCombo, buscar);
        } else {
            System.out.println("Se pulsa en buscar paquete por " + seleccionCombo + " y " + buscar);
            listarPaqueteBuscado(seleccionCombo, buscar);
        }
        btnBuscar.setEnabled(false);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.out.println("Cancelo búsqueda y vuelvo a nueva venta");
        this.setVisible(false);
        ventanaNuevaVenta.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        System.out.println("Selecciono y pongo en nueva venta jeje");
        if (esCliente()) {
            int fila = jTableBuscaCliPaq.getSelectedRow();
            System.out.println("Fila seleccionada => "+fila);
            Integer idCliente = (Integer) jTableBuscaCliPaq.getModel().getValueAt(fila,0);
            System.out.println("ID del cliente seleccionado => "+idCliente);
            String nombreCliente = (String) jTableBuscaCliPaq.getModel().getValueAt(fila, 1);
            String apellidoCliente = (String) jTableBuscaCliPaq.getModel().getValueAt(fila, 2);
            String nombreCompleto = nombreCliente+" "+apellidoCliente;
            System.out.println("Nombre del cliente selecciona => "+nombreCompleto);
            ventanaNuevaVenta.ponerDatosCliente(nombreCompleto, idCliente);
            this.setVisible(false);
            ventanaNuevaVenta.setVisible(true);
        } else {
            int fila = jTableBuscaCliPaq.getSelectedRow();
            System.out.println("Fila seleccionada => "+fila);
            Integer idPaquete = (Integer) jTableBuscaCliPaq.getModel().getValueAt(fila,0);
            System.out.println("ID del paquete seleccionado => "+idPaquete);
            String nombrePaquete = (String) jTableBuscaCliPaq.getModel().getValueAt(fila, 1);
            System.out.println("Nombre del paquete seleccionado => "+nombrePaquete);
            ventanaNuevaVenta.ponerDatosPaquete(nombrePaquete, idPaquete);
            this.setVisible(false);
            ventanaNuevaVenta.setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void focoBuscar(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focoBuscar
        textoBusqueda.setText("");
        System.out.println("Limpio jdialgo texto buscador");
    }//GEN-LAST:event_focoBuscar

    private void obtenValorTrasBusqueda(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_obtenValorTrasBusqueda
        String busqueda = textoBusqueda.getText();
        System.out.println("=> "+busqueda);
    }//GEN-LAST:event_obtenValorTrasBusqueda

    private void activaBotonGuardar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activaBotonGuardar
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_activaBotonGuardar

    private void focoBuscarGanado(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focoBuscarGanado
        textoBusqueda.setText("");
    }//GEN-LAST:event_focoBuscarGanado

    /**
     * Compruebo si es cliente lo que hay que buscar o paquete
     *
     * @return true si es cliente o false si paquete
     */
    private boolean esCliente() {
        boolean cliente = false;
        int compruebalo = Integer.parseInt(esCliPaqVar.getText());
        if (compruebalo == 0) {
            cliente = true;
        }
        return cliente;
    }

    /**
     * Cargo y preparo el formulario para realizar una búsqueda de cliente para
     * una nueva venta
     */
    public void cargaVentanaBusquedaCliente() {
        System.out.println("Cargo la ventana de busqueda de cliente");
        esCliPaqVar.setText("0");
        esCliPaqVar.setVisible(false);
        this.setTitle("Búsqueda de cliente");
        labelTiulo.setText("Búsqueda de cliente");
        labelTiulo.setToolTipText("Ventana de búsqueda de cliente para una nueva venta");
        comboSeleccionBusqueda.removeAllItems();
        comboSeleccionBusqueda.addItem("Nombre");
        comboSeleccionBusqueda.addItem("Apellidos");
        comboSeleccionBusqueda.addItem("Dni");
        comboSeleccionBusqueda.addItem("Pasaporte");
        comboSeleccionBusqueda.setToolTipText("Seleccione un parámetro de búsqueda de la caja combo");
        comboSeleccionBusqueda.setSelectedIndex(-1);
        textoBusqueda.setText("Introduzca término de búsqueda");
        textoBusqueda.setToolTipText("Introduce aquí el término a buscar del cliente");
        btnBuscar.setEnabled(false);
        btnBuscar.setToolTipText("Pulsa aquí para buscar un cliente con los parámetros seleccionados");
        btnCancelar.setToolTipText("Cancelar y volver a nueva venta");
        btnGuardar.setToolTipText("Seleccionar cliente y volver a nueva venta");
        btnGuardar.setEnabled(false);
        modeloTabla = new DefaultTableModel();
        jTableBuscaCliPaq.setModel(modeloTabla);
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Dni");
    }

    /**
     * Me permite pasar la conexión con la base de datos entre la ventana nueva
     * venta y la de buscar cliente/paquete
     *
     * @param con
     */
    public void darConexionAbierta(BaseDeDatos con) {
        System.out.println("Paso la conexión BD a buscar cliente/paquete para venta");
        this.con = con;
    }
    
    /**
     * 
     * @param ventanaNuevaVenta 
     */
    public void dameVentanaNuevaVenta(NuevaVenta ventanaNuevaVenta) {
        System.out.println("Paso la ventana de nueva venta a busqueda cli/paq");
        this.ventanaNuevaVenta = ventanaNuevaVenta;
    }

    /**
     * Lista los clientes buscados para una venta
     */
    public void listarClienteBuscado(String tipo, String busqueda) {
        DefaultTableModel model = (DefaultTableModel) this.jTableBuscaCliPaq.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            ResultSet rs;
            String mensaje;
            PreparedStatement consulta;
            busqueda = "%" + busqueda + "%";
            consulta = this.con.dameConexion().prepareStatement("SELECT * FROM Cliente WHERE " + tipo + " LIKE ?");
            consulta.setString(1, busqueda);
            rs = consulta.executeQuery();
            System.out.println(rs);
            if (!rs.next()) {
                mensaje = "No se han encontrado coincidencias en la búsqueda con los parámetros indicados.";
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, mensaje, "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
            } else {
                do {
                    model.addRow(new Object[]{
                        rs.getInt("clienteID"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getString("dni")
                    });
                } while (rs.next());
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        this.setVisible(true);
    }

    /**
     * Cargo y preparo el formulario para realizar una búsqueda de paquete para
     * una nueva venta
     */
    public void cargaVentanaBusquedaPaquete() {
        System.out.println("Carga ventana de búsqueda de paquete");
        esCliPaqVar.setText("1");
        esCliPaqVar.setVisible(false);
        this.setTitle("Búsqueda de paquete");
        labelTiulo.setText("Búsqueda de paquete");
        labelTiulo.setToolTipText("Ventana de búsqueda de paquete para una nueva venta");
        comboSeleccionBusqueda.removeAllItems();
        comboSeleccionBusqueda.addItem("Nombre");
        comboSeleccionBusqueda.addItem("Destino");
        comboSeleccionBusqueda.addItem("Precio");
        comboSeleccionBusqueda.setToolTipText("Seleccione un parámetro de búsqueda de la caja combo");
        comboSeleccionBusqueda.setSelectedIndex(-1);
        textoBusqueda.setText("Introduzca término de búsqueda");
        textoBusqueda.setToolTipText("Introduce aquí el término a buscar del paquete");
        btnBuscar.setEnabled(false);
        btnBuscar.setToolTipText("Pulsa aquí para buscar un paquete con los parámetros seleccionados");
        btnCancelar.setToolTipText("Cancelar y volver a nueva venta");
        btnGuardar.setToolTipText("Seleccionar paquete y volver a nueva venta");
        btnGuardar.setEnabled(false);
        modeloTabla = new DefaultTableModel();
        jTableBuscaCliPaq.setModel(modeloTabla);
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Destino");
        modeloTabla.addColumn("Precio");
    }

    /**
     * Listo los resultado de busqueda de paquete para una venta
     */
    public void listarPaqueteBuscado(String tipo, String busqueda) {
        DefaultTableModel model = (DefaultTableModel) this.jTableBuscaCliPaq.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            ResultSet rs;
            String mensaje;
            PreparedStatement consulta;
            busqueda = "%" + busqueda + "%";
            consulta = this.con.dameConexion().prepareStatement("SELECT * FROM Paquete WHERE " + tipo + " LIKE ?");
            consulta.setString(1, busqueda);
            rs = consulta.executeQuery();
            System.out.println(rs);
            if (!rs.next()) {
                mensaje = "No se han encontrado coincidencias en la búsqueda con los parámetros indicados.";
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, mensaje, "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
            } else {
                do {
                    model.addRow(new Object[]{
                        rs.getInt("paqueteID"),
                        rs.getString("nombre"),
                        rs.getString("destino"),
                        rs.getString("precio")
                    });
                } while (rs.next());
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboSeleccionBusqueda;
    private javax.swing.JTextField esCliPaqVar;
    private javax.swing.JScrollPane jScrollPaneBuscaCliPaq;
    private javax.swing.JTable jTableBuscaCliPaq;
    private javax.swing.JLabel labelTiulo;
    private javax.swing.JTextField textoBusqueda;
    // End of variables declaration//GEN-END:variables
}