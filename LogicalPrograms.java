class LogicalPrograms
{

public static void main(String[] args)
{
LogicalPrograms lp = new LogicalPrograms();
//lp.find_divisors(100);
//lp.find_count_of_divisors(131);
lp.find_Prime(131);
}

void find_Prime(int no) //no=131
{
int div = 2; 
int count = 0; 
while(div<no)
{
    if(no%div == 0)
    {
    System.out.println(div);
    count = count + 1; 
    }
    div = div +1; 
 }
System.out.println("No. of divisors is "+ count);
if(count==0)
    {
        System.out.println("Given number is Prime Number");
    }
else
    {
        System.out.println("Given number is Not Prime Number");
    }
}
void find_count_of_divisors(int no)
{
int div = 2; 
int count = 0; 
while(div<no)
{
    if(no%div == 0)
    {
    System.out.println(div);
    count = count + 1; 
    }
    div = div +1; 
 }
System.out.println("No. of divisors is "+ count);
}


void find_divisors(int no)
{
int div = 2; 
while(div<no)
{
    if(no%div == 0)
    {
    System.out.println(div);
    }
    div = div +1; 
    }
}

}
