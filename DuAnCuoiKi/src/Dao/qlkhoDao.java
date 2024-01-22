package Dao;

import java.util.ArrayList;

import Model.quanlikhothuoc;

public class qlkhoDao implements daoInterface<quanlikhothuoc> {

	public static qlkhoDao getInstance() {
		return new qlkhoDao();
	}
	
	
	@Override
	public int insert(quanlikhothuoc t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(quanlikhothuoc t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(quanlikhothuoc t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int timkiem(quanlikhothuoc t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<quanlikhothuoc> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public quanlikhothuoc selectByid(quanlikhothuoc t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<quanlikhothuoc> selectBycondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
