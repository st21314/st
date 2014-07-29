package com.itheima.student.study20;

public class testtt {
	public static void  main(String[] arg)
    {
      Son s=new Son();
      s.method1();
     }
}
class  Parent
{
    public void method1()
       {
               System.out.println("parent 1");
               this.method2();
        }
    public void method2()
        {
              System.out.println("parent 2");
         }
}
class Son extends Parent
{
       public void method1()
         {
               super.method1();
                 System.out.println("son 3");
                 this.method2();

          }
      public void method2()
        {
              System.out.println("son 4");
         }
}