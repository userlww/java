public class task2 {
	public static void main(String args[])
	{
		int x=998;
		Integer i1=new Integer(x);
		Long l1=new Long(11100111L);
		Double d1=new Double(12.8);
		Boolean b1=new Boolean("true");
		System.out.println("�����װ��ķ�װֵ��");
		System.out.println("i1="+i1+",l1="+l1+",d1="+d1+",b1="+b1);
		String s1=i1.toBinaryString(i1);
		String s2=l1.toString(11,10);
		String s3=d1.toString();
		String s4=b1.toString();
		System.out.println("s1="+s1+",s2="+s2+",s3="+s3+",s4="+s4);
		int i=Integer.parseInt(s1,2);
		System.out.println("���ַ���s1���ն�����ת��Ϊint�ͣ�"+i);    
		long l=Long.parseLong(s2,10);       
		System.out.println("���ַ���s2����ʮ������ת��Ϊlong�ͣ�"+l);      
		double d=Double.parseDouble(s3);   
		System.out.println("���ַ���s3ת��Ϊdouble���͵�ֵ��"+d);    
		boolean b=Boolean.parseBoolean(s4);    
		System.out.println("���ַ���s4ת��Ϊboolean���͵�ֵ��"+b);
		
	}

}
