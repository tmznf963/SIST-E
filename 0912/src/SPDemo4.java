import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SPDemo4 {
	private static final String URL="jdbc:oracle:thin:@211.238.142.147:1521:orcl";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String USER="scott";
	private static final String PASSWD = "tiger";
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
				
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 : ");     String hakbun = scan.next();
		
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
		CallableStatement cstmt = 
				conn.prepareCall("{call sp_student_select(?, ?, ?, ?, ?)}");
		
		//2, 3, 4, 5 : OUT   1 : IN
		cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);  //irum
		cstmt.registerOutParameter(3, java.sql.Types.SMALLINT);   //sum
		cstmt.registerOutParameter(4, java.sql.Types.DOUBLE);   //avg
		cstmt.registerOutParameter(5, java.sql.Types.CHAR);   //grade
		cstmt.setString(1, hakbun);    //학번
		
		cstmt.executeUpdate();     //이유여하를 불문하고 무조건 executeUpdate()다.
		String irum = cstmt.getString(2);  
		int sum = cstmt.getInt(3);
		double avg = cstmt.getDouble(4);
		char grade = cstmt.getString(5).charAt(0);
		
		System.out.println("학번     이름     총점      평균      평점");
		System.out.println("---------------------------------------");
		System.out.println(hakbun + "   " + irum + "    " + sum + "     " + avg + 
				                    "     " + grade);
		if(cstmt != null) cstmt.close();
		if(conn != null) conn.close();
	}
}

/*
CREATE OR REPLACE PROCEDURE sp_student_select
(
    v_hakbun        IN           student.hakbun%TYPE,
    v_irum            OUT        student.irum%TYPE,
    v_sum            OUT        student.sum%TYPE,
    v_avg             OUT        student.avg%TYPE,
    v_grade           OUT        student.grade%TYPE
)

IS
BEGIN
    SELECT  irum, sum, avg, grade
    INTO    v_irum, v_sum, v_avg, v_grade
    FROM    Student
    WHERE   hakbun = v_hakbun;
END;
*/