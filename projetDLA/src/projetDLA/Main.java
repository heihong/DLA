package projetDLA;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static int windowsWidth = 800;
	public static int widowsHeight = 600;

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
		GridLayout gridLayout = new GridLayout(5, 2);
		gridLayout.setHgap(10);
		gridLayout.setVgap(10);
		paramsPanel.setLayout(gridLayout);
		
		
		//On ajoute le bouton au content pane de la JFrame
		paramsPanel.add(new Label("Taille de la simulation : "));
		paramsPanel.add(new JTextField());
				
		paramsPanel.add(new Label("Nombre de particules :"));
		paramsPanel.add(new JTextField());
				
		paramsPanel.add(new Label("Probabilité de collage :"));
		JTextField textField = new JTextField();
		textField.setText("1");
		paramsPanel.add(textField);
		
		paramsPanel.add(new Label("Type de déplacement :"));
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Balistique");
		combo.addItem("Brownien");
		paramsPanel.add(combo);
		
		
		paramsPanel.add(new Label(""));
		JButton launchButton = new JButton("Lancer le DLA");
		launchButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Render renderWindow = new Render();				
			}
		});
		paramsPanel.add(launchButton);
		
		// On ajoute le conteneur
		fenetre.add(titlePanel, BorderLayout.NORTH);
		fenetre.add(paramsPanel, BorderLayout.CENTER);
		
		
		fenetre.setVisible(true);
	}

}
