package john.learning.spring_mvc.controllers;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import john.learning.spring_mvc.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//This will pre process every string form data
	//Used to trim strings before validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult binding ) {
		if(binding.hasErrors()) {
			return "customer-form";
		}
		return "customer-confirmed";
	}
}
