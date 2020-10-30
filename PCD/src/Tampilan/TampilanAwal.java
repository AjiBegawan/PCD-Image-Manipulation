package Tampilan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.filechooser.*;
import java.awt.image.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;




public class TampilanAwal extends JFrame {

	protected static final String GenerateImage = null;
	private JPanel contentPane;
	private JTextField txtSourceAddress;
	private JTextField txtFinalAddress;
	private String alamat = "null";
	private String simpan = "null";

	JFileChooser fc;
	
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
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ColorChooser.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setForeground(new Color(0, 0, 0));
		menu.setBackground(new Color(30, 144, 255));
		menu.setBounds(0, 0, 150, 681);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JLabel lblmenu = new JLabel("Menu");
		lblmenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblmenu.setBackground(UIManager.getColor("text"));
		lblmenu.setForeground(new Color(255, 255, 255));
		lblmenu.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblmenu.setBounds(0, 0, 150, 60);
		menu.add(lblmenu);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Kelompok 4\nDicky Febrian Dwiputra 3411181097\nAde Ridwan Nugraha 3411181117\nIndiarto Aji Begawan 3411181114");
			}
		});
		btnAbout.setBounds(10, 647, 110, 23);
		menu.add(btnAbout);
		
		JButton btnRGBtoGray = new JButton("RGB to Gray");
		btnRGBtoGray.setForeground(new Color(0, 0, 0));
		btnRGBtoGray.setBackground(new Color(255, 215, 0));
		btnRGBtoGray.setBounds(0, 70, 150, 30);
		menu.add(btnRGBtoGray);
		btnRGBtoGray.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnBrightness = new JButton("Brightness");
		btnBrightness.setForeground(new Color(0, 0, 0));
		btnBrightness.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBrightness.setBackground(new Color(255, 215, 0));
		btnBrightness.setBounds(0, 100, 150, 30);
		menu.add(btnBrightness);
		
		JButton btnBW = new JButton("B & W");
		btnBW.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBW.setForeground(new Color(0, 0, 0));
		btnBW.setBackground(new Color(255, 215, 0));
		btnBW.setBounds(0, 160, 150, 30);
		menu.add(btnBW);
		
		JButton btnNegatif = new JButton("Negatif Film");
		btnNegatif.setForeground(new Color(0, 0, 0));
		btnNegatif.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNegatif.setBackground(new Color(255, 215, 0));
		btnNegatif.setBounds(0, 130, 150, 30);
		menu.add(btnNegatif);
		
		JButton btnKontras = new JButton("Kontras");
		btnKontras.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnKontras.setForeground(new Color(0, 0, 0));
		btnKontras.setBackground(new Color(255, 215, 0));
		btnKontras.setBounds(0, 190, 150, 30);
		menu.add(btnKontras);
		
		JPanel panel = new JPanel();
		panel.setForeground(UIManager.getColor("text"));
		panel.setBackground(Color.WHITE);
		panel.setBounds(149, 0, 915, 681);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel l = new JLabel("");
		
		JPanel source = new JPanel();
		source.setBackground(new Color(255, 255, 255));
		source.setBounds(40, 104, 400, 400);
		panel.add(source);
		
		JLabel LblIS = new JLabel("");
		LblIS.setHorizontalAlignment(SwingConstants.CENTER);
		LblIS.setBounds(0, 0, 320, 240);
		source.add(LblIS);
		
		txtSourceAddress = new JTextField();
		txtSourceAddress.addMouseListener(new MouseAdapter() {
		});

		txtSourceAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtSourceAddress.setBounds(40, 604, 400, 45);
		txtSourceAddress.setColumns(10);
		panel.add(txtSourceAddress);
		
		txtFinalAddress = new JTextField();
		txtFinalAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtFinalAddress.setColumns(10);
		txtFinalAddress.setBounds(475, 604, 400, 45);
		panel.add(txtFinalAddress);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(30, 144, 255), 2));
		panel_1.setBounds(-22, 0, 972, 55);
		panel.add(panel_1);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		
		JLabel lblRGBtoGray = new JLabel("RGB to Grayscale");
		lblRGBtoGray.setHorizontalAlignment(SwingConstants.CENTER);
		lblRGBtoGray.setBounds(24, 0, 205, 55);
		panel_1.add(lblRGBtoGray);
		lblRGBtoGray.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel result = new JPanel();
		result.setBackground(new Color(255, 255, 255));
		result.setBounds(475, 104, 400, 400);
		panel.add(result);
		
		JLabel LblFS = new JLabel("");
		LblFS.setForeground(new Color(139, 69, 19));
		LblFS.setBackground(new Color(255, 255, 0));
		LblFS.setHorizontalAlignment(SwingConstants.CENTER);
		LblFS.setBounds(0, 0, 320, 240);
		result.add(LblFS);
		
		JButton btnBrowse = new JButton("Browse Image Address");
		btnBrowse.setBackground(new Color(60, 179, 113));
		btnBrowse.setForeground(Color.WHITE);
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == btnBrowse) {
					 JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
					  
			            // invoke the showsOpenDialog function to show the save dialog 
			            int r = j.showOpenDialog(null); 
			  
			            // if the user selects a file 
			            if (r == JFileChooser.APPROVE_OPTION) 
			  
			            { 
			                // set the label to the path of the selected file 
			            	txtSourceAddress.setText(j.getSelectedFile().getAbsolutePath());
			            	
			            	// set the label to the path of the selected file with add string "black" in the end of the filename
			            	StringBuffer str = new StringBuffer(txtSourceAddress.getText());
			            	str.insert(str.length()-4,"Black");
			            	String str2 = str.toString();
			            	txtFinalAddress.setText(str2);
			            } 
			            // if the user cancelled the operation 
			            else
			                l.setText("the user cancelled the operation"); 
			            }
			}
		});
		btnBrowse.setBounds(40, 540, 175, 35);
		panel.add(btnBrowse);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setForeground(new Color(255, 255, 255));
		btnConvert.setBackground(new Color(30, 144, 255));
		btnConvert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				alamat = txtSourceAddress.getText();			
				simpan = txtFinalAddress.getText();
				
	
				ImageIcon gambarAwal = new ImageIcon (alamat);				
				Image ga = gambarAwal.getImage(); // transform it 
				Image newimg = ga.getScaledInstance(400, 400,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
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
					 Image newimg2 = gak.getScaledInstance(400, 400,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
					 gambarAkhir = new ImageIcon(newimg2);  // transform it back
					 LblFS.setIcon(gambarAkhir);
			      } catch (Exception e) {}

			}
		});
		btnConvert.setBounds(700, 540, 175, 35);
		panel.add(btnConvert);
		
		JLabel lblSource = new JLabel("Source Image");
		lblSource.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSource.setHorizontalAlignment(SwingConstants.CENTER);
		lblSource.setBounds(164, 66, 150, 35);
		panel.add(lblSource);
		
		JLabel lblResult = new JLabel("Result Image");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(605, 66, 150, 35);
		panel.add(lblResult);
		
		JButton btnLoad = new JButton("Load Image");
		btnLoad.setForeground(new Color(255, 255, 255));
		btnLoad.setBackground(new Color(30, 144, 255));
		btnLoad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				alamat = txtSourceAddress.getText();			
				
				ImageIcon gambarAwal = new ImageIcon (alamat);				
				Image ga = gambarAwal.getImage(); // transform it 
				Image newimg = ga.getScaledInstance(400, 400,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
				gambarAwal = new ImageIcon(newimg);  // transform it back
				LblIS.setIcon(gambarAwal);
							
			}
		});
		btnLoad.setBounds(265, 540, 175, 35);
		panel.add(btnLoad);
		
		JButton btnSave = new JButton("Browse Save Address");
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(60, 179, 113));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create an object of JFileChooser class 
				JFileChooser js = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 

				// invoke the showsSaveDialog function to show the save dialog 
				int r = js.showSaveDialog(null); 

				// if the user selects a file 
				if (r == JFileChooser.APPROVE_OPTION) 

				{ 
					// set the label to the path of the selected file 
					txtFinalAddress.setText(js.getSelectedFile().getAbsolutePath()); 
				} 
				// if the user cancelled the operation 
				else
					l.setText("the user cancelled the operation"); 
			}
		});
		btnSave.setBounds(477, 540, 175, 35);
		panel.add(btnSave);
	}
}
