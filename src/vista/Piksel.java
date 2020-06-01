package vista;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.border.LineBorder;

import modelo.ScreenImage;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Piksel extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane, AreaDibujo;
	private JButton btn8bits, btn16bits, btn32bits;
	private JButton[][] pixels;
	private int medidas = 8;

	private JButton btnVerde, btnCyan, btnAzul, btnMagenta, btnRosa, btnAmarillo, btnNaranja, btnGris, btnNegro;
	private JButton btnMasColores;
	private Color c;
	private JButton btnResetear;
	private JButton btnGuardar;
	private JTextField txtNombre;
	private JLabel lblNombre;
	private boolean pulsado = false;
	private JButton btnRellenar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piksel frame = new Piksel();
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
	public Piksel() {
		setResizable(false);
		setTitle("Piksel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 762);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		pixels = new JButton[8][8];

		pantalla();

		eventos();
		
		setVisible(true);
	}

	private void eventos() {
		btn8bits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medidas = 8;
				pixels = new JButton[8][8];
				CrearGrid(medidas);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});

		btn16bits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medidas = 16;
				pixels = new JButton[16][16];
				CrearGrid(medidas);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});

		btn32bits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medidas = 32;
				pixels = new JButton[32][32];

				CrearGrid(medidas);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});

		btnMasColores.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c = JColorChooser.showDialog(null, "Choose a Color", btnMasColores.getForeground());
				btnMasColores.setBackground(c);
				fondoRellenar(c);
			}
		});

		btnVerde.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.green;
				fondoRellenar(c);
			}
		});

		btnRosa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.PINK;
				fondoRellenar(c);
			}
		});

		btnAmarillo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.YELLOW;
				fondoRellenar(c);
			}
		});

		btnAzul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.BLUE;
				fondoRellenar(c);
			}
		});

		btnCyan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.CYAN;
				fondoRellenar(c);
			}
		});

		btnGris.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.DARK_GRAY;
				fondoRellenar(c);
			}
		});

		btnNaranja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.orange;
				fondoRellenar(c);
			}
		});

		btnMagenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.MAGENTA;
				fondoRellenar(c);
			}
		});

		btnNegro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c = Color.black;
				fondoRellenar(c);
			}
		});

		btnResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < pixels.length; i++) {
					for (int j = 0; j < pixels.length; j++) {
						try {
							pixels[i][j].setBackground(Color.white);
						} catch (Exception e2) {
							// TODO: handle exception
						}

					}
					AreaDibujo.revalidate();
					AreaDibujo.repaint();
					AreaDibujo.validate();
				}
			}
		});

		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtNombre.getText().isBlank() || txtNombre.getText().isEmpty()) {
					txtNombre.setBackground(Color.RED);
				} else {
					txtNombre.setBackground(Color.WHITE);
					BufferedImage bi = ScreenImage.createImage(AreaDibujo);
					try {
						ScreenImage.writeImage(bi,
								"C:\\Users\\danie\\Desktop\\Eclipse\\" + txtNombre.getText() + ".jpg");
						JOptionPane.showMessageDialog(new JFrame(), "Imagen guardada con éxito");
					} catch (IOException e1) {
						// TODO Bloque catch generado automáticamente
						e1.printStackTrace();
					}
				}

			}
		});
		
		
		btnRellenar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < pixels.length; i++) {
					for (int j = 0; j < pixels.length; j++) {
						pixels[i][j].setBackground(c);
					}
				}

			}
		});
		
		
		
		

	}

	private void fondoRellenar(Color c2) {
		btnRellenar.setBackground(c2);
		
	}

	private void pantalla() {

		btn8bits = new JButton("8-Bits");

		btn8bits.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn8bits.setBounds(36, 36, 107, 47);
		contentPane.add(btn8bits);

		btn16bits = new JButton("16-Bits");
		btn16bits.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn16bits.setBounds(36, 106, 107, 47);
		contentPane.add(btn16bits);

		btn32bits = new JButton("32-Bits");
		btn32bits.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn32bits.setBounds(36, 185, 107, 47);
		contentPane.add(btn32bits);

		btnVerde = new JButton("");
		btnVerde.setBackground(Color.GREEN);
		btnVerde.setBounds(43, 258, 20, 20);
		contentPane.add(btnVerde);

		btnCyan = new JButton("");
		btnCyan.setBackground(Color.CYAN);
		btnCyan.setBounds(78, 258, 20, 20);
		contentPane.add(btnCyan);

		btnAzul = new JButton("");
		btnAzul.setBackground(Color.BLUE);
		btnAzul.setBounds(111, 258, 20, 20);
		contentPane.add(btnAzul);

		btnMagenta = new JButton("");
		btnMagenta.setBackground(Color.MAGENTA);
		btnMagenta.setBounds(43, 295, 20, 20);
		contentPane.add(btnMagenta);

		btnRosa = new JButton("");
		btnRosa.setBackground(Color.PINK);
		btnRosa.setBounds(78, 295, 20, 20);
		contentPane.add(btnRosa);

		btnAmarillo = new JButton("");
		btnAmarillo.setBackground(Color.YELLOW);
		btnAmarillo.setBounds(111, 295, 20, 20);
		contentPane.add(btnAmarillo);

		btnNaranja = new JButton("");
		btnNaranja.setBackground(Color.ORANGE);
		btnNaranja.setBounds(43, 333, 20, 20);
		contentPane.add(btnNaranja);

		btnGris = new JButton("");
		btnGris.setBackground(Color.DARK_GRAY);
		btnGris.setBounds(78, 333, 20, 20);
		contentPane.add(btnGris);

		btnNegro = new JButton("");
		btnNegro.setBackground(Color.BLACK);
		btnNegro.setBounds(111, 333, 20, 20);
		contentPane.add(btnNegro);

		btnMasColores = new JButton("Más Colores");
		btnMasColores.setFont(new Font("Dialog", Font.BOLD, 12));
		btnMasColores.setBounds(36, 390, 107, 64);
		contentPane.add(btnMasColores);

		btnResetear = new JButton("");
		btnResetear.setForeground(Color.WHITE);
		btnResetear.setBorderPainted(false); 
		btnResetear.setContentAreaFilled(false); 
		btnResetear.setFocusPainted(false); 
		btnResetear.setOpaque(false);

		btnResetear.setBounds(186, 15, 115, 40);
		btnResetear.setBackground(Color.LIGHT_GRAY);
		Image imagen = new ImageIcon(this.getClass().getResource("/reset.png")).getImage();
		btnResetear.setIcon(new ImageIcon(imagen));
		contentPane.add(btnResetear);

		btnGuardar = new JButton("Guardar");

		btnGuardar.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnGuardar.setBounds(10, 558, 161, 106);
		contentPane.add(btnGuardar);

		lblNombre = new JLabel("Nombre del archivo:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(10, 494, 155, 25);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(10, 529, 161, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		btnRellenar = new JButton(new ImageIcon(("C:\\Users\\danie\\Desktop\\rellenar.png")));
		btnRellenar.setBounds(387, 18, 49, 36);
		btnRellenar.setBackground(c);
		
		contentPane.add(btnRellenar);
		
		contentPane.revalidate();
		contentPane.repaint();
		contentPane.validate();
		
		JLabel labelRellenar = new JLabel("");
		imagen = new ImageIcon(this.getClass().getResource("/cubopng.png")).getImage();
		labelRellenar.setIcon(new ImageIcon(imagen));
		labelRellenar.setBounds(327, 10, 50, 50);
		contentPane.add(labelRellenar);
		
		CrearGrid(medidas);

	}

	public void CrearGrid(int medidas) {
		try {
			contentPane.remove(AreaDibujo);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

		AreaDibujo = new JPanel();
		AreaDibujo.setBorder(new LineBorder(new Color(0, 0, 0)));
		AreaDibujo.setBackground(Color.WHITE);
		AreaDibujo.setBounds(186, 67, 600, 600);
		contentPane.add(AreaDibujo);
		AreaDibujo.setLayout(new GridLayout(medidas, medidas, -1, -1));
		
		

		for (int x = 0; x < medidas; x++) {

			for (int y = 0; y < medidas; y++) {

				JButton boton = new JButton("");
				boton.setHorizontalAlignment(SwingConstants.CENTER);
				boton.setBackground(Color.white);

				boton.addActionListener(this);
				boton.addMouseListener(this);
				AreaDibujo.add(boton);

				pixels[x][y] = boton;

			}

		}

		AreaDibujo.revalidate();
		AreaDibujo.repaint();
		AreaDibujo.validate();

	}

	private void borrarComponentes() {

		AreaDibujo.removeAll();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente

		JButton button = (JButton) e.getSource();
		button.setBackground(c);

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public void mousePressed(MouseEvent e) {

		if (SwingUtilities.isRightMouseButton(e)) {
			JButton button = (JButton) e.getSource();
			button.setBackground(Color.white);
		}

	}
}
