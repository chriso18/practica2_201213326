package lista3;

public class Nodo {
  private int dato;
  
  private Nodo siguiente;
  
  public Nodo getSiguiente(){
	  return siguiente;
  }
  
  public void setSiguiente(Nodo siguiente){
	  this.siguiente=siguiente;
  }
  
  public int getDato(){
	  return dato;
  }
  
  public void setDato(int dato){
	  this.dato = dato;
  }
}

