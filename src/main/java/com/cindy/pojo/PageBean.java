package com.cindy.pojo;
import java.util.List;

//Paging query java bean
public class PageBean<T> {
    //total pages
    private int totalCount;

    //current page list of data
    private List<T> rows;

    public int getTotalCount() {
        return totalCount;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
