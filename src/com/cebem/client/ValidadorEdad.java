package com.cebem.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;

public class ValidadorEdad extends Composite implements HasText {

	private static ValidadorEdadUiBinder uiBinder = GWT
			.create(ValidadorEdadUiBinder.class);
	@UiField IntegerBox edad;
	@UiField Button acceder;
	@UiField Label resultado;

	interface ValidadorEdadUiBinder extends UiBinder<Widget, ValidadorEdad> {
	}

	public ValidadorEdad() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	

	public ValidadorEdad(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	

	public void setText(String text) {
	
	}

	public String getText() {
		return "";
	}

	@UiHandler("acceder")
	void onAccederClick(ClickEvent event) {
		if(edad.getValue()<18){
			resultado.setText("Eres menor de edad");	
		}else
		{
			resultado.setText("Eres mayor de edad");
		}
	}
}
