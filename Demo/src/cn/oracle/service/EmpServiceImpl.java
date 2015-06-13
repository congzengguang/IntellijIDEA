package cn.oracle.service;

import cn.oracle.pojo.Emp;

import java.util.List;

/**
 * Created by Administrator on 2015/6/13.
 */
public class EmpServiceImpl implements IEmpService {
    @Override
    public boolean insert(Emp vo) throws Exception {
        return false;
    }

    @Override
    public boolean update(Emp vo) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return false;
    }

    @Override
    public Emp get(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<Emp> list() throws Exception {
        return null;
    }

    @Override
    public List<Emp> list(String column, String keyWord, Integer currentPage, Integer lineSize) throws Exception {
        return null;
    }

    @Override
    public Integer allCount(String column, String keyWord) throws Exception {
        return null;
    }
}
