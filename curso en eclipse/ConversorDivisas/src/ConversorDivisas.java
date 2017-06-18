import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorDivisas extends JFrame {

	private JPanel pnlContent;
	private JTextField txtDolares;
	private JTextField txtEuros;
	private JTextField txtPesos;
	double pesos=0.0,dolares=0.0,euros=0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDivisas frame = new ConversorDivisas();
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
	public ConversorDivisas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConversorDivisas.class.getResource("/Imagenes/money162.png")));
		setTitle("Conversor de Divisas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pnlContent = new JPanel();
		pnlContent.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlContent);
		pnlContent.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 30, 28, -6);
		pnlContent.add(lblNewLabel);
		
		JLabel lblDolares = new JLabel("Dolares");
		lblDolares.setBounds(20, 11, 46, 14);
		pnlContent.add(lblDolares);
		
		txtDolares = new JTextField();
		txtDolares.setBounds(76, 8, 86, 20);
		pnlContent.add(txtDolares);
		txtDolares.setColumns(10);
		
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setBounds(20, 36, 46, 14);
		pnlContent.add(lblEuros);
		
		txtEuros = new JTextField();
		txtEuros.setBounds(76, 33, 86, 20);
		pnlContent.add(txtEuros);
		txtEuros.setColumns(10);
		
		JLabel lblPesos = new JLabel("Pesos");
		lblPesos.setBounds(20, 61, 46, 14);
		pnlContent.add(lblPesos);
		
		txtPesos = new JTextField();
		txtPesos.setEnabled(false);
		txtPesos.setBounds(76, 58, 136, 20);
		pnlContent.add(txtPesos);
		txtPesos.setColumns(10);
		
		JButton btnDolaresAPesos = new JButton("Dolares a Pesos");
		btnDolaresAPesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try{
				dolares=Double.parseDouble(txtDolares.getText());
			    pesos=dolares*12.1896;
			    txtPesos.setText(""+pesos);
			}catch(Exception e1){
				JOptionPane.showMessageDialog(null, "Error de datos");
			}
			}
		});
		btnDolaresAPesos.setIcon(new ImageIcon(ConversorDivisas.class.getResource("/Imagenes/money1.png")));
		btnDolaresAPesos.setBounds(222, 7, 126, 23);
		pnlContent.add(btnDolaresAPesos);
		
		JButton btnEurosAPesos = new JButton("Euros a Pesos");
		btnEurosAPesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					euros=Double.parseDouble(txtEuros.getText());
				    pesos=euros*15.80760;
				    txtPesos.setText(""+pesos);
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Error de datos");
				}
			}
		});
		btnEurosAPesos.setIcon(new ImageIcon(ConversorDivisas.class.getResource("/Imagenes/euro29.png")));
		btnEurosAPesos.setBounds(222, 57, 126, 23);
		pnlContent.add(btnEurosAPesos);
	}
}
