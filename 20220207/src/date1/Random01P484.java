package date1;

import java.util.Random;

public class Random01P484 {

	public static void main(String[] args) {
		// Random Ŭ������ Math.random()���� �� �� �����ϰ�
		// �پ��� ������ �������� ���� �� �ֵ��� �����ݴϴ�.
		// java.util�� ���� import �� �� �ֽ��ϴ�.
		Random random = new Random();
		boolean result = random.nextBoolean();
		System.out.println(result);
	}
}
