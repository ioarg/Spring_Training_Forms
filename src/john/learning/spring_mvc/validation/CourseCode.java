package john.learning.spring_mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//Which class will be used to implement the validation logic
@Constraint(validatedBy=CourseCodeValidator.class)
//Where should this be applied?
@Target({ElementType.METHOD, ElementType.FIELD})
//Where will this be used?
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	//define default course code
	public String value() default "LUV";
	//define default error message
	public String message() default "Must start with \"LUV\"";
	//define default groups
	public Class<?>[] groups() default {};
	//define default payloads
	public Class<? extends Payload>[] payload() default{}; 
}
