package mvc.example.controller;

import mvc.example.model.Model;
import mvc.example.view.SubmitEvent;
import mvc.example.view.SubmitEventListener;
import mvc.example.view.View;

public class Controller implements SubmitEventListener{
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	@Override
	public void submitEventPerformed(SubmitEvent event) {
		System.out.println("Form submitted: " + event.getSubmittedText());
		
	}
}
