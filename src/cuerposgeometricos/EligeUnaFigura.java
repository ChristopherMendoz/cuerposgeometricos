package cuerposgeometricos;

import java.util.*;
public class EligeUnaFigura {

	static Scanner es = new Scanner(System.in);
	static double radio, RadioM,radiomenor, h, Perimetrobase, AreaLateral, Areabase, Areabasemayor, Areabasemenor, AreaTotal,
			Volumen, Generatriz, Caras,
			Vertices, Apotema, Aristas, Area, Areapentagonal, Longitudlados;

	public static void main(String[] args) {

		System.out.println("Bienvenido al Programa de Figuras Geometricas \n"
				+ "En la que pueden elegir la Figura de la cual desean conocer los datos");

		System.out.println("De que figura desea conocer los datos?");
		System.out.println("1.Cilindro \n"
				+ "2. Cono\n"
				+ "3. Dodecaedro\n"
				+ "4. Esfera\n"
				+ "5. Zonas de la Esfera\n"
				+ "6. Hexaedro\n"
				+ "7. Icosaedro\n"
				+ "8. Octaedro\n"
				+ "9. Ortoedro\n"
				+ "10. Piramide\n"
				+ "11. Tetraedro\n"
				+ "12. Tronco de Cono\n"
				+ "13. Tronco de Piramide\n"
				+ "14. Prisma");
		int figura = es.nextInt();

		switch (figura) {
			case 1:
				System.out.println("Datos del Cilindro \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese la Altura");
				h = es.nextDouble();
				System.out.println("Ingrese su Radio");
				radio = es.nextDouble();

				cilindro(h, radio);
				break;
			case 2:
				System.out.println("Datos del Cono \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese la Altura");
				h = es.nextDouble();
				System.out.println("Ingrese su Radio");
				radio = es.nextDouble();

				cono(h, radio);
				break;
			case 3:
				System.out.println("Datos del Dodecaedro \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese sus Caras");
				Caras = es.nextDouble();
				System.out.println("Ingrese sus Vertices");
				Vertices = es.nextDouble();
				System.out.println("Ingrese su Apotema");
				Apotema = es.nextDouble();

				dodecaedro(Caras, Vertices, Apotema);
				break;
			case 4:
				System.out.println("Datos del Esfera \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese su Radio");
				radio = es.nextDouble();

				esfera(radio);
				break;
			case 5:
				System.out.println("Datos de las Zonas de las esferas \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese su radio");
				radio = es.nextDouble();
				System.out.println("Ingrese su Altura");
				h = es.nextDouble();
				System.out.println("Ingrese su Radio Mayor");
				RadioM = es.nextDouble();

				zonaesfera(radio, h, RadioM);
				break;
			case 6:
				System.out.println("Datos del Hexaedro \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese sus Caras");
				Caras = es.nextDouble();
				System.out.println("Ingrese sus Vertices");
				Vertices = es.nextDouble();

				hexaedro(Caras, Vertices);
				break;
			case 7:
				System.out.println("Datos del Icosaedro \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese sus Caras");
				Caras = es.nextDouble();
				System.out.println("Ingrese sus Vertices");
				Vertices = es.nextDouble();

				icosaedro(Caras, Vertices);
				break;
			case 8:
				System.out.println("Datos del Octaedro \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese sus Caras");
				Caras = es.nextDouble();
				System.out.println("Ingrese sus Vertices");
				Vertices = es.nextDouble();

				octaedro(Caras, Vertices);
				break;
			case 9:
				System.out.println("Datos del Ortoedro \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese sus Caras");
				Caras = es.nextDouble();
				System.out.println("Ingrese sus Vertices");
				Vertices = es.nextDouble();
				System.out.println("Ingrese la medida de la Base Menor");
				double Basemenor = es.nextDouble();

				ortoedro(Caras, Vertices, Basemenor);
				break;
			case 10:
				System.out.println("Datos del Triangulo \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese la Altura");
				h = es.nextDouble();
				System.out.println("Ingrese la longitud de los lados");
				Longitudlados = es.nextDouble();

				triangulo(h, Longitudlados);
				break;
			case 11:
				System.out.println("Datos del Tetraedro \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese sus Caras");
				Caras = es.nextDouble();
				System.out.println("Ingrese sus Vertices");
				Vertices = es.nextDouble();

				tetraedro(Caras, Vertices);
				break;
			case 12:
				System.out.println("Datos del Tetraedro \n"
						+ "Ingrese los datos Porfavor");
				System.out.println("Ingrese el Area de la Base mayor");
				Areabasemayor = es.nextDouble();
				System.out.println("Ingrese su Altura");
				h = es.nextDouble();
				System.out.println("Ingrese su Radio menor");
				radiomenor = es.nextDouble();
				System.out.println("Ingrese su Radio Mayor");
				RadioM = es.nextDouble();

				tetraedro(Areabasemayor, h, radiomenor);
		
		}

	}

