package com.amazonproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.amazonproject.config.DBconfig;
import com.amazonproject.model.Brand;


public class ProductDaoImple {

	public void addNewBrand(Brand brand) {
	List<Brand> list=new ArrayList<Brand>();
		try {
			Connection con=DBconfig.getConnection();
			String query="insert into brands(?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,brand.getBrandId());
			ps.setString(2,brand.getBrandName());
			
			ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					Brand bd=new Brand();
					bd.setBrandId(rs.getInt(1));
					bd.setBrandName(rs.getString(2));
					
					list.add(bd);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
		DBconfig.closeConnection();
		}
  }
	
}
