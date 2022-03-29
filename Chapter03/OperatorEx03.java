package Chapter03;

public class OperatorEx03 {

	public static void main(String[] args) {
		/*
		 * �� ������ (&&, �Ӥ�, ^, !) : ��Ʈ ��Ŷ�� �߻��� (�պκ��� ���� ����� ������ �� ���� �� �޺κ��� ������ ����)
		 * ��Ʈ ������ (& , �� , ^ , ~ ) : ��Ʈ ��Ŷ�� �߻����� ����
		 * */
		
		System.out.println("1. �� ������ AND (&&) : �� ���� ��� true �϶� ����� true");
		System.out.println(true && true); //true, ��Ʈ ��Ŷ�� �߻����� ����. 
		System.out.println(true && false); //false, ��Ʈ ��Ŷ�� �߻����� ����.
		System.out.println(false && true); // false, ��Ʈ ��Ŷ �߻��� (�տ� false�� ���� �ڿ� true�� ������ false�� ������ false�� �Ǳ� ������)
		System.out.println(true && (5<3)); //false
		System.out.println((5 <= 5) && (7 > 2)); //true
		System.out.println((3 < 2) && (8 < 10)); //false, ��Ʈ��Ŷ �߻�
		
		System.out.println("2. �� ������ OR (||) : �� ���� �ϳ��� true �̸� ����� true");
		System.out.println(true || true); //true ; or���꿡�� �տ� true�� ���� ��Ʈ��Ŷ �߻�
		System.out.println(false || (5<3)); // false , ��Ʈ��Ŷ �߻�x
		System.out.println();
		
		System.out.println("1. �� ������ XOR (^)"); //�� ���� ���� �� false, �� ���� �ٸ� �� true
		System.out.println(true ^ true); //false , �ڿ� ���� �ݵ�� Ȯ�εǾ�� �ϱ� ������ ��Ʈ ��Ŷ�� �߻����� �ʴ´�. 
		System.out.println(false ^ false); //false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println((5 <=5 ^ (7 > 2))); //false , �ΰ� �� Ʈ����
		System.out.println();
		
		System.out.println("1. �� ������ NOT (!)"); //true�̸� false, false �̸� true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5<3)); //true
		System.out.println();
		
		System.out.println("=====��Ʈ ��Ŷ�� ����ϴ� ����(���������� �� �߻�, ��Ʈ�������϶��� �߻����� ����========");
		int value2 = 3;
		System.out.println(true & value2++ == 3); //false, ��Ʈ��Ŷ �߻�
		System.out.println(value2); 	//value2�� 4�� �Ǿ�� �ϴµ� ��Ʈ��Ŷ���� ���ؼ� �ڿ� ����� �����Ǿ� value2�� �״�� 3�� ��
		
		int value3 = 3;
		System.out.println(true & value3++ == 3);
		System.out.println(value3);  //4, ��Ʈ ��Ŷ�� �߻����� �ʾ� 4�� ��
		
		int value4 = 3;
		System.out.println(true || ++value4 > 6);
		System.out.println(value4);
		
		int value5= 3;
		System.out.println(true | ++value5 > 6); //true
		System.out.println(value5); //4, ��Ʈ��Ŷ�� �߻����� ����
		
		
		
				
		
		
	}

}
