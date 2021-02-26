package my.day10.e.stringbuilder;

public class MainStringBuilder {

	public static void main(String[] args) {
		
		String name = "일순신"; //메모리상에 name 1개 소모 (4byte)
			   name += ",이순신"; //메모리상에 name 1개 소모 (4byte)
			   name += ",삼순신"; //메모리상에 name 1개 소모 (4byte)
			   name += ",사순신"; //메모리상에 name 1개 소모 (4byte)
			   name += ",오순신"; //메모리상에 name 1개 소모 (4byte)
			   name += ",육순신"; //메모리상에 name 1개 소모 (4byte)
		   	   name += ",칠순신"; //메모리상에 name 1개 소모 (4byte)
			   name += ",팔순신"; //메모리상에 name 1개 소모 (4byte)
			   name += ",구순신"; //메모리상에 name 1개 소모 (4byte)
			   
			   					//누적되어진 메모리상의 name은 9개 (36byte) 소모 
		
		System.out.println(name);
		
		name = "끝";
		
		System.out.println(name);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		StringBuilder sb = new StringBuilder();
		//추가해줄 데이터가 많을 때는 StringBuilder가 
		//String에 직접 데이터를 추가해주는 것보다 메모리 낭비를 막아준다.
		//하지만 데이터가 많이 없을 경우에는 직접 추가하는 것이 낫다.
		//StringBuilder자체가 String 보다 기존 데이터 무게가 무겁다
		
		sb.append("일순신");
		sb.append(",이순신");
		sb.append(",삼순신");
		sb.append(",사순신");
		sb.append(",오순신");
		sb.append(",육순신");
		sb.append(",칠순신");
		sb.append(",팔순신");
		sb.append(",구순신");
		
		System.out.println(sb.toString());
		
		//StringBuilder 초기화
		sb.setLength(0);
		
		sb.append("끝");
		
		System.out.println(sb.toString());
		

	}

}
