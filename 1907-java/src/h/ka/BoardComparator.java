package h.ka;

import java.util.Comparator;


public class BoardComparator implements Comparator<BoardVo> {

/*char flag = 'n'; 
	
	public BoardComparator(char flag) {
		this.flag = flag;
	}*/
	
	@Override
	public int compare(BoardVo s1, BoardVo s2) {
		int result = 0;
		//if(s1==null|| s2=null){
		//r=0;
		//if(s1==!null&&s2=!null){
		//r=s1.getmDate().compareTo(s2.getmDate());
		
		
		//if(flag == 'n') {
			result = s1.getmDate().compareTo(s2.getmDate());
		//}else {
			result = s1.getmDate().compareTo(s2.getmDate());
	//	}
		return result;
		
	}
}