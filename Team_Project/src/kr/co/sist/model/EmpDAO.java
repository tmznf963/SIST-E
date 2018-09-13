package kr.co.sist.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import kr.co.sist.control.DBClose;
import kr.co.sist.control.DBConnection;

public class EmpDAO {
	public static Vector<EmpVO> getcountProduction() throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "select count(*) from employee where dcode='F'"; //생산부
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				int count = rs.getInt("count(*)");
				EmpVO e = new EmpVO(count);
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}	
	//----------------------------------------------------------------------------------------
	public static Vector<EmpVO> getcountResearch() throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "select count(*) from employee where dcode='E'"; //연구부
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				int count = rs.getInt("count(*)");
				EmpVO e = new EmpVO(count);
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}	
	//----------------------------------------------------------------------------------------
	public static Vector<EmpVO> getcountGeneralAffairs() throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "select count(*) from employee where dcode='D'"; //총무부
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				int count = rs.getInt("count(*)");
				EmpVO e = new EmpVO(count);
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}	
	//----------------------------------------------------------------------------------------
	public static Vector<EmpVO> getcountPublicRelations() throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "select count(*) from employee where dcode='C'"; //홍보부
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				int count = rs.getInt("count(*)");
				EmpVO e = new EmpVO(count);
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}	
	//----------------------------------------------------------------------------------------
	public static Vector<EmpVO> getcountHumanResources() throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "select count(*) from employee where dcode='B'"; // 인사부
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				int count = rs.getInt("count(*)");
				EmpVO e = new EmpVO(count);
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}	
	//----------------------------------------------------------------------------------------
	public static Vector<EmpVO> getcountSales() throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "select count(*) from employee where dcode='A'"; // 영업부
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				int count = rs.getInt("count(*)");
				EmpVO e = new EmpVO(count);
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}	
	//----------------------------------------------------------------------------------------
	public static int insert(EmpVO emp) throws SQLException{ //사원입력
		int row = 0;
		Connection conn = new DBConnection().getConnection();
		String sql = "INSERT INTO employee VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, emp.getEmpno());
		pstmt.setString(2, emp.getPwd());
		pstmt.setString(3, emp.getName());
		pstmt.setInt(4, emp.getAge());
		pstmt.setString(5, emp.getBirthdate());
		pstmt.setString(6, emp.getSex());
		pstmt.setString(7, emp.getEmail());
		pstmt.setString(8, emp.getHiredate());
		pstmt.setString(9, emp.getP_num());
		pstmt.setInt(10, emp.getSum());
		pstmt.setInt(11, emp.getSalary());
		pstmt.setString(12, emp.getAddress());
		pstmt.setString(13, emp.getEmpno().substring(0, 1));
		pstmt.setInt(14, 0);
		pstmt.setString(15, emp.getPosition());
		row = pstmt.executeUpdate();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return row;
	}
	//---------------------------------------------------------------------------------------cut // 야근수당
	public static Vector<EmpVO> getnightinfo(String no) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "select e.nighttime, n.nightbonus from employee e, nighttable"
				+ "  n where e.nighttime=n.nighttime and e.empno='"+no+"'";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				int time = rs.getInt("e.nighttime");
				int bonus = rs.getInt("n.nightbonus");
				EmpVO e = new EmpVO(time,  bonus); 
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
		
	}// --------------------------------------------------------------------------------cut
	//---------------------------------------------------------------------------------------cut //기본급
	public static Vector<EmpVO> getsalinfo(String no) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "select e.position, g.gibon from employee e, gibontable g where"
				+ "  e.position=g.position and e.empno='"+no+"'";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				String position = rs.getString("e.position");
				int gibon = rs.getInt("g.gibon");
				EmpVO e = new EmpVO(position,  gibon); //empno, pwd 가져올때 ,position, gibon순서
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
		
	}// --------------------------------------------------------------------------------cut
	//---------------------------------------------------------------------------------------cut //employee login
	public static Vector<EmpVO> emplogin() throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "select empno, pwd,name from employee  ";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				String name = rs.getString("name");
				String dname = rs.getString("empno");
				String empno = rs.getString("pwd");
				EmpVO e = new EmpVO(name, dname,empno); //name,empno, pwd 순서 
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
		
	}// --------------------------------------------------------------------------------cut

	//---------------------------------------------------------------------------------------cut  //트리에서 클릭된 사원을 출력하기위한 method
		public static Vector<EmpVO> getinfo(String no) throws SQLException{
			Connection conn = new DBConnection().getConnection();
			String sql = " SELECT * FROM employee natural join department where empno='"+no+"'";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
			if(!rs.next()) vector = null;
			else {
				do {
					String hiredate= rs.getString("hiredate");
					String empno = rs.getString("empno"); 
					String name = rs.getString("name");
					String birthdate = rs.getString("birthdate");
					int age = rs.getInt("age");
					String sex = rs.getString("sex");
					String address = rs.getString("address");
					String p_num = rs.getString("p_num");
					String email = rs.getString("email");
					String dname = rs.getString("dname");
//					String position = rs.getString("position");
					int sum = rs.getInt("sum");
					String pwd = rs.getString("pwd");
					int salary = rs.getInt("salary");
					String dcode = rs.getString("dcode");
//					int gibon = rs.getInt("gibon");
//					int nighttime = rs.getInt("nighttime");
//					int nightbonus = rs.getInt("nightbonus");
					EmpVO e = new EmpVO(empno, pwd, name, sex, email,  hiredate,  birthdate,
							 p_num,  sum,  salary,  address,  dcode,  dname, age);
					vector.addElement(e);
				}while(rs.next());
			}
			if(rs != null) rs.close();   if(stmt != null) stmt.close();
			DBClose.close(conn);
			return vector;
			
		}// --------------------------------------------------------------------------------cut
//---------------------------------------------------------------------------------------cut //트리를 만들기 위한 정보가져오기
	public static Vector<EmpVO> getTree() throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "select d.dname, e.name, e.empno from employee e, department d where e.dcode=d.dcode ";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				String dname = rs.getString("d.dname");
				String ename = rs.getString("e.name");
				String empno = rs.getString("e.empno");
				EmpVO e = new EmpVO(ename, dname,empno);
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
		
	}// --------------------------------------------------------------------------------cut
	
}
