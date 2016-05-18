package mvc.example.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class View extends JFrame {
	
	private JTextArea textArea;
	private JButton okBtn;
	private SubmitEventListener listener;
	
	public View() {
		
		setLayout(new BorderLayout(0, 20));
		
		textArea = new JTextArea();
		okBtn = new JButton("OK");
		
		Container c = getContentPane();
		c.add(textArea, BorderLayout.CENTER);
		c.add(okBtn, BorderLayout.SOUTH);
		
		setSize(250, 200);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(listener != null) {
					listener.submitEventPerformed(new SubmitEvent(textArea.getText()));
				}
			}
		});
	}
	
	public void submitPerformed(SubmitEventListener listener) {
		this.listener = listener;
	}
}
