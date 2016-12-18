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
public class Method {

    //holds local variables
    public Object containingClass;
    public HashMap<String, Object> vars = new HashMap();
    public ArrayList<String> args = new ArrayList();
    public ArrayList<String> ops = new ArrayList();
    HashMap<String, Object> methods = new HashMap();
    //call a native 

// this method will execute the methods operations
// by iterating through the operations list    
    public Object execute() {

        //need to check each arg and make sure its not a method call
        //all the args are contained in the array list
        Object result = null;
        for (String op : ops) {
            String[] parts = op.split("\\s+");
            //////////////          
            //for basics first need to see if referencing a varible
            //Change all returns to assign to result
            //////////////
            if (parts[0] == "add") {
                double operand1 = 0;
                double operand2 = 0;
                if (containingClass.getClass().equals(new JCInstance().getClass())) {
                    JCInstance x = (JCInstance) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 = (Double)x.vars.get(args.get(0));
                    } else {
                        Double.valueOf(args.get(0));
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (Double)x.vars.get(args.get(1));;
                    } else {
                        Double.valueOf(args.get(1));
                    }
                    //for JCClass
                } else {
                    JCClass x = (JCClass) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 = (Double)x.vars.get(args.get(0));
                    } else {
                        operand1 = Double.valueOf(args.get(0));
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (Double)x.vars.get(args.get(1));
                    } else {
                        operand2 = Double.valueOf(args.get(1));
                    }
                }

                result = operand1 + operand2;

            }
            if (parts[0] == "subtract") {
                double operand1 = 0;
                double operand2 = 0;
                if (containingClass.getClass().equals(new JCInstance().getClass())) {
                    JCInstance x = (JCInstance) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 = (Double)x.vars.get(args.get(0));
                    } else {
                        operand1 = Double.valueOf(args.get(0));
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (Double)x.vars.get(args.get(1));
                    } else {
                        operand2 =Double.valueOf(args.get(1));
                    }
                    //for JCClass
                } else {
                    JCClass x = (JCClass) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 = (Double)x.vars.get(args.get(0));
                    } else {
                        operand1 = Double.valueOf(args.get(0));
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (Double)x.vars.get(args.get(1));
                    } else {
                        operand2 =Double.valueOf(args.get(1));
                    }
                }

                result = operand1 - operand2;

            }
            if (parts[0] == "multiply") {
                double operand1 = 0;
                double operand2 = 0;
                if (containingClass.getClass().equals(new JCInstance().getClass())) {
                    JCInstance x = (JCInstance) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 =(Double)x.vars.get(args.get(0));
                    } else {
                        operand1 = Double.valueOf(args.get(0));
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (Double)x.vars.get(args.get(1));
                    } else {
                        operand2 =Double.valueOf(args.get(1));
                    }
                    //for JCClass
                } else {
                    JCClass x = (JCClass) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 = (Double)x.vars.get(args.get(0));
                    } else {
                        operand1 = Double.valueOf(args.get(0));
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (Double)x.vars.get(args.get(1));
                    } else {
                        operand2 =Double.valueOf(args.get(1));
                    }
                }

                result = operand1 * operand2;

            }
            if (parts[0] == "divide") {
                double operand1 = 0;
                double operand2 = 0;
                if (containingClass.getClass().equals(new JCInstance().getClass())) {
                    JCInstance x = (JCInstance) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 = (Double)x.vars.get(args.get(0));
                    } else {
                        operand1 = Double.valueOf(args.get(0));
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (Double)x.vars.get(args.get(1));
                    } else {
                       operand2 = Double.valueOf(args.get(1));
                    }
                    //for JCClass
                } else {
                    JCClass x = (JCClass) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 =(Double) x.vars.get(args.get(0));
                    } else {
                        operand1 =Double.valueOf(args.get(0));
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (Double)x.vars.get(args.get(1));
                    } else {
                        operand2 =Double.valueOf(args.get(1));
                    }
                }

                result = operand1 / operand2;

            }

            if (parts[0] == "strConcat") {
                String operand1 = "";
                String operand2 = "";
                if (containingClass.getClass().equals(new JCInstance().getClass())) {
                    JCInstance x = (JCInstance) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 = (String) x.vars.get(args.get(0));
                    } else {
                        operand1 = (String) args.get(0);
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (String) x.vars.get(args.get(1));
                    } else {
                        operand2 =(String)args.get(1);
                    }
                    //for JCClass
                } else {
                    JCClass x = (JCClass) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 = (String) x.vars.get(args.get(0));
                    } else {
                        operand1 = (String) args.get(0);
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (String) x.vars.get(args.get(1));
                    } else {
                        operand2 =(String)args.get(1);
                    }
                }

                result = operand1 + operand2;


            }
            if (parts[0] == "strComp") {
                String operand1 = "";
                String operand2 = "";
                if (containingClass.getClass().equals(new JCInstance().getClass())) {
                    JCInstance x = (JCInstance) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 = (String) x.vars.get(args.get(0));
                    } else {
                        operand1 = (String) args.get(0);
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (String) x.vars.get(args.get(1));
                    } else {
                        operand2 =(String)args.get(1);
                    }
                    //for JCClass
                } else {
                    JCClass x = (JCClass) containingClass;
                    if (x.vars.containsKey(args.get(0))) {
                        operand1 = (String) x.vars.get(args.get(0));
                    } else {
                        operand1 = (String) args.get(0);
                    }
                    if (x.vars.containsKey(args.get(1))) {
                        operand2 = (String) x.vars.get(args.get(1));
                    } else {
                        operand2 =(String)args.get(1);
                    }
                }

                result = (operand1.equals(operand2));

            }
            if ("print".equals(parts[0])) {
                if (args.isEmpty()) {
                    //class to string method of containing class
                    System.out.println(containingClass);
                } else {
                    String toPrint = "";
                    for (String str : args) {
                        
                        if(vars.containsKey(str)){
                            Object vals = vars.get(str);
                        toPrint += (" " + vals);
                        }else{
                        toPrint += (" " + str);
                        }
                    }
                    System.out.println(toPrint);
                }

            }

            if (parts[0] == "assign") {

                if (containingClass.getClass().equals(new JCInstance().getClass())) {
                    //If JCInstance
                    JCInstance instance = (JCInstance) containingClass;
                    String name = args.get(0);
                    if (instance.methods.containsKey(args.get(1))) {
                        //if arg is a method
                        ArrayList<String> toSend = new ArrayList();
                        for (int i = 2; i < args.size(); i++) {
                            //copy over args
                            toSend.add(args.get(i));
                        }
                        Object val = instance.respondToMessage(args.get(1), toSend);
                        instance.vars.put(name, val);
                        return null;
                    }
                    if (instance.vars.containsKey(args.get(1))) {
                        //if referencing a variable then get value and assign to name
                        instance.vars.put(name, instance.vars.get(args.get(1)));
                        return null;
                    }

                    try {//if a number
                        double dub = Double.valueOf(args.get(1));
                        instance.vars.put(name, dub);
                    } catch (Exception e) {
                        //if a string
                        instance.vars.put(name, args.get(1));
                    }

                } else {
                    //if JCClass
                    JCClass instance = (JCClass) containingClass;
                    String name = args.get(0);
                    if (instance.methods.containsKey(args.get(1))) {
                        //if arg is a method
                        ArrayList<String> toSend = new ArrayList();
                        for (int i = 2; i < args.size(); i++) {
                            //copy over args
                            toSend.add(args.get(i));
                        }
                        Object val = instance.respondToMessage(args.get(1), toSend);
                        instance.vars.put(name, val);
                        return val;
                    }
                    if (instance.vars.containsKey(args.get(1))) {
                        //if referencing a variable then get value and assign to name
                        instance.vars.put(name, instance.vars.get(args.get(1)));
                        return null;
                    }

                    try {//if a number
                        double dub = Double.valueOf(args.get(1));
                        instance.vars.put(name, dub);
                    } catch (Exception e) {
                        //if a string
                        instance.vars.put(name, args.get(1));
                    }
                }//end if else
            }//end of assign
            
            
            if (parts[0] == "addInstanceVar") {

                String key = args.get(0);
                try {
                    double x = Double.valueOf(args.get(1));
                    JCInstance z = (JCInstance) containingClass;
                    z.vars.put(key, x);
                } catch (Exception e) {
                    JCInstance z = (JCInstance) containingClass;
                    z.vars.put(key, args.get(1));
                }

            }

            if (parts[0] == "addInstanceMethod") {
                Method newMeth = new Method();
                String methodName = args.get(0);
                for (int i = 1; i < args.size(); i++) {
                    String newop = args.get(i).replace(";", "");
                    newMeth.ops.add(newop);
                    newMeth.containingClass = this.containingClass;
                   
                }
                 JCInstance x = (JCInstance) containingClass;
                 x.methods.put(methodName, newMeth);
            }
            if (parts[0] == "addClassVar") {
                String key = args.get(0);
                try {
                    double x = Double.valueOf(args.get(1));
                    JCClass z = (JCClass) containingClass;
                    z.vars.put(key, x);
                } catch (Exception e) {
                    JCClass z = (JCClass) containingClass;
                    z.vars.put(key, args.get(1));
                }
            }

            if (parts[0] == "addClassMethod") {
                Method newMeth = new Method();
                String methodName = args.get(0);
                for (int i = 1; i < args.size(); i++) {
                    String newop = args.get(i).replace(";", "");
                    newMeth.ops.add(newop);                   
                }//end of for each
                newMeth.containingClass = this.containingClass;
                    JCClass x = (JCClass) containingClass;
                    x.methods.put(methodName, newMeth);
            }

            if (parts[0] == "new") {
                JCClass parent = (JCClass) containingClass;
                JCInstance justBorn = parent.createNewInstance(args.get(0));
                //register with Interpreter
                JCInterp.classes.put(args.get(0), justBorn);
                
                return justBorn;

            }//end of for each

            if (parts[0] == "subclass") {
                JCClass parent = (JCClass) containingClass;
                JCClass justBorn = parent.CreateSubClass(args.get(0));
                //register with Interpreter
                JCInterp.classes.put(args.get(0), justBorn);
                return justBorn;
            }//end of if

            //return result;
        }//end of for each
        return result;
    }
        //call a method
    
    
    
    
    
    
    
    
    
    
    
    
    //assign a value  
    //The question is what data will the interpreter send me
    // iew assign x = add 5 5 what will interpreter do 

    //    public Object resolveAssign(String var, String op) {
    //        Object ret = null;
    //        //handle string
    //        //handle double
    //        // look up method name in parent class
    //        //method list call it if its in there
    //        //and assign the result
    //        Object result;
    //        String[] parts = op.split(" ");
    //        //method name will be first token if 
    //        //its a method call
    //        //ie add 4 4
    //        // add is parts[0], 4 and 4 are arguments
    //        ArrayList<String> arguments = new ArrayList();
    //        if (methods.containsKey(parts[0])) {
    //
    //            for (int i = 1; i < parts.length - 1; i++) {
    //                arguments.add(parts[i]);
    //            }//end of for  
    //            Method met = (Method) methods.get(parts[0]);
    //            //this will resolve the assingment if arg was a method
    //            //this could cascade
    //            //Need to pass the method the proper parameters
    //            met.args = arguments;
    //            ret = met.execute();
    //            return ret;
    //        }//end of if
    //
    //        if (vars.containsKey(parts[0])) {
    //            return vars.get(parts[0]);
    //        }//end of if
    //
    //        //try to cast as double
    //        try {
    //            double val = Double.valueOf(op);
    //            return val;
    //        } catch (Exception e) {
    //            //if not a method or double
    //            //then its a string
    //            //ie assign x hello
    //            return op;
    //        }//end of try catch
    //    }//end method
    //
    //    //will resolve a method call
    //    //can handle methods calls being passed as variables
    //    public Object resolveMethodCall(String op) {
    //        Object ret = null;
    //        String[] parts = op.split(" ");
    //        ArrayList<String> arguments = new ArrayList();
    //        for (int i = 1; i < parts.length - 1; i++) {
    //            arguments.add(parts[i]);
    //        }//end of for       
    //
    //        Method met = (Method) methods.get(parts[0]);
    //        met.args = arguments;
    //        ret = met.execute();
    //        return ret;
    //    }
  

