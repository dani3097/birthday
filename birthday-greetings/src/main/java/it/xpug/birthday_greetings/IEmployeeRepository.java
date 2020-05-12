package it.xpug.birthday_greetings;

public interface IEmployeeRepository {

	
	//public void sendGreetings(String fileName, XDate xDate, String smtpHost, int smtpPort) throws IOException, ParseException, AddressException, MessagingException {
	//BufferedReader in = new BufferedReader(new FileReader(fileName));
	//String str = "";
	//str = in.readLine(); // skip header
	//while ((str = in.readLine()) != null) {
		//String[] employeeData = str.split(", ");
		//Employee employee = new Employee(employeeData[1], employeeData[0], employeeData[2], employeeData[3]);
		//if (employee.isBirthday(xDate)) {
			//String recipient = employee.getEmail();
			//String body = "Happy Birthday, dear %NAME%".replace("%NAME%", employee.getFirstName());
			//String subject = "Happy Birthday!";
			//sendMessage(smtpHost, smtpPort, "sender@here.com", subject, body, recipient);
		//}
//	}
}
}
