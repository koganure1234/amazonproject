package com.amazonproject.utility;

import java.util.Scanner;

import com.amazonproject.dao.ProductDaoImple;
import com.amazonproject.model.Brand;

public class AmazonUtility {

	public void addNewBrand()
	{
		
		Scanner sc=new Scanner(System.in);
		Brand br=new Brand();
		System.out.println("Enter Brand Id");
		int id=sc.nextInt();
		br.setBrandId(id);
		System.out.println("Brand name");
		String name=sc.next();
		br.setBrandName(name);
		
		ProductDaoImple pr=new ProductDaoImple();
		pr.addNewBrand(br);
	}
}
