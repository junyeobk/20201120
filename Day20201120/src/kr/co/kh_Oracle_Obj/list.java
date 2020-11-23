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
			System.out.print("이름:");
			System.out.print(irum+"\t");
			System.out.print("나이:");
			System.out.print(age+"\t");
			System.out.print("학번:");
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
			System.out.print("이름:");
			System.out.print(irum+"\t");
			System.out.print("나이:");
			System.out.print(age+"\t");
			System.out.print("과목:");
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
			System.out.print("이름:");
			System.out.print(irum+"\t");
			System.out.print("나이:");
			System.out.print(age+"\t");
			System.out.print("부서:");
			System.out.print(part+"\n");
		}
		stmt = conn.createStatement();
		sql = "select s.no as 번호,s.age as 나이,s.irum as 이름,s.hakbun as 학번,p.age as 교수나이,p.irum as 교수이름,p.subject as 과목,m.age as 관리자나이,m.irum as 관리자이름,m.part as 부서 from (student s full outer join professor p on s.no=p.no) full outer join manager m on s.no=m.no ORDER BY 번호 ASC";
		System.out.println("학사전체출력");
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int sage=rs.getInt("나이");
			String sirum=rs.getString("이름");
			int shakbun=rs.getInt("학번");
			int page = rs.getInt("교수나이");
			String pirum=rs.getString("교수이름");
			String psubject=rs.getString("과목");
			int mage = rs.getInt("관리자나이");
			String mirum=rs.getString("관리자이름");
			String mpart=rs.getString("부서");
			System.out.print(sage+"\t"+sirum+"\t"+shakbun+"\t"+page+"\t"+pirum+"\t"+psubject+"\t"+mage+"\t"+mirum+"\t"+mpart+"\n");
		}
}
*/
