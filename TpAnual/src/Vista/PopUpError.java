package Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PopUpError extends JOptionPane {

	private static final long serialVersionUID = -161821326252844572L;
	private JFrame frame;

	public PopUpError(String error) {
		frame = new JFrame();
		PopUpError.showMessageDialog(frame, error, "Atencion", JOptionPane.ERROR_MESSAGE);
		this.setVisible(true);
	}

}
