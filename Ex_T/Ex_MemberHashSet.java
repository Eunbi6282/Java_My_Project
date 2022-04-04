package Ex_T;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// HashSet���� ��ȯ
// Member Ŭ������ memberid �ö��� equlas(), hashCode()�� ���ؼ� ���� -> ������ �ڵ����� Ȯ��

// �߿� : Set�� �ߺ��� ���� ������ �� ����.
	//WrapperŬ������ Integer, String, Double, Float, Chractor, Byte, Boolean
	//WrapperŬ������ equlas(),hashcode()�޼��尡 ���� �Ǿ� �ִ�.
	// Ư�� ��ü�� ������ �� ��ü�� Set�� ������ ��� �� ��ü�� bjectŬ������ equals(), hashcode()�� ������ ����� �Ѵ�.
	// ��ü�� Ư�� �ʵ��� ���� ���� �� �ߺ��� �ĺ��ϴ� �ʵ� ����


class Member{		//DTO , VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid; //Set�� ���� �ĺ���, memberid�ʵ��� ���� ���� �� ���� ��ü�̴� ��� ����
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
	
	// Set�ȿ� �ߺ��� ���� ���� �ʱ� ���� ���� ���� equals(), hashCode()������
	
	// ��ü���� ���� ���Ϸ��� �� ���� epquals()�� ������ ����� ��!!!!
	@Override      //member1.equlas(member2)
		public boolean equals(Object obj) {
			if(obj instanceof Member) {			//Object�ٿ� ĳ���� �ʿ�-> ��Ÿ�� ���� ����
				Member member = (Member) obj; // obj�� Object�� ��ĳ���� �Ǿ� �ֱ� �빮�� �ٿ�ĳ���� �ʿ�
				if(this.memberid == member.memberid) { 
					//this.memberid : member1��ü , member.memberid :member2
					return true;
				}else {
					return false;
				}
			}
			return false; //obj�� MemberŸ���� �������� ���� ��
		}
	
	@Override
		public int hashCode() {  //membeid �ʵ��� ���� ������ �� hashCode����
		
		// �ϳ��� �ʵ�(memberid)���� �������� �ؽ��ڵ带 ���� ��
		//return memberid;	
			return Objects.hashCode(memberid); // �������
				//Objects.hashCode(memberid,membername); �������� �ʵ带 �������� hashCode���� �� �� �ִ�. 
				// memberid, membername�ʵ��� ���� ��� ������ ���
		}
	}

// �迭 : ������ �Ҵ�
 // �÷��� �����ӿ�ũ : �޼��带 �̿��ؼ� ���� ����, ���� ���

class MemberHashSet{  
	private Set<Member> hashSet; //Set���� : <Member>
	
		// ���ʤø����� ��ü���� ���
		//List <Member> aList = new ArrayList<Member>();
		// ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberHashSet() {	// �⺻������ ȣ��� Set�� �������� Ȱ��ȭ
		hashSet = new HashSet<Member>();//<Member> �����ϸ� �ȵ�
		
		// *hashSetȣ���ϴ� ���
		//Set<Member> hashSet = new HashSet<Member>; <- �̶� <Member>���� ����
		
		
			//MemberArrayList�� ��üȭ �ϸ� arrayList��ü�� ����� ����.(Ȱ��ȭ ��)
	}
	
	public void addMember(Member member){ //Member��ü�� �޾Ƽ� �Ǹ������濡 �����߰��ϴ� �޼��� 
		//�ڵ� ���
		hashSet.add(member); 	//Member ��ü�� input�޾� hashSet�� member�� ����, ���� ����Ǹ� ���ȵȴ�
							// Member ��ü�� memberif �ʵ��� ���� ������ ���, ������ ��ü��� �����ص�(equals, hashcode ������)
	}
	
	public boolean removeMember(int memberid) { //memberid�� Member��ü ���� �ʵ��̹Ƿ� Set�� ����Ǵ� ��ü�� �����;� �Ѵ�. 
		//Set�� index�� �������� �����Ƿ� �⺻for���� ����� �� ����.
		// -> iterator or Enhanced for�� ����ؼ� remove
		Iterator<Member> i1 = hashSet.iterator(); //iterator :��ȸ��(��ȸ�ϸ鼭 ���� �ִ��� ã��)
		
		while(i1.hasNext()) {     //hashSet�� ���� ������ �� true �ƴϸ� false
			Member member = i1.next();
			int tempid = memberid.get;
			
			if(tempid == memberid) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberid + "�� �������� �ʽ��ϴ�.");
		return false;
	}


	
	public void showAllMember() {
		// ArrayList�� ����� ��� ����� ������ ����ϴ� �޼���
		//iterator ���
		Iterator<Member> i2 = hashSet.iterator(); // ��������
		while(i2.hasNext()) { // ���� �����ϸ� true�ؼ� ���� ���� ���
			Member member = i2.next();  //��ü�� �����ͼ� member�� ����
			System.out.print(i2.next() + " ");  //hashSet�� ��ü�� ���
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
		Member memberLee2 = new Member(7111, "������");
		
		
		//�� ��ü�� �����ؼ� ����
		memberHashSet.addMember(memberJung);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberSom);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showSize();
		
		//��� ����� ���� ���
		memberHashSet.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberHashSet.removeMember(7111);
		
		// 
		memberHashSet.showSize();
		
		
	}

}
