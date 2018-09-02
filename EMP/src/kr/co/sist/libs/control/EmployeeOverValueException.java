package kr.co.sist.libs.control;
//Unchecked Exception
public class EmployeeOverValueException extends RuntimeException {
	public EmployeeOverValueException(String msg){
		super(msg);
	}
}
