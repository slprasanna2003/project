package project.project;

/**
 * Hello world!
 *
 */
public class App 
{
	  public static void main(String[] args) {

		    //Launch 10 threads that make the operation with a different number
		    for (int i=1; i<=10; i++){
		      Calculator calculator=new Calculator(i);
		      Thread thread=new Thread(calculator);
		      thread.start();/*from  w  w  w .  ja v a  2 s.  co  m*/
		    }
		  }
		}
		/**
		 *  This class prints the multiplication table of a number
		 */
		class Calculator implements Runnable {

		  /**
		   *  The number
		   */
		  private int number;
		  
		  /**
		   *  Constructor of the class
		   * @param number : The number
		   */
		  public Calculator(int number) {
		    this.number=number;
		  }
		  
		  /**
		   *  Method that do the calculations
		   */
		  @Override
		  public void run() {
		    for (int i=1; i<=10; i++){
		      System.out.printf("%d * %d = %d\n",number,i,i*number);
		    }
		  }
}
