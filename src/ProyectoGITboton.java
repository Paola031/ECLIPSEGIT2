import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProyectoGITboton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoGITboton frame = new ProyectoGITboton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProyectoGITboton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMensaje = new JButton("Mensaje");
		btnMensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola Git");
			}
		});
		btnMensaje.setBounds(157, 110, 85, 21);
		contentPane.add(btnMensaje);
		
		JButton btnNewButton = new JButton("Mensaje2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola Soy Benjamin Antonio");
			}
		});
		btnNewButton.setBounds(157, 147, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnMensajeEclipse = new JButton("Mensaje 3");
		btnMensajeEclipse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola desde rama de Eclipsse");
			}
		});
		btnMensajeEclipse.setBounds(157, 186, 89, 23);
		contentPane.add(btnMensajeEclipse);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Hola boton con Merge");
			}
		});
		btnNewButton_1.setBounds(157, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
