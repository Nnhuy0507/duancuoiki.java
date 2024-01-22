package Dao;

import java.util.ArrayList;

import Model.thongtinnguoidungModel;

public class nguoidungDao implements daoInterface<thongtinnguoidungModel> {

	public static nguoidungDao getInstance() {
		return new nguoidungDao();
	}

	
	@Override
	public int insert(thongtinnguoidungModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(thongtinnguoidungModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(thongtinnguoidungModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int timkiem(thongtinnguoidungModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<thongtinnguoidungModel> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public thongtinnguoidungModel selectByid(thongtinnguoidungModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<thongtinnguoidungModel> selectBycondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
