package cn.oracle.service;

import cn.oracle.pojo.Emp;

import java.util.List;

/**
 * Created by Administrator on 2015/6/13.
 */
public interface IEmpService {
    public boolean insert(Emp vo)throws Exception;
    public boolean update(Emp vo)throws Exception;
    public boolean delete(Integer id)throws Exception;
    public Emp get(Integer id)throws Exception;
    public List<Emp> list() throws Exception;
    public List<Emp> list(String column,String keyWord,Integer currentPage,Integer lineSize)throws Exception;
    public Integer allCount(String column,String keyWord)throws Exception;
}
