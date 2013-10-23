/**
 * 
 */
package com.dayler.jsf.sample.started.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * @author dayler salazar
 *
 */
public class PasswordValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		
		String password = (String) value;

		if (password.isEmpty()) {
			FacesMessage fMessage = new FacesMessage();
			fMessage.setDetail("Password cannot be empty");
			fMessage.setSummary("Password is empty");
			fMessage.setSeverity(FacesMessage.SEVERITY_ERROR);

			throw new ValidatorException(fMessage);
		}
		
	}

}
