package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

public class gridImagenes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gridImagenes frame = new gridImagenes();
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
	public gridImagenes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 752);
		contentPane = new JPanel();
		int imagenes = 27;
		contentPane.setBorder(new EmptyBorder(5, 5, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(148, 141, 610, 514);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 5, 10, 10));
		
		JLabel label = new JLabel("New label");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("New label");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("New label");
		panel.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("New label");
		panel.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("New label");
		panel.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("New label");
		panel.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("New label");
		panel.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("New label");
		panel.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("New label");
		panel.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("New label");
		panel.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("New label");
		panel.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("New label");
		panel.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("New label");
		panel.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("New label");
		panel.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("New label");
		panel.add(lblNewLabel_38);
		
		JLabel lblNewLabel_39 = new JLabel("New label");
		panel.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("New label");
		panel.add(lblNewLabel_40);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(757, 141, 26, 514);
		contentPane.add(scrollBar);
	}
}
