package java7;
public class Num {

	public static void main (String[] args) {

				int[] numbers = {11, -3, -11,-5, 23};
				int index = 0;
				for (int  i = 0; i < numbers.length; i++) {
					if (numbers[i] > 0) {
						index ++;
					} 
					if (index == 2) {
						System.out.println("������ ������������� ����� "+ numbers[i] + " ��������� �� " + (i + 1)+" �����");
						break;
					}
				}
				int min = numbers[0];
				int min1 = 0;
				int y = 0;

				while (y < numbers.length) {
					if (numbers[y] < min) {
						min = numbers[y];
						min1 = y;
					}
					y++;
				}
				System.out.println("����������� ����� = " + min + " �� " + (min1 + 1) + " �����");
				int product = 1;
				for (int w = 0; w < numbers.length; w++) {
					if (numbers[w] % 2 == 0) {
						product *= numbers[w];
					}
				}
				System.out.println("��������� ��������� ������ ����� =  " + product);


			}
		}