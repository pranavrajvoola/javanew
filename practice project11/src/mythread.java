public class mythread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		mythread mt = new  mythread();
  		mt.start();
 	}
}
