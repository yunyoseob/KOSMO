package a.b.c.test.xml_p;

import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.io.Resources;

public class Property_Read_1 {
	public static void main(String[] args) throws Exception{
		String resource="db.properties";
		Properties prop=new Properties();
		try{
			Reader rd=Resources.getResourceAsReader(resource);
			prop.load(rd);
			
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
			/*
			 oracle.jdbc.driver.OracleDriver
			jdbc:oracle:thin:@localhost:1521:orclYYS00
			scott
			tiger
			 * */
		}catch(Exception e){
			System.out.println("error >>> : "+e.getMessage());
		}
	}
}