	private static void cilindro(double radio, double h) {

		Perimetrobase = (2 * Math.PI) * radio;
		AreaLateral = Perimetrobase * h;
		Areabase = Math.PI * (2 * radio);
		AreaTotal = AreaLateral + (2 * Areabase);
		Volumen = Areabase * h;

		System.out.println(" El perimetro base del Cilindro es: " + String.format("%.2f", Perimetrobase));
		System.out.println("El Area Lateral del Cilindro es: " + String.format("%.2f", AreaLateral));
		System.out.println("El Area base del Cilindro es: " + String.format("%.2f", Areabase));
		System.out.println(" El Area Total del Dcilindo es: " + String.format("%.2f", AreaTotal));
		System.out.println("El Volumen del Cilindro es: " + String.format("%.2f", Volumen));
	}

	private static void cono(double radio, double h) {
		Generatriz = (Math.pow(h, 2) + (Math.pow(radio, 2)));
		Perimetrobase = Math.PI * 2 * radio;
		AreaLateral = (Perimetrobase * Generatriz) / 2;
		Areabase = Math.PI * (Math.pow(radio, 2));
		AreaTotal = AreaLateral + Areabase;
		Volumen = (Areabase * h) / 3;

		System.out.println("El radio del Cono es. " + radio);
		System.out.println("La altura del cono es: " + h);
		System.out.println("El Perimetro base del cono es: " + String.format("%.2f", Perimetrobase));
		System.out.println("El Area lateral del cono es. " + String.format("%.2f", AreaLateral));
		System.out.println("El Area Base del cono es: " + String.format("%.2f", Areabase));
		System.out.println("El AreaTotal del cono es: " + String.format("%.2f", AreaTotal));
		System.out.println("El Volumen del cono es :" + String.format("%.2f", Volumen));
	}

	private static void dodecaedro(double Caras, double Vertices, double Apotema) {

		Aristas = Caras + Vertices;
		Area = (3 * Math.pow(Aristas, 2)) * Math.sqrt(25 + 10 * Math.sqrt(5));
		Areapentagonal = 5 * (Aristas * Apotema);
		Volumen = 1 * (15 + (7 * Math.sqrt(5))) * Math.pow(Aristas, 3) / 4;

		System.out.println("El Dodecaedro tiene " + Caras + " caras");
		System.out.println("El Dodecaedro tiene " + Vertices + " Vertices");
		System.out.println("El Dodecaedro tiene " + (Aristas - 2) + " Aristas");
		System.out.println("EL Apotema del Dodecaedro es de: " + String.format("%.2f", Apotema));
		System.out.println("El Area del Dodecaedro es de: " + String.format("%.2f", Area));
		System.out.println("El Area Pentagonal del Dodecaedro es de: " + String.format("%.2f", Areapentagonal));
		System.out.println("El Volumen del Dodecaedro es de: " + String.format("%.2f", Volumen));
	}

	private static void esfera(double radio) {

		Area = (4 * Math.PI) * (radio * radio);
		Volumen = 4 * (Math.PI * (radio * radio * radio)) / 3;

		System.out.println("Datos de la Esfera");
		System.out.println("El Radio de la esfera es: " + radio);
		System.out.println("El Area de la Esfera es: " + String.format("%.2f", Area));
		System.out.println("El Volumen de la Esfera es: " + String.format("%.2f", Volumen));
	}

	private static void zonaesfera(double radio, double h, double RadioM) {

		double Areazonaesferica = 2 * Math.PI * (RadioM * h);
		double Volumenzonaesferica = (Math.PI * h)
				* (Math.pow(h, 2) + (3 * Math.pow(RadioM, 2) + (3 * Math.pow(radio, 2))));
		double AreaCesferico = (2 * Math.PI) * (RadioM * h);
		double Volumencesferico = ((Math.PI * Math.pow(h, 2)) * (3 * radio - h)) / 3;

		System.out.println("Datos de la Zona Esferica");
		System.out.println("EL Radio menor de  la Esfera es: " + radio);
		System.out.println("El Radio mayor de la Esfera es: " + RadioM);
		System.out.println("La altura de la Esfera es: " + h);
		System.out.println("El Area de la Zona Esferica es:" + String.format("%.2f", Areazonaesferica));
		System.out.println("El Volumen de la Zona Esferica es: " + String.format("%.2f", Volumenzonaesferica));
		System.out.println("El Area del Casquere Esferico es: " + String.format("%.2f", AreaCesferico));
		System.out.println("El Volumen del Casquete esferico es: " + String.format("%.2f", Volumencesferico));

	}

	private static void hexaedro(double Caras, double Vertices) {

		Aristas = Caras + Vertices;
		Area = 6 * Math.pow(Aristas, 2);
		Volumen = Math.pow(Aristas, 3);
		double D = Aristas * Math.sqrt(3);

		System.out.println("El Hexaedro tiene " + Caras + " caras");
		System.out.println("El Hexaedro tiene " + Vertices + " Vertices");
		System.out.println("El Hexaedro tiene " + (Aristas - 2) + " Aristas");
		System.out.println("El Area del Hexaedro es de: " + String.format("%.2f", Area));
		System.out.println("El Volumen del Hexaedro es de: " + String.format("%.2f", Volumen));
		System.out.println("La Diagonal del Hexaedro es de: " + String.format("%.2f", D));
	}

