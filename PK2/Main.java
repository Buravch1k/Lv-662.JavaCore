package java12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]agrs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("������ ����� ��� ����");
		int a = Integer.parseInt(br.readLine());
		switch(a) {
		case 1:
			System.out.println("Monday,��������");
			break;
		case 2:
			System.out.println("Tuesday,³������");
			break;
		case 3:
			System.out.println("Wednesday,������");
			break;
		case 4:
			System.out.println("Thursday,������");
			break;
		case 5:
			System.out.println("Friday,�'�����");
			break;
		case 6:
			System.out.println("Saturday,������");
			break;
		case 7:
			System.out.println("Sunday,�����");
			break;
			default:
				System.out.println("���� ������");
			
		}
		
	
	} 
	}