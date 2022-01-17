package de.unistuttgart.iste.sqa.pse.sheet12.presence.collectionstreams;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Represents a student.
 * 
 * Invariant: name != null, birthday != null, sex != null, emailAdress != null,
 * writtenExam != null;
 * 
 * @author mfrank
 *
 */
public class Student {

	public enum Sex {
		MALE, FEMALE
	}

	private final String name;
	private final LocalDate birthday;
	private final Sex gender;
	private final String emailAddress;
	private final Map<String, Exam> writtenExams;

	
	/**
	 * 
	 * Default Constructor for a Student
	 * 
	 * @param name - must not be null
	 * @param birthday - must not be null
	 * @param gender - must not be null
	 * @param email - must not be null
	 */
	public Student(final String name, final LocalDate birthday, final Sex gender, final String email) {

		if (name == null || birthday == null || gender == null || email == null) {
			throw new IllegalArgumentException();
		}

		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = email;
		this.writtenExams = new HashMap<String, Exam>();
	}


	/**
	 * Adds an exam to the exam-list of student. It uses a Map an the name of the exam as key. 
	 * To get the exam use getExam(key) for a single exam or getWrittenExams() for all.
	 * 
	 * @param exam - must not be null
	 */
	public void addExam(Exam exam) {

		if (exam == null) {
			throw new IllegalArgumentException();
		}

		writtenExams.put(exam.getSubject(), exam);
	}
	
	/**
	 * @return the age in Years (int) of the student. 
	 */
	
	public int getAge() {

		return (int) ChronoUnit.YEARS.between(birthday, LocalDate.now());
	}


	/**
	 * Returns the exam for a given Name.
	 * 
	 * @param examTag name of the exam 
	 * @return exam for given key
	 * 
	 */
	public Exam getExam(final String examTag){
		return writtenExams.get(examTag);
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public Map<String, Exam> getWrittenExams() {
		return writtenExams;
	}

}