package Tampilan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TampilanAwal extends JFrame {

	protected static final String GenerateImage = null;
	private JPanel contentPane;
	private JTextField txtSourceAddress;
	private JTextField txtFinalAddress;
	private String alamat = "null";
	private String simpan = "null";

	
	   BufferedImage  image;
	   int width;
	   int height;

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
		setBounds(100, 100, 1021, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTrueColorTo = new JLabel("TRUE COLOR TO GRAYSCALE ");
		lblTrueColorTo.setForeground(new Color(255, 99, 71));
		lblTrueColorTo.setBackground(new Color(255, 99, 71));
		lblTrueColorTo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTrueColorTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrueColorTo.setBounds(260, 42, 455, 32);
		contentPane.add(lblTrueColorTo);
		
		JLabel lblSourceImage = new JLabel("SOURCE IMAGE");
		lblSourceImage.setBounds(190, 114, 100, 14);
		contentPane.add(lblSourceImage);
		
		JLabel lblFinalImage = new JLabel("FINAL IMAGE");
		lblFinalImage.setBounds(672, 114, 100, 14);
		contentPane.add(lblFinalImage);
		
		JLabel LblFS = new JLabel("");
		LblFS.setForeground(new Color(139, 69, 19));
		LblFS.setBackground(new Color(255, 255, 0));
		LblFS.setHorizontalAlignment(SwingConstants.CENTER);
		LblFS.setBounds(561, 139, 300, 254);
		contentPane.add(LblFS);
		
		JLabel LblIS = new JLabel("");
		LblIS.setHorizontalAlignment(SwingConstants.CENTER);
		LblIS.setBounds(79, 139, 300, 254);
		contentPane.add(LblIS);
		
		JButton btnConvert = new JButton("CONVERT");
		btnConvert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				alamat = txtSourceAddress.getText();			
				simpan = txtFinalAddress.getText();
				
	
				ImageIcon gambarAwal = new ImageIcon (alamat);				
				Image ga = gambarAwal.getImage(); // transform it 
				Image newimg = ga.getScaledInstance(300, 254,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
				gambarAwal = new ImageIcon(newimg);  // transform it back
				LblIS.setIcon(gambarAwal);
				
				try {
			         //File input = new File("F:\\College\\5th Semester\\Pengolahan Citra Digital\\Coklat.jpg");
					
					 File input = new File(alamat);
			         image = ImageIO.read(input);
			         width = image.getWidth();
			         height = image.getHeight();
			         
			         for(int i=0; i<height; i++) {
			         
			            for(int j=0; j<width; j++) {
			            
			               Color c = new Color(image.getRGB(j, i));
			               int red = (int)(c.getRed() * 0.299);
			               int green = (int)(c.getGreen() * 0.587);
			               int blue = (int)(c.getBlue() *0.114);
			               Color newColor = new Color(red+green+blue, red+green+blue,red+green+blue);
			               
			               image.setRGB(j,i,newColor.getRGB());
			            }
			         }
			         
			         //File ouptut = new File("F:\\College\\5th Semester\\Pengolahan Citra Digital\\TampilanHitamPutih.jpg");
			         File ouptut = new File(simpan);
			         ImageIO.write(image, "jpg", ouptut);
			         
					 ImageIcon gambarAkhir = new ImageIcon (simpan);
					 Image gak = gambarAkhir.getImage(); // transform it 
					 Image newimg2 = gak.getScaledInstance(300, 254,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
					 gambarAkhir = new ImageIcon(newimg2);  // transform it back
					 LblFS.setIcon(gambarAkhir);
			      } catch (Exception e) {}

			}
		});
		btnConvert.setBounds(406, 256, 118, 23);
		contentPane.add(btnConvert);
		
		txtSourceAddress = new JTextField();
		txtSourceAddress.addMouseListener(new MouseAdapter() {
		});

		txtSourceAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtSourceAddress.setBounds(79, 428, 300, 45);
		contentPane.add(txtSourceAddress);
		txtSourceAddress.setColumns(10);
		
		txtFinalAddress = new JTextField();
		txtFinalAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtFinalAddress.setColumns(10);
		txtFinalAddress.setBounds(561, 428, 300, 45);
		contentPane.add(txtFinalAddress);
		
		JButton btnNewButton = new JButton("LOAD IMAGE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				alamat = txtSourceAddress.getText();			
				
				ImageIcon gambarAwal = new ImageIcon (alamat);				
				Image ga = gambarAwal.getImage(); // transform it 
				Image newimg = ga.getScaledInstance(300, 254,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
				gambarAwal = new ImageIcon(newimg);  // transform it back
				LblIS.setIcon(gambarAwal);
							
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(406, 217, 118, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ABOUT");
		btnNewButton_1.setBounds(406, 480, 118, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("SOURCE ADDRESS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(79, 404, 300, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTargetAddress = new JLabel("TARGET ADDRESS");
		lblTargetAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblTargetAddress.setBounds(561, 404, 300, 14);
		contentPane.add(lblTargetAddress);
		

		

		
		
	}
}
