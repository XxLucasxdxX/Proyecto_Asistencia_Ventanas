
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */

/**
 *
 * @author lzamo
 */
public class MostrarCursos extends javax.swing.JFrame {

    private static asistenciaColegio asistenciaColegioAux;
    private Cursos cursoSeleccionado;
    
    /**
     * Creates new form MostrarCursos1
     */
    public MostrarCursos(asistenciaColegio asistenciaColegioAux) {
        initComponents();
        this.asistenciaColegioAux = asistenciaColegioAux; // Obtiene la instancia existente
        mostrarNombresDeCursosEnComboBox();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        seleccion = new javax.swing.JLabel();
        mostrarNombresCursos = new javax.swing.JComboBox<>();
        ver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        volver.setText("Volver");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(volver)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addComponent(volver)
                .addGap(91, 91, 91))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 450));

        seleccion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        seleccion.setText("Seleccione curso");
        background.add(seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 210, 50));

        mostrarNombresCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarNombresCursosActionPerformed(evt);
            }
        });
        background.add(mostrarNombresCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 160, -1));

        ver.setText("Ver");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        background.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombre", "Apellido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 550, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void mostrarNombresDeCursosEnComboBox() {
        mostrarNombresCursos.removeAllItems();
        ArrayList<Cursos> cursos = asistenciaColegio.obtenerCopiaCursos();

        for (Cursos curso : cursos) {
            mostrarNombresCursos.addItem(curso.getNombre());
        }
    }
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        Menu irMenu = null;
        try {
            irMenu = new Menu();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MostrarCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        irMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverMouseClicked

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // Obtener el nombre del curso seleccionado en el ComboBox
        String nombreCursoSeleccionado = (String) mostrarNombresCursos.getSelectedItem();

        // Buscar el curso correspondiente en la lista de cursos
        for (Cursos curso : asistenciaColegio.obtenerCopiaCursos()) {
            if (curso.getNombre().equals(nombreCursoSeleccionado)) {
                cursoSeleccionado = curso;
                break;
            }
        }

        if (cursoSeleccionado != null) {
            // Obtener la lista de alumnos del curso seleccionado
            HashMap<String, Alumnos> alumnos = cursoSeleccionado.obtenerCopiaAlumnos();

            // Llenar la tabla con los datos de los alumnos
            DefaultTableModel model = (DefaultTableModel) tablaAlumnos.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos

            for (Alumnos alumno : alumnos.values()) {
                Object[] rowData = {alumno.getRut(), alumno.getNombre(), alumno.getApellido()};
                model.addRow(rowData);
            }
        }
    }//GEN-LAST:event_verActionPerformed

    private void mostrarNombresCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarNombresCursosActionPerformed

    }//GEN-LAST:event_mostrarNombresCursosActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarCursos(asistenciaColegioAux).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mostrarNombresCursos;
    private javax.swing.JLabel seleccion;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JButton ver;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

}
