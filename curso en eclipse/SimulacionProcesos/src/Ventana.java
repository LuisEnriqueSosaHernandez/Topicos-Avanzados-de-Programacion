import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	
	JProgressBar BarExcel;
	JProgressBar BarWord;
	JProgressBar BarPaint;
	HiloExcel hExcel;
	HiloWord hWord;
	HiloPaint hPaint;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Simulacion de procesos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProcesoWord = new JLabel("Proceso Word");
		lblProcesoWord.setBounds(10, 11, 75, 14);
		contentPane.add(lblProcesoWord);
		
		JLabel lblProcesoExcel = new JLabel("Proceso Excel");
		lblProcesoExcel.setBounds(10, 66, 66, 14);
		contentPane.add(lblProcesoExcel);
		
		JLabel lblProcesoPaint = new JLabel("Proceso Paint");
		lblProcesoPaint.setBounds(10, 114, 66, 14);
		contentPane.add(lblProcesoPaint);
		
		 BarWord = new JProgressBar();
		BarWord.setBounds(93, 11, 243, 25);
		contentPane.add(BarWord);
		
		 BarExcel = new JProgressBar();
		BarExcel.setBounds(93, 66, 243, 25);
		contentPane.add(BarExcel);
		
		 BarPaint = new JProgressBar();
		BarPaint.setBounds(93, 114, 243, 25);
		contentPane.add(BarPaint);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			hExcel=new HiloExcel(BarExcel);
			Thread hE=new Thread(hExcel,"Excel");
			hWord=new HiloWord(BarWord);
			Thread hW=new Thread(hWord,"Word");
			hPaint=new HiloPaint(BarPaint);
			Thread hP=new Thread(hPaint,"Paint");
			hE.start();
			hW.start();
			hP.start();
			BarExcel.setForeground(Color.GREEN);
			BarWord.setForeground(Color.GREEN);
			BarPaint.setForeground(Color.GREEN);
			
			
			}
		});
		btnIniciar.setBounds(38, 180, 89, 23);
		contentPane.add(btnIniciar);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			HiloExcel.finalizado=true;
			HiloWord.finalizado=true;
			HiloPaint.finalizado=true;
			}
		});
		btnFinalizar.setBounds(259, 180, 89, 23);
		contentPane.add(btnFinalizar);
	}
}
