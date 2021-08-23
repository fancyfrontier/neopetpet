package com.petpet.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	@GetMapping("/Test")
	public String toTest() throws IOException {
		
		BufferedReader bfr = null;
		String data = "";
		
		try {
			bfr = new BufferedReader(new FileReader("C:\\JAVA\\WorkPlace\\JDBC\\res\\emp.txt"));
			
			while ((data = bfr.readLine()) != null) { // 讀出emp.txt檔的值
				String result[] = data.trim().split(","); // 將emp.txt內的文字以,號分隔並去除,號間的空格並儲存在result字串陣列
				for (int i = 0; i < result.length; i++) {
					System.out.println("result[" + i + "]=" + result[i] + " ");// 印出result陣列內的資料
					// EX:當i=0時pstmt.setString(1, result[0]);...以此類推
					
					//下面是原本的CODE,你自己要寫方法存進去
//					pstmt.setString(i + 1, result[i]);
				}
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";
	}
	
}
