/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jclanguage;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class JCClass {
// define methods that apply to classes
    //How you make a class

    String parentClass = "JCMetaClass";
    String className; // name of the classs
    HashMap<String, Object> vars = new HashMap();
    HashMap<String, Object> methods = new HashMap();

    public JCClass createNewClass(String name) {
        JCClass newClass = new JCClass();
        newClass.className = name;
        return newClass;
    }
    public JCInstance createNewInstance(String name){
    JCInstance x = new JCInstance();
    x.className = name;
    //might need to add in other stuff
    x.metaClass = this;
    x.methods = this.methods;
    x.vars = this.vars;
    return x;
    }
    
    
    public JCClass CreateSubClass(String name) {

//create new class and copy all parent values  
        JCClass newSubClass = new JCClass();
        newSubClass.parentClass = this.className;
        newSubClass.className = name;
        newSubClass.methods = this.methods;
        newSubClass.vars = this.vars;

//Return newly created class
        return newSubClass;
    }

    public Object respondToMessage(String methodName, ArrayList args) {
        Object res = null;
        if (methods.containsKey(methodName)) {
            Method call = (Method) methods.get(methodName);
            call.args = args;
            call.containingClass = this;
            call.vars = this.vars;
            call.methods = this.methods;
            res = call.execute();         
            return res;
        } else {
            System.out.println("Message in not recognized");
            return res;
        }

    }//end of method

    public void addClassVariable(String name, Object o) {
    //add varibale to class dictionary
        //can also assing null if not declared with a value
        vars.put(name, o);
    }

    public void addClassMethod(String methodName, Method method) {
        methods.put(methodName, method);
    }

    public void print() {
        System.out.println("My name is " + className + "!! Thanks for asking");
    }// prints the name of the class    

    public void print(Object o) {
        System.out.println(o);
    }

    public String toString() {
        return "Come with " + className + " if you want to live!!";
    }
//        public void addClassMethodsToJCClass() {
//        Method add = new Method();
//        add.ops.add("add");
//        this.methods.put("add", add);
//        Method subtract = new Method();
//        subtract.ops.add("subtract");
//        this.methods.put("subtract", subtract);
//        Method multiply = new Method();
//        add.ops.add("multiply");
//        this.methods.put("multiply", multiply);
//        Method divide = new Method();
//        add.ops.add("divide");
//        this.methods.put("divide", divide);
//        Method strConcat = new Method();
//        add.ops.add("strConcat");
//        this.methods.put("strConcat", strConcat);
//        Method strComp = new Method();
//        add.ops.add("strComp");
//        this.methods.put("strComp", strComp);
//        Method assign = new Method();
//        add.ops.add("assign");
//        this.methods.put("assign", assign);
//        Method newClass = new Method();
//        add.ops.add("new");
//        this.methods.put("new", newClass);
//        Method addInstanceVar = new Method();
//        add.ops.add("addInstanceVar");
//        this.methods.put("addInstanceVar", addInstanceVar);
//        Method addInstanceMethod = new Method();
//        add.ops.add("addInstanceMethod");
//        this.methods.put("addInstanceMethod", addInstanceMethod);
//        Method addClassVar = new Method();
//        add.ops.add("addClassVar");
//        this.methods.put("addClassVar", addClassVar);
//        Method subClass = new Method();
//        add.ops.add("subclass");
//        this.methods.put("subclass", subClass);
//        Method addClassMethod = new Method();
//        add.ops.add("addClassMethod");
//        this.methods.put("addClassMethod", addClassMethod);
//    }//end of method
}//end of class
