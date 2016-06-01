import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AntennaPanel extends JPanel {
	private final JButton btnAntenna1 = new JButton("Antenna 1");
	private final JButton btnAntenna2 = new JButton("Antenna 2");
	private final JButton btnAntenna3 = new JButton("Antenna 3");
	private final JButton btnAntenna4 = new JButton("Antenna 4");

	/**
	 * Create the panel.
	 */
	public AntennaPanel() {

		initGUI();
	}
	private void initGUI() {
		setBackground(new Color(51, 204, 204));
		setLayout(null);
		btnAntenna1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAntenna1.setBounds(167, 63, 117, 29);
		
		add(btnAntenna1);
		btnAntenna2.setBounds(44, 63, 117, 29);
		
		add(btnAntenna2);
		btnAntenna3.setBounds(167, 128, 117, 29);
		
		add(btnAntenna3);
		btnAntenna4.setBounds(44, 128, 117, 29);
		
		add(btnAntenna4);
	}

}
