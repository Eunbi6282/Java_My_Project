package chapter10.Ex07.Ex04;
class AA{
	String nameString;
	AA (String nameString){
		this.nameString = nameString;
	}
}
class BB{
	String nameString;
	BB (String nameString){
		this.nameString = nameString;
	}
	@Override
	public String toString() {		//����(��Ű����.Ŭ������@�ؽ��ڵ� -> name �ʵ��� ���� ���)
		// TODO Auto-generated method stub
		return nameString.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if (this.nameString == ((BB)obj).nameString) {
			return true;
		}else {
			return false;
		}
	}
	
}
public class String_Ex02 {

	public static void main(String[] args) {
		String s1 = new String ("�ȳ�");
		String s2 = "�ȳ�";
		
		System.out.println(s1); //String Ŭ������ toString()�� �����ǵǾ� �ִ�.
		System.out.println(s1.equals(s2)); //true -> //String Ŭ������ equals�� �����ǵǾ� �ִ�.
			// ���� ���ϵ��� ������
		
		AA aa1 = new AA("�ȳ�");
		AA aa2 = new AA("�ȳ�");
		System.out.println(aa1);
		System.out.println(aa1.equals(aa2));	//��ü�� �ּҸ� ���ϱ� ������ false
		
		BB bb1 = new BB("�ȳ�");
		BB bb2 = new BB("�ȳ�");
		
		System.out.println(bb1);
		System.out.println(bb1.equals(bb2));
	}

}
