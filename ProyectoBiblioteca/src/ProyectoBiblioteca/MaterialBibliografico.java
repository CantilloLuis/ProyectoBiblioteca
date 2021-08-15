
package ProyectoBiblioteca;



public class MaterialBibliografico {
    
    private int id;
    private String titulo;
    private String codigo;
    private String autor;
    private int anio;
    
    public MaterialBibliografico(int id, String titulo, String codigo, String autor, int anio){
    
    this.id = id;
    this.titulo = titulo;
    this.codigo = codigo;
    this.autor = autor;
    this.anio = anio;
    
    
    
    }
    
    public int getId(){
    
    return id;
    }
    
    public String getTitulo(){
    
    return titulo;
    }
    
    
    public String getCodigo(){
        
    return codigo;
    
    }
    
    public String getAutor(){
        
    return autor;
    
    }
    
    public int getAnio(){
    
    return anio;
    
    }
    
    
    public void setId(int id){
    
    this.id = id;
    }
    
    public void setTitulo(String titulo){
    
    this.titulo = titulo;
    }
    
    public void setCodigo(String codigo){
    
    this.codigo = codigo;
    
    }
    
    public void setAutor(String autor){
    
        this.autor = autor;
    }
    
    
    public void setAnio(int anio){
    
    this.anio = anio;
    
    }
    
    
    
}
