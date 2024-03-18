
package entidad;

import java.util.Scanner;

public class Libro {
    public String titulo, autor;
    public int num, ISBN;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int num) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.num = num;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNum() {
        return num;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void guardarLibro(){
        System.out.println("Ingrese el titulo del libro");
        this.titulo = leer.next();
        System.out.println("Ingrese el autor del libro");
        this.autor = leer.next();
        System.out.println("Ingrese el ISBN del libro");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el numero de paginas");
        this.num = leer.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.println("El titulo del libro es " + this.titulo);
        System.out.println("El autor del libro es " + this.autor);
        System.out.println("El ISBN del libro es " + this.ISBN);
        System.out.println("El numero de paginas del libro es " + this.num);
    }
    
}
