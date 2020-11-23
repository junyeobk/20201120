package kr.co.kh_Oracle_Obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HaksaEx {

	public static void main(String[] args) {
		register reg = new register();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String protocol = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}

		while (true) {// 반복문
			try {
				reg.getConnection();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			System.out.println("======학사관리=====");
			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.삭제");
			System.out.println("4.전체출력");
			System.out.println("=================");
			System.out.println("0.종료");
			System.out.println("번호를 선택해 주세요..");
			try {
				protocol = input.readLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			if (protocol.equals("1")) { //등록 프로토콜
				try {
					reg.selectType();
					if (protocol.equals("4"))
						continue;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						reg.connClose();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				System.out.println("계속하시려면 1,종료하시려면0을 입력해 주세요..");
				try {
					String bunho = input.readLine();
					if (bunho.equals("1")) {
						continue;
					} else {
						System.exit(0);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // 등록의끝
//		if(protocol.equals("2")) {
//			System.out.println("찾기");
//			   try {
//				HaksaFunction.search(input, stmt, conn);
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//						try {
//							conn.close();
//						} catch (SQLException e) {
//							e.printStackTrace();
//						}			
//		}
//		else if(protocol.equals("3")) {
//			System.out.println("삭제");
//			try {
//				HaksaFunction.delete(input, stmt, conn);
//			} catch (IOException e) {
//				e.printStackTrace();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}else if(protocol.equals("4")) {
//			System.out.println("전체출력");
//			        try {
//						HaksaFunction.list(stmt, conn);
//						
//					} catch (IOException e) {
//						e.printStackTrace();
//					} catch (SQLException e) {
//						e.printStackTrace();
//					} finally {
//						try {
//							conn.close();
//						} catch (SQLException e) {
//							e.printStackTrace();
//						}
//					}			
//		   }		
//		else if(protocol.equals("0")) {			
//			System.out.println("학사프로그램을 종료합니다.");
//			System.exit(0);
//		}
		} // 반복문
	}
}
