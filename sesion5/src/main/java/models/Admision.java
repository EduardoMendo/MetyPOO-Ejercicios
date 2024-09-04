package models;


/**
 * @author mendo
 * @version 1.0
 * @created 03-sep.-2024 17:56:26
 */
public class Admision {

	public Admision(){

	}


	/**
	 * 
	 * @param Student
	 */
	public void calSchoolarship(Student Student) {
        Student.setSchoolarship(Student.getAverage() >= 80);
	}
}