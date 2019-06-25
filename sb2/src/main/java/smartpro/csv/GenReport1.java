package smartpro.csv;

public class GenReport1 {
	public static void main(String[] args) {

		String fileName = "student.csv";

		System.out.println("Write CSV file:");
		CsvFileWriter.writeCsvFile(fileName);

	}
}