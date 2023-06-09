package borderlayout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderTest implements ActionListener {
	private Frame frame;
	private Button center, west, east, south;
	private TextField tf1;

	public BorderTest() {
		frame = new Frame("BorderLayout example");
		south = new Button("Button1");
		west = new Button("Button2");
		east = new Button("Button3");
		center = new Button("Button4");
		tf1 = new TextField();
		tf1.setText("입력창 입니다");
	}

	public void startFrame() {
		center.addActionListener(this);
		west.addActionListener(this);
		east.addActionListener(this);
		south.addActionListener(this);
		
		frame.add(tf1, "North");
		frame.add(south, "South");
		frame.add(west, "West");
		frame.add(east, "East");
		frame.add(center, "Center");

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest border = new BorderTest();
		border.startFrame();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Button1")) {
			System.out.println("Button 1 Click!");
		}
		if(e.getActionCommand().equals("Button2")) {
			System.out.println("Button 2 Click!");
		}
		if(e.getActionCommand().equals("Button3")) {
			System.out.println("Button 3 Click!");
		}
		if(e.getActionCommand().equals("Button4")) {
			System.out.println("Button 4 Click!");
		}
	}
}
