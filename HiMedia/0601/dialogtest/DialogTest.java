package dialogtest;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest extends WindowAdapter {
	private Frame f;
	private Dialog info;

	public void windowClosing(WindowEvent e) {		
		System.exit(0);
	}

	public DialogTest() {
		f = new Frame("Parent");
		f.setSize(300, 200);
		f.setLocation(2500, 10);
		f.addWindowListener(this);

		info = new Dialog(f, "Information", true);
		info.setSize(140, 90);
		info.setLocation(2550, 50);
		info.setLayout(new FlowLayout());
		info.addWindowListener(this);

		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				info.dispose();
			}
		});
		
		info.add(msg);
		info.add(ok);

		f.setVisible(true);
		info.setVisible(true);
	}

	public static void main(String[] args) {
		DialogTest dt = new DialogTest();
	}
}
