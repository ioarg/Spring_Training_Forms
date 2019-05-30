package john.learning.spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import john.learning.spring_mvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/form")
	public String showForm(Model model) {
		//Add a student to the model
		Student student = new Student();
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@PostMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		return "student-confirmation";
	}
}