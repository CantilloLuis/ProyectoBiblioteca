

package ProyectoBiblioteca;

import java.util.ArrayList;



public class Biblioteca {
    
    public static ArrayList<MaterialBibliografico> libros;
    private int cantidadLibros;
    private int secuenciaID = 0;
    
    public Biblioteca(){
    
        libros = new ArrayList<>();
        libros.add(new MaterialBibliografico(secuenciaID, "Fausto", "FR32","Fausto", 2000));
        secuenciaID++;
        cantidadLibros++;
    
    
    }
    
    
    
    public void agregar(String titulo, String codigo, String autor, int anio){
    
        MaterialBibliografico op = new MaterialBibliografico(secuenciaID, titulo,codigo,autor,anio);
        libros.add(op);
        secuenciaID++;
    }
    

    public Object[][] listar(){
    Object tabla[][] = new Object[libros.size()][5];
    int j=0;

    for(MaterialBibliografico i: libros){
    tabla[j][0] = i.getId();
    tabla[j][1] = i.getTitulo();
    tabla[j][2] = i.getCodigo();
    tabla[j][3] = i.getAutor();
    tabla[j][4] = i.getAnio();
      j++;
      
    }
        
     return tabla;
     
    }
    
    public Object[][] obtenerPorId(int id){
    Object tabla[][] = new Object[1][5];
    
      for( MaterialBibliografico i: libros){
      
        if(i.getId() == id ){
            tabla[0][0] = i.getId();
            tabla[0][1] = i.getTitulo();
            tabla[0][2] = i.getCodigo();
            tabla[0][3] = i.getAutor();
            tabla[0][4] = i.getAnio();
        
        }
      
      
      }
      return tabla;
    }
    
    public String modificar(int id, String titulo, String codigo, String autor, int anio ){

        String info ="";
      for(MaterialBibliografico i: libros){
      
           if(i.getId() == id){
               i.setTitulo(titulo);
               i.setCodigo(codigo);
               i.setAutor(autor);
               i.setAnio(anio);
               info = "Modificado con exito";
               break;
           }else{
           
              info = "No se encontro libro para modificar";           
           }
      
      }
      return info;
    } 
    
    
  public String eliminar(int id){
      
      String Info = "";
      for(int i=0;i<libros.size();i++){
         
         if(libros.get(i).getId() == id){
             
         libros.remove(id);
         Info = "ELiminado con exito";
         break;
          
         }else{
         
         Info = "No se encontro el libro para eliminarlo";
         }
      
      
      
      }
      
      return Info;
      
    
//    for(MaterialBibliografico i : libros){
//    
//        if(i.getId() == id){
//    
//            libros.remove(i);
//            cantidadLibros--;
//           
//
//        }
//    }
   
  }
    
}
