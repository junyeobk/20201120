package kr.co.kh_Oracle_Obj;

public class register {

}

/*
public static String register(String protocol,BufferedReader input,Statement stmt,Connection conn,int cnt)throws IOException,SQLException {
System.out.println("=====�޴�����======");
	System.out.println("1.�л�");
	System.out.println("2.����");
	System.out.println("3.������");
	System.out.println("4.�����޴�");
	System.out.println("��ȣ�� ������ �ּ���..");
		protocol=input.readLine();
	if(protocol.equals("1")) {
		System.out.println("�л����");
			System.out.println("����:");
			String age1 = input.readLine();
			System.out.println("�̸�:");
			String irum = input.readLine();
			System.out.println("�й�:");
			String hakbun1 = input.readLine();			
				stmt=conn.createStatement();
				int age=Integer.parseInt(age1);
				int hakbun = Integer.parseInt(hakbun1);
				String sql = "insert into student(no,age,irum,hakbun) values(student_no.nextval,"+age+",'"+irum+"',"+hakbun+")";
				cnt = stmt.executeUpdate(sql);
		
			System.out.println(cnt+"�� �л��� ��ϵǾ����ϴ�.");
	}else if(protocol.equals("2")) {
		System.out.println("�������");
		
			System.out.println("����:");
			String age1 = input.readLine();
			System.out.println("�̸�:");
			String irum = input.readLine();
			System.out.println("����:");
			String subject = input.readLine();
			int age=Integer.parseInt(age1);			
				stmt = conn.createStatement();
				String sql = "insert into professor(no,age,irum,subject) values(professor_no.nextval,"+age+",'"+irum+"','"+subject+"')";
				cnt=stmt.executeUpdate(sql);
				System.out.println(cnt+"�� �������� ��ϵǾ����ϴ�.");			
	}else if(protocol.equals("3")) {
		    System.out.println("�����ڵ��");		    
			System.out.println("����:");
			String age1 = input.readLine();
			System.out.println("�̸�:");
			String irum = input.readLine();
			System.out.println("�μ�:");
			String part = input.readLine();
			cnt=0;
				stmt = conn.createStatement();
				int age = Integer.parseInt(age1);
				String sql = "insert into manager(no,age,irum,part) values(manager_no.nextval,"+age+",'"+irum+"','"+part+"')";
				cnt = stmt.executeUpdate(sql);
	}
			System.out.println(cnt+"�� �����ڴ��� ��ϵǾ����ϴ�.");
			return protocol;
}
*/