package collection1;

import java.util.List;

public class ArrayList1P447 {

	public static void main(String[] args) {
		// List�� �������̽��̰� ����Ŭ������ ArrayList�� LinkedList�� ���� �� �ְ�
		// �⺻�����δ� ArrayList�� ���� �˴ϴ�.
		// java.util�� List�� ArrayList�� import�� ���� �˴ϴ�.
		
		// List�� ������ List<�ڷ���>�� ����־� �ش� �ڷ�����
		// ���� ���� �迭���·� �޾��� �� �ֽ��ϴ�.
		// <> ���̿��� �⺻���ڷ�(int, double, boolean��)�� �� �� �����ϴ�.
		
		// ���� �ڷḦ ���� �� �ִ� ����Ʈ ����(���̴� ������)
		List<Integer> list1 = new ArrayList<>();
		
		// �����ڷ����̹Ƿ� �߰��ϰ� ���� ��ŭ �ڷ� �߰� ����
		list1.add(1);
		list1.add(2);
		list1.add(3);

		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(1,100); // 1�� �ε������� �ڷ� ��ĭ�� �о ������� ����� 100 �ֱ� (
		System.out.println(list1);
		list1.set(1, 99); // 1�� �ε����� �ִ� �ڷḦ 99�� ��ü�ϰڴ�. (2�� �ε������� 99 �ڷ� �и�)
		System.out.println(list1);
	}
}
