package exceptions;
import com.cisc181.core.Person;

public class PersonException extends Exception{
	private int age;
	private Person person;
	private String invalidNumber;
	
	/**
	 * Create an instance of the PersonException class, to be thrown to the caller
	 * @param age that was entered that is invalid. Should be over 100.
	 */
	public PersonException(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public PersonException(Person person){
		this.person = person;
	}
	
	/**
	 * Create an instance of the PersonException class, to be thrown to the caller
	 * @param Phone number entered that was invalid, should have been of the form
	 * (###)-###-####
	 */
	public PersonException(String phone_number){
		this.invalidNumber = phone_number;
	}
	
	public String getInvalidNumber(){
		return this.invalidNumber;
	}
	
	

}
