package General;

import java.util.Locale;

public class FirstUpper {

	public static void main(String[] args) {
		
		String data = "I am java developer!";
		String[] ar = data.split(" ");
		for(int i = 0; i < ar.length; i++){
			String kelime = String.valueOf(ar[i].charAt(0)).toUpperCase(new Locale("TR","tr"))+ar[i].substring(1);
			System.out.println(kelime);
		}
	}

}
