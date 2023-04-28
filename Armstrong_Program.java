class Armstrong_Program 
{
       public static void main(String [] args)
      {
       Armstrong_Program ap = new Armstrong_Program();
       ap.find_Armstrong_Number(370);
      }
void find_Armstrong_Number(int no)
     {
     int n=no;
     int a=0;
while(no>0)
       {
        int rem=no%10;// 0 is remainder
        a=a+(rem*rem*rem);//add +(rem cube)
        no=no/10;
        }
      System.out.println(a);
if(a==n)
     {
      System.out.println("Armstrong Number");
     }
else
     {
      System.out.println("Not Armstrong");
     }
    }
   }
