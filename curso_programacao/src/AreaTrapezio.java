public class AreaTrapezio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double baseMenor = 6.0, baseMaior = 8.0, h = 5.0;
		double areaTrapezio;
		areaTrapezio = ( baseMenor + baseMaior ) / 2 * h;

		System.out.printf("�rea Total Trap�zio: %.2f \n", areaTrapezio);
		
		outroCalculoArea();
	}
	
	public static void outroCalculoArea() {
		// Transforma o trap�zio em dois pol�gonos: um ret�ngulo ( bMenor * bMaior ) / 2 e um tri�ngulo ( b * h ) / 2
		int baseMenorRetangulo = 5, baseMaiorRetangulo = 6, h = 5;
		double areaRetangulo, areaTriangulo;
		
		areaRetangulo = ( baseMenorRetangulo * baseMaiorRetangulo );
		areaTriangulo = ( h * ( 8 - baseMaiorRetangulo ) ) / 2;

		System.out.printf("�rea Total Trap�zio [Ret�ngulo + Tri�ngulo]: %.2f \n", areaRetangulo + areaTriangulo);
	}
}
