package a.b.c.com.json;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class JsonFile {
	private static Logger logger = LogManager.getLogger(JsonFile.class);
	
	public static final String JSON_FILE_NAME = "JsonTest2";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject personInfo = new JSONObject();
		personInfo.put("name", "KimJuHyung");
		personInfo.put("age", "27");
		personInfo.put("jobInfo", "programmer");
		
		JSONArray hobbyList = new JSONArray();
		hobbyList.add("programming");
		hobbyList.add("music");
		hobbyList.add("book");
		
		personInfo.put("message", hobbyList);
		
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter(CommonJSON.JSON_FILE_PATH +"/"+ JSON_FILE_NAME + ".json"));
			bw.write(personInfo.toJSONString());
			bw.flush();
			bw.close();
		}catch(IOException e){
			
		}
		
		logger.info("personInfo >>> : " + personInfo);
	}
}
