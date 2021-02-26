package my.day17.a.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
	=== Map 계열 ===
	1. HashMap 과 Hashtable 이 있다.
	2. Map 계열은 List 계열(Vector, ArrayList, LinkedList)처럼 index 가 사용되어 저장되는 것이 아니라, 
	   Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  
	         데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
	         이때 key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다.
	3. Map 계열에 저장된 key값들은 순서와는 상관없이 저장된다.  
	4. Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 
	   value 값의 추출은 get(String key) 메소드를 사용한다. 
*/ 
public class HashMapMain_4 {
	
	public static void main(String[] args) {
		//Map<String, Member> mbrMap = new HashMap<String, Member>();
		//또는
		HashMap<String, Member> mbrMap = new HashMap<>();
		//
		//"youjs"만 넣어주면 new Member("youjs", "qwer1234$", "유재석")
		
		mbrMap.put("", new Member("youjs", "qwer1234$", "유재석"));
		
		mbrMap.put("eom", new Member("eom","qwer1234$","엄정화"));
		mbrMap.put("kanghd", new Member("kanghd","qwer1234$","강호동"));
		mbrMap.put("leess", new Member("leess","qwer1234$","이순신"));
		mbrMap.put("kimth", new Member("kimth","qwer1234$","김태희"));
		mbrMap.put("kangkc", new Member("kangkc","qwer1234$","강감찬"));
		
		//mbrMap에 저장된 Member 객체들 중에 key가 "leess"인 vaule 값(지금은 Member)을 추출해서
		//추출된 회원(Member)의 정보를 출력하세요.
		String id = "leess";
		Member mbr = mbrMap.get(id);
		if(mbr != null)
			mbr.mbrInfoPrint();
		else
			System.out.println(">> 검색하신"+ id + "에 해당하는 회원이 없습니다. <<");
		
		/*
		 == 이순신님의 회원 정보 ==
		1. 아이디 : leess
		2. 암   호 : qwer1234$
		3. 성   명 : 이순신
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		mbrMap.put("leess", new Member("leess","abcd1234$","이삼신"));
		mbrMap.put("leess2", new Member("leess","abcd1234$","이삼신"));
		
		id = "leess";
		mbr = mbrMap.get(id);
		if(mbr != null)
			mbr.mbrInfoPrint();
		else
			System.out.println(">> 검색하신"+ id + "에 해당하는 회원이 없습니다. <<");
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		//mbrMap에 저장되어진 모든 key들을 읽어오는 첫 번째 방법
		Set<String> KeySets = mbrMap.keySet();
		
		for(String key : KeySets) {
			System.out.println(key);
		}
		/*
		 	eom
			kimth
			kangkc
			kanghd
			leess2
			leess
		 */
		
		id = "leess";
		boolean flag = false;
		
		for(String key : KeySets) {
			if(id.equals(key)) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			mbrMap.put("leess", new Member("leess","abcd1234$","이수성"));
			System.out.println("\n >>> 회원가입 성공 <<<");
		}
		else {
			System.out.println("\n>> '"+ id +"'는 이미 사용중인 아이디입니다. 회원가입 실패!! <<");
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		//mbrMap에 저장되어진 모든 key들을 읽어오는 두 번째 방법
		Set<String> keySets2 = mbrMap.keySet();
		
		Iterator<String> itra = keySets2.iterator();
		//Iterator는 저장소가 아니라 Collection 에 저장되어진 요소를 읽어오는 용도로 쓰인다.
		
		while(itra.hasNext()) {
		/*
            itrator.hasNext() 은 
            itrator 에서 현재 itrator 가 가지고 있는 여러 String 데이터중
                          하나를 끄집어내서 존재하는지를 알아보는 것이다.
                          존재하면 true , 존재하지 않으면 false.
                          그러므로 현재는 키의 갯수가 6개 이므로 6번 반복을 할 것이다.
         */
			
			String key = itra.next();
			/*
			 	실제로 키 값이 String 값을 itra에서 끄집어 낸다.
			 	그러면 끄집어 낸 String 값은 더 이상 itra에는 남아있지 않게 된다.
			 	
			 */
			
			System.out.println(key);
			
		
		}
		
		System.out.println("\n~~~~~~~~~~~~~~또 한번 더~~~~~~~~~~~~~\n");

		while(itra.hasNext()) {
				String key = itra.next();
				System.out.println(key);
				
				/*
				 	itra에는 더 이상 String 데이터가 존재하지 않으므로
				 	처음부터 itra.hasNext()는 false가 되어진다.
				 	그래서 아무것도 출력되지 않는다.
				 */
			}
		System.out.println("\n~~~~~~~~ 다시 처음부터 ~~~~~~~\n");
		
		Iterator<String> itra2 = keySets2.iterator();
		while(itra2.hasNext()) {
			String key = itra2.next();
			System.out.println(key);
		}
		
		Iterator<String> itra3 = keySets2.iterator();
		id = "kangkc";
		flag = false;
		while(itra3.hasNext()) {
			String existsId = itra3.next();
			if(id.equals(existsId)) {
				System.out.println("아이디가 이미 존재하므로 회원가입이 불가능합니다.");
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			mbrMap.put("kangkc", new Member("kangkc","qwer1234$","강감찬"));
		}
		
		System.out.println("\n~~~~~ [퀴즈] mbrMap 에 저장되어진 모든 회원들의 정보를 출력 ~~~~~\n");
		
		Set<String> keySets1 = mbrMap.keySet();
		
		for(String key : keySets1) {
			mbrMap.get(keySets1).mbrInfoPrint();
		}
		
		System.out.println("\n~~~~ 또는 ~~~~\n");
		Iterator<String> it = keySets1.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			mbrMap.get(key).mbrInfoPrint();
		}
		
		System.out.println("\n~~~ key 값이 kangkc 인 Member 를 삭제하기 ~~~\n");
		mbrMap.remove("kangkc");
		for(String key : keySets1) {
			mbrMap.get(key).mbrInfoPrint();
		}
		
		System.out.println("\n~~~ mbrMap에 저장되어진 모든 Member 를 삭제하기 ~~~\n");

		mbrMap.clear();
		for(String key : keySets1) {
			mbrMap.get(key).mbrInfoPrint();
		}
		
		System.out.println("mbrMap.isEmpty() => " + mbrMap.isEmpty());

		
	}
	
}
