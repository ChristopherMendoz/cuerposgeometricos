package cuerposgeometricos;

public class Huso_Esferico {
	public static void main(String[] arg) {
	   double Area, Volumen, r , n ;
	
	   r=8;
	   n=45; 
	   Area= (Math.PI*Math.pow(r,2)*n)/90;
	   Volumen = (Math.PI*Math.pow(r,3)*n)/270;

	System.out.println("--------------------------");
	System.out.println("Datos Del Huso Esferico : ");
	System.out.println("1.El Radio es : "+r);
	System.out.println("2.El Area Total es : "+String.format("%.2f",Area));
	System.out.println("3.El Volumen es : "+String.format("%.2f",Volumen));
	System.out.println("--------------------------");
  }
}
