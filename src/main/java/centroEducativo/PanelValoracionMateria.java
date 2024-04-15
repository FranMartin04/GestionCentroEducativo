package centroEducativo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import centroEducativo.controladores.ControladorEstudiante;
import centroEducativo.controladores.ControladorMateria;
import centroEducativo.controladores.ControladorProfesor;
import centroEducativo.entities.Estudiante;
import centroEducativo.entities.Materia;
import centroEducativo.entities.Profesor;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class PanelValoracionMateria extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JList<Estudiante> listANS; // Declara listANS como una variable miembro

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PanelValoracionMateria frame = new PanelValoracionMateria();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public PanelValoracionMateria() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 661, 540);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{0, 0};
        gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
        gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        GridBagConstraints gbc_panel_1 = new GridBagConstraints();
        gbc_panel_1.insets = new Insets(0, 0, 5, 0);
        gbc_panel_1.fill = GridBagConstraints.BOTH;
        gbc_panel_1.gridx = 0;
        gbc_panel_1.gridy = 0;
        contentPane.add(panel_1, gbc_panel_1);
        GridBagLayout gbl_panel_1 = new GridBagLayout();
        gbl_panel_1.columnWidths = new int[]{0, 0, 0};
        gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0};
        gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_1.setLayout(gbl_panel_1);

        JLabel lblNewLabel = new JLabel("Materia:");
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 0;
        panel_1.add(lblNewLabel, gbc_lblNewLabel);
        JComboBox<Materia> jcbMateria = new JComboBox<>();
        List<Materia> lista = (List<Materia>) ControladorMateria.getInstance().findAll();
        for (Materia materia : lista) {
            jcbMateria.addItem(materia);
        }
        GridBagConstraints gbc_jcbMateria = new GridBagConstraints();
        gbc_jcbMateria.gridwidth = 3;
        gbc_jcbMateria.insets = new Insets(0, 0, 5, 0);
        gbc_jcbMateria.fill = GridBagConstraints.HORIZONTAL;
        gbc_jcbMateria.gridx = 1;
        gbc_jcbMateria.gridy = 0;
        panel_1.add(jcbMateria, gbc_jcbMateria);

        JLabel lblNewLabel_1 = new JLabel("Profesor:");
        GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
        gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_1.gridx = 0;
        gbc_lblNewLabel_1.gridy = 1;
        panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);

        JComboBox<Profesor> jcbProfesor = new JComboBox<>();
        List<Profesor> liProfesor = (List<Profesor>) ControladorProfesor.getInstance().findAll();
        for (Profesor profesor : liProfesor) {
            jcbProfesor.addItem(profesor);
        }
        GridBagConstraints gbc_jcbProfesor = new GridBagConstraints();
        gbc_jcbProfesor.gridwidth = 3;
        gbc_jcbProfesor.insets = new Insets(0, 0, 5, 0);
        gbc_jcbProfesor.fill = GridBagConstraints.HORIZONTAL;
        gbc_jcbProfesor.gridx = 1;
        gbc_jcbProfesor.gridy = 1;
        panel_1.add(jcbProfesor, gbc_jcbProfesor);

        JLabel lblNewLabel_2 = new JLabel("Nota:");
        GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2.gridx = 0;
        gbc_lblNewLabel_2.gridy = 2;
        panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

        JComboBox<Integer> jcbNota = new JComboBox<>();
        for (int i = 0; i <= 10; i++) {
            jcbNota.addItem(i);
        }

        GridBagConstraints gbc_jcbNota = new GridBagConstraints();
        gbc_jcbNota.gridwidth = 3;
        gbc_jcbNota.insets = new Insets(0, 0, 5, 0);
        gbc_jcbNota.fill = GridBagConstraints.HORIZONTAL;
        gbc_jcbNota.gridx = 1;
        gbc_jcbNota.gridy = 2;
        panel_1.add(jcbNota, gbc_jcbNota);

        JButton btnActualiza = new JButton("Boton actualizar alumnado");
        GridBagConstraints gbc_btnActualiza = new GridBagConstraints();
        gbc_btnActualiza.gridx = 3;
        gbc_btnActualiza.gridy = 3;
        panel_1.add(btnActualiza, gbc_btnActualiza);
        btnActualiza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la materia, el profesor y la valoración de la materia seleccionados
                Materia materiaSeleccionada = (Materia) jcbMateria.getSelectedItem();
                Profesor profesorSeleccionado = (Profesor) jcbProfesor.getSelectedItem();
                int valoracionMateriaSeleccionada = (int) jcbNota.getSelectedItem(); // Cambiado a int

                // Llamar al método en el controlador de estudiantes para obtener la lista de estudiantes
                List<Estudiante> estudiantes = (List<Estudiante>) ControladorEstudiante.getInstance().cargarEstudiante(materiaSeleccionada, profesorSeleccionado, valoracionMateriaSeleccionada);

                // Actualizar el modelo del JList listANS con la lista de estudiantes
                DefaultListModel<Estudiante> modeloListANS = new DefaultListModel<>();
                for (Estudiante estudiante : estudiantes) {
                    modeloListANS.addElement(estudiante);
                }
                listANS.setModel(modeloListANS);
            }
        });

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.insets = new Insets(0, 0, 5, 0);
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 0;
        gbc_panel.gridy = 1;
        contentPane.add(panel, gbc_panel);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_panel.rowHeights = new int[]{0, 0, 0};
        gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_panel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel.setLayout(gbl_panel);

        JLabel lblNewLabel_3 = new JLabel("Alumnado no seleccionado");
        GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
        gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_3.gridx = 0;
        gbc_lblNewLabel_3.gridy = 0;
        panel.add(lblNewLabel_3, gbc_lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Alumnado seleccionado");
        GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
        gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_4.gridx = 2;
        gbc_lblNewLabel_4.gridy = 0;
        panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

        listANS = new JList<>(); // Inicializa listANS
        GridBagConstraints gbc_listANS = new GridBagConstraints();
        gbc_listANS.insets = new Insets(0, 0, 0, 5);
        gbc_listANS.fill = GridBagConstraints.BOTH;
        gbc_listANS.gridx = 0;
        gbc_listANS.gridy = 1;
        panel.add(listANS, gbc_listANS);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 255));
        GridBagConstraints gbc_panel_2 = new GridBagConstraints();
        gbc_panel_2.insets = new Insets(0, 0, 0, 5);
        gbc_panel_2.fill = GridBagConstraints.BOTH;
        gbc_panel_2.gridx = 1;
        gbc_panel_2.gridy = 1;
        panel.add(panel_2, gbc_panel_2);
        GridBagLayout gbl_panel_2 = new GridBagLayout();
        gbl_panel_2.columnWidths = new int[]{0, 0};
        gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
        gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_2.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        panel_2.setLayout(gbl_panel_2);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(255, 255, 255));
        GridBagConstraints gbc_panel_4 = new GridBagConstraints();
        gbc_panel_4.insets = new Insets(0, 0, 5, 0);
        gbc_panel_4.fill = GridBagConstraints.BOTH;
        gbc_panel_4.gridx = 0;
        gbc_panel_4.gridy = 0;
        panel_2.add(panel_4, gbc_panel_4);

        JButton btnTodos = new JButton("<<");
        GridBagConstraints gbc_btnTodos = new GridBagConstraints();
        gbc_btnTodos.insets = new Insets(0, 0, 5, 0);
        gbc_btnTodos.gridx = 0;
        gbc_btnTodos.gridy = 1;
        panel_2.add(btnTodos, gbc_btnTodos);

        JButton btnUnoIzquierda = new JButton("<");
        btnUnoIzquierda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        GridBagConstraints gbc_btnUnoIzquierda = new GridBagConstraints();
        gbc_btnUnoIzquierda.insets = new Insets(0, 0, 5, 0);
        gbc_btnUnoIzquierda.gridx = 0;
        gbc_btnUnoIzquierda.gridy = 2;
        panel_2.add(btnUnoIzquierda, gbc_btnUnoIzquierda);

        JButton btnUnoDerecha = new JButton(">");
        GridBagConstraints gbc_btnUnoDerecha = new GridBagConstraints();
        gbc_btnUnoDerecha.insets = new Insets(0, 0, 5, 0);
        gbc_btnUnoDerecha.gridx = 0;
        gbc_btnUnoDerecha.gridy = 3;
        panel_2.add(btnUnoDerecha, gbc_btnUnoDerecha);

        JButton btnTodosDerecha = new JButton(">>");
        GridBagConstraints gbc_btnTodosDerecha = new GridBagConstraints();
        gbc_btnTodosDerecha.insets = new Insets(0, 0, 5, 0);
        gbc_btnTodosDerecha.gridx = 0;
        gbc_btnTodosDerecha.gridy = 4;
        panel_2.add(btnTodosDerecha, gbc_btnTodosDerecha);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 255, 255));
        GridBagConstraints gbc_panel_3 = new GridBagConstraints();
        gbc_panel_3.fill = GridBagConstraints.BOTH;
        gbc_panel_3.gridx = 0;
        gbc_panel_3.gridy = 5;
        panel_2.add(panel_3, gbc_panel_3);

        JList listAS = new JList();
        GridBagConstraints gbc_listAS = new GridBagConstraints();
        gbc_listAS.fill = GridBagConstraints.BOTH;
        gbc_listAS.gridx = 2;
        gbc_listAS.gridy = 1;
        panel.add(listAS, gbc_listAS);

        JButton btnGuardar = new JButton("Guardar las notas de todos los alumnos seleccionados");
        GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
        gbc_btnGuardar.anchor = GridBagConstraints.EAST;
        gbc_btnGuardar.gridx = 0;
        gbc_btnGuardar.gridy = 2;
        contentPane.add(btnGuardar, gbc_btnGuardar);
    }
}
