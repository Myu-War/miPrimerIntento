/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerintento;

/**
 *
 * @author introduccion02
 */
public interface miEstructura<T extends Comparable <T>> {
    public void insertar(T elem);
    public boolean borrar(T elem) throws cheched;
    public int buscar (T elem);
        /**
     * @param args the command line arguments
     */
    
}
