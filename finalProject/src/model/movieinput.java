package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class movieinput {

    // tag값의 정보를 가져오는 메소드
   private static String getTagValue(String tag, Element eElement) {
       NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
       Node nValue = (Node) nlList.item(0);
       if(nValue == null) 
           return null;
       return nValue.getNodeValue();
   }

   public static void main(String[] args) {
	    Calendar date = Calendar.getInstance();//월 -1로 적기, 일+1로 적기
	    date.set(2015, 12, 15);
		date.add(Calendar.DAY_OF_MONTH, -1);
        SimpleDateFormat format = new SimpleDateFormat("YYYYMMdd");
		String todayDate = format.format(date.getTime());
		
      //int page = 20180715;   // 페이지 초기값 
     // int page2 =page+5;
      try{
    	  System.out.println(todayDate);
         while(true){
            // parsing할 url 지정(API 키 포함해서)
            String url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?"
                  + "key=8fc9e2ace5ff38d5af86973eaa774996&targetDt="+todayDate;
            
            DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
            Document doc = dBuilder.parse(url);
            
            // root tag 
            doc.getDocumentElement().normalize();
//            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            
            // 파싱할 tag
            NodeList nList = doc.getElementsByTagName("dailyBoxOffice");
//            System.out.println("파싱할 리스트 수 : "+ nList.getLength());
            System.out.println("######################");
            for(int temp = 0; temp < nList.getLength(); temp++){
               Node nNode = nList.item(temp);
               if(nNode.getNodeType() == Node.ELEMENT_NODE){
                  
                  Element eElement = (Element) nNode;
                  System.out.println("######################");
                  //System.out.println(eElement.getTextContent());
                  System.out.println("해당 일자 : "+todayDate);
                  System.out.println("순번을 출력  : " + getTagValue("rnum", eElement));
                  System.out.println("전일대비 순위의 증감분을  : " + getTagValue("rankInten", eElement));
                  System.out.println("영화의 대표코드 : " + getTagValue("movieCd", eElement));
                  System.out.println("영화명(국문)  : " + getTagValue("movieNm", eElement));
                  System.out.println("영화의 개봉일  : " + getTagValue("openDt", eElement));
                  System.out.println("해당일의 매출액  : " + getTagValue("salesAmt", eElement));
                  System.out.println("해당일자 상영작의 매출총액 대비 해당 영화의 매출비율  : " + getTagValue("salesShare", eElement));
                  System.out.println("전일 대비 매출액 증감분  : " + getTagValue("salesInten", eElement));
                  System.out.println("전일 대비 매출액 증감 비율  : " + getTagValue("salesChange", eElement));
                  System.out.println("누적매출액  : " + getTagValue("salesAcc", eElement));
                  System.out.println("해당일의 관객수  : " + getTagValue("audiCnt", eElement));
                  System.out.println("전일 대비 관객수 증감분  : " + getTagValue("audiInten", eElement));
                  System.out.println("전일 대비 관객수 증감 비율  : " + getTagValue("audiChange", eElement));
                  System.out.println("누적관객수  : " + getTagValue("audiAcc", eElement));
                  System.out.println("해당일자에 상영한 스크린수 : " + getTagValue("scrnCnt", eElement));
                  System.out.println("해당일자에 상영된 횟수  : " + getTagValue("showCnt", eElement));



               }   // for end
            }   // if end
            
            //page += 1;
    		date.add(Calendar.DAY_OF_MONTH, -1);
    		todayDate = format.format(date.getTime());
//            System.out.println("page number : "+page);
            if(todayDate.compareTo("20151231")==0){   //일 -1로 적기
               break;
            }
         }   // while end
      } catch (Exception e){   
         e.printStackTrace();
      }   // try~catch end
   }   // main end
}   // class end