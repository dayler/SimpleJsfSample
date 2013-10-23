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
public class LoginValidator implements Validator {

	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {

		String user = (String) value;

		if (user.isEmpty()) {
			FacesMessage message = new FacesMessage();
			message.setDetail("User field is empty");
			message.setSummary("User field is empty");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);

			throw new ValidatorException(message);
		}

		if (!user.equalsIgnoreCase("test")) {
			FacesMessage message = new FacesMessage();
			message.setDetail("User " + user + " does not exists");
			message.setSummary("Login Incorrect");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);

			throw new ValidatorException(message);
		}
	}
}
