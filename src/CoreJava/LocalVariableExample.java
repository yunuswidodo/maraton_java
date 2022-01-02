package CoreJava;

public class LocalVariableExample {

	public int sum (int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + i ;
		}
		
		return sum; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    LocalVariableExample localvariableexample = new LocalVariableExample();
    int sum  = localvariableexample.sum(10);
    System.out.println("sum of first 10 numbers -> " + sum);

	}

}
