package centroEducativo;

import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

public class PanelMateria extends JPanel {

	private static final long serialVersionUID = 1L;

	JPanel panelEstudiantes;

	/**
	 * Create the panel.
	 */
	public PanelMateria() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0};
		gridBagLayout.columnWeights = new double[]{1.0};
		setLayout(gridBagLayout);
		
		JPanel panelProfesorMateria = new JPanel();
		GridBagConstraints gbc_panelProfesorMateria = new GridBagConstraints();
		gbc_panelProfesorMateria.insets = new Insets(0, 0, 5, 0);
		gbc_panelProfesorMateria.fill = GridBagConstraints.BOTH;
		gbc_panelProfesorMateria.gridx = 0;
		gbc_panelProfesorMateria.gridy = 0;
		add(panelProfesorMateria, gbc_panelProfesorMateria);
		GridBagLayout gbl_panelProfesorMateria = new GridBagLayout();
		gbl_panelProfesorMateria.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelProfesorMateria.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panelProfesorMateria.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelProfesorMateria.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelProfesorMateria.setLayout(gbl_panelProfesorMateria);
		
		JLabel lblNewLabel = new JLabel("Materia:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panelProfesorMateria.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox jcbMateria = new JComboBox();
		GridBagConstraints gbc_jcbMateria = new GridBagConstraints();
		gbc_jcbMateria.gridwidth = 2;
		gbc_jcbMateria.insets = new Insets(0, 0, 5, 5);
		gbc_jcbMateria.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMateria.gridx = 1;
		gbc_jcbMateria.gridy = 0;
		panelProfesorMateria.add(jcbMateria, gbc_jcbMateria);
		
		
		JLabel lblNewLabel_1 = new JLabel("Profesor:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panelProfesorMateria.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		
		JButton btnRefrescar = new JButton("Actualizar alumno");
		btnRefrescar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JComboBox jcbProfesor = new JComboBox();
		GridBagConstraints gbc_jcbProfesor = new GridBagConstraints();
		gbc_jcbProfesor.gridwidth = 2;
		gbc_jcbProfesor.insets = new Insets(0, 0, 5, 5);
		gbc_jcbProfesor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbProfesor.gridx = 1;
		gbc_jcbProfesor.gridy = 1;
		panelProfesorMateria.add(jcbProfesor, gbc_jcbProfesor);
		
		JLabel lblNewLabel_2 = new JLabel("Nota:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panelProfesorMateria.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JComboBox jcbNota = new JComboBox();
		GridBagConstraints gbc_jcbNota = new GridBagConstraints();
		gbc_jcbNota.gridwidth = 2;
		gbc_jcbNota.insets = new Insets(0, 0, 5, 5);
		gbc_jcbNota.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbNota.gridx = 1;
		gbc_jcbNota.gridy = 2;
		panelProfesorMateria.add(jcbNota, gbc_jcbNota);
		GridBagConstraints gbc_btnRefrescar = new GridBagConstraints();
		gbc_btnRefrescar.gridx = 2;
		gbc_btnRefrescar.gridy = 3;
		panelProfesorMateria.add(btnRefrescar, gbc_btnRefrescar);
		
		panelEstudiantes = new JPanel();
		GridBagConstraints gbc_panelEstudiantes = new GridBagConstraints();
		gbc_panelEstudiantes.weighty = 1.0;
		gbc_panelEstudiantes.insets = new Insets(0, 0, 5, 0);
		gbc_panelEstudiantes.fill = GridBagConstraints.BOTH;
		gbc_panelEstudiantes.gridx = 0;
		gbc_panelEstudiantes.gridy = 1;
		add(panelEstudiantes, gbc_panelEstudiantes);
		GridBagLayout gbl_panelEstudiantes = new GridBagLayout();
		gbl_panelEstudiantes.columnWidths = new int[]{0};
		gbl_panelEstudiantes.rowHeights = new int[]{0};
		gbl_panelEstudiantes.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelEstudiantes.rowWeights = new double[]{Double.MIN_VALUE};
		panelEstudiantes.setLayout(gbl_panelEstudiantes);
		
		JButton btnGuardar = new JButton("Guardar las notas de todos los alumnos seleccionados");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.gridx = 0;
		gbc_btnGuardar.gridy = 2;
		add(btnGuardar, gbc_btnGuardar);

		
	}

	
	
}













