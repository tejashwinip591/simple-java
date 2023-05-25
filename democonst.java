class calculator
{
   int n1;
   int n2;
   calculator()
   {
    n1=20;
    n2=30;
   }
   
   
   calculator(int a,int b)
  {
    n1=a;
    n2=b;
    
  }
  
  void add()
  {
    System.out.println(n1+n2);
  }
}
class democonst
{
    public static void main(String arg[])
    {
        calculator c=new calculator();
        c.add();
        calculator c1=new calculator(30,30);
        c1.add();

    } 
    

    
        
    
}