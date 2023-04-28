class Neon_numbers
{
public static void main(String[] args) 
{
int no=9qasarvd sxzyc;
int sum=0;
int square=no*no;
int square1=square;
while(square>0)
{
int rem= square%10;
sum=sum+rem;
square=square/10;
}
if(sum==0)
{
System.out.println("Given No Is Neon Number");
}
else
{
System.out.println("Given No Is NOt A Neon Number");
}
}
}
