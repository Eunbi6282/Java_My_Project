package chapter17.Ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// HashSet���� ��ȯ
// Member Ŭ������ memberid �ö��� equlas(), hashCode()�� ���ؼ� ���� -> ������ �ڵ����� Ȯ��


class Member{		//DTO , VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;
	private String memberName;
	public Set<Member> hashSet;
	
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
	
	// ���� ���� equals(), hashCode()������ 
	@Override
	public int hashCode() {
		return Objects.hash(memberid,memberName);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			
			if(this.memberid == ((Member)obj).memberid && this.memberName == ((Member)obj).memberName){
				return true;
			}
		}
		return false;
	}

}

// �迭 : ������ �Ҵ�
 // �÷��� �����ӿ�ũ : �޼��带 �̿��ؼ� ���� ����, ���� ���

class MemberHashSet{  
	private Set<Member> hashSet;
	
		// ���ʤø����� ��ü���� ���
		//List <Member> aList = new ArrayList<Member>();
		// ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberHashSet() {	// �⺻������(�Ű����� ��x)
		hashSet = new HashSet<>();		
			//MemberArrayList�� ��üȭ �ϸ� arrayList��ü�� ����� ����.(Ȱ��ȭ ��)
	}
	
	public void addMember(Member member){ //Member��ü�� �޾Ƽ� �Ǹ������濡 �����߰��ϴ� �޼��� 
		//�ڵ� ���
		hashSet.add(member); 	//
	}
	
	public boolean removeMember(int memberid) {
		//iterator ����ؼ� remove
		Iterator<Member> i1 = hashSet.iterator();
		while (i1.hasNext()) {
			Member member = i1.next();
		int	m2 = member.getMemberid();
			
			if (memberid == m2) {
				hashSet.remove(i1);
				System.out.println("ȸ������ "+ memberid + "�� ���� �Ǿ����ϴ�.");
				return true;
			}
		}
		return false;
	}


	
	public void showAllMember() {
		// ArrayList�� ����� ��� ����� ������ ����ϴ� �޼���
		//iterator ���
		Iterator<Member> i2 = hashSet.iterator();
		while(i2.hasNext()) { // ���� �����ϸ� true�ؼ� ���� ���� ���
			System.out.print(i2.next() + " ");
		}
	}
	
	public void showSize() {
		System.out.println(hashSet.size());
	}
	
}
public class Ex_MemberHashSet {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();	
			// ��ü�� �����ϴ� ���� arraryList �ʵ尡 Ȱ��ȭ
			// �޼��� ȣ���ϱ� ���ؼ� ��ü ����
			// addMemeber(), addMember2 , removeMember(), showAllMember()
		
		// arrayList Ȱ��ȭ,
		// memberid -> equals()
		Member memberLee = new Member(7111, "������"); // 1��ü�� 2���� �� , memberid membername
		Member memberSom = new Member(1581, "�����");
		Member memberPark = new Member(3333, "������");
		Member memberHong = new Member(3344, "ȫ�浿");
		Member memberJung = new Member(5555, "������");
		
		
		//�� ��ü�� �����ؼ� ����
		memberHashSet.addMember(memberJung);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberSom);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberPark);
		
		
		//��� ����� ���� ���
		memberHashSet.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberHashSet.removeMember(7111);
		
		// 
		memberHashSet.showSize();
		
		
	}

}
