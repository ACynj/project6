package 第九章一星题目;

import java.util.Random;

public class problem2 {

	public static void main(String[] args) {
		Random x=new Random(1000);
		for(int i=0;i<50;i++) {
			System.out.println(x.nextInt(100));
		}
	   
	}

}
