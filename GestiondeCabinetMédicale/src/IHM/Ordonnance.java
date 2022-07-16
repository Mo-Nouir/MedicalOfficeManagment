package IHM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import DAO.OrdDao;
import DAO.consDAO;
import OO.consultation;
import OO.ordonnance;

public class Ordonnance implements ActionListener {
	
	JFrame frame;
	JTextField textField;
	JTextField nomMed;
	JTextField textField_2;
	JTextArea descOrd ;
	JButton addOrd,AnnOrd,btneffacer;
	
	public Ordonnance() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 621, 22);
		panel.add(menuBar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 204));
		panel_1.setBounds(0, 21, 104, 422);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Ordonnance");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lblNewLabel.setBounds(260, 21, 205, 61);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Recherche Rapide :");
		lblNewLabel_1.setBounds(114, 88, 151, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(224, 85, 126, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pharmacie :");
		lblNewLabel_2.setBounds(114, 126, 126, 14);
		panel.add(lblNewLabel_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(179, 126, 345, 103);
		panel.add(textPane);
		
		JButton btnNewButton = new JButton("Ajouter Med");
		btnNewButton.setBounds(176, 240, 116, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modifier Med");
		btnNewButton_1.setBounds(300, 240, 116, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Retirer Med");
		btnNewButton_2.setBounds(426, 240, 98, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("M\u00E9dicament choisi :");
		lblNewLabel_3.setBounds(114, 277, 104, 14);
		panel.add(lblNewLabel_3);
		
		nomMed = new JTextField();
		nomMed.setBounds(224, 274, 126, 20);
		panel.add(nomMed);
		nomMed.setColumns(10);
		
		descOrd = new JTextArea();
		descOrd.setBounds(179, 298, 345, 37);
		panel.add(descOrd);
		
		JLabel lblNewLabel_4 = new JLabel("Quantit\u00E9 :");
		lblNewLabel_4.setBounds(114, 349, 78, 14);
		panel.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 346, 48, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		addOrd = new JButton("Cr\u00E9er Ordonnance");
		addOrd.setBounds(463, 394, 141, 23);
		panel.add(addOrd);
		addOrd.addActionListener(this);
		
		
		btneffacer = new JButton("Tout effacer");
		btneffacer.setBounds(349, 394, 104, 23);
		panel.add(btneffacer);
		
		AnnOrd = new JButton("Annuler");
		AnnOrd.setBounds(247, 394, 89, 23);
		panel.add(AnnOrd);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		if (source == AnnOrd) { // Fermer la fenêtre si on clique sur Annuler
			frame.dispose();
			System.out.println("aanuler");
		}
		else 
			if (source == addOrd) {
			try { 
				
				int code = (int) (Math.random()*(100000));
						//Integer.parseInt(txtnumC.getText());			
				String desc = descOrd.getText();
				String nom =nomMed.getText();
				
				ordonnance ord = new ordonnance(code,nom,desc);
				
				//Utiliser la classe DAO pour ajouter cons dans la BD
				OrdDao oDAO = new OrdDao();
				ordonnance oAjoutee =oDAO.AjouteOrd(ord);
				//JOptionPane.showMessageDialog(null, "Ordonnance ajouté avec succès");				

				
				// Vérifier si l'ajout a bien été effectué ou non
				if (oAjoutee != null)
					JOptionPane.showMessageDialog(null, "Ordonnance ajouté avec succès");				
				else
					JOptionPane.showMessageDialog(null, "Problème d’ajout dune Ordonnance "); 

			}
			catch(Exception ex) { 
	           JOptionPane.showMessageDialog(null, "Veuillez vérifier les données du AjouteOrd à ajouter!");
				
			}
		
	}

}}
