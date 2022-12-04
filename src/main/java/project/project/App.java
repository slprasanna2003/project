package project.project;

/**
 * Hello world!
 *
 */
public class App 
{
	public class SleepExp1 extends Thread  
	{    
	    public void run()  
	    {    
	    	int num=8;
	        for(int i=1;i<5;i++)  
	        {    
	            try  
	            {  
	                Thread.sleep(500);  
	            }catch(InterruptedException e){System.out.println(e);}    
	            for(int j=1;j<=10;j++) {
	            	System.out.printf("%d * %d = %d\n",num,j,num*j);
	            }
	        }    
	    }    
	    public void main(String args[])
	    {    
	        SleepExp1 t1=new SleepExp1();    
    
	        t1.start();   
	    }    
	}  
}
