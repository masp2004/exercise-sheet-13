package de.unistuttgart.iste.sqa.pse.sheet12.presence.collectionstreams;

/**
 * In this class you are supposed to train your skills in using the Java Streams API and Collections.
 * Implement the four empty operations in this class properly by using streams.
 * Do not forget to use defensive programming and to comment your code!
 */
public final class StreamsAndFilterExercise {

	public static void main(String[] args) {
		final StudentRecord record = new StudentRecord();
		DataGenerator.fillRecordWithTestData(record);
		DataGenerator.fillRecordWithRealLifePSEMarks(record);

		getStudentName(record);
		getStudentsNameOlderThan(record, 23);
		getNumberOfStudentsOlderThan(record, 23);
		getStudentsFailedExam(record, 25, "PSE");
	}

	private static void getStudentName(final StudentRecord record) {
		//TODO: implement
	}

	private static void getNumberOfStudentsOlderThan(final StudentRecord record, final int olderThan) {
		//TODO: implement
	}

	private static void getStudentsNameOlderThan(final StudentRecord record, final int olderThan) {
		//TODO: implement
	}

	private static void getStudentsFailedExam(final StudentRecord record, final int olderThan, final String exam) {
		//TODO: implement
	}

}
