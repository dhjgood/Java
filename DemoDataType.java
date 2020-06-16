/*
 * @Author: Xiao'Hong
 * @Date: 2020-06-15 16:18:12
 * @LastEditors: Xiao'Hong
 * @LastEditTime: 2020-06-16 11:23:12
 * @Description:  数据类型转换
 * @FilePath: \Java\Practice\DemoDataType.java
 */ 

public class DemoDataType{
    public static void main(String[] args) {
        // long强制转换为int
        int num1 =  (int) 6000000000L; 
        System.out.println(num1); //1705032704


        //double -->int 强制转换 小数舍弃
        int num2 = (int) 3.5;
        System.out.println(num2);  

        
        char str1  = 'A';
        System.out.println(str1+1); // 66 code码相加  A = 65 

        // byte + byte --> int + int  = int 
        byte  num4 = 40; 
        byte  num5 = 50; 
        int res1 = num4 + num5; //这个相加 会把 byte 转换 int  所以接收类型必须 int
        System.out.println(res1);
        
        // byte + short --> int + int = int
        short num6 = 60;
        short res2 = (short) (num4+num6); //100  int强制转换为short：必须不能超过short范围，否则会数据溢出
        System.out.println(res2);
        

        // boolean 不能发生强制类型转换

    }
 }