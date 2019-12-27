package k_io;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;

public class fileExam {

	public static void main(String[] args) throws Exception {
		File dir = new File("c:/Temp/Dir");
		File file1 = new File("c:/Temp/file1.txt");
		File file2 = new File("c:/Temp/file2.txt");
		File file3 = new File(new URI("file:///c:/Temp/file3.txt"));
	
		if(!dir.exists()) dir.mkdirs();
		if(!file1.exists()) file1.createNewFile();
		if(!file2.exists()) file2.createNewFile();
		if(!file3.exists()) file3.createNewFile();
		
        File temp = new File("c:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		File[] contents = temp.listFiles();
		System.out.println("��¥        �ð�      ����        ũ��       �̸�");
		for(File file:contents) {
			System.out.print(sdf.format(file.lastModified()));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t"+file.getName());
			}else {
				System.out.print("\t\t"+ file.length()+"\t"+file.getName());
			}
		System.out.println();		
		}
		
		
	}

}
