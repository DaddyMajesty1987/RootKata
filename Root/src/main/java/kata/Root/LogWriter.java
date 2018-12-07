package kata.Root;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

public class LogWriter {
	
	
	public void writeLog(String typeOfTransaction, double amount, double updatedBalance) {

		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		try (PrintWriter logWriter = new PrintWriter(new FileOutputStream(new File("./log.txt"), true))) {

			String printToday = today.toString();
			String printTime = now.toString().substring(0, now.toString().length() - 4);
			String printTypeOfTransaction = typeOfTransaction.toString();
			double printAmount = amount;
			double printBalance = updatedBalance;

			logWriter.println(printToday + " " + printTime + " " + String.format("%-25s", printTypeOfTransaction)
			+ String.format("%-10s", "$" + printAmount) + String.format("%-10s", "$" + printBalance));

		} catch (FileNotFoundException e) {
			e.getMessage();
		}
	}
}
