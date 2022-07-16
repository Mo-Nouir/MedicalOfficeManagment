package IHM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener,WindowListener{
	
	JFrame frame;
	JTextField textlog;
	JButton btnlogin;
	String log = "Medecin";
	JPasswordField textmdp;
	public Login() {
			
	frame = new JFrame("Login");
	frame.addWindowListener(this);
	
	JPanel panel = new JPanel();
	panel.setBackground(new Color(255, 255, 255));
	panel.setForeground(new Color(0, 51, 204));
	frame.getContentPane().add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Login");
	lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
	lblNewLabel.setForeground(new Color(0, 0, 204));
	lblNewLabel.setBounds(165, 147, 146, 59);
	panel.add(lblNewLabel);
	
	textlog = new JTextField();
	textlog.setBounds(352, 153, 198, 52);
	panel.add(textlog);
	textlog.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Mot de passe");
	lblNewLabel_1.setForeground(new Color(0, 0, 204));
	lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
	lblNewLabel_1.setBounds(165, 216, 198, 44);
	panel.add(lblNewLabel_1);
	
	textmdp = new JPasswordField();
	textmdp.setBounds(352, 216, 198, 52);
	panel.add(textmdp);
	textmdp.setColumns(10);
	
	JLabel lblNewLabel_2 = new JLabel("");
	lblNewLabel_2.setIcon(new ImageIcon("login.jpg"));
	lblNewLabel_2.setBounds(31, 23, 186, 166);
	panel.add(lblNewLabel_2);
	
	btnlogin = new JButton("Entrer");
	btnlogin.setBounds(428, 319, 122, 35);
	panel.add(btnlogin);
	btnlogin.addActionListener(this);
	
	JButton btnNewButton_1 = new JButton("Annuler");
	btnNewButton_1.setBounds(301, 319, 112, 35);
	panel.add(btnNewButton_1);
	
	frame.setContentPane(panel);
	frame.setBounds(100, 100, 646, 426);
	
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);

	//frame.setSize(500,300);

}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if (source == btnlogin)
		{
			
			if (textlog.getText().equals("secretaire"))
			{ 
				
				Secretaire frameSecretaire = new Secretaire();
			}
			else if (textlog.getText().equals("medecin"))
			{
				Medecin frameMedecin = new Medecin();
			}
		}
		}
		
		
	}
