package collection1;

import java.util.ArrayList;
import java.util.List;

// import java.util.*; <- util ���ο� �ִ� ��� ��ƿ import 

public class ArrayList02P447 {

	public static void main(String[] args) {
		// �������� ���� String �ڷḦ ���������� ���� �� �ִ�
		// ArrayList�� ������ֽð� ���ʿ� �ڷ�� 
		// "���", "����", "����", "��纣��", "���ξ���"�� �־��ּ���.
		// �ڷᰡ ����� ArrayList�� �ֿܼ� ����ּ���.
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("���");
		list1.add("����");
		list1.add("����");
		list1.add("��纣��");
		list1.add("���ξ���");

		System.out.println(list1);
		
		// .contains("�ڷ�")�� ����Ʈ ���� ã�� �ڷᰡ ������ true
		// ���ٸ� false�� ������ش�.
		System.out.println(list1.contains("���"));
		System.out.println(list1.contains("������"));
	}
}
