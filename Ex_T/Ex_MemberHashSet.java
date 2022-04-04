package Ex_T;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// HashSet으로 변환
// Member 클래스의 memberid 컬람을 equlas(), hashCode()로 비교해서 설정 -> 동일한 코드인지 확인

// 중요 : Set은 중복된 값을 지정할 수 없다.
	//Wrapper클래스는 Integer, String, Double, Float, Chractor, Byte, Boolean
	//Wrapper클래스는 equlas(),hashcode()메서드가 정의 되어 있다.
	// 특정 객체를 생성후 그 객체를 Set에 지정할 경우 그 객체의 bject클래스의 equals(), hashcode()를 재정의 해줘야 한다.
	// 객체의 특정 필드의 값이 같을 때 중복을 식별하는 필드 설정


class Member{		//DTO , VO : 각 계층간의 데이터를 받아서 전달해주는 클래스
	private int memberid; //Set에 넣을 식별자, memberid필드의 값이 같을 때 같은 객체이다 라고 선언
	private String memberName;
	public Set<Member> hashSet;
	
	public Member (int memberid, String memberName) {// 생성자 통해서 필드의 값할당
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
		return memberName + "회원님의 아이디는 " + memberid + "입니다.";
	}
	
	// Set안에 중복된 값을 넣지 않기 위해 값비교 위한 equals(), hashCode()재정의
	
	// 객체안의 값을 비교하려고 할 때는 epquals()를 재정의 해줘야 함!!!!
	@Override      //member1.equlas(member2)
		public boolean equals(Object obj) {
			if(obj instanceof Member) {			//Object다운 캐스팅 필요-> 런타임 오류 방지
				Member member = (Member) obj; // obj눈 Object로 업캐스팅 되어 있기 대문에 다운캐스팅 필요
				if(this.memberid == member.memberid) { 
					//this.memberid : member1객체 , member.memberid :member2
					return true;
				}else {
					return false;
				}
			}
			return false; //obj가 Member타입을 내포하지 않을 때
		}
	
	@Override
		public int hashCode() {  //membeid 필드의 값이 동일할 때 hashCode생성
		
		// 하나의 필드(memberid)만을 조건으로 해쉬코드를 만들 때
		//return memberid;	
			return Objects.hashCode(memberid); // 권장사항
				//Objects.hashCode(memberid,membername); 여러개의 필드를 조건으로 hashCode생성 할 수 있다. 
				// memberid, membername필드의 값이 모두 동일할 경우
		}
	}

// 배열 : 직접값 할당
 // 컬렉션 프레임워크 : 메서드를 이용해서 값을 지정, 삭제 등등

class MemberHashSet{  
	private Set<Member> hashSet; //Set선언 : <Member>
	
		// 제너ㅓ릭에서 객체생성 방법
		//List <Member> aList = new ArrayList<Member>();
		// ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberHashSet() {	// 기본생성자 호출시 Set의 참조변수 활성화
		hashSet = new HashSet<Member>();//<Member> 생략하면 안됨
		
		// *hashSet호출하는 경우
		//Set<Member> hashSet = new HashSet<Member>; <- 이땐 <Member>생략 가능
		
		
			//MemberArrayList를 객체화 하면 arrayList객체가 만들어 진다.(활성화 됨)
	}
	
	public void addMember(Member member){ //Member객체를 받아서 맨마지막방에 값을추가하는 메서드 
		//코드 블락
		hashSet.add(member); 	//Member 객체를 input받아 hashSet에 member를 저쟁, 증복 저장되며 ㄴ안된다
							// Member 객체의 memberif 필드이 값이 동일한 경우, 동일한 객체라고 정의해둠(equals, hashcode 재정의)
	}
	
	public boolean removeMember(int memberid) { //memberid는 Member객체 내의 필드이므로 Set에 저장되니 객체를 가져와야 한다. 
		//Set은 index가 존재하지 않으므로 기본for문은 사용할 수 없다.
		// -> iterator or Enhanced for문 사용해서 remove
		Iterator<Member> i1 = hashSet.iterator(); //iterator :순회자(순회하면서 값이 있는지 찾음)
		
		while(i1.hasNext()) {     //hashSet에 값이 존재할 때 true 아니면 false
			Member member = i1.next();
			int tempid = memberid.get;
			
			if(tempid == memberid) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberid + "가 존재하지 않습니다.");
		return false;
	}


	
	public void showAllMember() {
		// ArrayList에 저장된 모든 사용자 정보를 출력하는 메서드
		//iterator 사용
		Iterator<Member> i2 = hashSet.iterator(); // 지역변수
		while(i2.hasNext()) { // 값이 존재하면 true해서 밑의 구문 출력
			Member member = i2.next();  //객체를 가져와서 member에 저장
			System.out.print(i2.next() + " ");  //hashSet의 객체를 출력
		}
	}
	
	public void showSize() {
		System.out.println(hashSet.size());
	}
	
}
public class Ex_MemberHashSet {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();	
			// 객체를 생성하는 순간 arraryList 필드가 활성화
			// 메서드 호출하기 위해서 객체 생성
			// addMemeber(), addMember2 , removeMember(), showAllMember()
		
		// arrayList 활성화,
		// memberid -> equals()
		Member memberLee = new Member(7111, "이은비"); // 1객체에 2개의 값 , memberid membername
		Member memberSom = new Member(1581, "손흥민");
		Member memberPark = new Member(3333, "박은비");
		Member memberHong = new Member(3344, "홍길동");
		Member memberJung = new Member(5555, "정재현");
		Member memberLee2 = new Member(7111, "이지우");
		
		
		//각 객체를 생성해서 저장
		memberHashSet.addMember(memberJung);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberSom);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showSize();
		
		//모든 사용자 정보 출력
		memberHashSet.showAllMember();
		
		//특정 id를 가진 사용자 제거
		memberHashSet.removeMember(7111);
		
		// 
		memberHashSet.showSize();
		
		
	}

}
