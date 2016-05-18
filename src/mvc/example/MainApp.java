package mvc.example;

import javax.swing.SwingUtilities;

import mvc.example.controller.Controller;
import mvc.example.model.Model;
import mvc.example.view.View;

public class MainApp {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				runApp();
			}
		});
	}
	public static void runApp() {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		view.submitPerformed(controller);
	}
}
