import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class TestPanel extends JPanel {
	private final JButton btnTest1 = new JButton("Test 1");
	private final JButton btnTest2 = new JButton("Test 2");
	private final JButton btnTest3 = new JButton("Test3");
	private final JButton btnTest4 = new JButton("Test4");

	/**
	 * Create the panel.
	 */
	public TestPanel() {

		initGUI();
	}
	private void initGUI() {
		setBackground(new Color(51, 204, 255));
		setLayout(null);
		btnTest1.setBounds(42, 49, 117, 29);
		
		add(btnTest1);
		btnTest2.setBounds(165, 49, 117, 29);
		
		add(btnTest2);
		btnTest3.setBounds(42, 115, 117, 29);
		
		add(btnTest3);
		btnTest4.setBounds(165, 115, 117, 29);
		
		add(btnTest4);
	}

}
