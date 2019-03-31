package db;
 

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

 

import entity.Subject2;
 
public class AnDBImpl implements AnDB {
	
	Connection conn = (Connection) DBConn.getConn();
 
	
	@Override
	public boolean add(Subject2 subject2) {
		boolean flag = false;
		
		
		try {
			String sql="insert announcement values('"+subject2.getAnID()+"','"
					 +subject2.getAnTitle()+"','"
				     +subject2.getAnText()+"','"
					 +subject2.getAnDateTime()+"')";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			if(i>0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
 
 
	@Override
	public List<Subject2> selectall() {
		List<Subject2> list = new ArrayList<Subject2>();
		try {
			String sql = "select * from announcement";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Subject2 subject2 = new Subject2();
				subject2.setAnID(rs.getInt("AnID"));
				subject2.setAnTitle(rs.getString("AnTitle"));
				subject2.setAnText(rs.getString("AnText"));
				subject2.setAnDateTime(rs.getString("AnDateTime"));
				list.add(subject2);
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Subject2> selectByID(String AnID) {
		List<Subject2> list2 = new ArrayList<Subject2>();
		try {
			String sql = "select * from announcement where AnID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,AnID );
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Subject2 subject2 = new Subject2();
				subject2.setAnID(rs.getInt("AnID"));
				subject2.setAnTitle(rs.getString("AnTitle"));
				subject2.setAnText(rs.getString("AnText"));
				subject2.setAnDateTime(rs.getString("AnDateTime"));
				
				list2.add(subject2);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list2;
	}


	
	@Override
	public boolean update( String AnID,String AnTitle,String AnText, String AnDateTime) {
		boolean flag = false;
		try {
			String sql = "update announcement set AnTitle = '"+ AnTitle +"', AnText = '"+ AnText +"', AnDateTime = '"+ AnDateTime +"' where AnID = '"+ AnID +"'";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			if(i>0)flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
 
	@Override
	public boolean delete(int AnID) {
		boolean flag = false;
		
		try {
			String sql = "delete from announcement where AnID = '"+AnID+"'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			if(i>0) flag = true;
		} catch (SQLException e) {
			System.out.println("删除失败！");
			e.printStackTrace();
		}
		
		return flag;
	}
 
}
