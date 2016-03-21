package exceptions;
import com.cisc181.core.Person;

public class PersonException extends Exception{
	private long age;
	private Person person;
	
	public PersonException(int age){
		this.age = age;
	}
	public PersonException(String phone_number){
		
	}
	
	

}
