import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
	
	static ArrayList<String> objField = new ArrayList<String>();
	static int k = 0;
	
	public static void main(String[] args) throws Exception {
		
		Billboard bb = new Billboard(dealFile("wiki_hot_100s.txt"));
		
		bb.printSongs(1960);
		bb.printSingers();
		bb.printSingersAndSongs();
		
	}
	
	public static ArrayList<Item> dealFile(String filePath) throws IOException{
		//用于返回
		ArrayList<Item> itemList = new ArrayList<Item>();
		
		// 按行读取字符串
		ArrayList<String> strList = new ArrayList<String>();
		FileReader fr = new FileReader(new File(filePath));			
		BufferedReader bf = new BufferedReader(fr);			
		String line;					
		while ((line = bf.readLine()) != null) {				
			strList.add(line);		
			System.out.println(line);
		}		
		bf.close();			
		fr.close();
		
		// 减去第零行
		strList.remove(0);
		
		//
		for(int i = 0 ;i<strList.size();i++) {

			for(int j = 0;j < strList.get(i).length(); j++) {

				int flag1 = 0;
				int flag2 = 0;		
				if(strList.get(i).charAt(j) == '\t') {
					flag1 = flag2;
					flag2 =j;			
					objField.set(k++, strList.get(i).substring(flag1, flag2));
					System.out.println(objField.get(--k));//测试
				}
			}
			Item i1 =new Item(
					Integer.parseInt(objField.get(0)),
					objField.get(1),
					objField.get(2),
					Integer.parseInt(objField.get(3))
					);
			
			itemList.add(i1);
		}

		return itemList;
	}
}
