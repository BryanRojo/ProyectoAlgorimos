package Graphs;

public class ColaEnlazada implements StackCola{
	 //atributos
    	NodeCola anterior, posterior;
    //int contadorNodos; Usar esta variable si queremos eliminar getSize()
    //constructor

    public ColaEnlazada() {
    
        anterior = posterior = null;
    
    }//finConstructor

    @Override
    public int getSize() {
    
        NodeCola aux = posterior;//inicio de la cola
        
        if(isEmpty()){
            throw  new FullStackException("La cola esta vacia");
        }
        
        //control de la cantidad de nodos de la cola
        int cont = 0;
        
        while(aux!=null){
           cont++;
           aux = aux.sgte;
        }//finWhile
        
        return cont;
        /* 
        Parametro "R"
        posterior = new Nodo("R");
        ------------------------------>
        :)            :)                 :)                        :) |Cajero|  
        [B] <----     [H]<---      .sgte [G]        <---   .sgte    [Rolando] 
        ------------------------------> 
 posterior                                 
                                                         .sgte <--  anterior --> .ant
                
        aux = anterior
        */      
        }//finGetSize

    @Override
    public void anular() {
        anterior = posterior = null;
    }

 
	@Override
    public boolean isEmpty() {
        return posterior == null;     
    }

    @Override
    public void encolar(Object element) throws FullStackException {
    
        //Cuando la cola esta vacia, y vamos a ingresar el primer elemento
        if(isEmpty()){//no hay nada en la cola aun
            posterior = new NodeCola(element);
            //para poder llevar control de los 2 apuntadores
            anterior = posterior;
        }
        else{
            //cuando ya existe un elemento
            anterior.sgte = new NodeCola(element);
            anterior = anterior.sgte;
        }//else
    
    }//finEncolar

    @Override
    public Object desencolar() {
        if(isEmpty())
            throw new FullStackException("No se puede desencolar, TDA Cola esta vacio");
        
        Object elementoADesencolar = posterior.element;
        System.out.println(posterior.element);
        posterior = posterior.sgte;
        
       
        return elementoADesencolar;
    }//desencolar
    

    @Override
    public int getPosicion(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exist(Object element) {
        
        Object aux;
        int x = 1;
        boolean encontrado = false;
        while(x<=getSize()){
            aux = desencolar();
            if(aux.equals(element))
                encontrado = true;
            x++;
            encolar(aux);
        }//finWhile
        
        return encontrado;
    }//finExisteEnCola

    @Override
    public Object frente() throws FullStackException {
        
    if(isEmpty())
            throw new FullStackException("No se puede desencolar, TDA Cola esta vacio");
        
        Object elementoAMostrar = anterior.element;
        
        return elementoAMostrar;
        
    }
    
    
}//end class

