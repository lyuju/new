package j_Collection;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductVo {
	private String serial; // yyyy-MM-dd-serial
	private String code;
	private String pName;
	private int ea;// 수량
	private Date nal;// 입고 ,출고일자

	public ProductVo() {

	}
	public ProductVo(String s,String pC,String pN,int ea,Date Nal) {
		this.serial=s;
		this.code=pC;
		this.pName=pN;
		this.ea=ea;
		this.nal=Nal;
	}
	@Override
    public int hashCode() {
    	return this.serial.hashCode();//시리얼 번호가 같으면 똑같은 코드 동일한 시리얼은 추가 안됨
	}
    @Override//조회할때
    public boolean equals(Object obj) {
    	boolean result = false;
    	if(obj instanceof ProductVo) {
    		ProductVo vo =(ProductVo)obj;
    		
    	result = serial.indexOf(vo.getSerial())>-1||
    	         code.indexOf(vo.getCode())>-1||
    	         pName.indexOf(vo.getpName())>-1;
    }
    	return result;
    }    	
    @Override
    public String toString() {
    	DecimalFormat df = new DecimalFormat("#,###,###");
    	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd(E)");
    	
    	String tempEa =df.format(this.ea);
    	String tempDate = sdf.format(this.nal);
    	
    	String temp = String.format("%s\t%s\t%s\t%s\t%s\n",this.serial,this.code,this.pName,tempEa,tempDate);
    	
    	return temp;
    }
    	
	    
	
	
	
	

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public Date getNal() {
		return nal;
	}

	public void setNal(Date nal) {
		this.nal = nal;
	}

}
