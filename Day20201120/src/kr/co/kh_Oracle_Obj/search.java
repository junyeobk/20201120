package kr.co.kh_Oracle_Obj;

public class search {

}
/*
public static void search(BufferedReader input,Statement stmt,Connection conn)throws IOException,SQLException {
System.out.println("ã�����:");
	System.out.println("1.�л�2.����3.������");		  
		
			String gubun = input.readLine();
			if(gubun.equals("1")) {
				System.out.println("ã�� �л��̸��Է�:");
				String irumSearch = input.readLine();
				stmt = conn.createStatement();
				String sql = "select age,irum,hakbun from student where irum='"+irumSearch+"'";
				ResultSet rs=stmt.executeQuery(sql);
				String irum=null;
				int age=0;
				int hakbun=0;
				if(!rs.isBeforeFirst()) {
					System.out.println("ã���л��� �����ϴ�.");
				}
				while(rs.next()) {
					irum=rs.getString("irum");
					age=rs.getInt("age");
					hakbun=rs.getInt("hakbun");
					System.out.print("�̸�:"+irum);
					System.out.print("����:"+age);
					System.out.print("�й�:"+hakbun+"\n");
				}
				
			}else if(gubun.equals("2")) {
				System.out.println("ã�� �����̸��Է�:");
				String irumSearch = input.readLine();
				stmt = conn.createStatement();
				String sql = "select age,irum,subject from professor where irum='"+irumSearch+"'";
				ResultSet rs=stmt.executeQuery(sql);
				String irum=null;
				int age=0;
				String subject=null;
				if(!rs.isBeforeFirst()) {
					System.out.println("ã�±������� �����ϴ�.");
				}
				while(rs.next()) {
					irum=rs.getString("irum");
					age=rs.getInt("age");
					subject=rs.getString("subject");
					System.out.print("�̸�:"+irum);
					System.out.print("����:"+age);
					System.out.print("����:"+subject+"\n");
				}
			}else if(gubun.equals("3")) {
				System.out.println("ã�� �������̸��Է�:");
				String irumSearch = input.readLine();
				stmt = conn.createStatement();
				String sql = "select age,irum,part from manager where irum='"+irumSearch+"'";
				ResultSet rs=stmt.executeQuery(sql);
				String irum=null;
				int age=0;
				String part=null;
				if(!rs.isBeforeFirst()) {
					System.out.println("ã�°����ڴ��� �����ϴ�.");
				}
				while(rs.next()) {
					irum=rs.getString("irum");
					age=rs.getInt("age");
					part=rs.getString("part");
					System.out.print("�̸�:"+irum);
					System.out.print("����:"+age);
					System.out.print("�μ�:"+part+"\n");
				}
			}
		
}
*/