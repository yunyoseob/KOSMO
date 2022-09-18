package a.b.c.com.json;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonRead {
	private static Logger logger = LogManager.getLogger(JsonFile.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		
		try {
			String jsonFilePath = CommonJSON.JSON_FILE_PATH;
			File jsonFile = new File( jsonFilePath + "/JsonRead.json");
			
			Object obj = parser.parse(new FileReader(jsonFile));
			JSONObject jsonObject = (JSONObject)obj;
			
			String name = (String)jsonObject.get("name");
			logger.info("name >>> : " + name);
			
			long id = (Long)jsonObject.get("id");
			logger.info("id >>> : " + id);
			
			JSONArray phoneNum = (JSONArray)jsonObject.get("phoneNumbers");
			Iterator iter = phoneNum.iterator();
			while (iter.hasNext()){
				logger.info("phoneNum >>> : " + iter.next());
			}
			
			JSONArray array = (JSONArray)jsonObject.get("address");			
			for(int i=0; i < array.size(); i++){
				JSONObject result = (JSONObject)array.get(i);
				//logger.info("street >>> : " + result.get("street"));
				//logger.info("city >>> : " + result.get("city"));
				logger.info("address >>> : " + result.get("zipcode"));
			}
			
			//String role = (String)jsonObject.get("role");
			//logger.info("role >>> : " + role);
		}catch(Exception e){
			
		}
	}

}
