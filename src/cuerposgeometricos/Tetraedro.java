package cuerposgeometricos;

public class Tetraedro {

	public static void main(String[] args) {
		float  a;
		double area,volumen,H;
		
		a=4;

		area=Math.pow(a,2 )*Math.sqrt(3);
		volumen=(Math.sqrt(2)/2)*Math.pow(a, 3);
		H=a*( Math.sqrt(6)/3);
		
		System.out.println("----------------------------");
		System.out.println("Datos del tetraedro");
		System.out.println("1.Area del tetraedro: "+String.format("%.2f",area));
		System.out.println("2.Volumen: "+String.format("%.2f",volumen));
		System.out.println("3. H : "+String.format("%.2f",H));
		System.out.println("----------------------------");

	}

}
