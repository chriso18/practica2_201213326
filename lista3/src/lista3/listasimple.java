package lista3;

public class listasimple {
	private Nodo inicio;
    private Nodo fin;
    
    public listasimple(){
    	inicio=null;
    	fin=null;
    }
   
    // metodo para insertar un dato
    public void insertarDatos(int dato){
    	if(!encontrarNodo(dato)){
    		// si el dato no fue encontrado dentro de la lista
    		Nodo nuevo = new Nodo(); // crea un nodo nuevo y se le asigna un dato
    		nuevo.setDato(dato);
    		if (getInicio()==null){   // si no hay un dato dentro de la lista entonces inicio es nulo
    			setInicio(nuevo);
    			setFin(getInicio());
    		} else{    // si llega a este punto si hay un elemento en la lista
    			getFin().setSiguiente(nuevo); //asigno al siguiente del nodo final el nuevo dato
    			setFin(nuevo); //ahora el nodo final es el nuevo nodo
    		}	
    	}
    }
    
   
	public void mostrarDatos(){
        Nodo aux = getInicio();
        while(aux !=null){
        	System.out.println("Dato : " +aux.getDato() + "\n");
        	aux = aux.getSiguiente();
        }  	
  }
    
    public boolean encontrarNodo(int dato){
    	Nodo aux = getInicio();
    	while(aux !=null){
    		if(aux.getDato() == dato)
    			return true;
    		aux = aux.getSiguiente();
    	}
    	return false;
    }
    
    public Nodo getFin(){
    	return fin;
    }
    
    public void setFin(Nodo fin){
    	this.fin=fin;
    }
    
    public Nodo getInicio(){
		return inicio;
	}
	
	public void setInicio(Nodo inicio){
		this.inicio=inicio;
	}
}
