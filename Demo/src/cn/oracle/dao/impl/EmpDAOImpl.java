package cn.oracle.dao.impl;

import cn.oracle.dao.IEmpDAO;
import cn.oracle.pojo.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * Created by Administrator on 2015/6/13.
 */
public class EmpDAOImpl implements IEmpDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    @Override
    public boolean doCreate(Emp vo) throws Exception {
        String sql="INSERT INTO emp(empno,ename,job,hiredate,sal,comm)VALUES(?,?,?,?,?,?)";
        this.pstmt=this.conn.prepareStatement(sql);
        this.pstmt.setInt(1,vo.getEmpno());
        this.pstmt.setString(2,vo.getEname());
        this.pstmt.setString(3,vo.getJob());
        this.pstmt.setDate(4,new java.sql.Date(vo.getHiredate().getTime()));
        this.pstmt.setDouble(5,vo.getSal());
        this.pstmt.setDouble(6,vo.getComm());
        if(this.pstmt.executeUpdate()>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean doUpdate(Emp vo) throws Exception {
        return false;
    }

    @Override
    public boolean doRemove(Integer id) throws Exception {
        return false;
    }

    @Override
    public Emp findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<Emp> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Emp> findAll(String column, String keyWord, Integer currentPage, Integer lineSize) throws Exception {
        return null;
    }

    @Override
    public Integer getAllCount(String column, String keyWord) throws Exception {
        return null;
    }
}
