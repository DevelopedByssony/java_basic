package collection2;

import java.util.Collections;
import java.util.ArrayList; // List �������̽��� ����
import java.util.LinkedList; // List �������̽��� ����
import java.util.List; // �������̽� 

public class LinkedList01P447 {

	public static void main(String[] args) {
		// LinkedList�� �ڷ��� ������ ����� �� ����ϸ� ���� ����� �ֽ��ϴ�.
		// �Ϲ����� ��Ȳ������ ArrayList�� �� ���� ����
		// ��������δ� �� �ڷ����� ������ ���̴� �����Ƿ� ������ �� �� ����帮�ڽ��ϴ�.
		// ArrayList���� �� �� �ִ� �޼ҵ�� LinkedList���� �� �� �ְ�
		// LinkedList�� ArrayList���� �� �� �ִ�.
		
		List<String> list1 = new LinkedList<>();
		
		list1.add("�ڹ�");
		list1.add("JSP");
		list1.add("������");
		list1.add("��������Ʈ");
		System.out.println(list1);
		
		// .remove()�� �� ������ �ֽ��ϴ�.
		// .remove(��ȣ)�� ������ �ش� �ε����� �ڷᰡ �����ǰ�
		// .remove("�ڷ�")�� ������ ��ȣ�� ������� �ڷḦ �����մϴ�.
		// list1.remove(0); // 0�� �ε����� "�ڹ�"�� �����մϴ�.
		// System.out.println(list1);
		
		// list1.remove("������"); // "������" �ڷ����� ��ȣ�� ������� �����մϴ�.
		// System.out.println(list1);
		
		// ����Ʈ�� ��ü������ ��ﶧ�� .clear()�� ����մϴ�.
		// �� �� ���� �Ἥ ��ȸ�غ�����.
		// list1.clear();
		// System.out.println(list1);
		
		// 4�� �ڷ� �ƹ��ų� �߰��ϱ�
		list1.add("���̽�");
		list1.add("����Ŭ");
		list1.add("MySQL");
		list1.add("GO");
		

		// �ڷ� ������ Collections.sort(���Ĵ��) �Դϴ�.
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
	}
}
