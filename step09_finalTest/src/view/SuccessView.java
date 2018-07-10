package view;

import java.util.HashMap;
import java.util.Iterator;

import model.dto.Electronics;

public class SuccessView {
	public static void allProductPrint(HashMap all){
		Iterator allProduct = all.keySet().iterator();
		String key = null;
		while(allProduct.hasNext()){
			key = (String)allProduct.next();
			System.out.println("품목 : " + key + " - 모든 제품정보 " + all.get(key));
		}
	}
	
	public static void productPrint(Electronics product){
		System.out.println("제품 정보 - " + product);
	}
 
	public static void successMessage(String message) {
		System.out.println(message);
	}
}
