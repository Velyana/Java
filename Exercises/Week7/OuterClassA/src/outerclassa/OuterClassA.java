/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outerclassa;

/**
 *
 * @author Velyana
 */
public class OuterClassA {
    
    class InnerClassA {

        private String myName;
        
        public InnerClassA(String myName) {
            this.myName = myName;
        }
        
        public String toString() {
            return "InnerClassA";
        }
        
        public String getMyName() {
            return myName;
        }
        
        public void setMyName(String val) {
            myName = val;
        }
    }
    
    public OuterClassA() {
    }
    
    public String toString() {
        return "OuterClassA";
    }
    
    public InnerClassA getInnerClassA(String s) {
        return new InnerClassA(s);
    }
}
