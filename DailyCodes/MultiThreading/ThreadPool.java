class ThreadPoolDemo implements Runnable{
	
	int num ;

	ThreadPoolDemo(num){
	
	this.num = num;
	
	}

	
	
	public void run(){
	
		System.out.println(Thread.currentThread().getName() + "Start " + num);
		fun();
		System.out.println(Thread.currentThread().getName() + "End " + num);
	
	
	}

	void fun()throws Exception{
	
		Thread.sleep(2000);
	
	}

}

class ThreadPool {

	public static void main(String args [])throws Exception{
	
		ThreadPoolDemo tpd = new Runnable(5);

		ThreadPoolExecutor tpe = (ThreadPoolExecutor)new ThreadPoolExecutor(tpd);

		tpe.execute();
	
	
	
	}




}
