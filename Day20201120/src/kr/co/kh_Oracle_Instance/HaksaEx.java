package kr.co.kh_Oracle_Instance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HaksaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HaksaInstance hak = new HaksaInstance();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String protocol=null;
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
		Statement stmt =null;
		int cnt=0;
		while(true) {//�ݺ���
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","khbclass","dkdlxl");
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		System.out.println("======�л����=====");
		System.out.println("1.���");
		System.out.println("2.�˻�");
		System.out.println("3.����");
		System.out.println("4.��ü���");
		System.out.println("=================");
		System.out.println("0.����");
		System.out.println("��ȣ�� ������ �ּ���..");	
		try {
			protocol = input.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		if(protocol.equals("1")) {
			     try {
				protocol=hak.register(protocol, input, stmt, conn, cnt);
			    } catch (IOException e) {
				e.printStackTrace();
			    } catch (SQLException e) {
				e.printStackTrace();
			    } finally {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}						
			    if(protocol.equals("4")) {
				continue;
			    }
			System.out.println("����Ͻ÷��� 1,�����Ͻ÷���0�� �Է��� �ּ���..");
			try {
				String bunho = input.readLine();
				if(bunho.equals("1")) {
					continue;
				}else {
					System.exit(0);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//����ǳ� 
		if(protocol.equals("2")) {
			System.out.println("ã��");
			   try {
				   hak.search(input, stmt, conn);
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
						try {
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}			
		}
		else if(protocol.equals("3")) {
			System.out.println("����");
			try {
				hak.delete(input, stmt, conn);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if(protocol.equals("4")) {
			System.out.println("��ü���");
			        try {
			        	hak.list(stmt, conn);
						
					} catch (IOException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}			
		   }		
		else if(protocol.equals("0")) {			
			System.out.println("�л����α׷��� �����մϴ�.");
			System.exit(0);
		}
	 }//�ݺ���
	}

}
