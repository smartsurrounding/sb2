package smartpro.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileWriter {

	// Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	// CSV file header
	private static final String FILE_HEADER = "id,firstName,lastName,gender,age";

	public static void writeCsvFile(String fileName) {

		// Create new PojoStudents objects
		PojoStudent pojoStudent1 = new PojoStudent(1, "Ahmed", "Mohamed", "M", 25);
		PojoStudent pojoStudent2 = new PojoStudent(2, "Sara", "Said", "F", 23);
		PojoStudent pojoStudent3 = new PojoStudent(3, "Ali", "Hassan", "M", 24);
		PojoStudent pojoStudent4 = new PojoStudent(4, "Sama", "Karim", "F", 20);
		PojoStudent pojoStudent5 = new PojoStudent(5, "Khaled", "Mohamed", "M", 22);
		PojoStudent pojoStudent6 = new PojoStudent(6, "Ghada", "Sarhan", "F", 21);

		// Create a new list of PojoStudent objects
		List<PojoStudent> pojoStudents = new ArrayList<PojoStudent>();
		pojoStudents.add(pojoStudent1);
		pojoStudents.add(pojoStudent2);
		pojoStudents.add(pojoStudent3);
		pojoStudents.add(pojoStudent4);
		pojoStudents.add(pojoStudent5);
		pojoStudents.add(pojoStudent6);

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(fileName);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			// Write a new PojoStudent object list to the CSV file
			for (PojoStudent pojoStudent : pojoStudents) {
				fileWriter.append(String.valueOf(pojoStudent.getId()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(pojoStudent.getFirstName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(pojoStudent.getLastName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(pojoStudent.getGender());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(pojoStudent.getAge()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}

		}
	}
}