class Calculator
{

    void multiply(int no1, int no2)
    {
    System.out.println(no1*no2);
    }

    public static void main(String[] args)
    {
    Calculator calc = new Calculator(); //constructor//
    calc.add();  //Method calling Statement//
    calc.sub();
    calc.multiply();
    }
    void add()
    {  //Method Body/Method Definition//
     System.out.println(10+20); 
    }
void sub()

    {  //Method Body/Method Definition//
     System.out.println(20-10); 
    }
 void multiply()
    {  //Method Body/Method Definition//
     System.out.println(10*20); 
    }
}
