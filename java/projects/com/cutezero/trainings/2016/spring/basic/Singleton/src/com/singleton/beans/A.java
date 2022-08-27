package com.singleton.beans;
public class A{
  private A(){
     System.out.println("constroctor A()");
  }
   private static A instance=null;
  public static A createA(){
       if (instance==null){
       instance= new A();
}
return instance;
}
public void display(){
      System.out.println("display ()");
  }
}