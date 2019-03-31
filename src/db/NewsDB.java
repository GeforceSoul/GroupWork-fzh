package db;
 
import java.util.List;
 
import entity.Subject;
 
public interface NewsDB {
	
	public boolean add(Subject subject);
	public List<Subject> selectall();
	public List<Subject> selectByID(String string);
	public boolean update(String NewsID,String NewsTitle,String NewsText,String NewsDateTime);
	public boolean delete(int NewsID);
	}
