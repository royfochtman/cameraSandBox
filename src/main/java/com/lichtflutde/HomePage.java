package com.lichtflutde;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.extensions.ajax.markup.html.autocomplete.AutoCompleteBehavior;
import org.apache.wicket.extensions.ajax.markup.html.autocomplete.StringAutoCompleteRenderer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import components.Kamera;
import components.KameraTree;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	
	private final KameraTree kameraTree = new KameraTree();
	
    public HomePage(final PageParameters parameters) {
		super(parameters);
	
		final IModel<String> model = new Model<String>("Welt");
		final Label nameLabel = new Label("name", model);
		add(nameLabel);
		
		Form myForm = new Form("myForm"){
		@Override
		protected void onSubmit(){
			super.onSubmit();
			}
	    };
	    add(myForm);
	    TextField<String> nameField = new TextField<String>("nameField", model);
	    myForm.add(nameField);
	    
	    /*nameField.add(new AutoCompleteBehavior<String>(StringAutoCompleteRenderer.INSTANCE){

			@Override
			protected Iterator<String> getChoices(final String input) {
				final List<String> suggestions = new ArrayList<String>();
				for(final Kamera name : kameraTree.getTree()){
					if(name.toString().startsWith(input)){
						suggestions.add(name.toString());
					}
				}
				return suggestions.iterator();
			}
	    	
	    });*/
    	
    }
}
