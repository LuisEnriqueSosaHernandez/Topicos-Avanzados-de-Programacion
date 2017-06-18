
public class ArbolAVL {
    private NodoArbolAVL raiz,x;
    public ArbolAVL(){
        raiz=null;
        x=null;
    }
    public NodoArbolAVL obtenerRaiz(){
        return raiz;
    }
     public int obtenerRaiz2(){
        return raiz.dato;
    }
    
    //buscar un nodo
    public NodoArbolAVL buscar(int d,NodoArbolAVL r){
        if(raiz==null){
            return null;
        }else if(r.dato==d){
            return r;
        }else if(r.dato<d){
            return buscar(d,r.hijoDerecho);
        }else{
            return buscar(d,r.hijoIzquierdo);
        }
    }
    //Metodo para obtener el factor de equilibrio
    public int obtenerFE(NodoArbolAVL x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
        }
    }
  
   public void mostrarHojas(NodoArbolAVL r){
        if(r!=null){
           
            if(r.hijoDerecho==null&&r.hijoIzquierdo==null){
                System.out.println("Hojas"+r.dato);  
            }
            mostrarHojas(r.hijoIzquierdo);
            mostrarHojas(r.hijoDerecho);
           
        }
   }
    //Rotacion simple izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c){
        NodoArbolAVL auxiliar=c.hijoIzquierdo;
        c.hijoIzquierdo=auxiliar.hijoDerecho;
        auxiliar.hijoDerecho=c;
        c.fe=Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho))+1;
        auxiliar.fe=Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho))+1;
       return auxiliar;   
    }
    //Rotacion simple derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL c){
        NodoArbolAVL auxiliar=c.hijoDerecho;
        c.hijoDerecho=auxiliar.hijoIzquierdo;
        auxiliar.hijoIzquierdo=c;
        c.fe=Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho))+1;
        auxiliar.fe=Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho))+1;
       return auxiliar;   
    }
    //Rotacion DOble a la izquierda
   public NodoArbolAVL rotaciondobleIzquierda(NodoArbolAVL c){
       NodoArbolAVL temporal;
       c.hijoIzquierdo=rotacionDerecha(c.hijoIzquierdo);
       temporal=rotacionIzquierda(c);
       return temporal;
   }
   //Rotacion doble a la derecha
   public NodoArbolAVL rotaciondobleDerecha(NodoArbolAVL c){
       NodoArbolAVL temporal;
       c.hijoDerecho=rotacionIzquierda(c.hijoDerecho);
       temporal=rotacionDerecha(c);
       return temporal;
   }
   //Metodo para insertar AVL
   public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo,NodoArbolAVL subAr){
       NodoArbolAVL nuevoPadre=subAr;
       if(nuevo.dato<subAr.dato){
           if(subAr.hijoIzquierdo==null){
               subAr.hijoIzquierdo=nuevo;
           }else{
               subAr.hijoIzquierdo=insertarAVL(nuevo,subAr.hijoIzquierdo);
           if((obtenerFE(subAr.hijoIzquierdo)-obtenerFE(subAr.hijoDerecho))==2){
               if(nuevo.dato<subAr.hijoIzquierdo.dato){
                   nuevoPadre=rotacionIzquierda(subAr);
               }else{
                nuevoPadre=rotaciondobleIzquierda(subAr);   
               }
           }
           }
           
       }else if(nuevo.dato>subAr.dato){
           if(subAr.hijoDerecho==null){
               subAr.hijoDerecho=nuevo;
           }else{
               subAr.hijoDerecho=insertarAVL(nuevo,subAr.hijoDerecho);
               if((obtenerFE(subAr.hijoDerecho)-obtenerFE(subAr.hijoIzquierdo))==2){
                 if(nuevo.dato>subAr.hijoDerecho.dato){
                     nuevoPadre=rotacionDerecha(subAr);
                 }else{
                     nuevoPadre=rotaciondobleDerecha(subAr);
                 }  
               }
           }
       }else{
           System.out.println("Nodo Duplicado");
       }
       //Actualizando la alura o factor de equilibrio
       if((subAr.hijoIzquierdo==null)&&(subAr.hijoDerecho!=null)){
           subAr.fe=subAr.hijoDerecho.fe+1;
       }else if((subAr.hijoDerecho==null)&&(subAr.hijoIzquierdo!=null)){
           subAr.fe=subAr.hijoIzquierdo.fe+1;
       }else{
           subAr.fe=Math.max(obtenerFE(subAr.hijoIzquierdo),obtenerFE(subAr.hijoDerecho))+1;
       }
       return nuevoPadre;
   }
   //Metodo para insertar 
   public void insertar(int d){
       NodoArbolAVL nuevo=new NodoArbolAVL(d);
       if(raiz==null){
           raiz=nuevo;
       }else{
           raiz=insertarAVL(nuevo,raiz);
       }
   }
   //Recorridos
   public void inOrden(NodoArbolAVL r) {
        if (r != null) {
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato);
            inOrden(r.hijoDerecho);
        }
    }

    //Metodo para recorrer arbol en preOrden

    public void preOrden(NodoArbolAVL r) {
        if (r != null) {
            System.out.println(r.dato);
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
    //Metodo para recorrer un arbol en PostOrden
    public void postOrden(NodoArbolAVL r){
        if (r != null) {
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            System.out.println(r.dato);
        }
    }
    public void Apartirdato(NodoArbolAVL r,int dato){
       
        while(r!=null){
             Apartirdato(r.hijoIzquierdo,dato);
            if(r.dato==dato){
                inOrden(r);
            }
            Apartirdato(r.hijoDerecho, dato);
         
        }
       
    }
    
}
