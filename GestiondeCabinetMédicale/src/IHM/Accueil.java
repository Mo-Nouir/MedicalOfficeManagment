package IHM;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Accueil implements ActionListener {
	public JButton btnNewButton_1;
	JFrame frame;
	
	public Accueil() {
		
		frame = new JFrame("Login");
		frame.setBounds(100, 100, 778, 401);
		//frame.addWindowListener(this);
		

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.setBounds(315, 284, 160, 38);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("accueil.jpg"));
		lblNewLabel.setBounds(-20, 0, 782, 362);
		panel.add(lblNewLabel);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		//frame.setSize(400,200);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == btnNewButton_1)
		{ 
			Login framelogin = new Login();
		}
		
	}




}

