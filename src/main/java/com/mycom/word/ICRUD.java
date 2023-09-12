package com.mycom.word;

public interface ICRUD { // interface of CRUD
    public Object add();
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
}

