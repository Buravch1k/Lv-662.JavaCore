package java8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	public static void main(String[] args) throws NumberFormatException, IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int [] numbers = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
System.out.println("������� ����� ������");
int a = Integer.parseInt(br.readLine());
int x = a-1;
if (x > 11 | x < 1) {
	System.out.println(" �� ����� ������������ ����� ������ ");
}else {
	System.out.println("� " + a +" ������ ����� ���������� ���� - " + numbers[x]);
}
	}

}