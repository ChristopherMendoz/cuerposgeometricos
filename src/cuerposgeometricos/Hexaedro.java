package cuerposgeometricos;

public class Hexaedro {

	public static void main(String[] args) {
        double D,am,V,AM;
		
		am=2.25;
		AM=6*Math.pow(am, 2);
		V=Math.pow(am, 3);
		D=am*Math.sqrt(3);
		
		System.out.println("----------------------------");
		System.out.println("Datos Del Hexaedro");
	    System.out.println("1.Area menor :"+String.format("%.2f",am));
	    System.out.println("2.Area mayor :"+String.format("%.2f",AM));
	    System.out.println("3.Volumen :"+String.format("%.2f",V));
	    System.out.println("4. D :"+String.format("%.2f",D));
	    System.out.println("----------------------------");

	}

}
