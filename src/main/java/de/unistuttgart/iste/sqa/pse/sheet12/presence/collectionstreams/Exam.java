package de.unistuttgart.iste.sqa.pse.sheet12.presence.collectionstreams;

import java.time.LocalDate;

/*@
  @ invariant subject != null;
  @ invariant mark > 1.0 && mark < 6.0;
  @ invariant date != null;
  @*/
/**
 * Represents an exam. 
 * 
 * @author mfrank
 *
 */
public class Exam {

	private final LocalDate date;
	private final double mark;
	private final String subject;
	
	/*@
	  @ requires mark > 1.0 && mark < 6.0;
	  @ requires subject != null;
	  @*/
	/**
	 * Constructor  
	 * @param mark the mark achieved in this exam (between 1.0 and 6.0)
	 * @param subject subject of this exam (must not be null)
	 * @throws IllegalArgumentException if the specified mark is lower than 1.0 
	 *	   or greater than 6.0, or if the subject is {@code null}.
	 */
	public Exam(final double mark, final String subject) throws IllegalArgumentException {
		if(mark < 1.0 || mark > 6.0 || subject == null) {
			throw new IllegalArgumentException();
		}
		
		this.date = LocalDate.now();
		this.mark = mark;
		this.subject = subject;
	}
	
	/*@
	  @ ensures \result == date;
	  @*/
	/**
	 * @return the date when the exam was created
	 */
	public /*@ pure @*/ LocalDate getDate() {
		return date;
	}

	/*@
	  @ ensures \result == mark;
	  @*/
	/**
	 * @return returns the mark of the exam
	 */
	public /*@ pure @*/ double getMark() {
		return mark;
	}

	/*@
	  @ ensures \result == subject;
	  @*/
	/**
	 * @return returns the subject
	 */
	public /*@ pure @*/ String getSubject() {
		return subject;
	}
}
