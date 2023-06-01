package textfieldtest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextFieldTest {
	private Frame f;
	private TextField id, pwd, msg;
	private Button btn;

	public TextFieldTest() {
		f = new Frame("Login");
		f.setSize(400, 120);
		f.setLayout(new FlowLayout());

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		id = new TextField(10);
		pwd = new TextField(10);
		pwd.setEchoChar('*');

		btn = new Button("Login");

		msg = new TextField(40);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btn);
		f.add(msg);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		TextFieldTest t = new TextFieldTest();
	}
}
