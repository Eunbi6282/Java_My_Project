package Ex_T;
public class Ex11 {
	public static void main(String[] args) {
		//�⺻ �ڷ����϶� : == (���� ��)
		//���� �ڷ����϶� : == (�����ϴ� �ּ��� ������ ��)
		//���� �ڷ����϶� ���� ��: str1.equals(str2) <=�������� str1 ���� str2�� �� �ִ� ���� ��
		
		//String�� ���� �Ҵ��� �� ������(new) �̿� //������ �޸� ������ ����
		String aa = new String ("�ȳ�");
		String bb = new String("�ȳ�");
		System.out.println(aa);
		System.out.println(bb);
		
		if(aa == bb) {	//�޸��� �ּҰ���(aa,bb) ��
			//���� �ڷ������� "=="�� �޸� �ּҸ� ���Ѵ�. (�޸� �ּҰ� �������� Ȯ��)
			System.out.println(true);
		}else {
			System.out.println(false); //aa�� bb�� �ٸ� �޸� �ּҸ� ������.
		}
		System.out.println("===============");
		
		if(aa.equals(bb)) {			//�޸��� ���� ���� ��
			System.out.println(true);	//���� ����
		}else {
			System.out.println(false);
		}
		
		System.out.println("=====================");
		
		
		//String�� literal���� �ٷ� �Ҵ��ϴ� 2���� ��� //�޸� ������ ������
		String a = "�ȳ�";
		String b = "�ȳ�";
				
		if(a == b) {		//���� �ڷ������� "=="�� �޸� �ּҸ� ���Ѵ�. (�޸� �ּҰ� �������� Ȯ��)
			System.out.println(true); //aa�� bb�� ���� �޸� �ּҸ� ������.
		}else {
			System.out.println(false);
		}
	}

}
