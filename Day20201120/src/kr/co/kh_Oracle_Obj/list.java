package kr.co.kh_Oracle_Obj;

public class list {

}
/*
public static void list(Statement stmt,Connection conn)throws IOException,SQLException {
		stmt=conn.createStatement();
		String sql = "select no,age,irum,hakbun from student";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			int no=rs.getInt("no");
			int age=rs.getInt("age");
			String irum=rs.getString("irum");
			int hakbun=rs.getInt("hakbun");
			System.out.print("�̸�:");
			System.out.print(irum+"\t");
			System.out.print("����:");
			System.out.print(age+"\t");
			System.out.print("�й�:");
			System.out.print(hakbun+"\n");
		}
		stmt = conn.createStatement();
		sql = "select no,age,irum,subject from professor";
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int no = rs.getInt("no");
			int age = rs.getInt("age");
			String irum = rs.getString("irum");
			String subject = rs.getString("subject");
			System.out.print("�̸�:");
			System.out.print(irum+"\t");
			System.out.print("����:");
			System.out.print(age+"\t");
			System.out.print("����:");
			System.out.print(subject+"\n");
		}
		stmt = conn.createStatement();
		sql = "select no,age,irum,part from manager";
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int no = rs.getInt("no");
			int age = rs.getInt("age");
			String irum = rs.getString("irum");
			String part = rs.getString("part");
			System.out.print("�̸�:");
			System.out.print(irum+"\t");
			System.out.print("����:");
			System.out.print(age+"\t");
			System.out.print("�μ�:");
			System.out.print(part+"\n");
		}
		stmt = conn.createStatement();
		sql = "select s.no as ��ȣ,s.age as ����,s.irum as �̸�,s.hakbun as �й�,p.age as ��������,p.irum as �����̸�,p.subject as ����,m.age as �����ڳ���,m.irum as �������̸�,m.part as �μ� from (student s full outer join professor p on s.no=p.no) full outer join manager m on s.no=m.no ORDER BY ��ȣ ASC";
		System.out.println("�л���ü���");
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int sage=rs.getInt("����");
			String sirum=rs.getString("�̸�");
			int shakbun=rs.getInt("�й�");
			int page = rs.getInt("��������");
			String pirum=rs.getString("�����̸�");
			String psubject=rs.getString("����");
			int mage = rs.getInt("�����ڳ���");
			String mirum=rs.getString("�������̸�");
			String mpart=rs.getString("�μ�");
			System.out.print(sage+"\t"+sirum+"\t"+shakbun+"\t"+page+"\t"+pirum+"\t"+psubject+"\t"+mage+"\t"+mirum+"\t"+mpart+"\n");
		}
}
*/
