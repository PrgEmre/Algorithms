package General;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
public class GetContents {
	URL url = null;
	BufferedReader br = null;
	InputStreamReader ir = null;
	Pattern p = null;
	Matcher m = null;
	public static void main(String[] args) throws MalformedURLException, IOException, Exception{
		GetContents b = new GetContents("http://google.com");
		System.out.println(b.getUrlData());
		

	}
	public GetContents(String url) throws MalformedURLException, IOException{
		this.url = new URL(url);
		ir = new InputStreamReader(this.url.openStream(), "UTF-8");
		br = new BufferedReader(ir);
		
	}
	
	public String getUrlData(String pattern, int group) throws Exception{
		
		if(this.url != null){
			p = Pattern.compile(pattern);
			String temp = br.readLine();
			String data = "";
			while(temp != null){
				data += temp+"\n";
				temp = br.readLine();
			}
			m = p.matcher(data);
			String new_data = "";
			while(m.find()){
				new_data += m.group(group)+"\n";
			}
			return new_data.replace("ABCDEFGHİJKLMNOÖPRSŞTUVWYZJ", "");
			
		}else{
			throw new Exception("Url is null!");
		}
	}
	
public String getUrlData() throws Exception{
		
		if(this.url != null){
			
			String temp = br.readLine();
			String data = "";
			while(temp != null){
				data += temp+"\n";
				temp = br.readLine();
			}
			return data;
			
		}else{
			throw new Exception("Url is null!");
		}
	}

}
