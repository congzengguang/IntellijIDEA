package cn.oracle.pojo;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/6/13.
 */
public class Dept implements Serializable {
    private Integer deptno;
    private String dname;
    private String loc;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
