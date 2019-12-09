package d_array;

import java.util.Scanner;

public class arrayExam4 {
	String[] n = new String[10];
	int[][] s = new int[10][2];
	int a=0;
	int b=0;
	int count = 0; // 배열에 입력된 자료의 수

	arrayExam4() {
		// 무한루프를 돌면서 메뉴를 출력 q or quit을 누를때까지
		// if(menu==1) input()
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		//샘플용 데이터를 배열에 저장
		n[0]="kim";
		n[1]="hong";
		n[2]="park";
		n[3]="lee";
		s[0][0]=90 ;s[0][1]=80;
		s[1][0]=70 ;s[1][1]=30;
		s[2][0]=60 ;s[2][1]=20;
		s[3][0]=50 ;s[3][1]=10;
		
		count=4;
		
		while (run) {
			System.out.println("1.입력|2.수정|3.조회 및 종료");
			System.out.print("메뉴선택:");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				this.input();
				break;
			case 2:
				this.modify();
				break;
			case 3:
				this.search();
				break;
			case 4:
				run = false;

			}
		}

	}
	// 학생의 성적 정보를 배열에 입력

	public void input() {
		Scanner scanner = new Scanner(System.in);
		String name ="";
		int kor =0;
		int eng =0;
		int tot =0;
		double avg =0;
		
		
		System.out.print("성명 : ");
		name = scanner.nextLine();
		System.out.print("국어 : ");
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng = scanner.nextInt();
		
		tot = kor+eng;
		avg=(double)tot/2;
		System.out.println("총점 : "+tot);
		System.out.print("평균 : "+avg);
		
		n[count]=name;
		s[count][0]=kor;
		s[count][1]=eng;
		count++;
		
		System.out.println();
	}

	// 학생의 성적 정보를 수정
	//수정할 학생명을 입력받아 검색
	//기존 검색된 정보를 표시
	//관련 데이터를 수정
	//배열 정보도 수정
	public void modify() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("수정할 성명은?");
	String findName = scanner.nextLine();
	int c=0;
	int d=0;
	
	for(int i=0;i<count;i++) {
		if(n[i].equals(findName)){
		System.out.println("수정할 과목은?");
		String bb = scanner.nextLine();
		if("kor".equals(bb)) {
			System.out.println("국어 :");
			s[i][0]=scanner.nextInt();
		}else if("eng".equals(bb)) {
			System.out.println("영어 :");
			b=scanner.nextInt();
		}
       
        //s[0][i]=b; // kim일경우 s[0][0]
		
		
		
		}
	
		
		
	}
	
	}

	// 학생의 성적 정보를 조회 및 출력
	public void search() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 성명은?");
		String findName = scanner.nextLine();
		int tot =0;
		double avg =0;
		for(int i=0; i<count ;i++) {
			if(n[i].equals(findName)) {
			tot = s[i][0]+s[i][1];
			avg=(double)tot/s.length;
				
			System.out.print(n[i]+" ");
			System.out.print(s[i][0]+" ");
			System.out.print(s[i][1]+" ");
			System.out.print(tot+" ");
			System.out.printf("%5.1f",avg+" ");
			
			//총점과 평균을 계산하여 출력
			
			
		}
		}
	}

	public static void main(String[] args) {
		new arrayExam4();

	}

}
