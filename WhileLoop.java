class WhileLoop 
{
public static void main(String[] args) 
{
WhileLoop num = new WhileLoop();
//num.one();
//num.two();
//num.three();
num.four();
}
void one()
{
 int count=2;
while(count<=10)
  {
   System.out.print(count);
   count=count+2;                                                                                                                            
  }
}

void two()
{
  int count=1;
while(count<=13)
    {
      System.out.print(count);
count=count+3;
    }
}

void three()
{ 
  int count=3;
while (count<=15)
   { 
   System.out.print(count);
   count=count+3;
  }
}

void four()
{
int count=1;
while(count<=1331)
    {
     System.out.print(count);
     count=count*11;
    }
  }
}


