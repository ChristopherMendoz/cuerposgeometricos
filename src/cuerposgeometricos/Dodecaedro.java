package cuerposgeometricos;

public class Dodecaedro {

	public static void main(String[] args) {
         double Area, Volumen, arista;
		
		arista=5;
		Area= 3*Math.pow(arista,2)*Math.sqrt(25+10*Math.sqrt(5));
		Volumen = (15+7*(Math.sqrt(5)))*Math.pow(arista,3)*1/4;
		
		System.out.println("--------------------------");
		System.out.println("Datos de la Dodecaedro : ");
		System.out.println("1.El Area Total es : "+String.format("%.2f",Area));
		System.out.println("2.El Volumen es : "+String.format("%.2f",Volumen));
		System.out.println("--------------------------");


	}

}
