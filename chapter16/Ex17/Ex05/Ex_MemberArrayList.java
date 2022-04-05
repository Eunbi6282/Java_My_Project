package chapter16.Ex17.Ex05;

import java.util.ArrayList;

class Member{		//DTO , VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;
	private String memberName;
	
	public Member (int memberid, String memberName) {// ������ ���ؼ� �ʵ��� ���Ҵ�
		this.memberid = memberid;
		this.memberName = memberName;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
		public String toString() {
			return memberName + "ȸ������ ���̵�� " + memberid + "�Դϴ�.";
		}
}

// �迭 : ������ �Ҵ�
 // �÷��� �����ӿ�ũ : �޼��带 �̿��ؼ� ���� ����, ���� ���

class MemberArrayList{  
	private ArrayList<Member> arrayList;
	
		// ���ʤø����� ��ü���� ���
		//List <Member> aList = new ArrayList<Member>();
		// ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberArrayList() {	// �⺻������(�Ű����� ��x)
		arrayList = new ArrayList<Member>();		
			//MemberArrayList�� ��üȭ �ϸ� arrayList��ü�� ����� ����.(Ȱ��ȭ ��)
	}
	
	public void addMember(Member member){ //Member��ü�� �޾Ƽ� �Ǹ������濡 �����߰��ϴ� �޼��� 
		//�ڵ� ���
		arrayList.add(member); 	//
	}
	public void addMember2(int a, Member member) {		// �Ű����� 2���� �޾Ƽ� Ư�� index���ȣ�� ���� �߰�(����)
		//���� ó���غ���
		
		try {
		arrayList.add(a, member);  // ���� :IndexOutOfBoundsException �� �߻��� �� ����
		}catch (IndexOutOfBoundsException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�. ���ȣ�� �°� �Է����ּ���");
		}
		
		
		
		
	}
	public boolean removeMember(int memberid) {
		// ArrayList�� ����� memberid�� �˻��ؼ� �ش� ��ü�� �����ϴ� �޼���
		
		for(int i = 0; i  < arrayList.size(); i++) {
			Member member =	arrayList.get(i); 	//�� �濡 ����� Member ��ü�� member���� ������ �Ҵ�
			int temid = member.getMemberid(); 	// ��ü�� getMemberid(), ��ü ������ memberid
			
			if (temid == memberid) {
				arrayList.remove(i);  //arrayList ���� ��ü�� ����
				System.out.println("ȸ������ "+ memberid + "�� ���� �Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println(memberid + "�� �������� �ʽ��ϴ�. ");
		return false;
	}
	public void showAllMember() {
		// ArrayList�� ����� ��� ����� ������ ����ϴ� �޼���
		for (int i = 0; i < arrayList.size() ; i++) {
			System.out.println(arrayList.get(i)); //������ Member��ü�� ��ü�� ���
		}
		
	}
}
public class Ex_MemberArrayList {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();	
			// ��ü�� �����ϴ� ���� arraryList �ʵ尡 Ȱ��ȭ
			// �޼��� ȣ���ϱ� ���ؼ� ��ü ����
			// addMemeber(), addMember2 , removeMember(), showAllMember()
		
		// arrayList Ȱ��ȭ
		Member memberLee = new Member(7111, "������"); // 1��ü�� 2���� �� , memberid membername
		Member memberSom = new Member(1581, "�����");
		Member memberPark = new Member(3333, "������");
		Member memberHong = new Member(3344, "ȫ�浿");
		Member memberJung = new Member(5555, "������");
		
		
		//�� ��ü���� �����ؼ� ArrayList�� ����
		memberArrayList.addMember(memberJung);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberSom);
		
		//Ư�� index�濡 �߰����� �����
		memberArrayList.addMember2(3, memberJung); //3���濡 �߰�
		
		memberArrayList.addMember2(10, memberHong); //IndexOutOfBoundsException
//		memberArrayList.showSize();
		
		
		//��� ����� ���� ���
		memberArrayList.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberArrayList.removeMember(3344);
		
	}

}
