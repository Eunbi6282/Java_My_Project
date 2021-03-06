package chapter14.Ex09;

class A{
	String season;		//砂, 食硯, 亜聖 ,移随幻 級嬢臣 呪 赤製, 陥献葵戚 級嬢神檎 森須(森須 降持 : 砂,食硯,亜聖,移随幻 脊径馬室推)
	String week;  	//杉,鉢,呪,鯉,榎,塘,析 葵幻(森須降持 : 杉,鉢,呪,鯉,榎,塘,析幻 脊径馬室推)
	int scoreKor; 	// 0~ 100葵幻 脊径 (森須 降持 : 0拭辞 100猿走 舛呪幻 脊径馬室推)
	int scoreEng;	// 0~ 100葵幻 脊径 (森須 降持 : 0拭辞 100猿走 舛呪幻 脊径馬室推)
	String userID; 	//12切 戚雌, 20切 紫戚税 庚切 箸精 収切(森須 降持 : 12切戚雌 20切 紫戚税 庚切幻 隔生室推)
	
	 void checkKorscores(int scoreKor) throws RangeException{
		if (scoreKor < 0 || scoreKor > 100) {
			throw new RangeException("森須 降持 : 0拭辞 100猿走 舛呪幻 脊径馬室推");
		}
		else {
			this.scoreKor = scoreKor;
			System.out.println("厩嬢 繊呪 : " + this.scoreKor);
		}
	}
	 void checkEngscores(int scoreEng) throws RangeException{
		if (scoreEng < 0 || scoreEng > 100) {
			throw new RangeException("森須 降持 : 0拭辞 100猿走 舛呪幻 脊径馬室推");
		}
		else {
			this.scoreEng = scoreEng;
			System.out.println("慎嬢 繊呪 : " + this.scoreEng);
		}
	}
	 void checkSeason(String season) throws WordException {
		if(season != "砂"  &&  season != "食硯" &&  season != "亜聖" &&  season != "移随" ) {
			throw new WordException("森須 降持 : 砂,食硯,亜聖,移随幻 脊径馬室推");
		}else {
			this.season = season;
			System.out.println("域箭精 : " + this.season + "脊艦陥.");
		}
	}
	
	 void checkWeek(String week) throws WordException {
		if(week != "杉" && week != "鉢" && week != "呪" && week != "鯉" && week != "榎" && week != "塘" && week != "析") {
			throw new WordException("森須降持 : 杉,鉢,呪,鯉,榎,塘,析幻 脊径馬室推");
		}else {
			this.week = this.week;
			System.out.println("推析精 : " + this.week + "推析 脊艦陥.");
		}
	}
	
	 void checkUserID(String userID) throws RangeException{
		if (userID.length() < 12 || userID.length() > 20) {
			throw new RangeException("森須 降持 : 12切戚雌 20切 紫戚税 庚切幻 隔生室推");
		}
		else {
			this.userID = userID;
			System.out.println("紫遂切税 ID澗 : "+ this.userID + "脊艦陥.");
		}
	}
	
}

class WordException extends Exception{		//陥献 庚切亜 級嬢神檎 森須 降持
	public WordException(){
		super();
	}
	public WordException(String message) {
		super(message);
	}
}
class RangeException extends Exception{		//骨是 込嬢蟹檎 森須 降持
	public RangeException () {
		super();
	}
	public RangeException (String message) {
		super(message);
	}
}

public class UserException_Ex {

	public static void main(String[] args) {
		//梓端 持失
		A a = new A();
		
		//森須 坦軒 + 窒径
		
		//慎嬢繊呪
		try {
			a.checkEngscores(82);
		} catch (RangeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("==========");
		
		//厩嬢繊呪
		try {
			a.checkKorscores(55);
		} catch (RangeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========");
		
		// 域箭
		try {
			a.checkSeason("亜聖");
		} catch (WordException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("===========");
		//爽
		try {
			a.checkWeek("杉杉");
		} catch (WordException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=============");
		
		//紫遂切 Id
		try {
			a.checkUserID("20170033しししししししししし");
		} catch (RangeException e) {
			System.out.println(e.getMessage());
		}
	}
}
