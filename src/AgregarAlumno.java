
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */

/**
 *
 * @author lzamo
 */
public class AgregarAlumno extends javax.swing.JFrame {
    
    
    private static asistenciaColegio asistenciaColegioAux;
    private Alumnos alumnoAModificar;
    /**
     * Creates new form AgregarAlumno
     */
    public AgregarAlumno(asistenciaColegio asistenciaColegioAux) {
        this.asistenciaColegioAux = asistenciaColegioAux;
        initComponents();
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
        volver3 = new javax.swing.JButton();
        textoCurso = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        textoApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        textoRut1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        volver3.setText("Volver");
        volver3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volver3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(volver3)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(volver3)
                .addGap(95, 95, 95))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 450));

        textoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCursoActionPerformed(evt);
            }
        });
        background.add(textoCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 200, -1));

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        background.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, -1));
        background.add(textoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 200, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Agregar Alumno");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 280, 50));

        jLabel2.setText("Rut");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 30, 20));

        jLabel3.setText("Nombre");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel4.setText("Apellido");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        eliminar.setText("Eliminar");
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        background.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));
        background.add(textoRut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, -1));

        jLabel5.setText("Curso");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        Agregar.setText("Agregar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        background.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        background.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 90, -1));

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

    private void volver3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver3MouseClicked
        Menu irMenu = null;
        try {
            irMenu = new Menu();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MostrarCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        irMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volver3MouseClicked

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        // Obtener los valores ingresados en los campos de texto
        String nombreCurso = textoCurso.getText().trim();
        String rutAlumno = textoRut1.getText().trim();

        if (!nombreCurso.isEmpty() && !rutAlumno.isEmpty()) {
            // Buscar el curso por nombre utilizando buscarCursoNombre
            Cursos cursoEncontrado = asistenciaColegioAux.buscarCursoNombre(nombreCurso);

            if (cursoEncontrado != null) {
                // Preguntar al usuario si está seguro de eliminar al alumno
                int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar al alumno?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    // Eliminar al alumno del curso
                    cursoEncontrado.eliminarAlumno(rutAlumno);
                    JOptionPane.showMessageDialog(this, "Alumno eliminado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el curso.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarMouseClicked
    private boolean agregarAlumno(String nombreCurso, String nombreAlumno, String apellidoAlumno, String rutAlumno) {
        // Buscar el curso por nombre utilizando buscarCursoNombre
        Cursos cursoEncontrado = asistenciaColegioAux.buscarCursoNombre(nombreCurso);

        if (cursoEncontrado != null) {
            // Verificar si el alumno ya existe en el curso
            if (cursoEncontrado.obtenerCopiaAlumnos().containsKey(rutAlumno)) {
                return false;
            }

            // Si el alumno no existe, agrégalo
            cursoEncontrado.agregarAlumno(rutAlumno, nombreAlumno, apellidoAlumno);
            return true;
        } else {
            // No se encontró el curso
            return false;
        }
    }
    
    private void textoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCursoActionPerformed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
            // Obtener los valores ingresados en los campos de texto
        String nombreCurso = textoCurso.getText().trim();
        String nombreAlumno = textoNombre.getText().trim();
        String apellidoAlumno = textoApellido.getText().trim();
        String rutAlumno = textoRut1.getText().trim();

        if (!nombreCurso.isEmpty() && !nombreAlumno.isEmpty() && !apellidoAlumno.isEmpty()) {
            if (agregarAlumno(nombreCurso, nombreAlumno, apellidoAlumno, rutAlumno)) {
                JOptionPane.showMessageDialog(this, "Alumno agregado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo agregar el alumno.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregarMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        // Obtener el Rut del alumno que se va a modificar
        String rutAlumno = textoRut1.getText().trim();
        String cursoAlumno = textoCurso.getText().trim();

        // Buscar el alumno en la lista de alumnos del curso actual
        Alumnos alumnoAux = asistenciaColegioAux.obtenerAlumno(cursoAlumno, rutAlumno);

        if (alumnoAux != null) {
            // Crear una instancia de ModificarDatos y pasar los datos del alumno a la nueva ventana
            ModificarDatos irModificarDatos = new ModificarDatos(asistenciaColegioAux, alumnoAux);
            irModificarDatos.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado un curso.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ModificarMouseClicked

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
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAlumno(asistenciaColegioAux).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Modificar;
    private javax.swing.JPanel background;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoCurso;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoRut1;
    private javax.swing.JButton volver3;
    // End of variables declaration//GEN-END:variables

}
