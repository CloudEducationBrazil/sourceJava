import java.util.Locale;

// Curso mais didático e completo de Java e OO. UML, JDBC, JavaFX, Spring Boot, JPA, Hibernate, MySQL, MongoDB e muito mais

public class SaidaPrintPrintf {
			public static void main(String[] args) {
			    String product1 = "Computer";
			    String product2 = "Office desk";
			    int age = 30;
			    int code = 2093;
			    char gender = 'F';
			    double price1 = 2100.0;
			    double price2 = 650.50;
			    double measure = 53.234769;
			    
			    System.out.println("Products:");
			    System.out.printf(product1+", which price is $ %f \n", price1);
			    System.out.printf(product2+", which price is $ %f \n\n", price2);

			    System.out.print("Records:" + age + " years old, code " + code + " and gender: " + gender + "\n\n");
			    System.out.printf("Measue with eight decimal places: %.8f: \n", measure);
			    System.out.printf("Rounded (three decimal places): %.3f \n", measure);

			    //Locale ptBr = new Locale("pt", "BR");
			    Locale.setDefault(Locale.US);
			    System.out.printf("US decimal point: %.3f", measure);
	}
}
