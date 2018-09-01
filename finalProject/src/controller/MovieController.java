package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;



@WebServlet("/Movie")
public class MovieController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		
		
		String clientId = "UTKGihje_l4m4VPzgGYn";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "JVOdpUeIFc";//애플리케이션 클라이언트 시크릿값";
        try {
            String text = URLEncoder.encode("영화명", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/movie?query="+ text; // json 결과
            //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
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
            JSONObject jsonItems = (JSONObject)jsonArray.get(0);
            
            
            br.close();
            System.out.println(jsonItems);
            request.setAttribute("jsonItems",jsonItems);
            //request.getRequestDispatcher("main.jsp").forward(request, response);
            
        } catch (Exception e) {
            System.out.println(e);
        }
	}

}
