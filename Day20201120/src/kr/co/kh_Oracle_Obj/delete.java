package kr.co.kh_Oracle_Obj;

public class delete {

}
/*
public static void delete(BufferedReader input,Statement stmt,Connection conn)throws IOException,SQLException {
System.out.println("�������:");
	System.out.println("1.�л�2.����3.������");
	
		String gubun = input.readLine();
		if(gubun.equals("1")) {
			System.out.println("�������̸�:");
			String irumDelete = input.readLine();
			stmt = conn.createStatement();
			String sql = "delete from student where irum='"+irumDelete+"'";
			int cnt=stmt.executeUpdate(sql);
			System.out.println(cnt+"�� �л��� �����Ǿ����ϴ�.");				
		}
		else if(gubun.equals("2")) {
			System.out.println("�������̸�:");
			String irumDelete =input.readLine();
			stmt = conn.createStatement();
			String sql = "delete from professor where irum='"+irumDelete+"'";
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt+"�� �������� �����Ǿ����ϴ�.");
		}
		else if(gubun.equals("3")) {
			System.out.println("�������̸�:");
			String irumDelete = input.readLine();
			stmt = conn.createStatement();
			String sql = "delete from manager where irum='"+irumDelete+"'";
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt+"�� �����ڴ��� �����Ǿ����ϴ�.");
		}
	
}
*/