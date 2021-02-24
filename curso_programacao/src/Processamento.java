
public class Processamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x;
		double y;
		x = 5f;
		y = 2.0 * x;
		System.out.println(x);
		System.out.println(y);
		
		int a = 5, b = 2;
		double resultado;
		
		resultado = a / b;
		System.out.println("Resultado 1: " + resultado);

		resultado = (double) a / b; // casting
		System.out.println("Resultado 2: " + resultado);
	}

}
