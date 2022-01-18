package de.unistuttgart.iste.sqa.pse.sheet12.presence.collectionstreams;

/**
 * In this class you are supposed to train your skills in using the Java Streams API and Collections.
 * Implement the 4 empty operations in this class properly by using streams.
 * Do not forget to use defensive programming and to comment your code!
 */
public class StreamsAndFilterExercise {

	public static void main(String[] args) {
		StudentRecord record = new StudentRecord();
		DataGenerator.fillRecordWithTestData(record);
		DataGenerator.fillRecordWithRealLifePSEMarks(record);

		getStudentName(record);
		getStudentsNameOlderThan(record, 23);
		getNumberOfStudentsOlderThan(record, 23);
		getStudentsFaildExam(record, 25, "PSE");

	}

	private static void getStudentName(StudentRecord record) {
	}

	private static void getNumberOfStudentsOlderThan(StudentRecord record, int olderThan) {
	}

	private static void getStudentsNameOlderThan(StudentRecord record, int olderThan) {
	}

	private static void getStudentsFaildExam(StudentRecord record, int olderThan, String exam) {

	}

}