package kr.co.kh_Oracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HaksaProject {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String protocol = null;
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}

		while (true) {
			System.out.println("====학사관리====");
			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.삭제");
			System.out.println("4.전체출력");
			System.out.println("=============");
			System.out.println("0.종료");
			System.out.println("번호를 선택해 주세요..");

			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "khbclass", "dkdlxl");
				protocol = input.readLine();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			if (protocol.equals("1")) {// 등록 기본흐름
				System.out.println("====메뉴선택====");
				System.out.println("1.학생");
				System.out.println("2.교수");
				System.out.println("3.관리자");
				System.out.println("4.이전메뉴");
				System.out.println("번호를 선택해 주세요..");
				try {
					protocol = input.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}

				if (protocol.equals("1")) { // --------------학생
					System.out.println("학생등록");
					try {
						System.out.println("나이:");
						String age1 = input.readLine();
						System.out.println("이름:");
						String irum = input.readLine();
						System.out.println("학번:");
						String hakbun1 = input.readLine();
						int cnt = 0;
						try {
							stmt = conn.createStatement(); // 문자열 숫자로바꾸기
							int age = Integer.parseInt(age1);
							int hakbun = Integer.parseInt(hakbun1);
							String sql = "insert into student(no,age,irum,hakbun) values(student_no.nextval," + age
									+ ",'" + irum + "'," + hakbun + ")";
							cnt = stmt.executeUpdate(sql);
							System.out.println(cnt + "건 학생이 등록되었습니다.");
							stmt.close();
							conn.close();
						} catch (NumberFormatException e) {
							e.printStackTrace();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							stmt.close();
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}

				} else if (protocol.equals("2")) { // --------------교수
					System.out.println("교수등록");
					try {
						System.out.println("나이:");
						String age1 = input.readLine();
						System.out.println("이름:");
						String irum = input.readLine();
						System.out.println("과목:");
						String subject = input.readLine();
						int cnt = 0;
						try {
							stmt = conn.createStatement();
							int age = Integer.parseInt(age1);
							String sql = "insert into professor(no,age,irum,subject) values(professor_no.nextval," + age
									+ ",'" + irum + "','" + subject + "')";
							cnt = stmt.executeUpdate(sql);
							System.out.println(cnt + "건 교수님이 등록되었습니다.");
						} catch (SQLException e) {
							e.printStackTrace();
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							stmt.close();
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}

				} else if (protocol.equals("3")) { // --------------관리자
					System.out.println("관리자등록");
					try {
						System.out.println("나이:");
						String age1 = input.readLine();
						System.out.println("이름:");
						String irum = input.readLine();
						System.out.println("부서:");
						String part = input.readLine();
						int cnt = 0;
						try {
							stmt = conn.createStatement();
							int age = Integer.parseInt(age1);
							String sql = "insert into manager(no,age,irum,part) values(manager_no.nextval," + age + ",'"
									+ irum + "','" + part + "')";
							cnt = stmt.executeUpdate(sql);
							System.out.println(cnt + "건 관리자가 등록되었습니다.");
						} catch (SQLException e) {
							e.printStackTrace();
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							stmt.close();
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}

				} else if (protocol.equals("4")) { // --------------이전메뉴
					continue;
				}

				// 1하면계속0하면끝
				System.out.println("계속하시려면 1, 종료하시려면0을 입력해주세요..");
				try {
					String cnt = input.readLine();
					if (cnt.equals("1")) {
						continue;
					} else {
						System.exit(0);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // 등록 기본흐름 끝

			else if (protocol.equals("2")) { // 찾기 기본흐름
				System.out.println("찾을 대상 : ");
				System.out.println("1. 학생\t2.교수\t3.관리자");
				try {
					String gubun = input.readLine();
					int age = 0;
					String irum = null;
					int cnt = 0;

					if (gubun.equals("1")) { // 학생
						System.out.println("이름 입력 : ");
						String studentName = input.readLine();
						stmt = conn.createStatement();
						String sql = "select age,irum,hakbun from student where irum = '" + studentName + "'";
						cnt = stmt.executeUpdate(sql);
						if (cnt == 0)
							System.out.println("찾는 학생이 없습니다.");
						ResultSet rs = stmt.executeQuery(sql);
						while (rs.next()) {
							age = rs.getInt("age");
							irum = rs.getString("irum");
							int hakbun = rs.getInt("hakbun");
							System.out.print("이름:" + irum + "\t" + "나이:" + age + "\t" + "학번:" + hakbun + "\n");
						}

					} else if (gubun.equals("2")) { // 교수
						System.out.println("이름 입력 : ");
						String professorName = input.readLine();
						stmt = conn.createStatement();
						String sql = "select age,irum,subject from professor where irum = '" + professorName + "'";
						cnt = stmt.executeUpdate(sql);
						if (cnt == 0)
							System.out.println("찾는 교수가 없습니다.");
						ResultSet rs = stmt.executeQuery(sql);
						while (rs.next()) {
							age = rs.getInt("age");
							irum = rs.getString("irum");
							String subject = rs.getString("subject");
							System.out.print("이름:" + irum + "\t" + "나이:" + age + "\t" + "과목:" + subject + "\n");
						}

					} else if (gubun.equals("3")) { // 관리자
						System.out.println("이름 입력 : ");
						String managerName = input.readLine();
						stmt = conn.createStatement();
						String sql = "select age,irum,part from manager where irum = '" + managerName + "'";
						ResultSet rs = stmt.executeQuery(sql);
						if (!rs.isBeforeFirst())
							System.out.println("찾는 관리자가 없습니다."); // isBeforeFirst 쓸경우
						while (rs.next()) {
							age = rs.getInt("age");
							irum = rs.getString("irum");
							String part = rs.getString("part");
							System.out.print("이름:" + irum + "\t" + "나이:" + age + "\t" + "부서:" + part + "\n");
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						stmt.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

			} // 찾기 기본흐름 끝

			else if (protocol.equals("3")) {// 삭제 기본흐름
				System.out.println("삭제할 대상");
				System.out.println("1. 학생\t2.교수\t3.관리자");
				try {
					String gubun = input.readLine();
					if (gubun.equals("1")) {
						System.out.println("삭제할 이름 입력 : ");
						String studentName = input.readLine();
						stmt = conn.createStatement();
						String sql = "delete from student where irum = '" + studentName + "'";
						int cnt = stmt.executeUpdate(sql);
						if (cnt == 0)
							System.out.println("찾는 학생이 없습니다.");
						else
							System.out.println(cnt + "건 학생이 삭제되었습니다.");
					} else if (gubun.equals("2")) {
						System.out.println("삭제할 이름 입력 : ");
						String professorName = input.readLine();
						stmt = conn.createStatement();
						String sql = "delete from professor where irum = '" + professorName + "'";
						int cnt = stmt.executeUpdate(sql);
						if (cnt == 0)
							System.out.println("찾는 교수님이 없습니다.");
						else
							System.out.println(cnt + "건 교수님이 삭제되었습니다.");
					} else if (gubun.equals("3")) {
						System.out.println("삭제할 이름 입력 : ");
						String managerName = input.readLine();
						stmt = conn.createStatement();
						String sql = "delete from manager where irum = '" + managerName + "'";
						int cnt = stmt.executeUpdate(sql);
						if (cnt == 0)
							System.out.println("찾는 관리자가 없습니다.");
						else
							System.out.println(cnt + "건 관리자가 삭제되었습니다.");
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						stmt.close();
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} // 삭제 기본흐름 끝

			else if (protocol.equals("4")) {// 전체출력 기본흐름
				System.out.println("전체출력");
				try {
					stmt = conn.createStatement();
					String sql = "select no,age,irum,hakbun from student";
					ResultSet rs = stmt.executeQuery(sql); // rs는 테이블 가리킴
					while (rs.next()) {
						int no = rs.getInt("no");
						int age = rs.getInt("age");
						String irum = rs.getString("irum");
						int hakbun = rs.getInt("hakbun");
						System.out.print("이름:" + irum + "\t" + "나이:" + age + "\t" + "학번:" + hakbun + "\n");
					}

					stmt = conn.createStatement(); // 선언은 했으니까 안해도됨, 쿼리는 할때마다 새로 만들어야함
					sql = "select no,age,irum,subject from professor";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int no = rs.getInt("no");
						int age = rs.getInt("age");
						String irum = rs.getString("irum");
						String subject = rs.getString("subject");
						System.out.print("이름:" + irum + "\t" + "나이:" + age + "\t" + "과목:" + subject + "\n");
					}

					stmt = conn.createStatement();
					sql = "select no,age,irum,part from manager";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int no = rs.getInt("no");
						int age = rs.getInt("age");
						String irum = rs.getString("irum");
						String part = rs.getString("part");
						System.out.print("이름:" + irum + "\t" + "나이:" + age + "\t" + "부서:" + part + "\n"); // no는 안써도됨
					}

					stmt = conn.createStatement();
					// full outer join
					sql = "select s.no as 번호,s.age as 나이,s.irum as 이름,s.hakbun as 학번,"
							+ "p.age as 교수나이,p.irum as 교수이름,p.subject as 과목,"
							+ "m.age as 관리자나이,m.irum as 관리자이름,m.part as 부서 "
							+ "from (student s full outer join professor p on s.no=p.no) "
							+ "full outer join manager m on s.no=m.no ORDER BY 번호 ASC";

					// left join
//					sql = "select s.no as 번호, s.age as 나이, s.irum as 이름, s.hakbun as 학번, "
//							+ "p.age as 교수나이, p.irum as 교수이름, p.subject as 과목, "
//							+ "m.age as 관리자나이, m.irum as 관리자이름, m.part as 부서 "
//							+ "from (student s left join professor p on s.no = p.no) "//번호가 같을때 join을 해라
//							+ "left join manager m on s.no=m.no order by 번호 asc"; 

					System.out.println("학사 전체출력");
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int sage = rs.getInt("나이");
						String sirum = rs.getString("이름");
						int hakbun = rs.getInt("학번");
						int page = rs.getInt("교수나이");
						String pirum = rs.getString("교수이름");
						String subject = rs.getString("과목");
						int mage = rs.getInt("관리자나이");
						String mirum = rs.getString("관리자이름");
						String part = rs.getString("부서");
						System.out.println(sage + "\t" + sirum + "\t" + hakbun + "\t" + page + "\t" + pirum + "\t"
								+ subject + "\t" + mage + "\t" + mirum + "\t" + part);

					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						stmt.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			} // 전체출력 기본흐름 끝

			else if (protocol.equals("0")) {
				System.out.println("학사프로그램을 종료합니다.");
				System.exit(0);
			}
		} // 반복문
	}
}
