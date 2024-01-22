package Dao;

import java.util.ArrayList;

public interface daoInterface<T> {

	public int insert(T t);
	
	public int update(T t);
	
	public int delete(T t);
	
	public int timkiem(T t);
	
	public ArrayList<T> selectAll();
	
	public T selectByid(T t);
	
	public ArrayList<T> selectBycondition(String condition);
	
}
