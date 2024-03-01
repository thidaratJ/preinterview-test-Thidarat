package test;
import java.util.Scanner;
public class thidarat1 {
    public static void main(String[] args) {
    	Scanner kb  = new Scanner(System.in);
    	int index=0; 
    	int n = kb.nextInt();
    	for(int i=1; i<=n ; i++) {
    		if(i%3 == 0 && i%5 == 0) {
    			System.out.println(i + " Ping Pong");
    		}
    		else {	
    			if(i%3 == 0) {
        			System.out.println(i + " Ping");
        		}
    			if(i%5 == 0) {
        			System.out.println(i + " Pong");
        		}
        		
    		}
    		
    		
    	}

    }

}