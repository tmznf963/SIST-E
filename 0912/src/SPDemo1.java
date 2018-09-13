import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SPDemo1 {
	private static final String URL="jdbc:oracle:thin:@211.238.142.147:1521:orcl";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String USER="scott";
	private static final String PASSWD = "tiger";
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		Scanner scan = new Scanner(System.in);
		System.out.print("사원번호 : ");    int empno = scan.nextInt();
		System.out.print("이름 : ");    String ename = scan.next();
		System.out.print("업무 : ");    String job = scan.next();
		System.out.print("매니저사원번호 : ");	   int mgr = scan.nextInt();
		System.out.print("급여 : ");	   double sal = scan.nextDouble();
		
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
		CallableStatement cstmt = conn.prepareCall("{call sp_emp_input(?, ?, ?, ?, ?)}");
		cstmt.setInt(1,  empno);
		cstmt.setString(2, ename);       cstmt.setString(3, job);
		cstmt.setInt(4, mgr);      cstmt.setDouble(5, sal);
		
		int row = cstmt.executeUpdate();
		if(row == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		if(cstmt != null) cstmt.close();
		if(conn != null) conn.close();
	}
}

/*
CREATE OR REPLACE PROCEDURE sp_emp_input
(
    v_empno           IN        emp.empno%TYPE,
    v_ename           IN        emp.ename%TYPE,
    v_job                 IN        emp.job%TYPE,
    v_mgr              IN          emp.mgr%TYPE,
    v_sal               IN          emp.sal%TYPE
)
IS
    v_deptno         emp.deptno%TYPE;
    v_comm          emp.comm%TYPE;
BEGIN
    SELECT deptno INTO v_deptno
    FROM emp
    WHERE empno = v_mgr;

    IF UPPER(v_job) = UPPER('salesman') THEN
        v_comm := 0;
    ELSE v_comm := NULL;
    END IF;

    INSERT INTO emp(empno, ename, job, mgr, sal, deptno, comm)
    VALUES(v_empno, v_ename, UPPER(v_job), v_mgr, v_sal, v_deptno, v_comm);
    COMMIT;
END;
*/