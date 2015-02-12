/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerintento;

/**
 *
 * @author introduccion02
 */
public class miPrimerIntento<T extends Comparable<T>> implements miEstructura<T>{
   private Comparable[] arr;
   private int numElem=0;
   
   public miPrimerIntento(){
       
   }
   
   public miPrimerIntento(T elem){
        this.arr = (Comparable[]) new Object[1];
       
   }

    @Override
    public boolean borrar(T elem) throws cheched{
        boolean res=false;
        int i=0;
        
        while(i<arr.length || !res){
            if(arr[i].equals(elem)){
                res=true;
            }
        }
        
        if(res){
            System.out.println("todo bien");
        }
        else{
            throw new cheched("no se halla ");
        }
        
        
        
        return res;
    }

    @Override
    public int buscar(T elem) {
        int pos=0;
        
        while(pos<numElem && !elem.equals(arr[pos])){
            pos++;
        }
        if(pos==numElem){
            pos=-1;
        }
        
        return pos;
    }

    @Override
    public void insertar(T elem) {
        if(numElem>arr.length){
            expandCapacity();
        }
        arr[numElem]=elem;
        numElem++;
    }
    
    private void expandCapacity(){
        Comparable B[] = (Comparable[]) new Object[arr.length+2];
        
        for(int i=0; i<arr.length;i++){
            B[i]=arr[i];
        }
        arr=B;
    }
    
    public void nada (int i) throws miEx{
        if(i==0){
            System.out.println("todo bien");
        }
        else{
            throw new miEx("prueba");
        }
    }
}
