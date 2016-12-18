/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jclanguage;

import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class JCInterp extends JCClass {

    //holds both the methods and the variables
    ///Inherits vars and methods from JCClass
    public static HashMap<String, Object> classes = new HashMap();

    //public static HashMap<String, Object> InterpMethods = new HashMap();
    //poa = parent of all
    public void Interpret() throws Exception {
        //Read in file
        JCClass poa = new JCClass();
        addClassMethodsToInterp(this);
        addClassMethodsToJCClass(poa);
        classes.put("Object", poa);

        Scanner input = new Scanner(new File("C:\\Users\\the1_\\Desktop\\JCLanguage (1)\\JCLanguage\\build\\classes\\jclanguage\\testProgram.txt"));
        //Send message to object
        // put rest of string into a
        // space split array list
        // send message 
        while (input.hasNext()) {
            String nextOp = input.nextLine();
            //this is to handle blank lines
            if (nextOp.equals("")) {
                nextOp = "#";
            }
            
            //if the line starts with # its a comment
            if (!((nextOp.charAt(0) == '#'))) {
                String[] parts = nextOp.split("\\s+");
                String check = parts[0];

                if (classes.containsKey(check)) {
                    //create message to send to object
                    String methodCall = parts[1];
                    ArrayList<String> args = new ArrayList();
                    for (int i = 2; i < parts.length; i++) {
                        args.add(parts[i]);
                    }
                    if (classes.get(check).getClass() == (new JCClass()).getClass()) {
                        JCClass reciever = (JCClass) classes.get(check);
                        reciever.respondToMessage(methodCall, args);
                    }
                    if ((classes.get(check).getClass() == (new JCInstance()).getClass())) {
                        JCInstance reciever = (JCInstance) classes.get(check);
                        reciever.respondToMessage(methodCall, args);
                    }
                }//end of check for class
                //not referencing a class so interpreter
                //will recieve the message
                if (this.methods.containsKey(check)) {
                    ArrayList<String> args = new ArrayList();
                    for (int i = 1; i < parts.length; i++) {
                        args.add(parts[i]);
                    }//end of for
                    this.respondToMessage(parts[0], args);
                }//end of check for method

                /**
                 * Note that if the first token isn't a fucntion or class name
                 * it will just be skipped over
                 */
            }//end of if   
        }//end of while
    }//end of interpreter

    public void addClassMethodsToJCClass(JCClass poa) {
        Method add = new Method();
        add.ops.add("add");
        poa.methods.put("add", add);

        Method subtract = new Method();
        subtract.ops.add("subtract");
        poa.methods.put("subtract", subtract);

        Method multiply = new Method();
        multiply.ops.add("multiply");
        poa.methods.put("multiply", multiply);

        Method divide = new Method();
        divide.ops.add("divide");
        poa.methods.put("divide", divide);

        Method strConcat = new Method();
        strConcat.ops.add("strConcat");
        poa.methods.put("strConcat", strConcat);

        Method strComp = new Method();
        strComp.ops.add("strComp");
        poa.methods.put("strComp", strComp);

        Method assign = new Method();
        assign.ops.add("assign");
        poa.methods.put("assign", assign);

        Method newClass = new Method();
        newClass.ops.add("new");
        poa.methods.put("new", newClass);

        Method addInstanceVar = new Method();
        addInstanceVar.ops.add("addInstanceVar");
        poa.methods.put("addInstanceVar", addInstanceVar);

        Method addInstanceMethod = new Method();
        addInstanceMethod.ops.add("addInstanceMethod");
        poa.methods.put("addInstanceMethod", addInstanceMethod);

        Method addClassVar = new Method();
        addClassVar.ops.add("addClassVar");
        poa.methods.put("addClassVar", addClassVar);

        Method subClass = new Method();
        subClass.ops.add("subclass");
        poa.methods.put("subclass", subClass);

        Method addClassMethod = new Method();
        addClassMethod.ops.add("addClassMethod");
        poa.methods.put("addClassMethod", addClassMethod);

        Method print = new Method();
        print.ops.add("print");
        poa.methods.put("print", print);
    }//end of method

    public void addClassMethodsToInterp(JCInterp poa) {

        Method add = new Method();
        add.ops.add("add");
        poa.methods.put("add", add);

        Method subtract = new Method();
        subtract.ops.add("subtract");
        poa.methods.put("subtract", subtract);

        Method multiply = new Method();
        multiply.ops.add("multiply");
        poa.methods.put("multiply", multiply);

        Method divide = new Method();
        divide.ops.add("divide");
        poa.methods.put("divide", divide);

        Method strConcat = new Method();
        strConcat.ops.add("strConcat");
        poa.methods.put("strConcat", strConcat);

        Method strComp = new Method();
        strComp.ops.add("strComp");
        poa.methods.put("strComp", strComp);

        Method assign = new Method();
        assign.ops.add("assign");
        poa.methods.put("assign", assign);

        Method newClass = new Method();
        newClass.ops.add("new");
        poa.methods.put("new", newClass);

        Method addInstanceVar = new Method();
        addInstanceVar.ops.add("addInstanceVar");
        poa.methods.put("addInstanceVar", addInstanceVar);

        Method addInstanceMethod = new Method();
        addInstanceMethod.ops.add("addInstanceMethod");
        poa.methods.put("addInstanceMethod", addInstanceMethod);

        Method addClassVar = new Method();
        addClassVar.ops.add("addClassVar");
        poa.methods.put("addClassVar", addClassVar);

        Method subClass = new Method();
        subClass.ops.add("subclass");
        poa.methods.put("subclass", subClass);

        Method addClassMethod = new Method();
        addClassMethod.ops.add("addClassMethod");
        poa.methods.put("addClassMethod", addClassMethod);

        Method print = new Method();
        print.ops.add("print");
        poa.methods.put("print", print);
    }//end of method

}//end of class