//    public boolean isAMethod(String name) {
//        if (containingClass.methods.containsKey(name)) {
//            return true;
//        } else {
//            return false;
//        }//end of if else
//    }//end of method
//    public boolean isANumber(String name) {
//        try {
//            Double.valueOf(name);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }//end of try catch
//    }//end of method
//
//    public void addInstanceMethod(String methodName, Method method) {
//        JCInstance x = (JCInstance) containingClass;
//        x.methods.put(methodName, method);
//    }
//
//    public void addInstanceVariable(String name, Object o) {
//        //add varibale to class dictionary
//        //can also assing null if not declared with a value
//        JCInstance x = (JCInstance) containingClass;
//        x.vars.put(name, o);
//    }
//
//    public void addClassMethod(String methodName, Method method) {
//        JCClass x = (JCClass) containingClass;
//        x.methods.put(methodName, method);
//    }
//
//    public void addClassVariable(String name, Object o) {
//        //add varibale to class dictionary
//        //can also assing null if not declared with a value
//        JCClass x = (JCClass) containingClass;
//        x.vars.put(name, o);
//    }
//
//    public ArrayList addBasics() {
//        ArrayList<String> basics = new ArrayList();
//        basics.add("add");
//        basics.add("subtract");
//        basics.add("multipy");
//        basics.add("divide");
//        basics.add("strConcat");
//        basics.add("strCompare");
//        basics.add("addInstanceVariable");
//        basics.add("addInstanceMethod");
//        basics.add("addClassVariable");
//        basics.add("addClassMethod");
//        basics.add("print");
//        return basics;
//    }
}//end of class
