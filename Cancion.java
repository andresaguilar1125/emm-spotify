/*
 Se define la clase como public por principios de encapsulacion y abstraccion en los lenguajes orientados a objetos (OOP) 
 ayuda a proteger las otras clases y mediante los get y set (encapsulacion) se modifican los atributos y no se cambian directamente
 Java es OOP
*/

public class Cancion {

 /*
  * --------------------------------------------------------------------
  * ATRIBUTOS
  * Notar que los atributos estan privados porque la clase es publica
  * Las otras clases puden accesar a los atributos mediante la
  * encapsulacion get y set y no modificar los atributos directamente
  * --------------------------------------------------------------------
  */

 // Asumiendo que el id de la cancion es solo un numero y no contine letras
 private int id;

 // Titulo de la cancion tipo String
 private String titulo;

 // Autor de la cancion tipo String
 private String autor;

 // Por lo general la canciones se miden en segundos o minutos/segundos
 // Se podria usar int (entero) para duracion en segundos 189 seg
 // Se podria usar double (decimal) para duracion en min/seg 3.15 min
 // Se podria usar float (decimal) para precision detallada 3.15000000000 min
 private int duracion;

 // Tipo Date (es una libreria Utilitidad de Java)
 // Permite manipular rapidamente fechas, UTC (zonas horarias)
 // Esta seria la mejor manera de definirla
 // Se puede definir como tipo int (entero)
 private int year;

 /*
  * --------------------------------------------------------------------
  * CONSTRUCTOR
  * Aqui toma todos los atributos y hace referencia
  * Se pueden crear tantos constructores con tantos parametros como sean
  * necesarios
  * --------------------------------------------------------------------
  */

 // Ejemplo constructor #1
 public Cancion(int id, String titulo, String autor, int duracion, int year) {
  this.id = id;
  this.titulo = titulo;
  this.autor = autor;
  this.duracion = duracion;
  this.year = year;
 }

 /*
  * --------------------------------------------------------------------
  * ENCAPSULACION
  * Get y Set se define publico porque las clases acceden a los atributos
  * por medio de estos
  * --------------------------------------------------------------------
  */

 // GETTERS

 public int getId() {
  return id;
 }

 public String getTitulo() {
  return titulo;
 }

 public String getAutor() {
  return autor;
 }

 public int getDuracion() {
  return duracion;
 }

 public int getYear() {
  return year;
 }

 // SETTERS --
 // todos son void porque no regresan valor modifican el atributo de esta clase

 public void setId(int id) {
  this.id = id;
 }

 public void setTitulo(String titulo) {
  this.titulo = titulo;
 }

 public void setAutor(String autor) {
  this.autor = autor;
 }

 public void setDuracion(int duracion) {
  this.duracion = duracion;
 }

 public void setYear(int year) {
  this.year = year;
 }

  /*
  * --------------------------------------------------------------------
  * METODOS FUNCIONES
  * Funciones definidas por el usuario
  * --------------------------------------------------------------------
  */
   public double myFunction_convertMinutes (int duracion) {
    // Cast from int to double
    // Aunque se puede definir duracion como minutos
    // Es mejor usar segundos y convertir unidades
    // Si se define como minutos y no se usa 1.8333333333 min
    // Se puede perder datos o precision
    return (double) duracion / 60;
   }
  

}