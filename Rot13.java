package General;

import java.util.Scanner;

public class Rot13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rot13 rot = new Rot13();
		System.out.print("Enter String : ");
		System.out.println(rot.crypt(new Scanner(System.in).nextLine()));
	}

	private String crypt(String data){
		char[] ch = data.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if(ch[i] == ' ' || ch[i] == '\'' || ch[i] == '"' || ch[i] == ',') continue;
			if(ch[i] <= 'm'){
			
				ch[i] = (char)(ch[i]+13);
			
			}else{
				
				ch[i] = (char)(ch[i]-13);
				
			}
		}
		return new String(ch);
	}

}
