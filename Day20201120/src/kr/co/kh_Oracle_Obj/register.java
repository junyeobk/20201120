package kr.co.kh_Oracle_Obj;

public class register {

}

/*
public static String register(String protocol,BufferedReader input,Statement stmt,Connection conn,int cnt)throws IOException,SQLException {
System.out.println("=====메뉴선택======");
	System.out.println("1.학생");
	System.out.println("2.교수");
	System.out.println("3.관리자");
	System.out.println("4.이전메뉴");
	System.out.println("번호를 선택해 주세요..");
		protocol=input.readLine();
	if(protocol.equals("1")) {
		System.out.println("학생등록");
			System.out.println("나이:");
			String age1 = input.readLine();
			System.out.println("이름:");
			String irum = input.readLine();
			System.out.println("학번:");
			String hakbun1 = input.readLine();			
				stmt=conn.createStatement();
				int age=Integer.parseInt(age1);
				int hakbun = Integer.parseInt(hakbun1);
				String sql = "insert into student(no,age,irum,hakbun) values(student_no.nextval,"+age+",'"+irum+"',"+hakbun+")";
				cnt = stmt.executeUpdate(sql);
		
			System.out.println(cnt+"건 학생이 등록되었습니다.");
	}else if(protocol.equals("2")) {
		System.out.println("교수등록");
		
			System.out.println("나이:");
			String age1 = input.readLine();
			System.out.println("이름:");
			String irum = input.readLine();
			System.out.println("과목:");
			String subject = input.readLine();
			int age=Integer.parseInt(age1);			
				stmt = conn.createStatement();
				String sql = "insert into professor(no,age,irum,subject) values(professor_no.nextval,"+age+",'"+irum+"','"+subject+"')";
				cnt=stmt.executeUpdate(sql);
				System.out.println(cnt+"건 교수님이 등록되었습니다.");			
	}else if(protocol.equals("3")) {
		    System.out.println("관리자등록");		    
			System.out.println("나이:");
			String age1 = input.readLine();
			System.out.println("이름:");
			String irum = input.readLine();
			System.out.println("부서:");
			String part = input.readLine();
			cnt=0;
				stmt = conn.createStatement();
				int age = Integer.parseInt(age1);
				String sql = "insert into manager(no,age,irum,part) values(manager_no.nextval,"+age+",'"+irum+"','"+part+"')";
				cnt = stmt.executeUpdate(sql);
	}
			System.out.println(cnt+"건 관리자님이 등록되었습니다.");
			return protocol;
}
*/