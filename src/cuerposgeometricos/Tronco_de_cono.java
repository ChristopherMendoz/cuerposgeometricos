package cuerposgeometricos;

public class Tronco_de_cono {

	public static void main(String[] args) {
		float r,R,h;
		double areaLateral,Volumen,areaTotal,g,AB,Ab;
		
		r=2;
		R=2;
		h=4;
		
		AB=Math.PI*Math.pow(R,2);
		Ab=Math.PI*Math.pow(r,2);
		g=Math.sqrt((Math.pow(h,2)+(Math.pow(r,2))));
		areaLateral= Math.PI*g*(R+r);
		areaTotal=areaLateral+AB+Ab;
		Volumen=(Math.PI*h*(Math.pow(R,2)+Math.pow(r,2)+R*r)/3);
		
		System.out.println("----------------------------");
        System.out.println("Datos del tronco de cono");
	    System.out.println("1.Area lateral: "+String.format("%.2f",areaLateral));
	    System.out.println("2.Area Total: "+String.format("%.2f",areaTotal));
	    System.out.println("3.Volumen: "+String.format("%.2f",Volumen));
		System.out.println("4.Generatriz: "+String.format("%.2f",g));
		System.out.println("----------------------------");
	}

}
