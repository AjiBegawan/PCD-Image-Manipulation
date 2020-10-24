package Tampilan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class TampilanAwal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TampilanAwal frame = new TampilanAwal();
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
	public TampilanAwal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ColorChooser.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(102, 204, 255));
		menu.setBounds(0, 0, 120, 461);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JLabel lblmenu = new JLabel("Menu");
		lblmenu.setBackground(UIManager.getColor("text"));
		lblmenu.setForeground(UIManager.getColor("Button.disabledShadow"));
		lblmenu.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblmenu.setBounds(39, 11, 46, 14);
		menu.add(lblmenu);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAbout.setBounds(15, 427, 89, 23);
		menu.add(btnAbout);
		
		JButton btnRGBtoGray = new JButton("RGB to Gray");
		btnRGBtoGray.setBounds(5, 50, 109, 23);
		menu.add(btnRGBtoGray);
		btnRGBtoGray.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JPanel panel = new JPanel();
		panel.setForeground(UIManager.getColor("text"));
		panel.setBackground(new Color(245, 245, 220));
		panel.setBounds(122, 0, 862, 461);
		contentPane.add(panel);
		
		JLabel lblRGBtoGray = new JLabel("True Color to Gray");
		lblRGBtoGray.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		panel.add(lblRGBtoGray);
	}
}
