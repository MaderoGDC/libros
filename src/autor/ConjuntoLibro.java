/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autor;

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
    
    //AsociacionCardinalidad10
    //(Tamaño maximo conocido)
    private Libro [] libros;

    public ConjuntoLibro() {
    this.libros = new Libro[10];
    }
     
    //metodos
    
    public boolean anadirLibro( Libro libro  ){
    for (int posicion=0;posicion<10 && libros[posicion]!=null ;posicion++){
        this.libros[posicion] = libro;
        return true;    
    }
    return false;
   }
    //ELIMINARXTUTULO
   public boolean eliminarLibroXTitulo(String titulo){
   for(int posicion = 0; posicion < this.libros.length; posicion ++){
    if(this.libros[posicion].getTitulo().equals(titulo)){
        this.libros[posicion]= null;
        return true;                                           }
    }
   return false;
   }
      public boolean eliminarLibroXAutor(String Autor){
   for(int posicion = 0; posicion < this.libros.length; posicion ++){
    if(this.libros[posicion].getAutor().getNombre().equals(Autor)){
        this.libros[posicion]= null;
        return true;
        }else{
    
        return false;
    }
   }
   
public 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Libro buscarMejorClasificado(){
        int ind = 0;
        float maximo = libros[ind].getCalificacion();
        for(int i = 0; i < this.libros.length; i++){
            if(libros[i] != null){
                if(maximo < libros[i].getCalificacion()){
                    maximo = libros[i].getCalificacion();
                    ind = i;
                }
            }
        }
        return libros[ind];
    }
    public Libro buscarPeorClasificado(){
        int ind = 0;
        float minimo = libros[ind].getCalificacion();
        for(int i = 0; i < this.libros.length; i++){
            if(libros[i] != null){
                if(minimo > libros[i].getCalificacion()){
                    minimo = libros[i].getCalificacion();
                    ind = i;
                }
            }
        }
        return libros[ind];
    }
}


   