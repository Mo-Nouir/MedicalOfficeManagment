package IHM;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import DAO.PatDao;
import OO.patient;

public class FichePatient implements ActionListener, WindowListener {
		public static JFrame frame;
        JTextField txtcode;
        JTextField txtpr;
        JTextField txtNom;
        JTextField txtNaiss;
        JTextField txtTel;
        JTextField txtMail;
        JTextField txtAdr;
        JTextField txtNCNAM;
        JTextField txtTCNAM;
        JButton btnEnregis, btnAnn, btnSupp ;
	
	
	public FichePatient() {
		
		
		frame = new JFrame("Ajouter Patient");
		
		frame.addWindowListener(this);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblnom = new JLabel("Nom");
		lblnom.setBounds(86, 160, 100, 14);
		panel.add(lblnom);
		
		txtNom = new JTextField();
		txtNom.setBounds(196, 160, 86, 20);
		panel.add(txtNom);
		txtNom.setColumns(10);
		
		
		JLabel lblprenom= new JLabel("Prénom");
		lblprenom.setBounds(86, 191, 100, 14);
		panel.add(lblprenom);
		
		txtpr = new JTextField();
		txtpr.setBounds(196, 190, 86, 20);
		panel.add(txtpr);
		txtpr.setColumns(10);
		 
		JLabel lblnaiss = new JLabel("N\u00E9(e) le :");
		lblnaiss.setBounds(381, 138, 46, 14);
		panel.add(lblnaiss);
		
		
		JLabel lbladdrs = new JLabel("Adress :");
		lbladdrs.setBounds(381, 181, 46, 14);
		panel.add(lbladdrs);
		
		txtNaiss = new JTextField();
		txtNaiss.setText("");
		txtNaiss.setBounds(453, 135, 86, 20);
		panel.add(txtNaiss);
		txtNaiss.setColumns(10);
		
		JLabel lblemail = new JLabel("Email :");
		lblemail.setBounds(86, 274, 46, 14);
		panel.add(lblemail);
		
		txtTel = new JTextField();
		txtTel.setText("");
		txtTel.setBounds(142, 315, 86, 20);
		panel.add(txtTel);
		txtTel.setColumns(10);
		
		JLabel lbltel = new JLabel("Portable : ");
		lbltel.setBounds(86, 318, 76, 14);
		panel.add(lbltel);
		
		txtMail = new JTextField();
		txtMail.setText("");
		txtMail.setBounds(142, 271, 140, 20);
		panel.add(txtMail);
		txtMail.setColumns(10);
		
		btnEnregis = new JButton("Enregistrer");
		btnEnregis.setBounds(621, 338, 89, 23);
		panel.add(btnEnregis);
		btnEnregis.addActionListener(this);
		
		btnAnn= new JButton("Annuler");
		btnAnn.setBounds(522, 338, 89, 23);
		panel.add(btnAnn);
		btnAnn.addActionListener(this);
		
		btnSupp= new JButton("Supprimer");
		btnSupp.setBounds(422, 338, 89, 23);
		panel.add(btnSupp);
		btnSupp.addActionListener(this);
		
		JLabel lbltitre = new JLabel("GESTION DES PATIENTS");
		lbltitre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lbltitre.setBounds(236, 10, 474, 93);
		panel.add(lbltitre);
		
		JLabel lblcode = new JLabel("Code patient :");
		lblcode.setBounds(86, 128, 172, 14);
		panel.add(lblcode);
		
		txtcode = new JTextField();
		txtcode.setBounds(196, 128, 86, 20);
		panel.add(txtcode);
		txtcode.setColumns(10);
		
		JLabel lblsexe = new JLabel("Sexe :");
		lblsexe.setBounds(86, 225, 46, 14);
		panel.add(lblsexe);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Feminin");
		rdbtnNewRadioButton.setBounds(138, 221, 70, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculin");
		rdbtnNewRadioButton_1.setBounds(210, 221, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		txtAdr = new JTextField();
		txtAdr.setBounds(453, 181, 140, 20);
		panel.add(txtAdr);
		txtAdr.setColumns(10);
		
		JLabel lblNcnam = new JLabel("N\u00B0 Maticule de la CNAM :");
		lblNcnam.setBounds(381, 225, 119, 14);
		panel.add(lblNcnam);
		
		txtNCNAM = new JTextField();
		txtNCNAM.setBounds(525, 222, 86, 20);
		panel.add(txtNCNAM);
		txtNCNAM.setColumns(10);
		
		JLabel lblTcnam = new JLabel("Type de CNAM :");
		lblTcnam.setBounds(380, 271, 100, 14);
		panel.add(lblTcnam);
		
		txtTCNAM = new JTextField();
		txtTCNAM.setBounds(479, 271, 86, 20);
		panel.add(txtTCNAM);
		txtTCNAM.setColumns(10);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 738, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAjoutPatient = new JMenuItem("Ajout Patient");
		mnNewMenu.add(mntmAjoutPatient);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Ajout Consultation");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("Edition");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Patient");
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
		panel_1.setForeground(SystemColor.textHighlight);
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(0, 21, 76, 368);
		panel.add(panel_1);
		
		frame.setContentPane(panel);
		
		frame.setBounds(100, 100, 754, 428);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

     public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnEnregis ) {
			try {
				int code=Integer.parseInt(txtcode.getText());
				String prenom= txtpr.getText();
				String nom=txtNom.getText();
				
				long naiss=Long.parseLong(txtNaiss.getText());
				
				java.sql.Date datenaiss= new java.sql.Date(naiss);
				
				int tel=Integer.parseInt(txtTel.getText());
				String mail=txtMail.getText();
				String adr=txtAdr.getText();
				int NCNAM=Integer.parseInt(txtNCNAM.getText());
				String TCNAM=txtTCNAM.getText();
				patient p= new patient(code,nom,prenom,adr,tel,datenaiss,NCNAM,TCNAM,mail);
				PatDao PatientDao = new PatDao();
				PatientDao.creerPatient(p);
				
			}
			catch(Exception e1) {
				
				JOptionPane.showMessageDialog(null, "Veuillez vérifier les données du patient à ajouter!");
			} }
		else if(e.getSource()== btnAnn) {
		frame.dispose();
		
		}
		
		else if(e.getSource()== btnSupp) {
			int codePs=Integer.parseInt(txtcode.getText());
			PatDao PatientDao = new PatDao();
			PatientDao.suppPatient(codePs);
			JOptionPane.showMessageDialog(null, "Vous avez supprimer le patient dont son code est: "+ codePs);

			
			
		}
		
		
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
}
	
