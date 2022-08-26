package cuerposgeometricos;

public class Icosaedro {

	public static void main(String[] args) {
		double Area, Volumen, arista;
		
		arista=8;
		Area= 5*Math.pow(arista,2)*Math.sqrt(3);
		Volumen = (3+Math.sqrt(5))*Math.pow(arista,3)*5/12;
		
		System.out.println("--------------------------");
		System.out.println("Datos Del Icosaedro : ");
		System.out.println("1.La Arista es : " + arista);
		System.out.println("2.El Area Total es : "+String.format("%.2f",Area));
		System.out.println("3.El Volumen es : "+String.format("%.2f",Volumen));
		System.out.println("--------------------------");
	}

}
