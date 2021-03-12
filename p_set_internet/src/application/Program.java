package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.LogRegister;

public class Program {

	public static void main(String[] args) throws ParseException {
		// https://github.com/acenelio/set1-java
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("************ System Logs ************");
		System.out.println();

		// System.out.print("Enter file full path: ");
		// String path = sc.nextLine();

		String path = "c:\\temp\\logs.txt";
		
		List<LogRegister> list = new ArrayList<LogRegister>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// Não deve utilizar o método TreeSet, pois, objetivo é calcular o total de users
			// Set<LogRegister> set = new TreeSet<LogRegister>();
			
			// Conjunto sem ordenar - Tabela Hash
			Set<LogRegister> set = new HashSet<LogRegister>();
			
			LogRegister lgr = new LogRegister();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");

				// Data 2018-08-26T20:45:08Z
				// set.add(new LogRegister(fields[0], sdf.parse(fields[1])));

				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
	
				lgr = new LogRegister(username, moment);
				
				// Set insere no conjunto sem repetir registro
				set.add(lgr);
				list.add(lgr);

				line = br.readLine();
			}

			System.out.println("Filters Users");
			for (LogRegister lgr2 : set) {
				System.out.println(lgr2);
			}

			System.out.println("Total users: " + set.size());

			System.out.println();
			System.out.println("All Users");
			Collections.sort(list);
			for (LogRegister lgr2 : list) {
				System.out.println(lgr2);
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}