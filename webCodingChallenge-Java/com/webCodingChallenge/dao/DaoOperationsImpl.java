package com.webCodingChallenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.webCodingChallenge.exceptions.DaoException;
import com.webCodingChallenge.model.User;
import com.webCodingChallenge.util.Closing;
import com.webCodingChallenge.util.Connector;

public class DaoOperationsImpl implements DaoOperations {

	@Override
	public boolean loginCheckDao(String userName, String password) throws DaoException {

		String sql = "select password from credential where email=?";

		Closing close = new Closing();

		Connector connection = new Connector();
		Connection con = null;
//		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		int count = 0;
		boolean verify = false;

		try {
			System.out.println("making connection");

			con = connection.getConnector();

			System.out.println("...........");

			stmt = con.prepareStatement(sql);

			System.out.println("...........2222222222");

			stmt.setString(1, userName);

			System.out.println("...44444444");

			rs = stmt.executeQuery();

			System.out.println("query excecuted");
			System.out.println(rs);

			while (rs.next()) {
				String p = rs.getString(1);
//			System.out.println(p);
				if (p.equals(password)) {

					verify = true;

					System.out.println(verify);

					return verify;
				} else {
					System.out.println(verify);
					return verify;

				}
			}

		} catch (SQLException e) {
			throw new DaoException("dao excwption" + e.getCause() + "  " + e.getMessage());
		} finally {

			close.closeConnection(stmt);
			close.closeConnection(con);
		}
		return verify;

	}

	@Override
	public List<String> Fetch(String userName) throws DaoException {
		// TODO Auto-generated method stub
		String sql = "select name,mobileNum,city,state,country,email from user_details where email=?";
		Closing close = new Closing();

		Connector connection = new Connector();
		Connection con = null;

		ResultSet rs = null;
		PreparedStatement stmt = null;
		int count = 0;
//		User user = new User();
		List<String> userDetails  = new ArrayList<String>();
		try {
			System.out.println("making connection");

			con = connection.getConnector();

			stmt = con.prepareStatement(sql);

			stmt.setString(1, userName);

			rs = stmt.executeQuery();

			System.out.println("query excecuted");
			System.out.println(rs);

			while (rs.next()) {
//				User user= new User();
				String name = rs.getString(1);
				String mobileNum = rs.getString(2);
				String city = rs.getString(3);
				String state = rs.getString(4);
				String country = rs.getString(5);
				String email = rs.getString(6);
				userDetails.add(name);
				userDetails.add(mobileNum);
				userDetails.add(city);
				userDetails.add(state);
				userDetails.add(country);
				userDetails.add(email);
				
//				user.setName(rs.getString(1));
//				user.setMobileNum((rs.getString(2)));
//				user.setCity((rs.getString(3)));
//				user.setState((rs.getString(4)));
//				user.setCountry((rs.getString(5)));
//				user.setEmail((rs.getString(6)));
//				System.out.println(user);
			}

		} catch (SQLException e) {
			throw new DaoException("dao excwption" + e.getCause() + "  " + e.getMessage());
		} finally {

			close.closeConnection(stmt);
			close.closeConnection(con);
		}
		return userDetails;
	}

}
