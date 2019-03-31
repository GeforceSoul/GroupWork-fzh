package db;
 

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

 
import entity.Subject;
 
public class NewsDBImpl implements NewsDB {
	
	Connection conn = (Connection) DBConn.getConn();
 
	
	@Override
	public boolean add(Subject subject) {
		boolean flag = false;
		
		
		try {
			String sql="insert News values('"+subject.getNewsID()+"','"
					 +subject.getNewsTitle()+"','"
				     +subject.getNewsText()+"','"
					 +subject.getNewsDateTime()+"')";
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
	public List<Subject> selectall() {
		List<Subject> list = new ArrayList<Subject>();
		try {
			String sql = "select * from News";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Subject subject = new Subject();
				subject.setNewsID(rs.getInt("NewsID"));
				subject.setNewsTitle(rs.getString("NewsTitle"));
				subject.setNewsText(rs.getString("NewsText"));
				subject.setNewsDateTime(rs.getString("NewsDateTime"));
				list.add(subject);
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
	public List<Subject> selectByID(String NewsID) {
		List<Subject> list = new ArrayList<Subject>();
		try {
			String sql = "select * from News where NewsID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,NewsID );
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Subject subject = new Subject();
				subject.setNewsID(rs.getInt("NewsID"));
				subject.setNewsTitle(rs.getString("NewsTitle"));
				subject.setNewsText(rs.getString("NewsText"));
				subject.setNewsDateTime(rs.getString("NewsDateTime"));
				
				list.add(subject);
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
	public boolean update( String NewsID,String NewsTitle,String NewsText, String NewsDateTime) {
		boolean flag = false;
		try {
			String sql = "update News set NewsTitle = '"+ NewsTitle +"', NewsText = '"+ NewsText +"', NewsDateTime = '"+ NewsDateTime +"' where NewsID = '"+ NewsID +"'";
			
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
	public boolean delete(int NewsID) {
		boolean flag = false;
		
		try {
			String sql = "delete from News where NewsID = '"+NewsID+"'";
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
