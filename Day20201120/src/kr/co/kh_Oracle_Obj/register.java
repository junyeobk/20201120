package kr.co.kh_Oracle_Obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class register {
	public static BufferedReader input;
	private String protocol;
	public static Statement stmt;
	public static Connection conn;
	private int cnt;
	static {
		input = new BufferedReader(new InputStreamReader(System.in));
	}
	public register() {
	}

	public static Connection getConnection() throws SQLException {
		conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "junyeobk", "dkdlxl");
		return conn;
	}
	public void selectType() throws IOException, SQLException {
		System.out.println("=====메뉴선택======");
		System.out.println("1.학생");
		System.out.println("2.교수");
		System.out.println("3.관리자");
		System.out.println("4.이전메뉴");
		System.out.println("번호를 선택해 주세요..");
		protocol = input.readLine();
		if (protocol.equals("1")) {
			student();
		} else if (protocol.equals("2")) {
			professor();
		} else if (protocol.equals("3")) {
			manager();
		}
	}

	public String student() throws SQLException, IOException {
		System.out.println("학생등록");
		System.out.println("나이:");
		String age1 = input.readLine();
		System.out.println("이름:");
		String irum = input.readLine();
		System.out.println("학번:");
		String hakbun1 = input.readLine();
		stmt = conn.createStatement();
		int age = Integer.parseInt(age1);
		int hakbun = Integer.parseInt(hakbun1);
		String sql = "insert into student(no,age,irum,hakbun) values(student_no.nextval," + age + ",'" + irum + "',"
				+ hakbun + ")";
		cnt = stmt.executeUpdate(sql);
		System.out.println(cnt + "건 학생이 등록되었습니다.");
		return protocol;

	}

	public String professor() throws SQLException, IOException {
		System.out.println("교수등록");
		System.out.println("나이:");
		String age1 = input.readLine();
		System.out.println("이름:");
		String irum = input.readLine();
		System.out.println("과목:");
		String subject = input.readLine();
		int age = Integer.parseInt(age1);
		stmt = conn.createStatement();
		String sql = "insert into professor(no,age,irum,subject) values(professor_no.nextval," + age + ",'" + irum
				+ "','" + subject + "')";
		cnt = stmt.executeUpdate(sql);
		System.out.println(cnt + "건 교수님이 등록되었습니다.");
		return protocol;
	}

	public String manager() throws SQLException, IOException {
		System.out.println("관리자등록");
		System.out.println("나이:");
		String age1 = input.readLine();
		System.out.println("이름:");
		String irum = input.readLine();
		System.out.println("부서:");
		String part = input.readLine();
		stmt = conn.createStatement();
		int age = Integer.parseInt(age1);
		String sql = "insert into manager(no,age,irum,part) values(manager_no.nextval," + age + ",'" + irum + "','"
				+ part + "')";
		cnt = stmt.executeUpdate(sql);
		System.out.println(cnt + "건 관리자님이 등록되었습니다.");
		return protocol;
	}
	
	public void connClose() throws SQLException {
		conn.close();
	}
}
