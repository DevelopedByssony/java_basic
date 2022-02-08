package collection1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1P447 {

	public static void main(String[] args) {
		// List�� �������̽��̰� ����Ŭ������ ArrayList�� LinkedList�� ���� �� �ְ�
		// �⺻�����δ� ArrayList�� ���� �˴ϴ�.
		// java.util�� List, ArrayList�� import�� ���� �˴ϴ�.
		
		// List�� ������ List<�ڷ���>�� ����־� �ش� �ڷ�����
		// ���� ���� �迭���·� �޾��� �� �ֽ��ϴ�.
		// <> ���̿��� �⺻���ڷ�(int, double, boolean��)�� �� �� �����ϴ�.
		
		// ���� �ڷḦ ���� �� �ִ� ����Ʈ ����(���̴� ������)
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		String[] list3 = {"���", "����", "����", "��纣��", "���ξ���"};
		System.out.println(list3);
		System.out.println(Arrays.toString(list3));
		
		// �����ڷ����̹Ƿ� �߰��ϰ� ���� ��ŭ �ڷ� �߰� ����
		list1.add(1);
		list1.add(2);
		list1.add(3);

		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(1,100); // 1�� �ε������� �ڷ� ��ĭ�� �о ������� ����� 100 �ֱ� 
		System.out.println(list1);
		list1.set(1, 99); // 1�� �ε����� �ִ� �ڷḦ 99�� ��ü�ϰڴ�. (2�� �ε������� 99 �ڷ� �и�)
		System.out.println(list1);
		
		// .contains("�ڷ�")�� ����Ʈ ���� ã�� �ڷᰡ ������ true
		// ���ٸ� false�� ������ش�.
		System.out.println(list1.contains("���"));
		System.out.println(list1.contains("������"));
		
		// .get(��ȣ)�� �־��� �ε����� ����Ǿ� �ִ� �ڷḦ ��ȸ���ݴϴ�.
		System.out.println(list1.get(1));
		// ���� �ε��� ��ȣ�� �Է��غ�����.
		// ���� ��ȣ �Է� �� ���ܰ� �߻��� ��ü �ڵ尡 ����˴ϴ�.
		// System.out.println(list1.get(100));
		
		// .size()�� ���� ��� ������ Ȯ���� �� �ֽ��ϴ�.
		System.out.println(list1.size());
		
		// .isEmpty()�� ����ִ��� ���θ� üũ���ݴϴ�. (����ֳ���?)
		System.out.println(list1.isEmpty()); // false(�ƴ�), true(��)
		
		// �� ����Ʈ list2�� �������� ���� �����ؼ� .isEmpty()�� .size()�� ��ȸ���ּ���.
		System.out.println(list2.isEmpty()); // ����ִ� ����Ʈ --> true�� ����
		System.out.println(list2.size()); // ����ִ� ����Ʈ --> ���� ��� ���� 0	
	}
}
