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
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import components.*;

public class HomePage extends MainLayout {
	private static final long serialVersionUID = 1L;
	
	
    public HomePage(final PageParameters parameters) {
		super(parameters);
	
    	
    }
}
