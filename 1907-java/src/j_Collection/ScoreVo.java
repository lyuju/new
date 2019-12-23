package j_Collection;

import java.text.MessageFormat;

public class ScoreVo {
	int sno;
	String name;

public ScoreVo(int sno,String name) {
	this.sno=sno;
	this.name=name;
}
	@Override
	public boolean equals(Object obj) {
		boolean r = false;
		if (obj instanceof ScoreVo) {
			ScoreVo std = (ScoreVo) obj;
			if (sno == std.sno && name.equals(std.name)) {
				r = true;
			} else {
				r = false;
			}
		}
		return r;
	}



	@Override
	public int hashCode() {
		int code = sno + name.hashCode();
		return code;
	}

	@Override
	public String toString() {
		
	}

}
