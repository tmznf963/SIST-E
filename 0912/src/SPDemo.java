import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SPDemo {
	private static final String URL="jdbc:oracle:thin:@211.238.142.147:1521:orcl";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String USER="scott";
	private static final String PASSWD = "tiger";
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 : ");    String hakbun = scan.next();
		System.out.print("이름 : ");    String irum = scan.next();
		System.out.print("국어 : ");	   int kor = scan.nextInt();
		System.out.print("영어 : ");	   int eng = scan.nextInt();
		System.out.print("수학 : ");	   int mat = scan.nextInt();
		System.out.print("전산 : ");	   int edp = scan.nextInt();
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
		CallableStatement cstmt = conn.prepareCall("{call sp_student_insert(?,?,?,?,?,?)}");
		cstmt.setString(1, hakbun);       cstmt.setString(2, irum);
		cstmt.setInt(3, kor);      cstmt.setInt(4, eng);     cstmt.setInt(5,  mat);
		cstmt.setInt(6, edp);
		int row = cstmt.executeUpdate();
		if(row == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		if(cstmt != null) cstmt.close();
		if(conn != null) conn.close();
	}
}
/*
CREATE OR REPLACE PROCEDURE sp_student_insert
(
     hakbun        student.hakbun%TYPE,
     irum             student.irum%TYPE,
     kor               student.kor%TYPE,
     eng              student.eng%TYPE,
     mat              student.mat%TYPE,
     edp              student.edp%TYPE
)
IS
     v_sum         student.sum%TYPE;
     v_avg          student.avg%TYPE;
     v_grade       student.grade%TYPE := 'F';
BEGIN
     v_sum := kor + eng + mat + edp;
     v_avg := ROUND(v_sum / 4, 2);
     IF v_avg BETWEEN 90 AND 100 THEN v_grade := 'A';
     ELSIF v_avg < 90 AND v_avg >= 80 THEN v_grade := 'B';
     ELSIF v_avg < 80 AND v_avg >= 70 THEN v_grade := 'C';
     ELSIF v_avg < 70 AND v_avg >= 60 THEN v_grade := 'D';
     ELSE v_grade := 'F';
     END IF;
     INSERT INTO Student
     VALUES(hakbun, irum, kor, eng, mat, edp, v_sum, v_avg, v_grade);
     COMMIT;
     DBMS_OUTPUT.PUT_LINE('Insert Success');
END;
*/