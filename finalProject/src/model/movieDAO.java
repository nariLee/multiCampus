package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class movieDAO {

	public static JSONObject naverMovie(String movieName) {
		
		
		String clientId = "UTKGihje_l4m4VPzgGYn";//���ø����̼� Ŭ���̾�Ʈ ���̵�";
        String clientSecret = "JVOdpUeIFc";//���ø����̼� Ŭ���̾�Ʈ ��ũ����";
        JSONObject jsonItems=null;
        try {
            String text = URLEncoder.encode(movieName, "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/movie?query="+ text; // json ���
            //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml ���
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // ���� ȣ��
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // ���� �߻�
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer res = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                res.append(inputLine);
            }
            
            Object obj = JSONValue.parse(res.toString());
            JSONObject jsonObj = (JSONObject)obj;
            JSONArray jsonArray = (JSONArray)jsonObj.get("items");
            jsonItems = (JSONObject)jsonArray.get(0);
            
            br.close();
            System.out.println("dao: "+jsonItems);
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
		return jsonItems;
        
	}
	
}
