class Loop_pgm {
public static void main(String[] args) 
    {
     Loop_pgm lp=new Loop_pgm();
     //lp.print_reverse(1989);
     //lp.count_of_digits(123456);
     lp.sum_of_digits(4567);
    }

    void print_reverse(int task) //1989
    {
  while(task>0)
        {
        System.out.println(task%10);
        task=task/10;       
        }
      }
void count_of_digits(int task) //123456
    {     
       int count=0;
  while(task>0)
        {
        //System.out.println(task%10);
        count=count+1;
        task=task/10;    
        }
       System.out.println("count_of_Digits is "+ count);
}

void sum_of_digits(int task)//4567
         {
           int sum=0;
        while(task>0)
         {     
           //System.out.println(task%10);
            sum=sum+task%10;
           task=task/10;       
        }
        System.out.println("Sum of Digits is "+ sum);
      }
}






