import java.util.Scanner;

public class Main {
  /* 
  Es el punto de entrada a la aplicación y es donde comienza la ejecución del programa
  El modificador public - puede ser accedido desde cualquier clase en el programa.
  El modificador static- método puede ser llamado sin necesidad de crear una instancia de la clase.
  El modificador void - método no devuelve ningún valor.
  El parámetro args es una matriz de cadenas que contiene los argumentos que se pasan
  */
  public static void main(String[] args) {

    /*
    * --------------------------------------------------------------------
    * VARIABLES LOCALES
    * Solo estan dentro de esta funcion o metodo
    * Toman el valor del usuario con el scanner
    * Se le asigna a los atributos privados por medio de set / get
    * --------------------------------------------------------------------
    */
    int id = 0;
    String titulo = "";
    String autor = "";
    int duracion = 0;
    int year = 1990;

    /*
    * --------------------------------------------------------------------
    * INSTANCIA DE OBJETO CLASE CANCION
    * El constructor definido necesita todos los parametros
    * Se pueden crear tantas canciones instancias como sean necesarias
    * --------------------------------------------------------------------
    */
    Cancion cancion_inst = new Cancion(id, titulo, autor, duracion, year);

    /*
    * --------------------------------------------------------------------
    * UTILIDAD SCANNER 
    * --------------------------------------------------------------------
    */
    Scanner sc = new Scanner(System.in);

    /*
    * --------------------------------------------------------------------
    * PROGRAMA
    * --------------------------------------------------------------------
    */
    // Set
    System.out.println("Agregar cancion Id");
    cancion_inst.setId(sc.nextInt());
    
    System.out.println("Agregar cancion Titulo");
    cancion_inst.setTitulo(sc.next());
    
    System.out.println("Agregar cancion Autor");
    cancion_inst.setAutor(sc.next());
    
    System.out.println("Agregar cancion Duracion Seg");
    cancion_inst.setDuracion(sc.nextInt());

    System.out.println("Agregar cancion Year");
    cancion_inst.setYear(sc.nextInt());

    // Get
    System.out.println("---------------------------------------------");
    System.out.println("Tu ID es: " + cancion_inst.getId());
    System.out.println("Tu Titulo es: " + cancion_inst.getTitulo());
    System.out.println("Tu Autor es: " + cancion_inst.getAutor());
    System.out.println("Tu Duracion Seg es: " + cancion_inst.getDuracion());
    System.out.println("Tu Year es: " + cancion_inst.getYear());

    // Functions
    System.out.println(
      "Tu Duracion Min (myFunction) es: " + 
      cancion_inst.myFunction_convertMinutes(cancion_inst.getDuracion())
    );
    
  }
}
