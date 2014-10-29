import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	private static int windowsWidth = 800;
	private static int widowsHeight = 600;

	public static void main(String[] args) {

		// fenetre principale de paramétrage
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Diffusion Limited Aggregation");
		fenetre.setSize(windowsWidth, widowsHeight);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);
		fenetre.setLayout(new BorderLayout());
		
		
		JPanel titlePanel = new JPanel();
		titlePanel.add(new JLabel("<html><b>Diffusion Limited Aggregation</b></html>"));
		
		
		// Le conteneur principal
		JPanel paramsPanel = new JPanel();
		//content.setPreferredSize(new Dimension(windowsWidth, widowsHeight));
		
		// (x,y)	 x lignes y colonnes
		paramsPanel.setLayout(new GridLayout(3, 2));
		
		//On ajoute le bouton au content pane de la JFrame
		paramsPanel.add(new Label("Taille de la simulation : "));
		paramsPanel.add(new JTextField());
				
		paramsPanel.add(new Label("Nombre de particules :"));
		paramsPanel.add(new JTextField());
				
		paramsPanel.add(new Label("Probabilité de collage"));
		paramsPanel.add(new JTextField());
		
	
		// On ajoute le conteneur
		fenetre.add(titlePanel, BorderLayout.NORTH);
		fenetre.add(paramsPanel, BorderLayout.CENTER);
		
		
		fenetre.setVisible(true);
	}

}
