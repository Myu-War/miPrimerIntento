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
        try{
            m.nada(0);
        }
        catch(miEx o){
            System.out.print("no hay error");
        }
                
    }
}
