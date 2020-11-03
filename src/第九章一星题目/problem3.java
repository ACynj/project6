package 第九章一星题目;
import java.util.GregorianCalendar;
public class problem3 {

	public static void main(String[] args) {
		GregorianCalendar date=new GregorianCalendar();
	       System.out.println(date.get(GregorianCalendar.YEAR));
	       System.out.println(date.get(GregorianCalendar.MONTH)+1);
	       System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));
	       date.setTimeInMillis(1234567898765L);
	       System.out.println("设置后：");
	       System.out.println(date.get(GregorianCalendar.YEAR));
	       System.out.println(date.get(GregorianCalendar.MONTH)+1);
	       System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));
	}
   
}
