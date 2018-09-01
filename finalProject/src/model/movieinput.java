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

    // tag���� ������ �������� �޼ҵ�
   private static String getTagValue(String tag, Element eElement) {
       NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
       Node nValue = (Node) nlList.item(0);
       if(nValue == null) 
           return null;
       return nValue.getNodeValue();
   }

   public static void main(String[] args) {
	    Calendar date = Calendar.getInstance();//�� -1�� ����, ��+1�� ����
	    date.set(2015, 12, 15);
		date.add(Calendar.DAY_OF_MONTH, -1);
        SimpleDateFormat format = new SimpleDateFormat("YYYYMMdd");
		String todayDate = format.format(date.getTime());
		
      //int page = 20180715;   // ������ �ʱⰪ 
     // int page2 =page+5;
      try{
    	  System.out.println(todayDate);
         while(true){
            // parsing�� url ����(API Ű �����ؼ�)
            String url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?"
                  + "key=8fc9e2ace5ff38d5af86973eaa774996&targetDt="+todayDate;
            
            DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
            Document doc = dBuilder.parse(url);
            
            // root tag 
            doc.getDocumentElement().normalize();
//            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            
            // �Ľ��� tag
            NodeList nList = doc.getElementsByTagName("dailyBoxOffice");
//            System.out.println("�Ľ��� ����Ʈ �� : "+ nList.getLength());
            System.out.println("######################");
            for(int temp = 0; temp < nList.getLength(); temp++){
               Node nNode = nList.item(temp);
               if(nNode.getNodeType() == Node.ELEMENT_NODE){
                  
                  Element eElement = (Element) nNode;
                  System.out.println("######################");
                  //System.out.println(eElement.getTextContent());
                  System.out.println("�ش� ���� : "+todayDate);
                  System.out.println("������ ���  : " + getTagValue("rnum", eElement));
                  System.out.println("���ϴ�� ������ ��������  : " + getTagValue("rankInten", eElement));
                  System.out.println("��ȭ�� ��ǥ�ڵ� : " + getTagValue("movieCd", eElement));
                  System.out.println("��ȭ��(����)  : " + getTagValue("movieNm", eElement));
                  System.out.println("��ȭ�� ������  : " + getTagValue("openDt", eElement));
                  System.out.println("�ش����� �����  : " + getTagValue("salesAmt", eElement));
                  System.out.println("�ش����� ������ �����Ѿ� ��� �ش� ��ȭ�� �������  : " + getTagValue("salesShare", eElement));
                  System.out.println("���� ��� ����� ������  : " + getTagValue("salesInten", eElement));
                  System.out.println("���� ��� ����� ���� ����  : " + getTagValue("salesChange", eElement));
                  System.out.println("���������  : " + getTagValue("salesAcc", eElement));
                  System.out.println("�ش����� ������  : " + getTagValue("audiCnt", eElement));
                  System.out.println("���� ��� ������ ������  : " + getTagValue("audiInten", eElement));
                  System.out.println("���� ��� ������ ���� ����  : " + getTagValue("audiChange", eElement));
                  System.out.println("����������  : " + getTagValue("audiAcc", eElement));
                  System.out.println("�ش����ڿ� ���� ��ũ���� : " + getTagValue("scrnCnt", eElement));
                  System.out.println("�ش����ڿ� �󿵵� Ƚ��  : " + getTagValue("showCnt", eElement));



               }   // for end
            }   // if end
            
            //page += 1;
    		date.add(Calendar.DAY_OF_MONTH, -1);
    		todayDate = format.format(date.getTime());
//            System.out.println("page number : "+page);
            if(todayDate.compareTo("20151231")==0){   //�� -1�� ����
               break;
            }
         }   // while end
      } catch (Exception e){   
         e.printStackTrace();
      }   // try~catch end
   }   // main end
}   // class end