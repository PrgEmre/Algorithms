package General;

public class Gauss {

	public static void main(String[] args) {
		
		new Gauss(5,1);
	}
	
	public Gauss(int a, int b){
		int total = (a-b)+1;
		System.out.println(Math.ceil((((a-1)+(b+1))*total))/2);
	}

}
