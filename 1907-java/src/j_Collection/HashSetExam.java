package j_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();//다형화시킴
		
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		set.add("Java");
		set.add("myBatis");
		
		
		System.out.println("size :"+ set.size());
		Iterator<String> inter = set.iterator();
		while(inter.hasNext()){
		String temp =inter.next();
		System.out.println(temp);
		}
		System.out.println("---------------------------------");
		for(String temp:set) {
			System.out.println(temp);
		}
		set.remove("java");
		set.remove("myBatis");
		System.out.println("삭제후 size: "+ set.size());
		inter=set.iterator();
		while(inter.hasNext()) {
			String temp=inter.next();
			System.out.println(temp);
		}
		set.clear();
		if(set.isEmpty()) 
			System.out.println("자료가 비어있씁니다");
		
		
		//--------------------------------
		Set<MemberVo> memberSet = new HashSet<MemberVo>();
		memberSet.add(new MemberVo("a001","1111","hong","010-1234"));
		memberSet.add(new MemberVo("a002","1111","hong","010-1234"));
		memberSet.add(new MemberVo("a002","1111","hong","010-0000"));
		memberSet.add(new MemberVo("a002","2222","kim","010-1234"));
		
		System.out.println("memberSet size: "+ memberSet.size());
		
		Iterator<MemberVo> iter2 = memberSet.iterator();
	    while(iter2.hasNext()) {
	    	MemberVo vo = iter2.next();
	    	System.out.println(vo);
	    	
	    }
	    
	    MemberVo delvo = new MemberVo("a002","1111","hong","010-0000");
	    memberSet.remove(delvo);
	    
	    
	    
	    
	    
	    
	    
	    
	  System.out.println("------------------");
	  for(MemberVo vo : memberSet) {
		  System.out.println(vo);
	  }
	}

}
