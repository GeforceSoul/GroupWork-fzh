package db;
 
import java.util.List;
 

import entity.Subject2;
 
public interface AnDB {
	
	public boolean add(Subject2 subject2);
	public List<Subject2> selectall();
	public List<Subject2> selectByID(String string);
	public boolean update(String AnID,String AnTitle,String AnText,String AnDateTime);
	public boolean delete(int AnID);
	}
