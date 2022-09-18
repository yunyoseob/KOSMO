package a.b.c.test.xml_p;

import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.io.Resources;

public class Property_Read_2 {
		public static void main(String[] args){
			
			 // String resource="a.b.c.test.xml.db_2.ini";
			  String resource="a/b/c/test/xml/db_2.ini";
			  Properties prop=new Properties();
			 
			try{
				Reader rd=Resources.getResourceAsReader(resource);
				System.out.println("rd >>> : "+rd);
				// rd >>> : java.io.InputStreamReader@f6f4d33
				prop.load(rd);
				
				System.out.println(prop.getProperty("driver"));
				// a.b.c
				System.out.println(prop.getProperty("url"));
				// jdbc:oracle
				System.out.println(prop.getProperty("username"));
				// ss
				System.out.println(prop.getProperty("password"));
				// dd
			}catch(Exception e){
				
			}
		}
		
}
