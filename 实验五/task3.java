import java.util.Scanner;
public class task3 { 
	      public static void main(String[] args) {
       for(int i=0;i<3;i++){
		System.out.println("ÇëÊäÈë100¸ö×ÖÄ¸:");
        Scanner read=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        sb.append(read.nextLine());
        System.out.println("sb="+sb.toString());
		String s=sb.toString();
		String searchStr="abc";
        int a=s.indexOf(searchStr);
        int b=s.lastIndexOf(searchStr);
        System.out.println("a=s.indexOf(String abc)"+a);
        System.out.println("b=s.lastIdexOf(String abc)"+b);
	    }
      }
}
