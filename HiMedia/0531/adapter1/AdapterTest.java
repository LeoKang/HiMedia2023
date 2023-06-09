package adapter1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AdapterTest implements ActionListener, WindowListener {
	private Frame frame;
	private Button button1, button2, button3;

	public AdapterTest() {
		frame = new Frame("adapter example");
		button1 = new Button("OK");
		button2 = new Button("Open");
		button3 = new Button("Close");
	}

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());

		button3.addActionListener(this);

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		AdapterTest g = new AdapterTest();
		g.startFrame();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Close")) {
			System.exit(0);
		}
	}
}
