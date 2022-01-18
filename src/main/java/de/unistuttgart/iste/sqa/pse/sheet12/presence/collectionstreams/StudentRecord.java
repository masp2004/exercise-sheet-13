package de.unistuttgart.iste.sqa.pse.sheet12.presence.collectionstreams;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents a set of students. The record can be manipulated by adding new students. There is no possiblity
 * to remove students after inserting them to the record.
 * Invariant: students!=null
 */
public class StudentRecord {

	private final Set<Student> students;

	public StudentRecord() {
		this.students = new HashSet<Student>();
	}

	/**
	 * Adds a student to the current record
	 * @param student student that will be added
	 * Precondition: student!=null
	 */
	public void addStudent(final Student student) {
		if (student == null) {
			throw new IllegalArgumentException("The given reference to a student object must not be null!");
		}
		students.add(student);
	}

	/**
	 * Get the set of all students that are stored in this record.
	 */
	public Set<Student> getAllStudents() {
		return students;
	}

}
