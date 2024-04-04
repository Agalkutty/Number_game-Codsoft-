import java.util.Scanner;
class Number_game 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		int number=(int)(Math.random()*50);
		boolean repeat_feature=true;
		System.out.println("\t\t Guessing numbers");
		Thread.sleep(2000);
		System.out.println("\t\t we have assumed a number from 1-50");
		Thread.sleep(3000);
		System.out.println("\t\t start ur guess");
		Thread.sleep(2000);
		int trails=1;
		int won=0;
		if(trails<=2)
		{
			do
		{
			
			
				System.out.println("Enter the number n");
			    int n=sc.nextInt();
		
			if (n>number)
			{
				System.out.println("High");
			}
			else if(n<number)
			{
				System.out.println("Low");
			}
			else 
			{
				if(n==number)
				{
					System.out.println("U gotit");
					won=won+1;
					
					System.out.println("1.play again\n2.Exit");
					System.out.println("Enter the i/p");
					int input=sc.nextInt();
					if(input==2)
					{
						repeat_feature=false;
					}
					trails++;
				number=(int)(Math.random()*50);
				if(trails>2)
					{
					System.out.println("You have crossed the limit of trails");
					
				      if(won==2)
			       {
			        System.out.println(" U have  scored  100 in 2trails");
			       }
			           
                    
					repeat_feature=false;
				   }

				}
			}
		}while(repeat_feature);
		   
		   if(won<2)
	               {
				     System.out.println("U have scored 50 in 1trail" );
	               } 
		
		   System.out.println("\t\t******Thank you******");
		   }
	}
}
			
	
			
	
	
			
	
	

 
	    
		



	

		

		
		

