package cuerposgeometricos;

public class Octaedro {

	public static void main(String[] args) {
		double a,A,V;
		
		a=2;
		A=2*Math.pow(a, 2)*Math.sqrt(3);
		V=Math.sqrt(2)/3*Math.pow(a, 3);
		
		System.out.println("--------------------------");
		System.out.println("Datos Del Octaedro : ");
        System.out.println("1.El Area menor es : "+String.format("%.2f",a));
        System.out.println("2.El Area mayor es : "+String.format("%.2f",A));
        System.out.println("3.El Volumen es : "+String.format("%.2f",V));
        System.out.println("--------------------------");
	}

}
