/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerintento;

/**
 *
 * @author introduccion02
 */
public class miEx extends Exception {

    /**
     * Creates a new instance of
     * <code>miEx</code> without detail message.
     */
    public miEx() {
    }

    /**
     * Constructs an instance of
     * <code>miEx</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public miEx(String msg) {
        super(msg+"en la estructura");
    }
    public static void main(String [] args){
        miPrimerIntento m=new miPrimerIntento();
        
        System.out.print("Hola");
        m.insertar("que pedo");
        System.out.print("\nHola");
        try{
            m.borrar(1);
        }
        catch(cheched o){
            System.out.print("no se halla en la estructura");
        }
    }
}


