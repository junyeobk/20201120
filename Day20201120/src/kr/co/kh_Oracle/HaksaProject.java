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
			System.out.println("====�л����====");
			System.out.println("1.���");
			System.out.println("2.�˻�");
			System.out.println("3.����");
			System.out.println("4.��ü���");
			System.out.println("=============");
			System.out.println("0.����");
			System.out.println("��ȣ�� ������ �ּ���..");

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

			if (protocol.equals("1")) {// ��� �⺻�帧
				System.out.println("====�޴�����====");
				System.out.println("1.�л�");
				System.out.println("2.����");
				System.out.println("3.������");
				System.out.println("4.�����޴�");
				System.out.println("��ȣ�� ������ �ּ���..");
				try {
					protocol = input.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}

				if (protocol.equals("1")) { // --------------�л�
					System.out.println("�л����");
					try {
						System.out.println("����:");
						String age1 = input.readLine();
						System.out.println("�̸�:");
						String irum = input.readLine();
						System.out.println("�й�:");
						String hakbun1 = input.readLine();
						int cnt = 0;
						try {
							stmt = conn.createStatement(); // ���ڿ� ���ڷιٲٱ�
							int age = Integer.parseInt(age1);
							int hakbun = Integer.parseInt(hakbun1);
							String sql = "insert into student(no,age,irum,hakbun) values(student_no.nextval," + age
									+ ",'" + irum + "'," + hakbun + ")";
							cnt = stmt.executeUpdate(sql);
							System.out.println(cnt + "�� �л��� ��ϵǾ����ϴ�.");
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

				} else if (protocol.equals("2")) { // --------------����
					System.out.println("�������");
					try {
						System.out.println("����:");
						String age1 = input.readLine();
						System.out.println("�̸�:");
						String irum = input.readLine();
						System.out.println("����:");
						String subject = input.readLine();
						int cnt = 0;
						try {
							stmt = conn.createStatement();
							int age = Integer.parseInt(age1);
							String sql = "insert into professor(no,age,irum,subject) values(professor_no.nextval," + age
									+ ",'" + irum + "','" + subject + "')";
							cnt = stmt.executeUpdate(sql);
							System.out.println(cnt + "�� �������� ��ϵǾ����ϴ�.");
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

				} else if (protocol.equals("3")) { // --------------������
					System.out.println("�����ڵ��");
					try {
						System.out.println("����:");
						String age1 = input.readLine();
						System.out.println("�̸�:");
						String irum = input.readLine();
						System.out.println("�μ�:");
						String part = input.readLine();
						int cnt = 0;
						try {
							stmt = conn.createStatement();
							int age = Integer.parseInt(age1);
							String sql = "insert into manager(no,age,irum,part) values(manager_no.nextval," + age + ",'"
									+ irum + "','" + part + "')";
							cnt = stmt.executeUpdate(sql);
							System.out.println(cnt + "�� �����ڰ� ��ϵǾ����ϴ�.");
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

				} else if (protocol.equals("4")) { // --------------�����޴�
					continue;
				}

				// 1�ϸ���0�ϸ鳡
				System.out.println("����Ͻ÷��� 1, �����Ͻ÷���0�� �Է����ּ���..");
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
			} // ��� �⺻�帧 ��

			else if (protocol.equals("2")) { // ã�� �⺻�帧
				System.out.println("ã�� ��� : ");
				System.out.println("1. �л�\t2.����\t3.������");
				try {
					String gubun = input.readLine();
					int age = 0;
					String irum = null;
					int cnt = 0;

					if (gubun.equals("1")) { // �л�
						System.out.println("�̸� �Է� : ");
						String studentName = input.readLine();
						stmt = conn.createStatement();
						String sql = "select age,irum,hakbun from student where irum = '" + studentName + "'";
						cnt = stmt.executeUpdate(sql);
						if (cnt == 0)
							System.out.println("ã�� �л��� �����ϴ�.");
						ResultSet rs = stmt.executeQuery(sql);
						while (rs.next()) {
							age = rs.getInt("age");
							irum = rs.getString("irum");
							int hakbun = rs.getInt("hakbun");
							System.out.print("�̸�:" + irum + "\t" + "����:" + age + "\t" + "�й�:" + hakbun + "\n");
						}

					} else if (gubun.equals("2")) { // ����
						System.out.println("�̸� �Է� : ");
						String professorName = input.readLine();
						stmt = conn.createStatement();
						String sql = "select age,irum,subject from professor where irum = '" + professorName + "'";
						cnt = stmt.executeUpdate(sql);
						if (cnt == 0)
							System.out.println("ã�� ������ �����ϴ�.");
						ResultSet rs = stmt.executeQuery(sql);
						while (rs.next()) {
							age = rs.getInt("age");
							irum = rs.getString("irum");
							String subject = rs.getString("subject");
							System.out.print("�̸�:" + irum + "\t" + "����:" + age + "\t" + "����:" + subject + "\n");
						}

					} else if (gubun.equals("3")) { // ������
						System.out.println("�̸� �Է� : ");
						String managerName = input.readLine();
						stmt = conn.createStatement();
						String sql = "select age,irum,part from manager where irum = '" + managerName + "'";
						ResultSet rs = stmt.executeQuery(sql);
						if (!rs.isBeforeFirst())
							System.out.println("ã�� �����ڰ� �����ϴ�."); // isBeforeFirst �����
						while (rs.next()) {
							age = rs.getInt("age");
							irum = rs.getString("irum");
							String part = rs.getString("part");
							System.out.print("�̸�:" + irum + "\t" + "����:" + age + "\t" + "�μ�:" + part + "\n");
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

			} // ã�� �⺻�帧 ��

			else if (protocol.equals("3")) {// ���� �⺻�帧
				System.out.println("������ ���");
				System.out.println("1. �л�\t2.����\t3.������");
				try {
					String gubun = input.readLine();
					if (gubun.equals("1")) {
						System.out.println("������ �̸� �Է� : ");
						String studentName = input.readLine();
						stmt = conn.createStatement();
						String sql = "delete from student where irum = '" + studentName + "'";
						int cnt = stmt.executeUpdate(sql);
						if (cnt == 0)
							System.out.println("ã�� �л��� �����ϴ�.");
						else
							System.out.println(cnt + "�� �л��� �����Ǿ����ϴ�.");
					} else if (gubun.equals("2")) {
						System.out.println("������ �̸� �Է� : ");
						String professorName = input.readLine();
						stmt = conn.createStatement();
						String sql = "delete from professor where irum = '" + professorName + "'";
						int cnt = stmt.executeUpdate(sql);
						if (cnt == 0)
							System.out.println("ã�� �������� �����ϴ�.");
						else
							System.out.println(cnt + "�� �������� �����Ǿ����ϴ�.");
					} else if (gubun.equals("3")) {
						System.out.println("������ �̸� �Է� : ");
						String managerName = input.readLine();
						stmt = conn.createStatement();
						String sql = "delete from manager where irum = '" + managerName + "'";
						int cnt = stmt.executeUpdate(sql);
						if (cnt == 0)
							System.out.println("ã�� �����ڰ� �����ϴ�.");
						else
							System.out.println(cnt + "�� �����ڰ� �����Ǿ����ϴ�.");
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
			} // ���� �⺻�帧 ��

			else if (protocol.equals("4")) {// ��ü��� �⺻�帧
				System.out.println("��ü���");
				try {
					stmt = conn.createStatement();
					String sql = "select no,age,irum,hakbun from student";
					ResultSet rs = stmt.executeQuery(sql); // rs�� ���̺� ����Ŵ
					while (rs.next()) {
						int no = rs.getInt("no");
						int age = rs.getInt("age");
						String irum = rs.getString("irum");
						int hakbun = rs.getInt("hakbun");
						System.out.print("�̸�:" + irum + "\t" + "����:" + age + "\t" + "�й�:" + hakbun + "\n");
					}

					stmt = conn.createStatement(); // ������ �����ϱ� ���ص���, ������ �Ҷ����� ���� ��������
					sql = "select no,age,irum,subject from professor";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int no = rs.getInt("no");
						int age = rs.getInt("age");
						String irum = rs.getString("irum");
						String subject = rs.getString("subject");
						System.out.print("�̸�:" + irum + "\t" + "����:" + age + "\t" + "����:" + subject + "\n");
					}

					stmt = conn.createStatement();
					sql = "select no,age,irum,part from manager";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int no = rs.getInt("no");
						int age = rs.getInt("age");
						String irum = rs.getString("irum");
						String part = rs.getString("part");
						System.out.print("�̸�:" + irum + "\t" + "����:" + age + "\t" + "�μ�:" + part + "\n"); // no�� �Ƚᵵ��
					}

					stmt = conn.createStatement();
					// full outer join
					sql = "select s.no as ��ȣ,s.age as ����,s.irum as �̸�,s.hakbun as �й�,"
							+ "p.age as ��������,p.irum as �����̸�,p.subject as ����,"
							+ "m.age as �����ڳ���,m.irum as �������̸�,m.part as �μ� "
							+ "from (student s full outer join professor p on s.no=p.no) "
							+ "full outer join manager m on s.no=m.no ORDER BY ��ȣ ASC";

					// left join
//					sql = "select s.no as ��ȣ, s.age as ����, s.irum as �̸�, s.hakbun as �й�, "
//							+ "p.age as ��������, p.irum as �����̸�, p.subject as ����, "
//							+ "m.age as �����ڳ���, m.irum as �������̸�, m.part as �μ� "
//							+ "from (student s left join professor p on s.no = p.no) "//��ȣ�� ������ join�� �ض�
//							+ "left join manager m on s.no=m.no order by ��ȣ asc"; 

					System.out.println("�л� ��ü���");
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int sage = rs.getInt("����");
						String sirum = rs.getString("�̸�");
						int hakbun = rs.getInt("�й�");
						int page = rs.getInt("��������");
						String pirum = rs.getString("�����̸�");
						String subject = rs.getString("����");
						int mage = rs.getInt("�����ڳ���");
						String mirum = rs.getString("�������̸�");
						String part = rs.getString("�μ�");
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
			} // ��ü��� �⺻�帧 ��

			else if (protocol.equals("0")) {
				System.out.println("�л����α׷��� �����մϴ�.");
				System.exit(0);
			}
		} // �ݺ���
	}
}
