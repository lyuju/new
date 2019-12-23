package aa;



public class ScoreVo {
private String sno;
private String mName;
private String exam;
private int grade;
private int kor;
private int eng;
private int mat;

public ScoreVo(String sno,String mName,String exam,int grade,int kor,int eng, int mat) {
	this.sno=sno;
	this.mName=mName;
	this.exam=exam;
	this.grade=grade;
	this.kor=kor;
	this.eng=eng;
	this.mat=mat;
			
	
	
}

@Override
public boolean equals(Object obj) {
	boolean result = false;
	if(obj instanceof ScoreVo) {
		ScoreVo vo =(ScoreVo)obj;
		if(sno.equals(vo.sno)) {
			result =true;
		}else {
			result=false;
		}
	}
	return result;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return this.sno.hashCode();
}

public String getSno() {
	return sno;
}

public void setSno(String sno) {
	this.sno = sno;
}

public String getmName() {
	return mName;
}

public void setmName(String mName) {
	this.mName = mName;
}

public String getExam() {
	return exam;
}

public void setExam(String exam) {
	this.exam = exam;
}

public int getGrade() {
	return grade;
}

public void setGrade(int grade) {
	this.grade = grade;
}

public int getKor() {
	return kor;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return sno+"-"+mName+"-"+exam+"-"+grade+"-"+kor+"-"+eng+"-"+mat;
}

public void setKor(int kor) {
	this.kor = kor;
}

public int getEng() {
	return eng;
}

public void setEng(int eng) {
	this.eng = eng;
}

public int getMat() {
	return mat;
}

public void setMat(int mat) {
	this.mat = mat;
}

}
