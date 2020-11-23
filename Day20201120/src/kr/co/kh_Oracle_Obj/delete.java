package kr.co.kh_Oracle_Obj;

public class delete {

}
/*
public static void delete(BufferedReader input,Statement stmt,Connection conn)throws IOException,SQLException {
System.out.println("삭제대상:");
	System.out.println("1.학생2.교수3.관리자");
	
		String gubun = input.readLine();
		if(gubun.equals("1")) {
			System.out.println("삭제할이름:");
			String irumDelete = input.readLine();
			stmt = conn.createStatement();
			String sql = "delete from student where irum='"+irumDelete+"'";
			int cnt=stmt.executeUpdate(sql);
			System.out.println(cnt+"건 학생이 삭제되었습니다.");				
		}
		else if(gubun.equals("2")) {
			System.out.println("삭제할이름:");
			String irumDelete =input.readLine();
			stmt = conn.createStatement();
			String sql = "delete from professor where irum='"+irumDelete+"'";
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt+"건 교수님이 삭제되었습니다.");
		}
		else if(gubun.equals("3")) {
			System.out.println("삭제할이름:");
			String irumDelete = input.readLine();
			stmt = conn.createStatement();
			String sql = "delete from manager where irum='"+irumDelete+"'";
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt+"건 관리자님이 삭제되었습니다.");
		}
	
}
*/