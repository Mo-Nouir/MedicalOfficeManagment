package IHM;
import java.sql.Date;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import DAO.PatDao;
import DAO.consDAO;
import OO.consultation;
import OO.patient;

public class Consultation implements WindowListener, ActionListener {
	JFrame frame;
	JTextField Nom,prenom,dateCons,txtnumC,txtrechPat,txttypeCons,numP;
	JButton AjoutCons,AnnCons,RechPat,btnSuppc;
	JTextArea descCons;
	JMenuItem mntmAjoutPatient,AddCons,mntmNewMenuItem;

	public Consultation() {
		
		
		frame = new JFrame();
		frame.addWindowListener(this);
		frame.setBounds(100, 100, 754, 437);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 754, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		mntmAjoutPatient = new JMenuItem("Ajoutx Patient");
		mnNewMenu.add(mntmAjoutPatient);
		mntmAjoutPatient.addActionListener(this);
		
		AddCons = new JMenuItem("Ajout Consultation");
		mnNewMenu.add(AddCons);
		AddCons.addActionListener(this);
		
		JMenu mnNewMenu_1 = new JMenu("Edition");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem = new JMenuItem("Patient");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Rendez-vous");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Comptabilit\u00E9");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Gestion");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Aide");
		menuBar.add(mnNewMenu_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 204));
		panel_1.setBounds(0, 22, 122, 376);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Consultation");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lblNewLabel.setBounds(381, 33, 260, 79);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date :");
		lblNewLabel_1.setBounds(148, 157, 46, 14);
		panel.add(lblNewLabel_1);
		
		dateCons = new JTextField();
		dateCons.setBounds(252, 154, 86, 20);
		panel.add(dateCons);
		dateCons.setColumns(10);
		
		JLabel numCons = new JLabel("Num Consultation");
		numCons.setBounds(381, 157, 66, 14);
		panel.add(numCons);
		
		txtnumC = new JTextField();
		txtnumC.setBounds(457, 154, 86, 20);
		panel.add(txtnumC);
		txtnumC.setColumns(10);
		
		JLabel typeCons = new JLabel("Type Consultation");
		typeCons.setBounds(430, 200, 260, 79);
		panel.add(typeCons);
		
		txttypeCons = new JTextField();
		txttypeCons.setBounds(550, 225, 86, 20);
		panel.add(txttypeCons);
		txttypeCons.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nom :");
		lblNewLabel_3.setBounds(148, 196, 116, 14);
		panel.add(lblNewLabel_3);
		
		Nom = new JTextField();
		Nom.setBounds(252, 193, 86, 20);
		panel.add(Nom);
		Nom.setColumns(10);
		
		JLabel Prenom = new JLabel("Pr\u00E9nom");
		Prenom.setBounds(381, 196, 46, 14);
		panel.add(Prenom);
		
		prenom = new JTextField();
		prenom.setText("");
		prenom.setBounds(457, 193, 86, 20);
		panel.add(prenom);
		prenom.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Consultation :");
		lblNewLabel_5.setBounds(148, 240, 86, 14);
		panel.add(lblNewLabel_5);
		
		descCons = new JTextArea();
		descCons.setBounds(229, 235, 168, 131);
		panel.add(descCons);
		
		JLabel lblNewLabel_6 = new JLabel("Recherech Patient :");
		lblNewLabel_6.setBounds(148, 117, 130, 14);
		panel.add(lblNewLabel_6);
		
		
		txtrechPat = new JTextField();
		txtrechPat.setBounds(288, 114, 86, 20);
		panel.add(txtrechPat);
		txtrechPat.setColumns(10);
		
		RechPat = new JButton("Rechercher Patient");
		RechPat.setBounds(400, 114, 200, 20);
		panel.add(RechPat);
		RechPat.addActionListener(this);
		
		AjoutCons = new JButton("Enregistrer");
		AjoutCons.setBounds(630, 353,100, 23);
		panel.add(AjoutCons);
		AjoutCons.addActionListener(this);
		
		AnnCons = new JButton("Annuler");
		AnnCons.setBounds(515, 353, 89, 23);
		panel.add(AnnCons);
		AnnCons.addActionListener(this);
		
		JLabel nump = new JLabel("N° Patient");
		nump.setBounds(430, 250, 260, 79);
		panel.add(nump);
		
		numP = new JTextField();
		numP.setBounds(550, 275, 86, 20);
		panel.add(numP);
		numP.setColumns(10);
		
		btnSuppc= new JButton("Supprimer");
		btnSuppc.setBounds(422, 353, 89, 23);
		panel.add(btnSuppc);
		btnSuppc.addActionListener(this);
		
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
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
		
		if (source == AnnCons) { // Fermer la fenêtre si on clique sur Annuler
			frame.dispose();
		}
		else if (source == RechPat) {
			try {				
				String nom = txtrechPat.getText();				
				//Utiliser la classe DAO pour rechercher p dans la BD
				PatDao pDAO = new PatDao();
				patient pRech = pDAO.RechercherParnom(nom);
				
				// Vérifier si l'ajout a bien été effectué ou non
				if (pRech == null)
					JOptionPane.showMessageDialog(frame,"Aucun patient avec le nom : "+ nom);
				else { // Compléter de remplir les infos du produit dans l'interface une fois trouvé 
					Nom.setText(pRech.getNom());
					prenom.setText(pRech.getPrenom());
					
				}
			}
			catch(Exception ex) { 
	           JOptionPane.showMessageDialog(null, "Veuillez vérifier les données du patient à rechercher!");
				
			}
		
	}
		else if (source == AjoutCons) {
			try { 
				
				int num = Integer.parseInt(txtnumC.getText());
				int codep = Integer.parseInt(numP.getText());
                long dtc=Long.parseLong(dateCons.getText());

				String rqc = descCons.getText();
				String type =txttypeCons.getText();
				java.sql.Date datec= new Date(dtc); 
				
				consultation cons = new consultation(num,codep,datec,type,rqc);
				
				//Utiliser la classe DAO pour ajouter cons dans la BD
				consDAO cDAO = new consDAO();
				consultation cAjoutee = cDAO.Ajouter(cons);
				
				// Vérifier si l'ajout a bien été effectué ou non
				if (cAjoutee != null)
					JOptionPane.showMessageDialog(null, "Consultation ajouté avec succès");				
				else
					JOptionPane.showMessageDialog(null, "Problème d’ajout d'une consultation");

			}
			catch(Exception ex) { 
	           JOptionPane.showMessageDialog(null, "Veuillez vérifier les données du consultation à ajouter!");
				
			}
		}
		else if (source== btnSuppc) {
			int codecons=Integer.parseInt(txtnumC.getText());
			consDAO ConsultDao = new consDAO();
			ConsultDao.suppPatient(codecons);
			JOptionPane.showMessageDialog(null, "Vous avez supprimer la consultation enregistrée sous le numéro: "+ codecons);

			
		}
		}
	
}

