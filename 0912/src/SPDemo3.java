import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import oracle.jdbc.OracleTypes;

public class SPDemo3 {
	private static final String URL="jdbc:oracle:thin:@211.238.142.147:1521:orcl";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String USER="scott";
	private static final String PASSWD = "tiger";
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
				
		Scanner scan = new Scanner(System.in);
		System.out.print("사번 : ");     int empno = scan.nextInt();
		
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
		CallableStatement cstmt = conn.prepareCall("{call sp_emp_select(?, ?, ?, ?)}");
		
		//2, 3, 4 : OUT   1 : IN
		cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);  //ename
		cstmt.registerOutParameter(3, java.sql.Types.DOUBLE);   //sal
		cstmt.registerOutParameter(4, java.sql.Types.DATE);   //hiredate
		cstmt.setInt(1, empno);
		
		cstmt.executeUpdate();     //이유여하를 불문하고 무조건 executeUpdate()다.
		String ename = cstmt.getString(2);  
		double sal = cstmt.getDouble(3);
		java.sql.Date hiredate = cstmt.getDate(4);
		System.out.println("사번       이름      봉급      입사날짜");
		System.out.println("---------------------------------------");
		System.out.println(empno + "   " + ename + "    " + sal + "     " + hiredate);
		if(cstmt != null) cstmt.close();
		if(conn != null) conn.close();
	}
}

/*
CREATE OR REPLACE PROCEDURE sp_emp_select
(
    v_empno    IN        emp.empno%TYPE,
    v_ename     OUT    emp.ename%TYPE,
    v_sal            OUT    emp.sal%TYPE,
    v_hiredate    OUT    emp.hiredate%TYPE
)
IS
BEGIN
    SELECT   ename, sal, hiredate
    INTO      v_ename, v_sal, v_hiredate
    FROM     emp
    WHERE   empno = v_empno;
END;
*/