package assignment1;

public class Lableddowhileloop {
	
	    public static void main(String[] args) {
	        outerLoop: do {
	            int i = 1;
	            do {
	                System.out.println("i = " + i);
	                if (i == 2) {
	                    break outerLoop; 
	                }
	                i++;
	            } while (i <= 3);
	        } while (true); 
	        
	        System.out.println("Loop has exited.");
	    }
	}