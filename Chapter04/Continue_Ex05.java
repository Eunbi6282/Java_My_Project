package Chapter04;
public class Continue_Ex05 {
	public static void main(String[] args) {
		
		//1. ���� �������� continue(�ؿ� ������ �������� �ʰ� �������� �ٽ� ����. break ó�� ������ ���������� ���� �ƴ�)
		
		for (int i = 0; i < 10; i++) {
			continue;
			// System.out.println("��� ���� ����"); 	//continue�� ���Ǿ��� ���� ����
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			continue;		//continue�� ���Ǿ��� ������ ���๮�� ����ϸ� �����߻�
			//System.out.println();
		}
		System.out.println();
		System.out.println("======continueó��=========");
		
		//2. ������ ����ؼ� continue ó��
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;		//i�� 5���Ǹ� ���๮�� ������� ����, 5�� �ȳ���
								//continue�� ������ ���������� �ʰ� 5�϶��� ���๮�� ������� �ʰ� �ٽ� ���������� ���� �ٽ� ��� ����
			}
			System.out.print( i + " ");
		}
		
		System.out.println();
		System.out.println("=======breakó��=========");
		
		//2. ������ ����ؼ� break ó��
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;		//i�� 5���Ǹ� ���๮�� ������� ����, 5�� �Ǵ� ���� ������ �ƿ� ��������
			}
			System.out.print( i + " ");
		}
		
		System.out.println();
		System.out.println("=======���� �������� continue=========");
		
		//3. ���� ���������� continue���
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					continue;		//j�� 3�϶��� ���x
				}
				System.out.println(i + " , " + j);
			}
		}
		
		System.out.println();
		System.out.println("=======���� �������� break=========");
		
		//3. ���� ���������� break���
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break;		//j�� 3�Ӹ� �ƴ϶� 4�϶��� ���x
				}
				System.out.println(i + " , " + j);
			}
		}
		
		System.out.println();
		System.out.println("=======continue���� �� ���=========");
		
		//4. continue���� �� ���
POS2:		for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (j == 3) {
						continue POS2;		//continue�� ������ ���������� �ʰ� ���
					//j�� 3,4�϶� pos2�� �� �� �ٽ� �������� �� �� ����� �̾
					}
				System.out.println(i + " , " + j);
				}
	    	}
		
		System.out.println();
		System.out.println("=======break���� �� ���=========");
		
		//4. break���� �� ���
POS3:		for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (j == 3) {
						break POS3;		//j�� 3�� �� �� ��� ���� ����
					}
					System.out.println(i + " , " + j);
				}
		    }
				
		
	}

}