	private static void icosaedro(double Caras, double Vertices) {

		Aristas = Caras + Vertices;
		Area = 5 * Math.pow(Aristas, 2) * Math.sqrt(3);
		Volumen = 5 * (3 + Math.sqrt(5)) * Math.pow(Aristas, 3) / 12;

		System.out.println("El Icosaedro tiene " + Caras + " caras");
		System.out.println("El Icosaedro tiene " + Vertices + " Vertices");
		System.out.println("El Icosaedro tiene " + (Aristas - 2) + " Aristas");
		System.out.println("El Area del Icosaedro es de: " + String.format("%.2f", Area));
		System.out.println("El Volumen del Icosaedro es de: " + String.format("%.2f", Volumen));
	}

	private static void octaedro(double Caras, double Vertices) {

		Aristas = Caras + Vertices;
		Area = 2 * Math.pow(Aristas, 2) * Math.sqrt(3);
		Volumen = Math.sqrt(2) * Math.pow(Aristas, 2) / 3;

		System.out.println("El Octaedro tiene " + Caras + " caras");
		System.out.println("El Octaedro tiene " + Vertices + " Vertices");
		System.out.println("El Octaedro tiene " + (Aristas - 2) + " Aristas");
		System.out.println("El Area del Octaedro es de: " + String.format("%.2f", Area));
		System.out.println("El Volumen del Octaedro es de: " + String.format("%.2f", Volumen));
	}

	private static void ortoedro(double Caras, double Vertices, double basemenor) {

		Aristas = Caras + Vertices;
		Area = 2 * ((Aristas * basemenor) + (Aristas * Caras) + basemenor * Caras);
		double Diagonal = Math.sqrt(Math.pow(Area, 2) + Math.pow(basemenor, 2) + Math.pow(Caras, 2));
		Volumen = Aristas * basemenor * Caras;

		System.out.println("El Ortoedro tiene " + Caras + " caras");
		System.out.println("El Ortoedro tiene " + Vertices + " Vertices");
		System.out.println("El Ortoedro tiene " + (Aristas - 2) + " Aristas");
		System.out.println("El Area del Ortoedro es de: " + String.format("%.2f", Area));
		System.out.println("El Volumen del Ortoedro es de: " + String.format("%.2f", Volumen));
		System.out.println("La Diagonal del Ortoedro es de: " + String.format("%.2f", Diagonal));
	}

	private static void triangulo(double h, double Longitudlados) {

		System.out.println("La Altura de la Piramide es: " + h);
		System.out.println("La Longitud de los lados de la base es: " + Longitudlados);
		System.out.println("El Apotema de la Piramide es: " + Apotema);
		System.out.println("El Perimetro base de la Piramide es: " + String.format("%.2f", Perimetrobase));
		System.out.println("El Area lateral de la Piramide es. " + String.format("%.2f", AreaLateral));
		System.out.println("El Area Base de la Piramide es: " + String.format("%.2f", Areabase));
		System.out.println("El AreaTotal de la Piramide es: " + String.format("%.2f", AreaTotal));
		System.out.println("El Volumen de la Piramide es :" + String.format("%.2f", Volumen));
	}

	private static void tetraedro(double Caras, double Vertices) {

		Aristas = Caras + Vertices;
		Area = Math.pow(Aristas, 2) * Math.sqrt(3.0);
		Volumen = Math.sqrt(2) * Math.pow(Aristas, 3) / 12;
		h = Aristas * (Math.sqrt(6) / 3);

		System.out.println("El Tetraedro tiene " + Caras + " caras");
		System.out.println("El Tetraedro tiene " + Vertices + " Vertices");
		System.out.println("El Tetraedro tiene " + (Aristas - 2) + " Aristas");
		System.out.println("El Area del Tetraedro es de: " + String.format("%.2f", Area));
		System.out.println("El Volumen del Tetraedro es de: " + String.format("%.2f", Volumen));
		System.out.println("La Altura del Tetraedro es " + String.format("%.2f", h));
	}

	private static void troncodecono(double Areabasemayor, double h, double radiomenor, double RadioM) {

		double generatrizal2 = Math.pow(h, 2) + Math.pow(radiomenor, 2);
		Generatriz = Math.sqrt(generatrizal2);
		AreaLateral = (Math.PI * Generatriz) * (RadioM + radiomenor);
		Areabasemenor = Math.PI * (Math.pow(radiomenor, 2));
		AreaTotal = AreaLateral + Areabasemenor + Areabasemayor;
		Volumen = 1 * (Math.PI * h) * ((Math.pow(RadioM, 2) + (Math.pow(radiomenor, 2) + (RadioM * radiomenor)))) / 3;

		System.out.println("El Area lateral del Tronco de Cono es: " + String.format("%.2f", AreaLateral));
		System.out.println("El Area Total del Tronco de Cono es: " + String.format("%.2f", AreaTotal));
		System.out.println("El Volumen del Tronco de cono es: " + String.format("%.2f", Volumen));
	}

}
