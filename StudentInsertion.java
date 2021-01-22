package com.klu.insert;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import com.klu.bean.studentbean;
import com.klu.connections.DBUtil;


public class StudentInsertion {
	
	public int StudentInsert(studentbean student) throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.DBConnection();
//		Statement statement = con.createStatement();
		PreparedStatement statement = con.prepareStatement("insert into detail values(?, ?, ?)");
//		int i = statement.executeUpdate("insert into student_table values(student.regno, student.name, student.email)");
		statement.setInt(1,  student.getsid());
		statement.setString(2,  student.getName());
		statement.setString(3,  student.getdept());
		int i = statement.executeUpdate();
		return i;
		
	}
public int studentDelete(studentbean student) throws ClassNotFoundException , SQLException {
		Connection con =DBUtil.DBConnection();
		PreparedStatement ps = con.prepareStatement("delete from detail where sid=?");
		ps.setInt(1,student.getsid());
		int b=ps.executeUpdate();
		con.close();
		return b;
	}
	
public int studentUpdate(studentbean student) throws ClassNotFoundException , SQLException {
		Connection con =DBUtil.DBConnection();
		PreparedStatement ps = con.prepareStatement("update detail set name=? where sid=?");
		ps.setInt(1,student.getsid());
		ps.setString(2,student.getName());
		int c=ps.executeUpdate();
		con.close();
		return c;
	}




}
