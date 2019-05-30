package john.learning.spring_mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String>{
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String userText, ConstraintValidatorContext context) {
		boolean result;
		if(userText != null) {
			result = userText.startsWith(coursePrefix);
		}else {
			return true;	//not required field
		}
		return result;
	}

}
