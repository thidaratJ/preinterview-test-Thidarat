package test;
import java.util.Scanner;
public class thidarat2 {
	 public static void main(String[] args) {
	    	Scanner kb  = new Scanner(System.in);
	    	int index=0; 
	    	int n = kb.nextInt();
	    	int i = kb.nextInt();
	    	int j = kb.nextInt();
	    	for(int a=1; a<=n ; a++) {
	    		if(a%i == 0 && a%j == 0) {
	    			System.out.println(a + " Ping Pong");
	    		}
	    		else {	
	    			if(a%i == 0) {
	        			System.out.println(a + " Ping");
	        		}
	    			if(a%j == 0) {
	        			System.out.println(a + " Pong");
	        		}
	        		
	    		}
	    		
	    		
	    	}

	    }
}
