package de.unistuttgart.iste.sqa.pse.sheet12.presence.collectionstreams;

import java.time.LocalDate;


/**
 * 
 * Represents an exam. 
 * 
 * Invariant: subject != null, mark set, date != null
 * 
 * @author mfrank
 *
 */
public class Exam {

	private final LocalDate date;
	private final double mark;
	private final String subject;
	
	/**
	 * Constructor  
	 * @param mark - must between 1.0 and 6.0
	 * @param subject - must be not null
	 */
	public Exam(final double mark, final String subject) {
		if(mark < 1.0 || mark > 6.0 || subject == null) {
			throw new IllegalArgumentException();
		}
		
		this.date = LocalDate.now();
		this.mark = mark;
		this.subject = subject;
	}

	/**
	 * @return the date when the exam was created
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @return returns the mark of the exam
	 */
	public double getMark() {
		return mark;
	}

	/**
	 * @return returns the subject
	 */
	public String getSubject() {
		return subject;
	}
}