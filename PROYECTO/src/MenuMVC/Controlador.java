package MenuMVC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controlador  {
	public static void main (String [] args) { 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
        	System.out.println("\nMercado Libre");
        	System.out.println("\nCategorias: ");
            System.out.println("1. Musica   ");
            System.out.println("2. Consolas");
            System.out.println("3. Peliculas");
            System.out.println("4. Televisores");
            System.out.println("5. Telefonia");
            System.out.println("6. Ropa");
            System.out.println("7. Calzado");
            System.out.println("8. Instrumentos");
            System.out.println("9. Herramientas");
            System.out.println("10. Muebles");
            System.out.println("11. Lavadoras");
            System.out.println("12. Computadoras");
            System.out.println("13. Autos");
            System.out.println("14. Salir");
 
            try {
 
                System.out.println("");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        Musica musica = new Musica ( "Voice", "Cancion Digital", " Electronica", 005, 70 );
                        musica.MostarDatosM();
                        break;
                    case 2:
                        Consolas xbox = new Consolas ("Xbox One", "Xbox", "Proyect Scorpion", "SI", 17, 12899);
                        xbox.MostrarDatosCon();
                        break;
                    case 3:
                        Peliculas peli = new Peliculas("Terror", "+18", "El camino hacie el terror 2", "DVD", 2013, 124, 210542);
                        peli.MostrarPeliculas();
                        break;                    
                   case 4:
                         Televisores tv = new Televisores("BRAVIA", "SONY", "4K", "SI", 49, 12699, 10224564);
                         tv.MD();
                         break;
                   case 5:
                       Telefonia cel = new Telefonia ("Y9 2019", "Huawei", "Portatil", "SI", 6.5f, 5400, 1064);
                       cel.MostrarDcel();
                       break;
                   case 6:
                       Ropa ropa = new Ropa("Peanuts Football", "PEANUTS", "Playera ", "G", 120, 10400);
                       ropa.MostrarDropa();
                       break;
                   case 7:
                       Calzado zapa = new Calzado("LEVIS", "Hombre", "Levis", "Botas Casuales", 27, 1099, 10220094);
                       zapa.MostrarDatoszapatos();
                       break;
                   case 8:
                       Instrumentos guitarra = new Instrumentos("Guitarra Acustica", "Instrumento de Cuerda", "OCELOTL", "SI", 1050, 16609);
                      guitarra.MostrarDatosintru();
                       break;
                   case 9:
                       Herramientas martillo = new Herramientas("Caja de Destornilladores", "Tecnico", "SI", 510, 1200);
                       martillo.MostrarDatosH();
                       break;
                   case 10:
                        Muebles silla = new Muebles("Silla de plastico", "Jardin", "Blanco", "SI", 800, 12900);
                       silla.MostrarDatosmue();
                       break;
                   case 11:
                       Lavadoras lava = new Lavadoras ("WA19T", "Samsung", "Gris Oscuro", "SI", 19, 10299, 6260);
                       lava.MostrarDatoslava();
                       break;
                   case 12:
                       Computadoras compu = new Computadoras ("LEGION", "Lenovo", "Y520", "Portatil Gaming","SI", 18699, 10288951);
                       compu.MostrarDatoscompu();
                       break;
                   case 13:
                       Auto carro = new Auto ("FOCUS HB", "2014", "HachBack", "Negro","FORD", 5, 120599, 16062);
                       carro.MostrarDatosAuto();
                       break;
                    case 14:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
 

		
}
	
