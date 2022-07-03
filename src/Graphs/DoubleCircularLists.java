package Graphs;

public class DoubleCircularLists implements ListDouble{
	NodeCirculaDouble inicio, fin;
	int count;
	    //indica el inicio de la lista

	    public DoubleCircularLists() {
	        inicio = fin = null;
	    }//Fin de constructor
	        
	    @Override
	    public int getSize() {
	        if (isEmpty()) {
	            throw new FullStackException("No hay lista");
	        }
	        NodeCirculaDouble aux = inicio;//aux para movernos por la lita
	        int cont = 0;//para contar los nodos de la lista
	        while (aux != fin) {
	            cont++;
	            aux = aux.sgte;

	        }//fin del while
	        return cont;//con el conteo de los nods    
	    }

	    @Override
	    public void anular() {
	        inicio = null;
	    }

	    @Override
	    public boolean isEmpty() {
	        return inicio == null;
	    }

	    @Override
	    public void insertar(Object element) {
	    	
	    	NodeCirculaDouble aux = inicio;//defino aux para moverme por la lista y no perder inicio
	    	NodeCirculaDouble nuevoNodo = new NodeCirculaDouble(element);
	        if (inicio == null) {
	            inicio = fin = nuevoNodo;
	            count++;
	        } else {
	            while (aux != fin) {
	                aux = aux.sgte;// mueve aux al siguiente nodo
	            }// se sale cuando sea null
	            aux.sgte = nuevoNodo;
	            nuevoNodo.ant = aux;// hace doble enlace
	            fin = nuevoNodo;//se pone fin a apuntar al nuevo nodo
	          
	        }
	        // se hace doblemente enlace
	        fin.sgte = inicio;
	        inicio.ant = fin;
	        count++;

	//Comentado para que no enrede el print del GrafoListaAdyacencia
	      //  System.out.println("Se agrego el elemento= " + element);
	    }

	    public int getSize1() {
	    	return count;
	    }
	    @Override
	    public Object getByPosition(Object element) {
	        if (isEmpty()) {
	            throw new FullStackException("No existe");
	        }

	        NodeCirculaDouble aux = inicio;//para movernos por la lista
	        int posicion = 1;//indica la posicion del elemento en la lista

	        while (aux != fin) {
	            if (aux.element.equals(element))//ya lo encontro
	            {
	                return posicion;
	            }

	            aux = aux.sgte;
	            posicion++;
	        }//fin de while

	        return -1;//el elemento no existe
	    }

	    public void delete(Object element) {
	        if (isEmpty()) {
	            throw new FullStackException("No existe");
	        }
	        NodeCirculaDouble aux = inicio;//es para movernos en la lista
	        NodeCirculaDouble nodoAnterior = null;

	        //caso 1: cuando el elemento a suprimir es el primero de la lista
	        if (inicio.element.equals(element)) {//es el primero el que quiero suprimir
	            inicio = inicio.sgte;
	            inicio.ant = fin;
	        } else {
	            while (aux != fin && !aux.element.equals(element)) {
	                aux = aux.sgte;

	            }//while
	            if (aux.element.equals(element))//ya lo encontro, debo eliminarlo
	            {
	                aux.ant = aux.sgte;//para saltar al nodo apuntado por aux
	            }

	            if (aux == fin)//estamos apuntadndo al ultimo nodo
	            {
	                fin = aux.ant;
	            }

	        }//fin del else
	        //mantengo el enlace circular
	        fin.sgte = inicio;
	        //que pasa si solo queda un nodo y es el que se desea eliminar
	        if (inicio == fin && inicio.element.equals(element)) {
	            anular();//se anula toda la lista
	        }
	    }

	    public boolean exists(Object element) {
	     if (isEmpty()) {
	            throw new FullStackException("No existe");
	        }
	        NodeCirculaDouble aux = inicio;//para movernos por la lista
	        
	        
	        
	        while (aux != fin) {
	            if (aux.element.equals(element))//ya lo encontro
	            {
	                return true;
	            }
	            aux = aux.sgte;
	        }
	        
	        //Caso cuando el fin es el elemento que tiene el elemento a buscar
	        if(fin.element.equals(element))//ya lo encontro
	            return true;
	            
	        
	        return false;//el elemento no exist    
	    }

