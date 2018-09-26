package Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PopUpGeneral extends JOptionPane {

	private static final long serialVersionUID = -3328569642967832206L;
	private JFrame frame;

	public PopUpGeneral(String s) {
		frame = new JFrame();
		PopUpError.showMessageDialog(frame, s, "Atencion", JOptionPane.INFORMATION_MESSAGE);
		this.setVisible(true);
	}

}
