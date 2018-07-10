package model;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import exception.DuplicateException;
import exception.InexistentException;
import model.dto.Electronics;
import model.dto.NoteBook;
import model.dto.SmartPhone;


public class ElectronicsServiceImpl{
   private static ElectronicsServiceImpl instance = new ElectronicsServiceImpl();
   
   //모든 전자제품 저장 객체
   private HashMap<String, HashMap> electronicsList = new HashMap<String, HashMap>();
   
   //제품 번호로 노트북 저장 객체
   private HashMap<String, Electronics> noteBookList = new HashMap<String, Electronics>();

   //제품 번호로 스마트폰 저장 객체
   private HashMap<String, Electronics> smartPhoneList = new HashMap<String, Electronics>();
   
   //properties파일로 부터 데이터 로딩(저장)해서 HashMap객체들에 저장
   /*1. properties 두가지
    * 2. 노트북 / 스마트폰 정보를 개별 properties 파일로 구분
    * 3. properties 로 부터 데이터를 read해서 key = value 구조로 자바 객체로 변환
    *       -properties API는 properties 파일의 구조처럼 데이터 관리
    *       -key = value 구조
    *       -HashMap과 흡사 , 
    * 
    */
   private ElectronicsServiceImpl(){
      Properties productInfo = new Properties();
      try {
         //noteBookInfo.propertiesdm 의 내용을 보유
         /*#modelNum      modelName       price        os
            NT900X4D-A68S=NT900X4D-A68S,삼성센스,1300,Windows 8
            NT900X4D-A99S=NT900X4D-A99S,삼성센스,1700,Windows 8
          * 
          */
         productInfo.load(new FileReader("noteBookInfo.properties"));  //  load 는 2바이트 단위로 알아서 구동
         
         //properties 파일의 모든 key를 Set 객체로 반환
         Iterator keyAll = productInfo.stringPropertyNames().iterator(); // iterator로 넣어준다. 
         
         String key = null;
         String [] productValue = null;
         
         while(keyAll.hasNext()){ // 가지고 있으면 줘라 
            key = (String)keyAll.next();
//            System.out.println("===" + key);
            //System.out.println("-----" + productInfo.getProperty(key));
            
            productValue = productInfo.getProperty(key).split(",");	//getProperty(): key에 매핑된 value값 반환
            
            noteBookList.put(key, new NoteBook(productValue[0], productValue[1], new Integer(productValue[2]), productValue[3]));
         }         
         electronicsList.put("noteBook", noteBookList);
         productInfo.clear();//추가
         //smartPhone 데이터 로딩 
         productInfo.load(new FileReader("smartPhoneInfo.properties"));
         keyAll = productInfo.stringPropertyNames().iterator();         
         
         while(keyAll.hasNext()){
            key = (String)keyAll.next();
            productValue = productInfo.getProperty(key).split(",");
            smartPhoneList.put(key, new SmartPhone(productValue[0], productValue[1], 
                                                         Integer.parseInt(productValue[2]),
                                                         productValue[3]));
         }
         electronicsList.put("smartPhone", smartPhoneList);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   public static ElectronicsServiceImpl getInstance(){
      return instance;
   }
   
   //모든 전자 제품 반환
   public HashMap<String, HashMap> getElectronicsList() throws InexistentException{//추가
      return electronicsList;
   }
   
   //모든 노트북 or 스마트 폰 반환  
   public HashMap<String, Electronics> getKindElectronics(String kind) throws InexistentException{
      HashMap kindProduct = electronicsList.get(kind);
      if(kindProduct == null){
         throw new InexistentException("검색하고자 하는 품목들의 제품이 없습니다.");
      }
      return kindProduct;
   }
   
   //특정 제품 검색 
   public Electronics getElectronics(String kind, String modelNum) throws InexistentException{
      Electronics product = (Electronics)(electronicsList.get(kind).get(modelNum));
      if(product == null){
         throw new InexistentException();
      }
      return product;
   }
   
   
   //제품 고유 번호로 제품 존재 유무 체크 메소드
   /* true - 존재할 경우 반환값
    * false - 미존재할 경우 반환값    */
   public boolean existElectronics(String kind, String modelNum){
      HashMap<String, Electronics> products = electronicsList.get(kind);
      if(products != null) {	//추가
    	  return products.containsKey(modelNum);
      }
      return false;
   }
   
   /* 저장
    * 새로운 전자 제품 저장 
    */
   public void insertElectronics(String kind, Electronics product) throws DuplicateException{
      if(!existElectronics(kind, product.getModelNum())){
         electronicsList.get(kind).put(product.getModelNum(), product);
      }else{
         throw new DuplicateException();
      }
   }
   
   /* 수정
    * kind, 모델로 모델 가격 수정하기 
    */
   public void updateElectronics(String kind, String modelNum, int newPrice) throws InexistentException{
      Electronics product = getElectronics(kind, modelNum);
      if(product != null){
         product.setPrice(newPrice);
      }else{	//추가
          throw new InexistentException();
       }
   }
   
   
   /* 삭제
    * kind, modelNum으로 제품 삭제 
    */
   public void deleteElectronics(String kind, String modelNum) throws InexistentException{
	   //추가
	   Electronics product = getElectronics(kind, modelNum);
	      if(product != null){
	    	  getKindElectronics(kind).remove(modelNum);
	      }else{	//추가
	          throw new InexistentException();
	       }
   }
}