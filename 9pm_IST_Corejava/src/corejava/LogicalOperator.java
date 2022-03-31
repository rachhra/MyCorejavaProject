package corejava;

public class LogicalOperator
{
 public static void main(String[] args) {
            int a = 390;
            int b = 90;
            int c = 100;
            
            if (a > b && b > c) {
            	System.out.println("if block is executed");
            } else {
            	
            		System.out.println("else block is executed");{
            			
            			if (a > b || b > c) {
            				System.out.println("if block is executed");
            			} else {
            				System.out.println("else block is executed");
            			}
            			
            		}
            		
            	}
            	
            }
            
            
}
