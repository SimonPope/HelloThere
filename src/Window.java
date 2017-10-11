import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame implements MouseListener {

	private final Dimension dim;

	public Window() {
		super("Hello there!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 30));
		getContentPane().add(panel);

		JLabel message = new JLabel("<html><div style='text-align: center;'>General Kenobi<br><br>You ARE a bold one!</div></html>");
		panel.add(message);

		pack();
		setResizable(false);

		this.dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(this.dim.width/2-this.getSize().width/2, this.dim.height/2-this.getSize().height/2);

		addMouseListener(this);
	}

	public static void main(String[] args) {
		new Window().setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		int x;
		int y;
		while (true) {
			x = (int)(Math.random() * this.dim.width);
			y = (int)(Math.random() * this.dim.height);
			if (e.getX() < x || e.getY() < y || e.getX() > x + getSize().width || e.getY() > y + getSize().height) {
				break;
			}
		}
		this.setLocation(x, y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
