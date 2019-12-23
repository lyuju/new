package j_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	// <string.integer
	/*public void test1() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("hong", 90);
		map.put("lee", 80);
		map.put("park", 50);
		map.put("kim", 70);
		map.put("choi", 40);

		//System.out.println("size : " + map.size());

		// 키값으로 value 출력
		// System.out.println(map.get("lee"));
		//
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);// 맵의 키값에 해당하는 데이터를 가지고온다.

			//System.out.println(key+":"+value);

		}
		// Map.Entery
		Set<Map.Entry<String, Integer>> set2 = map.entrySet();// 원래 셋구조
		Iterator<Map.Entry<String, Integer>> iter2 = set2.iterator();
		while (iter2.hasNext()) {
			Map.Entry<String, Integer> entry = iter2.next();
			// System.out.println(entry.getKey()+":"+entry.getValue());
		}
		map.put("choi", 99);
		// System.out.println("수정 :"+map.get("choi"));

		//map.remove("choi");
		// how 1 (keyset)
		Set<String> set3 = map.keySet();
		Iterator<String> iter1 = set3.iterator();
		while (iter1.hasNext()) {
			String key = iter1.next();
			int value = map.get(key);

			//System.out.println(key + ":" + value);
		}

		// how 2 (Map.entry)
		Set<Map.Entry<String, Integer>> set4 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter3 = set4.iterator();
		while (iter3.hasNext()) {
			Map.Entry<String, Integer> entry1 = iter3.next();
			//System.out.println(entry1.getKey() + ":" + entry1.getValue());

		}

	}*/

	//key값의 유형이 Student type인 경우
	public void test2() {
		//Map<ScoreVo,String> map = new HashMap<ScoreVo,String>();
		Map<ScoreVo,String> map = new HashMap<ScoreVo,String>();
		// 추가
		map.put(new ScoreVo(1,"honh"),"010-1111-1111");
		
		prn(map);

	}

	public void prn(Map<ScoreVo, String> map) {
		Set<ScoreVo> set = map.keySet();
		Iterator<ScoreVo> iter = set.iterator();
		while (iter.hasNext()) {
			ScoreVo key = iter.next();
			String value = map.get(key);
			System.out.println(key + ">>>" + value);
		}

	}

	// value값이 Sale type인 경우
	/*public void test3() {
		Map<Integer, ScoreVo> map = new HashMap<Integer, ScoreVo>();
		map.put(201901001, new ScoreVo(1	));
		map.put(201901002, new ScoreVo(2));
		map.put(201901003, new ScoreVo(3));
		map.put(201901004, new ScoreVo(4));

		

		prn2(map);

	}*/

	public void prn2(Map<Integer, ScoreVo> a) {
		Set<Integer> set = a.keySet();
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			int key = iter.next();
			ScoreVo value = a.get(key);
			System.out.println(key + ":" + value);

		}

	}

	public static void main(String[] args) {
		MapExam exam = new MapExam();
		//exam.test1();
		exam.test2();
		//exam.test3();
	}
}
