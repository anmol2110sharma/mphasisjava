package day4;


	class Third implements Runnable
	{
          	synchronized public void run()   //execute one after other
		{
			try
			{
				Thread t=Thread.currentThread();
				String name=t.getName();
			
			
				for(int i=1;i<=10;i++)
				{System.out.println("n="+name+"="+i);
				Thread.sleep(500);
				}}catch(Exception e){}
			
		
			}}
	class ThreadExample
	{
		public static void main(String args[]) throws Exception
		 {
	    Third ob1=new Third();
		
		Thread t1=new Thread(ob1,"1st bike");
		Thread t2=new Thread(ob1,"2nd bike");
		
		t1.start();
		t2.start();
		 }
	}
