/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence;

/**
 *
 * @author Velyana
 */
public interface Selector {

    boolean end();
    Object current();
    void next();

}
