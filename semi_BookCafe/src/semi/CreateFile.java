package semi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

public class CreateFile {
	BufferedWriter bw;

	public boolean createFile(String currentDate, String[] colNames) {
		boolean result = true; // 저장 결과를 알려줌
		String separator = File.separator;
		String filePath = "c:\\txtBackUp";
		
		// 백업파일 저장할 경로 - 있으면 생성 X
		File dir = new File(filePath);
		if(!dir.exists()) dir.mkdir();
		try {
			// true면 파일 이어쓰기를 함
			bw = new BufferedWriter(new FileWriter(filePath + separator + "SalseLog_" + currentDate + ".xls", true));
			// 컬럼명 설정
			bw.write("날짜, 이용자 수, 총 매출액, 순이익");
			bw.newLine();
			
			// 데이터 저장
			SalesDao dao = new SalesDao();
			List<SalesVo> list = dao.select();
			for(SalesVo vo : list) {
				bw.write(vo.toString());
				bw.newLine();
			}
			
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
			result = false;
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return result;
		}
	}
}
