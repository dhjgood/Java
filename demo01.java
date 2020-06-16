package Practice;
/*
 * @Author: Xiao'Hong
 * @Date: 2020-06-15 13:56:58 
 * @LastEditors: Xiao'Hong
 * @LastEditTime: 2020-06-16 09:46:20
 * @Description: file content
 * @FilePath: \Java\Practice\demo01.java
 */ 
public class demo01 {
  public static void main(String[] args) {
     // 变量 int
      int num1; 
      num1 = 10;
      System.out.println("变量:"+num1);
     
     // byte 范围  -128 -- 127
      byte num2 = 30;  
      System.out.println("byte:"+num2);
      byte num3 = -30;
      System.out.println("byte:"+num3);

     // short 范围  30000
       short num4 = 10;
       System.out.println("short:"+num4);

     // long  
      long  num5 = 30000000000L;
      System.out.println("long:"+num5);

     // flota 
      float num6 = 2.5F;
      System.out.println("flaot:"+num6); 
    
     // double
      double num7 = 1.2;
      System.out.println("double:"+num7); 
     
     // char 
      char str1 = 'A';
      str1 = 'B';
      System.out.println("char:"+str1);

     // boolean
      boolean bool = true;
      bool = false;
      System.out.println(bool); 

  }
}