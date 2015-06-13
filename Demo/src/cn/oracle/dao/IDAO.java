package cn.oracle.dao;

import java.util.List;

/**
 * Created by Administrator on 2015/6/13.
 */
public interface  IDAO<K,V> {
    public boolean doCreate(V vo)throws Exception;
    public boolean doUpdate(V vo)throws Exception;
    public boolean doRemove(K id)throws Exception;
    public V findById(K id)throws Exception;
    public List<V> findAll()throws Exception;
    public List<V> findAll(String column,String keyWord,Integer currentPage,Integer lineSize)throws Exception;
    public Integer getAllCount(String column,String keyWord)throws Exception;

}
