package choicetest;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceTest implements ActionListener{
	public static void main(String[] args) {
		Frame f = new Frame("Choice - Select");
		f.setSize(300, 200);
		f.setLayout(null);

		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");

		day.setSize(100, 50);
		day.setLocation(100, 70);

		Button b = new Button("click");
		b.setSize(50, 20);
		b.setLocation(100, 100);
		b.addActionListener(this);
		
		f.add(day);
		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println();
	}
}
