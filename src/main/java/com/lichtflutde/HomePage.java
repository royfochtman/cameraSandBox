package com.lichtflutde;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.extensions.ajax.markup.html.autocomplete.AutoCompleteBehavior;
import org.apache.wicket.extensions.ajax.markup.html.autocomplete.StringAutoCompleteRenderer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import components.*;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	
	private final SortedSet<String> rememberedCameras = new TreeSet<String>();
	private final KameraArray kameraArray = new KameraArray();
	
	
    public HomePage(final PageParameters parameters) {
		super(parameters);
		
		for(int i=0;i<kameraArray.getArray().size();i++){
			rememberedCameras.add(kameraArray.getArray().get(i).toString());
		}
	
		final IModel<String> model = new Model<String>("Welt");
		final Label nameLabel = new Label("name", model);
		add(nameLabel);
		
		Form myForm = new Form("myForm"){
			private static final long serialVersionUID = 1L;

		@Override
		protected void onSubmit(){
			super.onSubmit();
			}
	    };
	    add(myForm);
	    TextField<String> nameField = new TextField<String>("nameField", model);
	    myForm.add(nameField);
	    
	    nameField.add(new AutoCompleteBehavior<String>(StringAutoCompleteRenderer.INSTANCE){

			@Override
			protected Iterator<String> getChoices(final String input) {
				final List<String> suggestions = new ArrayList<String>();
				for(final String name : rememberedCameras){
					if(name.startsWith(input)){
						suggestions.add(name);
					}
				}
				return suggestions.iterator();
			}
	    	
	    });
	    /*
	     * Erzeugt Liste der Kamera-Modellen der Marke NIKON
	     */
	    String markupLabelStringNikon = kameraArray.toButtonString("Nikon");
	    
	    Label markupLabelNikon = new Label("markupLabelNikon",markupLabelStringNikon);
        markupLabelNikon.setEscapeModelStrings(false);
        add(markupLabelNikon);
        
        /*
         * Erzeugt Liste der Kamera-Modellen der Marke CANON
         */
        String markupLabelStringCanon = kameraArray.toButtonString("Canon");
        
        Label markupLabelCanon = new Label("markupLabelCanon", markupLabelStringCanon);
        markupLabelCanon.setEscapeModelStrings(false);
        add(markupLabelCanon);
        
        
    	
    }
}
