package view;

import java.util.ArrayList;

import model.domain.DeptDTO;

public class EndView {

	public static void printAll(ArrayList<DeptDTO> datas) {
		//jdk1.5���� �߰��� �ݺ���
		for(DeptDTO dto:datas) {
			System.out.println(dto.toString());
		}
	}

	public static void succMsg(String msg) {
		System.out.println("���� ����: "+msg);
	}

	public static void errorMsg(String msg) {
		System.out.println("������ ����: "+msg);
	}

	public static void printAll(DeptDTO datas) {
		System.out.println(datas.toString());
	}

}
