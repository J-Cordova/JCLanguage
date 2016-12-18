/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jclanguage;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Jordan
 */
public class JCInstance {
    //How you make an instance of a class
 
 String instanceOf;
 JCClass metaClass;
 String className;
 HashMap<String,Object> vars = new HashMap();
 HashMap<String,Object> methods = new HashMap(); 
  
    public Object respondToMessage(String methodName, ArrayList args) {
        Object res = null;
        if (methods.containsKey(methodName)) {
            Method call = (Method) methods.get(methodName);
            call.args = args;
            call.containingClass = this;
            call.methods = this.methods;
            call.vars = this.vars;
            res = call.execute();
            return res;
        } else {
            System.out.println("Message in not recognized");
            return res;
        }
    }//end of method

 
public void addInstanceMethod(String methodName, Method method){
methods.put(methodName, method);
}

public void addInstanceVariable(String name, Object o){
    //add varibale to class dictionary
    //can also assing null if not declared with a value
   vars.put(name, o);
}

public void print(){
    System.out.println("Hey broseph I'm an instance of " + instanceOf);
}
 @Override
 public String toString(){
return "Come with "+ className + " if you want to live!!";
}
}//end of class
