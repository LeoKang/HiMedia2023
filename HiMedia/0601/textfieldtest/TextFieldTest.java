package textfieldtest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest implements ActionListener {
	private Frame f, f2;
	private TextField id, pwd, msg;
	private Button btn;
	private final String STRING_ID = "himedia";
	private final String STRING_PWD = "1111";

	public TextFieldTest() {
		f = new Frame("Login");
		f.setSize(400, 120);
		f.setLayout(new FlowLayout());

		f2 = new Frame("Main");
		f2.setSize(500, 500);
		
		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		id = new TextField(10);
		pwd = new TextField(10);
		pwd.setEchoChar('*');

		btn = new Button("Login");
		btn.addActionListener(this);

		msg = new TextField(40);
		msg.setEditable(false);

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

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("[" + id.getText() + "]");
		System.out.println("[" + pwd.getText() + "]");
		
		if(id.getText().equals(STRING_ID) && pwd.getText().equals(STRING_PWD)) {
//			System.out.println("로그인 성공");
			msg.setText("로그인 성공");
			f2.setVisible(true);
		}else {
			System.out.println("로그인 실패");
			msg.setText("로그인 실패");
		}
	}
}
