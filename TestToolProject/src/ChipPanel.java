import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class ChipPanel extends JPanel {
	private final JButton btnChip1 = new JButton("Chip 1");
	private final JButton btnChip2 = new JButton("Chip 2");
	private final JButton btnChip3 = new JButton("Chip 3");

	/**
	 * Create the panel.
	 */
	public ChipPanel() {

		initGUI();
	}
	private void initGUI() {
		setBackground(new Color(51, 204, 153));
		setLayout(null);
		btnChip1.setBounds(95, 30, 85, 29);
		
		add(btnChip1);
		btnChip2.setBounds(95, 124, 85, 29);
		
		add(btnChip2);
		btnChip3.setBounds(95, 218, 85, 29);
		
		add(btnChip3);
	}

}
