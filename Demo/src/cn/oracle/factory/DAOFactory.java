package cn.oracle.factory;

import cn.oracle.dao.IEmpDAO;
import cn.oracle.dao.impl.EmpDAOImpl;

/**
 * Created by Administrator on 2015/6/13.
 */
public class DAOFactory {
    public static IEmpDAO getIEmpDAOInstance(){
        return new EmpDAOImpl();
    }
}
