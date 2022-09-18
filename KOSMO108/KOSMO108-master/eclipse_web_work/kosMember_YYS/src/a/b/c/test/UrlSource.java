package a.b.c.test;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.FileWriter;

public class UrlSource {
	
	String url="https://www.melon.com/chart/index.htm";	
	
	try{
		URL u=new URL(url);
		BufferedReader br=new BufferedReader(
				new InputStreamReader(u.openStream(), "UTF-8")
		); 	
		String 
		
	}catch(Exception e){
		System.out.println("UrlSource 클래스에서 에러가 발생했어요 >>> : "+e.getMessage());
	}
} // end of UrlSource