	    public void addSort(Object element) {
	       
	    	NodeCirculaDouble aux = inicio;//permite movernos por la lista
	    	NodeCirculaDouble nuevoNodo = new NodeCirculaDouble(element);
	        int ordenado=0;
	        if(isEmpty())
	        {
	            inicio = fin = nuevoNodo;
	        }
	        else if((int)element <= (int)inicio.element)
	        {
	            nuevoNodo.sgte = inicio;
	            inicio = nuevoNodo;
	            nuevoNodo.sgte.ant = inicio;
	            nuevoNodo.ant = fin;
	        }
	        else{
	                while(aux != fin)
	                {
	                    if(
	                        (int)aux.element <= (int)element
	                        &&
	                        (int)aux.sgte.element >= (int)element
	                      )//ya lo encontro
	                       {
	                        nuevoNodo.sgte = aux.sgte;
	                        aux.sgte.ant = nuevoNodo;
	                        aux.ant.sgte.sgte = nuevoNodo;
	                        nuevoNodo.ant = aux;
	                        ordenado=1;
	                        break;
	                      }
	                    aux = aux.sgte;
	                }//fin del while
	                if(ordenado==0 && (int)aux.element<(int)nuevoNodo.element)
	                {
	                    aux.sgte = nuevoNodo;
	                    nuevoNodo.ant = aux;//realizamos el doble enlace
	                    fin = nuevoNodo;//se pone fin a apuntar al nuevo nodo
	                }
	            }//else
	            
	        //realizamos el doble enlace circular
	        fin.sgte = inicio;
	        inicio.ant = fin;
	        
	        //comentado para que no se enrede con las aristas del grafoListaAdyacencia
	       // System.out.println("Se agrego el elemento: "+element);
	        
	        
	    }

	    @Override
	    public Object firstInList() {
	         if (isEmpty()) {
	            throw new FullStackException("No existe");
	        }
	         return inicio;
//	        return inicio.elemento.toString();
	    }

	    public Object firstInListValue() {
	         if (isEmpty()) {
	            throw new FullStackException("No existe");
	        }
	         return inicio.element;
//	        return inicio.elemento.toString();
	    }

	    
	    //Devuelve el nodo de acuerdo en la posicion indicada
	    public NodeCirculaDouble getNodo(int posicion) throws FullStackException {
	        if (isEmpty()) {
	            throw new FullStackException("No existe");
	        }

	        NodeCirculaDouble aux = inicio;//para movernos por la lista
	        int pos = 1;//primera posicion de la lista


	        while (aux != fin && pos != posicion) {
	            aux = aux.sgte;
	            pos++;//incrementa contador

	        }//fin de while
	        if (pos == posicion)//encontro nodo de acuerdo a la posicion indicada
	        {
	            return aux;//retorna el nodo
	        } else {
	            return null;//el elemento no existe
	        }
	    }//Fin de getNodo
	 
	    //Devuelve el nodo de acuerdo en la posicion indicada
	    public Object getNodo2(int posicion) throws FullStackException {
	        if (isEmpty()) {
	            throw new FullStackException("No existe");
	        }

	        NodeCirculaDouble aux = inicio;//para movernos por la lista
	        int pos = 1;//primera posicion de la lista


	        while (aux != fin && pos != posicion) {
	            aux = aux.sgte;
	            pos++;//incrementa contador

	        }//fin de while
	        if (pos == posicion)//encontro nodo de acuerdo a la posicion indicada
	        {
	            return aux.element;//retorna el nodo
	        } else {
	            return null;//el elemento no existe
	        }
	    }//Fin de getNodo
	    
	     public Object anterior(Object elemento) throws FullStackException {
	        if (isEmpty()) {
	            throw new FullStackException("No existe");
	        }
	        NodeCirculaDouble aux = inicio;

	        if (inicio.element.equals(elemento))//es el primero, no tiene anterior
	        {
	            return null;
	        } else {
	            while (aux != null) {
	                if (aux.element.equals(elemento))//ya lo encontro
	                {
	                    return "El elemento anterior a " + aux.element.toString() + " es= " + aux.ant.toString();
	                }

	                aux = aux.sgte;
	            }//while
	        }        //Si se sale del while es porque el elemento anterior no existe
	        return null;
	    }//Fin de anterior
	    
	 /*   public void modificar(Object elemento1,Object elemento2){
	    
	    if(exists(elemento1))
	        getNodo(elemento1).elemento = elemento2;
	    }
	    
	    public Node getNodo(Object elemento) throws FullStackException{
	    if(isEmpty())
	        throw  new FullStackException("no hay lista");
	    NodeCirculaDouble aux = inicio;
	    
	    while(aux!=fin){
	        if(aux.element.equals(elemento))
	            return aux;
	        aux= aux.sgte;
	    }//while
	    
	    if(fin.element.equals(elemento))
	        return aux;
	    
	    return null;
	    
	    }//GetNodo*/
	   
	    public String toString(){
	        String resultado = "";

	        NodeCirculaDouble aux = inicio;

	            while (aux != fin) {
	                resultado +=aux.element+",";
	                aux = aux.sgte;
	            }//while

	            if(fin!=null)
	                resultado +=fin.element+",";
	            
	        return resultado;
	    
	    }//toString

		@Override
		public void detele(Object element) throws ListExeptions {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteByPosition(int pos) throws ListExeptions {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void exist(Object element) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void lastInTheList() {
			 if (isEmpty()) {
	                throw new FullStackException("No existe");
	            }
	        NodeCirculaDouble aux = inicio;
	            while (aux.sgte != fin) {
	                aux = aux.sgte;
	            }
	        //cuando se sale del while estoy en el ultimo nodo de la lista
//	        return aux.elemento.toString();  
			
		}

		@Override
		public Object firstInTheList() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void addSord(Object n) {
			// TODO Auto-generated method stub
			
		}


}//end class
