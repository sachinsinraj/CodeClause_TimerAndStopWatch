import java.util.Scanner;

	class CountDown extends Thread
	{
	    public void run()
	    {
	        Scanner sobj = new Scanner(System.in);
	        
	        System.out.print("Enter the time in second for CountDown : ");
	        int time =  sobj.nextInt();

	        for(int i = time-1; i>=0; i--)
	        {
	            System.out.println(i+" sec");

	            try
	            {
	                Thread.sleep(1000);
	            }
	            catch(Exception obj)
	            {
	                System.out.println( "Error : "+obj);
	            }
	            
	        }

	        System.out.println("Time is over ...!!");
	    }
	}

	public class CountDownTimer 
	{
	    public static void main(String[] args) 
	    {
	        
	        CountDown obj = new CountDown();

	        Thread t1 = new Thread(obj,"");

	        t1.start();

	    }    
	}

