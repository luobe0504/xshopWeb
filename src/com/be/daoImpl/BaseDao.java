package com.be.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.be.pojo.Goods;
import com.be.utils.DButils;

public class BaseDao<T> {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	public List<T> queryAll(String sql,Class clazz,Object...params){
		List<T> list =new ArrayList<>();
		try {		
			conn=DButils.getConnection();
			ps=conn.prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.length;i++){
					ps.setObject(i+1, params[i]);
				}
			}
			rs=ps.executeQuery();
			ResultSetMetaData rsd=rs.getMetaData();
			int columnCount = rsd.getColumnCount();
			while(rs.next()){
				Object obj=clazz.newInstance();
				for(int i=0;i<columnCount;i++){
					String label=rsd.getColumnLabel(i+1);
					BeanUtils.setProperty(obj,label,rs.getObject(label));
				}
				list.add((T)obj);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DButils.close(conn, ps, rs);
		}
		
			return list;
	}
	public int delete(String sql,Class clazz,Object...params){
		
		try {		
			conn=DButils.getConnection();
			ps=conn.prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.length;i++){
					ps.setObject(i+1, params[i]);
				}
			}
			int res=ps.executeUpdate();
			return res;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DButils.close(conn, ps, rs);
		}
			return 0;
	}

	public int update(String sql,Class clazz,Object...params){
		try {		
			conn=DButils.getConnection();
			ps=conn.prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.length;i++){
					ps.setObject(i+1, params[i]);
				}
			}
			int res=ps.executeUpdate();
			return res;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DButils.close(conn, ps, rs);
		}
			return 0;
	}
	public int insert(String sql,Class clazz,Object...params){
		try {		
			conn=DButils.getConnection();
			ps=conn.prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.length;i++){
					ps.setObject(i+1, params[i]);
				}
			}
			int res=ps.executeUpdate();
			return res;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DButils.close(conn, ps, rs);
		}
			return 0;
	}	
}
