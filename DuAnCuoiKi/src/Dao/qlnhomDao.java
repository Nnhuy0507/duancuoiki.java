package Dao;

import java.util.ArrayList;

import Model.danhmucspModel;

public class qlnhomDao implements daoInterface<danhmucspModel> {

	public static qlnhomDao getInstance() {
		return new qlnhomDao();
	}
	
	
	@Override
	public int insert(danhmucspModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(danhmucspModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(danhmucspModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int timkiem(danhmucspModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<danhmucspModel> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public danhmucspModel selectByid(danhmucspModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<danhmucspModel> selectBycondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
