package my.day17.a.collection;

import java.util.*;

public class SetMain_5 {
	
	/*
    == HashSet == 
    1. 출력시 저장된 순서가 유지되지 않는다.
    2. 중복된 데이터를 저장할 수 없다.
              그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.
              
    == LinkedHashSet ==
    1. 출력시 저장된 순서가 유지된다.
    2. 중복된 데이터를 저장할 수 없다.
              그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.        
*/
	
	public static void main(String[] args) {
		
		System.out.println("\n === HashSet === \n");
		
		//1. Member 클래스의 객체만을 저장할 수 있는 HashSet 객체 mbrHashSet 을 생성한다.
		
		Set<Member> mbrHashSet = new HashSet<>();
		
		//2. Member 클래스의 객체 6개를 생성하여 mbrHashSet에 저장한다.
		mbrHashSet.add(new Member("youjs","qwer1234$","유재석"));
		mbrHashSet.add(new Member("eom","qwer1234$","엄정화"));
		mbrHashSet.add(new Member("kanghd","qwer1234$","강호동"));
		mbrHashSet.add(new Member("leess","qwer1234$","이순신"));
		mbrHashSet.add(new Member("kimth","qwer1234$","김태희"));
		mbrHashSet.add(new Member("kangkc","qwer1234$","강감찬"));
		
		mbrHashSet.add(new Member("leess","qwer1234$","이순신"));
		
		Member mbr1 = new Member("suji", "abcd1234$", "수지");
		Member mbr2 = new Member("chaew", "abcd1234$", "차은우");
		
		mbr1 = mbr2; //mbr2가 참조하고 있던 메모리 주소를 mbr1에게 주었으므로 mbr1은 new Member("chaew", "abcd1234$", "차은우"); 의 메모리 주소를 참조한다.
					 //mbr2는 new Member("chaew", "abcd1234$", "차은우"); 메모리 주소를 참조한다.
		
		mbrHashSet.add(mbr1);
		mbrHashSet.add(mbr2);
		/*
		 	mbr1 과 mbr2는 동일한 객체(차은우)를 가리키는 것이므로
		 	이미 mbr1이 저장되었으므로 mbr2는 저장되지 않는다.
		 */
		
		//3. mbrHashSet 에 저장되어진 모든 Member 들의 정보를 출력한다.
		//	 Set 계열은 저장된 데이터(요소)에 접근해서 읽어오기 위해서는 Iterator 를 통해서만 가능하다.
		
		Iterator<Member> it = mbrHashSet.iterator();
		
		while(it.hasNext()) {
			// it.hasNext() 은 
	        // it 에서 현재 it가 가지고 있는 여러 Member 데이터중 
	        // 하나를 끄집어내서 존재하는지를 알아보는 것이다.
	        // 존재하면 true, 존재하지 않으면 false.
			
			Member mbr = it.next();
			// 실제로 Member를 it 에서  끄집어낸다.
	        // 그러면 끄집어 낸 Member는 더이상 it 에는 남아있지 않게 된다.
			
			mbr.mbrInfoPrint();
			
		}
		
		//4. mbrHashSet에 저장되어진 회원(Member)들 중에
		//	 id가 "leess"인 회원의 정보를 출력하세요.
		
		it = mbrHashSet.iterator();
		
		while(it.hasNext()) {
			Member mbr = it.next();
			if(mbr.id.equals("eom")) {
				mbr.mbrInfoPrint();
			}
		}
		
		//5. mbrHashSet에 저장되어진 회원(Member)들 중에
		//	 id가 "leess"인 회원의 정보를 삭제하세요.
				
				it = mbrHashSet.iterator();
				
				while(it.hasNext()) {
					Member mbr = it.next();
					if(mbr.id.equals("eom")) {
						it.remove();
						// mbrHashSet 에 저장된 요소(Element)를 삭제하려면
			            // Iterator를 이용한 it.remove(); 을 사용하여 삭제한다.
					}
				}
		
	}

}
