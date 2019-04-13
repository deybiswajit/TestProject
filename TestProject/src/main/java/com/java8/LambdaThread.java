package com.java8;

/*class MyThread implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("MyThread run method called()");
		}
	}
}*/

public class LambdaThread {
	public static void main(String[] args) {
		
		/*MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();*/
		
		Thread t = new Thread(()->{for(int i=0;i<10;i++){
			System.out.println("MyThread run method called()");
		}});
		t.start();
		
		
		
		for(int i=0;i<10;i++){
			System.out.println("Main thread method called()");
		}
	}
}
