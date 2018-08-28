import java.sql.SQLException;
import java.util.Vector;

public class SelectController {
	public static Vector<ZipSearchVO> selectAll() {
		Vector<ZipSearchVO> vector = null;
		try {
			vector = ZipSearchDAO.selectAll();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return vector;
	}
	public static Vector<ZipSearchVO> select(String key) {
		Vector<ZipSearchVO> vector = null;
		try {
			vector = ZipSearchDAO.select(key);
		}catch(SQLException e) {
			System.out.println(e);
		}
		return vector;
	}
}
