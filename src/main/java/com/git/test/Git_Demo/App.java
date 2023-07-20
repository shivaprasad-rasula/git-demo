package com.git.test.Git_Demo;

import java.io.IOException;

/**
 * Hello world!
 *
 */
class App {
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        System.out.println("shiva prasad rasula");
        
        App app = new App();
        app.Test() ;
        app.Test1();
        App2 app2 = new App2();
        app2.name();
    }

	public  void Test() throws IOException{
	 System.out.println("git repository");
	 System.out.println("shiva prasad rasula");
	}
	private static void Test1() {
	 System.out.println("git repository");
	 System.out.println("shiva prasad rasula");
	}
}

class App1 extends App{
	
	@Override
	public void Test() throws NumberFormatException{
		 System.out.println("git repository");
		 System.out.println("shiva prasad rasula");
		}
}

class App2 extends App1{
	
	@Override
	public void Test() throws ArithmeticException{
		 System.out.println("git repository");
		 System.out.println("shiva prasad rasula");
		}
	
	public void name() {
		try {
		int a = 10/0 ;
		}catch (Exception e) {
			throw new CustmeException("student not found");
		}
	}
}