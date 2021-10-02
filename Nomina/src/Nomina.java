import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Tarea 0
 * 
 * @author Gallegos Mota Victor Hugo, Carlos Cruz Rangel
 *
 *         Esta es la interfaz (GUI) que será mostrada en pantalla para la
 *         captura por parte del usuario.
 */

public class Nomina extends javax.swing.JFrame {

  private Registros trabajador;
  int l, regemp1, regemp2, ne, caso;
  String nombus;

  String numero, nom, apellidopaterno, apellidomaterno, direccion, curp, sueldo, diaslab, email, antiguedad, puesto;

  /** Creates new form Nomina */
  public Nomina() {

    initComponents();

    jDialog1.setVisible(false);
    jTextArea1.setVisible(false);
    jLabelSueldoTotal.setVisible(false);
    jTextFieldSueldoTotal.setVisible(false);

    abrirArchivo();

  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regemp1erated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jOptionPane1 = new javax.swing.JOptionPane();
    jDialog1 = new javax.swing.JDialog();
    jTextFieldSueldoTotal = new javax.swing.JTextField();
    jTextFieldCURP = new javax.swing.JTextField();
    jLabelSueldoTotal = new javax.swing.JLabel();
    jTextFieldDias = new javax.swing.JTextField();
    jTextFieldSueldoD = new javax.swing.JTextField();
    jTextFieldNombre = new javax.swing.JTextField();
    jTextFieldApellidopaterno = new javax.swing.JTextField();
    jTextFieldApellidomaterno = new javax.swing.JTextField();
    jTextFieldDireccion = new javax.swing.JTextField();
    jTextFieldNumEmp = new javax.swing.JTextField();
    jTextFieldEmail = new javax.swing.JTextField();
    jTextFieldAntiguedad = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jButtonCancelar = new javax.swing.JButton();
    jLabelDiasLab = new javax.swing.JLabel();
    jLabelNombre = new javax.swing.JLabel();
    jLabelApellidopaterno = new javax.swing.JLabel();
    jLabelApellidomaterno = new javax.swing.JLabel();
    jLabelDireccion = new javax.swing.JLabel();
    jLabelNumEmp = new javax.swing.JLabel();
    jLabelEmail = new javax.swing.JLabel();
    jLabelAntiguedad = new javax.swing.JLabel();
    jLabelPuesto = new javax.swing.JLabel();

    jLabelSueldoDiario = new javax.swing.JLabel();
    jLabelCURP = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    menuBar = new javax.swing.JMenuBar();
    archivoMenu = new javax.swing.JMenu();
    jMenuItemGuardar = new javax.swing.JMenuItem();
    exitMenuItem = new javax.swing.JMenuItem();
    registroMenu = new javax.swing.JMenu();
    jMenuItemAltas = new javax.swing.JMenuItem();
    jMenuItemBajas = new javax.swing.JMenuItem();
    jMenuItemCambios = new javax.swing.JMenuItem();
    jMenuItemBuscar = new javax.swing.JMenuItem();
    jMenuItemMostrarTodos = new javax.swing.JMenuItem();
    jMenuItemGenerar = new javax.swing.JMenuItem();
    ayudaMenu = new javax.swing.JMenu();
    aboutMenuItem = new javax.swing.JMenuItem();

    // Tamano de la tabla
    jDialog1.setMinimumSize(new java.awt.Dimension(844, 500));
    jDialog1.setModal(true);
    jDialog1.setName(""); // NOI18N

    jLabelSueldoTotal.setText("Sueldo total:            $");

    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButtonCancelar.setBackground(new java.awt.Color(255, 0, 0));
    jButtonCancelar.setText("Cancelar");
    jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCancelarActionPerformed(evt);
      }
    });

    jLabelDiasLab.setText("Días laborados:");

    jLabelNombre.setText("Nombre(s):");

    jLabelApellidopaterno.setText("Apellido paterno:");

    jLabelApellidomaterno.setText("Apellido materno:");

    jLabelDireccion.setText("Direccion:");

    jLabelNumEmp.setText("Número de trabajador:");

    jLabelSueldoDiario.setText("Sueldo diario:           $");

    jLabelCURP.setText("CURP:");

    jLabelEmail.setText("Correo Electronico:");

    jLabelAntiguedad.setText("Años de antiguedad:");

    jLabelPuesto.setText("Puesto:");

    javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
    jDialog1.getContentPane().setLayout(jDialog1Layout);
    jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jDialog1Layout.createSequentialGroup().addContainerGap()
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelNumEmp).addComponent(jLabelNombre).addComponent(jLabelEmail)
                .addComponent(jLabelAntiguedad).addComponent(jLabelPuesto).addComponent(jLabelApellidopaterno)
                .addComponent(jLabelApellidomaterno).addComponent(jLabelDireccion).addComponent(jLabelCURP)
                .addComponent(jLabelSueldoDiario).addComponent(jLabelDiasLab).addComponent(jLabelSueldoTotal))
            .addGap(6, 6, 6)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                    javax.swing.GroupLayout.PREFERRED_SIZE)

                .addComponent(jTextFieldApellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                    javax.swing.GroupLayout.PREFERRED_SIZE)

                .addComponent(jTextFieldApellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                    javax.swing.GroupLayout.PREFERRED_SIZE)

                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 383,
                    javax.swing.GroupLayout.PREFERRED_SIZE)

                .addComponent(jTextFieldNumEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                    javax.swing.GroupLayout.PREFERRED_SIZE)

                .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                    javax.swing.GroupLayout.PREFERRED_SIZE)

                .addComponent(jTextFieldSueldoD, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                    javax.swing.GroupLayout.PREFERRED_SIZE)

                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                    javax.swing.GroupLayout.PREFERRED_SIZE)

                .addComponent(jTextFieldAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
                    javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldSueldoTotal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCURP, javax.swing.GroupLayout.Alignment.LEADING,
                        javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
            .addContainerGap(108, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(70, 70, 70).addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(98, 98, 98)));
    jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jDialog1Layout.createSequentialGroup().addContainerGap()
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelApellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldApellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelApellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldApellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelNumEmp).addComponent(jTextFieldNumEmp, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelCURP).addComponent(jTextFieldCURP, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelSueldoDiario).addComponent(jTextFieldSueldoD,
                    javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(7, 7, 7)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelDiasLab).addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                .addComponent(jLabelAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                .addComponent(jLabelPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                    javax.swing.GroupLayout.PREFERRED_SIZE)

                .addComponent(jLabelSueldoTotal).addComponent(jTextFieldSueldoTotal,
                    javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(60, Short.MAX_VALUE)));

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Nómina");

    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane1.setViewportView(jTextArea1);

    archivoMenu.setText("Archivo");

    jMenuItemGuardar.setText("Guardar");
    jMenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemGuardarActionPerformed(evt);
      }
    });
    archivoMenu.add(jMenuItemGuardar);

    exitMenuItem.setText("Salir");
    exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitMenuItemActionPerformed(evt);
      }
    });
    archivoMenu.add(exitMenuItem);

    menuBar.add(archivoMenu);

    registroMenu.setText("Registro");

    jMenuItemAltas.setText("Altas");
    jMenuItemAltas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemAltasActionPerformed(evt);
      }
    });
    registroMenu.add(jMenuItemAltas);

    jMenuItemBajas.setText("Bajas");
    jMenuItemBajas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemBajasActionPerformed(evt);
      }
    });
    registroMenu.add(jMenuItemBajas);

    jMenuItemCambios.setText("Cambios");
    jMenuItemCambios.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemCambiosActionPerformed(evt);
      }
    });
    registroMenu.add(jMenuItemCambios);

    jMenuItemBuscar.setText("Buscar Trabajador");
    jMenuItemBuscar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemBuscarActionPerformed(evt);
      }
    });
    registroMenu.add(jMenuItemBuscar);

    jMenuItemMostrarTodos.setText("Mostrar todos ");
    jMenuItemMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemMostrarTodosActionPerformed(evt);
      }
    });
    registroMenu.add(jMenuItemMostrarTodos);

    jMenuItemGenerar.setText("Generar pagos de nómina");
    jMenuItemGenerar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemGenerarActionPerformed(evt);
      }
    });
    registroMenu.add(jMenuItemGenerar);

    menuBar.add(registroMenu);

    ayudaMenu.setText("Ayuda");

    aboutMenuItem.setText("Mas info");
    aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        aboutMenuItemActionPerformed(evt);
      }
    });
    ayudaMenu.add(aboutMenuItem);

    menuBar.add(ayudaMenu);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitMenuItemActionPerformed
    guardarArchivo();
    System.exit(0);
  }// GEN-LAST:event_exitMenuItemActionPerformed

  private void jMenuItemAltasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemAltasActionPerformed
    jTextArea1.setVisible(false);
    jDialog1.setLocation(400, 200);
    jDialog1.setTitle("Altas");
    jButton1.setBackground(new java.awt.Color(153, 204, 255));
    jButton1.setText("Guardar");

    jTextFieldNumEmp.setText("");

    jTextFieldNombre.setText("");
    jTextFieldApellidopaterno.setText("");
    jTextFieldApellidomaterno.setText("");
    jTextFieldDireccion.setText("");
    jTextFieldCURP.setText("");
    jTextFieldSueldoD.setText("");
    jTextFieldDias.setText("");
    jTextFieldSueldoTotal.setText("");
    jLabelSueldoTotal.setVisible(false);
    jTextFieldSueldoTotal.setVisible(false);
    jTextFieldEmail.setText("");
    jTextFieldAntiguedad.setText("");
    caso = 1;
    jDialog1.setVisible(true);
  }// GEN-LAST:event_jMenuItemAltasActionPerformed

  private void jMenuItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemBuscarActionPerformed
    buscar();
  }// GEN-LAST:event_jMenuItemBuscarActionPerformed

  private void jMenuItemBajasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemBajasActionPerformed
    String numemp = jOptionPane1
        .showInputDialog("Escriba el número de empleado" + " del registro que desea eliminar: ");

    ne = Integer.parseInt(numemp);
    regemp1 = trabajador.buscarParaCam(ne);

    if (ne == -1)
      jOptionPane1.showMessageDialog(null, "No se encontró ningún registro");
    else {
      jDialog1.setLocation(400, 200);
      jDialog1.setTitle("Bajas");
      jButton1.setText("Eliminar");
      jLabelSueldoTotal.setVisible(true);
      jTextFieldSueldoTotal.setVisible(true);

      String numeroemp = String.valueOf(trabajador.registro(regemp1).getNumEmp());

      String sueldodia = String.valueOf(trabajador.registro(regemp1).getSueldoDiario());
      String diastra = String.valueOf(trabajador.registro(regemp1).getDiasLab());
      String sueldotot = String.valueOf(trabajador.registro(regemp1).getSueldoTotal());

      jTextFieldNumEmp.setText(numeroemp);

      jTextFieldNombre.setText(trabajador.registro(regemp1).getNombre());
      jTextFieldApellidopaterno.setText(trabajador.registro(regemp1).getApellidopaterno());
      jTextFieldApellidomaterno.setText(trabajador.registro(regemp1).getApellidomaterno());
      jTextFieldDireccion.setText(trabajador.registro(regemp1).getDireccion());
      jTextFieldCURP.setText(trabajador.registro(regemp1).getCurp());
      jTextFieldSueldoD.setText(sueldodia);
      jTextFieldDias.setText(diastra);
      jTextFieldSueldoTotal.setText(sueldotot);
      jTextFieldEmail.setText(trabajador.registro(regemp1).getEmail());
      jTextFieldAntiguedad.setText(trabajador.registro(regemp1).getAntiguedad());
      caso = 3;
      jDialog1.setVisible(true);
    }
  }// GEN-LAST:event_jMenuItemBajasActionPerformed

  @SuppressWarnings("static-access")
  private void jMenuItemMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemMostrarTodosActionPerformed
    jTextArea1.setText("");
    l = trabajador.longitud();
    for (int i = 0; i < trabajador.longitud(); i++) {
      String numeroemp = String.valueOf(trabajador.registro(i).getNumEmp());

      String sueldodia = String.valueOf(trabajador.registro(i).getSueldoDiario());
      String diastra = String.valueOf(trabajador.registro(i).getDiasLab());
      String sueldotot = String.valueOf(trabajador.registro(i).getSueldoTotal());
      jTextArea1.append("  Nombre: " + trabajador.registro(i).getNombre() + " "
          + trabajador.registro(i).getApellidopaterno() + " " + trabajador.registro(i).getApellidomaterno()
          + "  Número de trabajador: " + numeroemp + "  Direccion: " + trabajador.registro(i).getDireccion()
          + "  CURP:  " + trabajador.registro(i).getCurp() + "  Días laborados: " + diastra + "  Sueldo por día: "
          + sueldodia + "  Sueldo total: " + sueldotot + "  Email: " + trabajador.registro(i).getEmail()
          + "  Años de antiguedad: " + trabajador.registro(i).getAntiguedad() + "\n");
    }
    jTextArea1.append("\nRegistros totales: " + l);
    jTextArea1.setVisible(true);
  }// GEN-LAST:event_jMenuItemMostrarTodosActionPerformed

  private void jMenuItemGenerarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemGenerarActionPerformed
    jTextArea1.setText("");

    for (int i = 0; i < trabajador.longitud(); i++) {
      String numeroemp = String.valueOf(trabajador.registro(i).getNumEmp());

      String sueldodia = String.valueOf(trabajador.registro(i).getSueldoDiario());
      String diastra = String.valueOf(trabajador.registro(i).getDiasLab());
      String sueldotot = String.valueOf(trabajador.registro(i).getSueldoTotal());
      jTextArea1.append("\n                           "
          + "                                                                FACULTAD DE CIENCIAS\n"
          + "                      Comprobante de pago"
          + "                                                                               "
          + "                                                        Folio " + (i + 1) + "\n\n");
      jTextArea1.append("Número de trabajador: " + numeroemp + "  Nombre: " + trabajador.registro(i).getNombre() + " "
          + trabajador.registro(i).getApellidopaterno() + " " + trabajador.registro(i).getApellidomaterno()
          + "  Direccion: " + trabajador.registro(i).getDireccion() + "  CURP:  " + trabajador.registro(i).getCurp()
          + "\n" + "                   Sueldo por día :  " + sueldodia + "\n" + "                   Días laborados: "
          + diastra + "\n" + "                   Sueldo total:  " + sueldotot + "  Email: "
          + trabajador.registro(i).getEmail() + "  Años de antiguedad: " + trabajador.registro(i).getAntiguedad() + "\n"
          + "                                                     "
          + "                                                     "
          + "                   Firma de recibido:______________________\n"
          + "------------------------------------------------------"
          + "------------------------------------------------------"
          + "------------------------------------------------------");
    }
    jTextArea1.setVisible(true);
  }// GEN-LAST:event_jMenuItemGenerarActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
    if (caso == 1) {
      String numero = jTextFieldNumEmp.getText();

      String nom = jTextFieldNombre.getText();
      String apellidopaterno = jTextFieldApellidopaterno.getText();
      String apellidomaterno = jTextFieldApellidomaterno.getText();
      String direccion = jTextFieldDireccion.getText();
      String curp = jTextFieldCURP.getText();
      String sueldo = jTextFieldSueldoD.getText();
      String diaslab = jTextFieldDias.getText();
      String email = jTextFieldEmail.getText();
      String antiguedad = jTextFieldAntiguedad.getText();

      int numeroe = Integer.parseInt(numero);
      int dias = Integer.parseInt(diaslab);
      Float sueldo1 = Float.parseFloat(sueldo);
      Float sueldototal = sueldo1 * dias;

      trabajador.nuevoReg(new Empleado(nom, apellidopaterno, apellidomaterno, numeroe, direccion, curp, sueldo1, dias,
          sueldototal, email, antiguedad));
      jOptionPane1.showMessageDialog(null, "El archivo se ha guardado correctamente");
      jDialog1.setVisible(false);
    } else if (caso == 2) {
      regemp2 = trabajador.buscar(nombus, regemp1 + 1);
      if (regemp2 < 0) {
        jOptionPane1.showMessageDialog(null, "No existen coincidencias");
        jButton1.setText("Nueva búsqueda");
        caso = 5;
      } else if (regemp2 >= 0 && regemp2 < l) {
        jDialog1.setVisible(true);
        jLabelSueldoTotal.setVisible(true);
        jTextFieldSueldoTotal.setVisible(true);

        String numeroemp = String.valueOf(trabajador.registro(regemp2).getNumEmp());

        String sueldodia = String.valueOf(trabajador.registro(regemp2).getSueldoDiario());
        String diastra = String.valueOf(trabajador.registro(regemp2).getDiasLab());
        String sueldotot = String.valueOf(trabajador.registro(regemp2).getSueldoTotal());

        jTextFieldNumEmp.setText(numeroemp);

        jTextFieldNombre.setText(trabajador.registro(regemp2).getNombre());
        jTextFieldApellidopaterno.setText(trabajador.registro(regemp2).getApellidopaterno());
        jTextFieldApellidomaterno.setText(trabajador.registro(regemp2).getApellidomaterno());
        jTextFieldDireccion.setText(trabajador.registro(regemp2).getDireccion());
        jTextFieldCURP.setText(trabajador.registro(regemp2).getCurp());
        jTextFieldSueldoD.setText(sueldodia);
        jTextFieldDias.setText(diastra);
        jTextFieldSueldoTotal.setText(sueldotot);
        jTextFieldEmail.setText(trabajador.registro(regemp2).getEmail());
        jTextFieldAntiguedad.setText(trabajador.registro(regemp2).getAntiguedad());
        regemp1 = regemp2;
      }
    } else if (caso == 3) {
      trabajador.eliminarReg(ne);
      jDialog1.setVisible(false);
      jOptionPane1.showMessageDialog(null, "Registro eliminado");
    } else if (caso == 4) {
      String numero = jTextFieldNumEmp.getText();

      String sueldo = jTextFieldSueldoD.getText();
      String diaslab = jTextFieldDias.getText();
      int numeroe = Integer.parseInt(numero);
      Float sueldo1 = Float.parseFloat(sueldo);
      int diasl = Integer.parseInt(diaslab);
      Float sueldotot = sueldo1 * diasl;

      trabajador.registro(regemp1).setNumemp(numeroe);

      trabajador.registro(regemp1).setNombre(jTextFieldNombre.getText());
      trabajador.registro(regemp1).setApellidopaterno(jTextFieldApellidopaterno.getText());
      trabajador.registro(regemp1).setApellidomaterno(jTextFieldApellidomaterno.getText());
      trabajador.registro(regemp1).setDireccion(jTextFieldDireccion.getText());
      trabajador.registro(regemp1).setCurp(jTextFieldCURP.getText());
      trabajador.registro(regemp1).setSueldoDiario(sueldo1);
      trabajador.registro(regemp1).setDiasLab(diasl);
      trabajador.registro(regemp1).setSueldoTotal(sueldotot);
      trabajador.registro(regemp1).setEmail(jTextFieldEmail.getText());
      trabajador.registro(regemp1).setAntiguedad(jTextFieldAntiguedad.getText());

      jDialog1.setVisible(false);
      jOptionPane1.showMessageDialog(null, "Registro actualizado");
    } else
      buscar();
  }// GEN-LAST:event_jButton1ActionPerformed

  private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarActionPerformed
    jDialog1.setVisible(false);
  }// GEN-LAST:event_jButtonCancelarActionPerformed

  private void jMenuItemCambiosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemCambiosActionPerformed
    String nombus = jOptionPane1.showInputDialog("Escriba el numero del Trabajador que desea modificar: ");

    int numeroe = Integer.parseInt(nombus);

    regemp1 = trabajador.buscarParaCam(numeroe);
    if (regemp1 == -1)
      jOptionPane1.showMessageDialog(null, "No se encontró ningún registro");
    else {
      jDialog1.setLocation(400, 200);
      jDialog1.setTitle("Actualizar");
      jButton1.setText("Guardar cambios");
      String numeroE = String.valueOf(trabajador.registro(regemp1).getNumEmp());

      String sueldoD = String.valueOf(trabajador.registro(regemp1).getSueldoDiario());
      String diasl = String.valueOf(trabajador.registro(regemp1).getDiasLab());
      jTextFieldNumEmp.setText(numeroE);

      jTextFieldNombre.setText(trabajador.registro(regemp1).getNombre());
      jTextFieldApellidopaterno.setText(trabajador.registro(regemp1).getApellidopaterno());
      jTextFieldApellidomaterno.setText(trabajador.registro(regemp1).getApellidomaterno());
      jTextFieldDireccion.setText(trabajador.registro(regemp1).getDireccion());
      jTextFieldCURP.setText(trabajador.registro(regemp1).getCurp());
      jTextFieldSueldoD.setText(sueldoD);
      jTextFieldDias.setText(diasl);
      jLabelSueldoTotal.setVisible(false);
      jTextFieldSueldoTotal.setVisible(false);
      jTextFieldEmail.setText(trabajador.registro(regemp1).getEmail());
      jTextFieldAntiguedad.setText(trabajador.registro(regemp1).getAntiguedad());
      caso = 4;
      jDialog1.setVisible(true);
    }
  }// GEN-LAST:event_jMenuItemCambiosActionPerformed

  private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_aboutMenuItemActionPerformed
    jOptionPane1.showMessageDialog(null,
        "Tarea 0: \n" + "Modelado y programacion \n" + "Versión: 1.0.0\n"
            + "Creado por: Gallegos Mota Victor Hugo y Carlos Cruz Rangel\n" + "Desarrollado con el \u2764 \n"
            + "Semestre 2022-1 \n" + "Contacto: 316160456@ciencias.unam.mx, carloscruzrangel@ciencias.unam.mx");
  }// GEN-LAST:event_aboutMenuItemActionPerformed

  private void jMenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemGuardarActionPerformed
    guardarArchivo();
  }// GEN-LAST:event_jMenuItemGuardarActionPerformed

  /**
   * Se abre el flujo de datos hacía el archivo "nomina.txt"
   */
  private void abrirArchivo() {
    File archivo = new File("nomina.txt");

    /**
     * Se verifica si existe el archivo, de no ser así se crea "nomina.txt", si el
     * archivo existe se abre el flujo hacia este.
     */
    if (!archivo.exists()) {
      trabajador = new Registros();
      jOptionPane1.showMessageDialog(null, "Se ha creado una nómina nueva");
    } else {
      try {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("nomina.txt"));
        trabajador = (Registros) ois.readObject();
        ois.close();
        jOptionPane1.showMessageDialog(null, "Se cargó la nómina con éxito");
      } catch (IOException e) {
        jOptionPane1.showMessageDialog(null, "Error: " + e.getMessage());
      } catch (ClassNotFoundException e) {
        jOptionPane1.showMessageDialog(null, "Error: " + e.getMessage());
      }
    }
  }

  /**
   * Se escriben los datos y se cierra el flujo en el archivo "nomina.txt"
   */
  public void guardarArchivo() {
    try {
      ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("nomina.txt"));
      fos.writeObject(trabajador);
      fos.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * El método buscar se utilizará en 3 casos: 1. En la opción "Buscar" del Menú
   * "Registro" 2. En el botón "Buscar siguiente" del cuadro de diálogo "Buscar"
   * 3. En el botón "Nueva búsqueda" del cuadro de diálogo "Buscar", esta opción
   * se activa cuando "Buscar siguiente" devuelve "No existen coincidencias"
   */
  public void buscar() {
    nombus = jOptionPane1.showInputDialog("Escriba el numero de trabajador a buscar: ");
    int numeroe = Integer.parseInt(nombus);

    regemp1 = trabajador.buscarParaCam(numeroe);

    l = trabajador.longitud();
    if (l == 0)
      jOptionPane1.showMessageDialog(null, "Lista vacía");

    else if (regemp1 == -1)
      jOptionPane1.showMessageDialog(null, "No se encontró ningún registro");
    else {
      jDialog1.setLocation(400, 200);
      jDialog1.setTitle("Buscar");
      jButton1.setText("Buscar siguiente");
      jLabelSueldoTotal.setVisible(true);
      jTextFieldSueldoTotal.setVisible(true);

      String numeroemp = String.valueOf(trabajador.registro(regemp1).getNumEmp());

      String sueldodia = String.valueOf(trabajador.registro(regemp1).getSueldoDiario());
      String diastra = String.valueOf(trabajador.registro(regemp1).getDiasLab());
      String sueldotot = String.valueOf(trabajador.registro(regemp1).getSueldoTotal());

      jTextFieldNumEmp.setText(numeroemp);

      jTextFieldNombre.setText(trabajador.registro(regemp1).getNombre());
      jTextFieldApellidopaterno.setText(trabajador.registro(regemp1).getApellidopaterno());
      jTextFieldApellidomaterno.setText(trabajador.registro(regemp1).getApellidomaterno());
      jTextFieldDireccion.setText(trabajador.registro(regemp1).getDireccion());
      jTextFieldCURP.setText(trabajador.registro(regemp1).getCurp());
      jTextFieldSueldoD.setText(sueldodia);
      jTextFieldDias.setText(diastra);
      jTextFieldSueldoTotal.setText(sueldotot);
      jTextFieldEmail.setText(trabajador.registro(regemp1).getEmail());
      jTextFieldAntiguedad.setText(trabajador.registro(regemp1).getAntiguedad());
      caso = 2;
      jDialog1.setVisible(true);
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Nomina().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem aboutMenuItem;
  private javax.swing.JMenu archivoMenu;
  private javax.swing.JMenu ayudaMenu;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButtonCancelar;
  private javax.swing.JDialog jDialog1;
  private javax.swing.JLabel jLabelDiasLab;
  private javax.swing.JLabel jLabelNombre;
  private javax.swing.JLabel jLabelApellidopaterno;
  private javax.swing.JLabel jLabelApellidomaterno;
  private javax.swing.JLabel jLabelDireccion;
  private javax.swing.JLabel jLabelNumEmp;

  private javax.swing.JLabel jLabelCURP;
  private javax.swing.JLabel jLabelSueldoDiario;
  private javax.swing.JLabel jLabelSueldoTotal;
  private javax.swing.JLabel jLabelEmail;
  private javax.swing.JLabel jLabelAntiguedad;
  private javax.swing.JLabel jLabelPuesto;
  private javax.swing.JMenuItem jMenuItemAltas;
  private javax.swing.JMenuItem jMenuItemBajas;
  private javax.swing.JMenuItem jMenuItemBuscar;
  private javax.swing.JMenuItem jMenuItemCambios;
  private javax.swing.JMenuItem jMenuItemGenerar;
  private javax.swing.JMenuItem jMenuItemGuardar;
  private javax.swing.JMenuItem jMenuItemMostrarTodos;
  private javax.swing.JOptionPane jOptionPane1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextArea1;
  private javax.swing.JTextField jTextFieldDias;
  private javax.swing.JTextField jTextFieldNombre;
  private javax.swing.JTextField jTextFieldApellidopaterno;
  private javax.swing.JTextField jTextFieldApellidomaterno;
  private javax.swing.JTextField jTextFieldDireccion;
  private javax.swing.JTextField jTextFieldNumEmp;

  private javax.swing.JTextField jTextFieldCURP;
  private javax.swing.JTextField jTextFieldSueldoD;
  private javax.swing.JTextField jTextFieldSueldoTotal;
  private javax.swing.JTextField jTextFieldEmail;
  private javax.swing.JTextField jTextFieldAntiguedad;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenu registroMenu;
  // End of variables declaration//GEN-END:variables

}