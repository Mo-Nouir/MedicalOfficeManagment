package IHM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Medecin implements ActionListener, WindowListener {

	JFrame frame;
	JMenuItem mntmAjoutPatient,AddCons,ModPat ,mntmNewMenuItem_1,SuppPat,AddOrd;
	
	public Medecin() {
		
		frame = new JFrame("Partie Medecin");
		
		frame.addWindowListener(this);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 204));
		panel.setForeground(new Color(0, 51, 204));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		mntmAjoutPatient = new JMenuItem("Ajout Patient");
		mnNewMenu.add(mntmAjoutPatient);
		mntmAjoutPatient.addActionListener(this);
		
		AddCons = new JMenuItem("Ajout Consultation");
		mnNewMenu.add(AddCons);
		AddCons.addActionListener(this);
		
		AddOrd = new JMenuItem("Ajout Ordonnance");
		mnNewMenu.add(AddOrd);
		AddOrd.addActionListener(this);
		
		
		
		JMenu mnNewMenu_1 = new JMenu("Edition");
		menuBar.add(mnNewMenu_1);
		
		ModPat = new JMenuItem("Modifier Patient");
		mnNewMenu_1.add(ModPat);
		ModPat.addActionListener(this);
		
		SuppPat = new JMenuItem("Supprimer Patient");
		mnNewMenu_1.add(SuppPat);
		SuppPat.addActionListener(this);
		
		mntmNewMenuItem_1 = new JMenuItem("Rendez-vous");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Comptabilit\u00E9");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Gestion");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Aide");
		menuBar.add(mnNewMenu_3);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);

	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if (source == mntmAjoutPatient)
		{ 
				FichePatient frameFichePatient = new FichePatient();
		}
		else
			if(source == SuppPat) {
				SuppModPat frameFichePatient = new SuppModPat();
			}
			else 
				if(source == ModPat) {
					SuppModPat frameFichePatient = new SuppModPat();
					
				}
				
				else 
					if(source == AddCons)
					{
						Consultation frameCons = new Consultation();
					}
					else 
						if(source == AddOrd)
						{
							Ordonnance frameOrd = new Ordonnance();
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
