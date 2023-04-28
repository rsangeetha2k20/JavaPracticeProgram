class PowerDigitPgm 
{
public static void main(String[] args) 
{
     PowerDigitPgm pd = new PowerDigitPgm();
     pd.find_square_of_Number(2,5);
}

void find_square_of_Number(int base,int power)
     {
        int box=1;
while(power>0) 
     {
        box=box*base;
        power=power-1;
      }
        return box;
      
     }
}
