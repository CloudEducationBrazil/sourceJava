public class AreaTrapezio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double baseMenor = 6.0, baseMaior = 8.0, h = 5.0;
		double areaTrapezio;
		areaTrapezio = ( baseMenor + baseMaior ) / 2 * h;

		System.out.printf("Área Total Trapézio: %.2f \n", areaTrapezio);
		
		outroCalculoArea();
	}
	
	public static void outroCalculoArea() {
		// Transforma o trapézio em dois polígonos: um retângulo ( bMenor * bMaior ) / 2 e um triângulo ( b * h ) / 2
		int baseMenorRetangulo = 5, baseMaiorRetangulo = 6, h = 5;
		double areaRetangulo, areaTriangulo;
		
		areaRetangulo = ( baseMenorRetangulo * baseMaiorRetangulo );
		areaTriangulo = ( h * ( 8 - baseMaiorRetangulo ) ) / 2;

		System.out.printf("Área Total Trapézio [Retângulo + Triângulo]: %.2f \n", areaRetangulo + areaTriangulo);
	}
}
