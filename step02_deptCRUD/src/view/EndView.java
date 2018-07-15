package view;

import java.util.ArrayList;

import model.domain.DeptDTO;

public class EndView {

	public static void printAll(ArrayList<DeptDTO> datas) {
		//jdk1.5부터 추가된 반복문
		for(DeptDTO dto:datas) {
			System.out.println(dto.toString());
		}
	}

	public static void succMsg(String msg) {
		System.out.println("정상 실행: "+msg);
	}

	public static void errorMsg(String msg) {
		System.out.println("비정상 실행: "+msg);
	}

	public static void printAll(DeptDTO datas) {
		System.out.println(datas.toString());
	}

}
