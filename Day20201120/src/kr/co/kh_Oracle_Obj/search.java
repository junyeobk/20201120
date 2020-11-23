package kr.co.kh_Oracle_Obj;

public class search {

}
/*
public static void search(BufferedReader input,Statement stmt,Connection conn)throws IOException,SQLException {
System.out.println("찾을대상:");
	System.out.println("1.학생2.교수3.관리자");		  
		
			String gubun = input.readLine();
			if(gubun.equals("1")) {
				System.out.println("찾을 학생이름입력:");
				String irumSearch = input.readLine();
				stmt = conn.createStatement();
				String sql = "select age,irum,hakbun from student where irum='"+irumSearch+"'";
				ResultSet rs=stmt.executeQuery(sql);
				String irum=null;
				int age=0;
				int hakbun=0;
				if(!rs.isBeforeFirst()) {
					System.out.println("찾는학생이 없습니다.");
				}
				while(rs.next()) {
					irum=rs.getString("irum");
					age=rs.getInt("age");
					hakbun=rs.getInt("hakbun");
					System.out.print("이름:"+irum);
					System.out.print("나이:"+age);
					System.out.print("학번:"+hakbun+"\n");
				}
				
			}else if(gubun.equals("2")) {
				System.out.println("찾을 교수이름입력:");
				String irumSearch = input.readLine();
				stmt = conn.createStatement();
				String sql = "select age,irum,subject from professor where irum='"+irumSearch+"'";
				ResultSet rs=stmt.executeQuery(sql);
				String irum=null;
				int age=0;
				String subject=null;
				if(!rs.isBeforeFirst()) {
					System.out.println("찾는교수님이 없습니다.");
				}
				while(rs.next()) {
					irum=rs.getString("irum");
					age=rs.getInt("age");
					subject=rs.getString("subject");
					System.out.print("이름:"+irum);
					System.out.print("나이:"+age);
					System.out.print("과목:"+subject+"\n");
				}
			}else if(gubun.equals("3")) {
				System.out.println("찾을 관리자이름입력:");
				String irumSearch = input.readLine();
				stmt = conn.createStatement();
				String sql = "select age,irum,part from manager where irum='"+irumSearch+"'";
				ResultSet rs=stmt.executeQuery(sql);
				String irum=null;
				int age=0;
				String part=null;
				if(!rs.isBeforeFirst()) {
					System.out.println("찾는관리자님이 없습니다.");
				}
				while(rs.next()) {
					irum=rs.getString("irum");
					age=rs.getInt("age");
					part=rs.getString("part");
					System.out.print("이름:"+irum);
					System.out.print("나이:"+age);
					System.out.print("부서:"+part+"\n");
				}
			}
		
}
*/