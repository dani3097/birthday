package it.xpug.birthday_greetings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class BirthdayService {
	private EmployeeRepository repository;
	private MessageService messageService;

	public void BirthdayService(IEmployeeRepository repository, IMessageService messageService){
		this.repository=repository;
		this.messageService=messageService;
	}
	public void sendGreetings(OurDate today)
	{
		List<Employee> employees=;
		for (Employee employee: employees) {
			Greetings greetings=new Greetings (employee);
			messageService.send(greetings);
		}
	}
	


}
