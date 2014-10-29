package projetDLA;

import javax.swing.JFrame;

public class Render extends JFrame {
	public Render() {
		this.setTitle("Diffusion Limited Aggregation");
		this.setSize(Main.windowsWidth,Main.widowsHeight);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		this.setVisible(true);
	}
}
