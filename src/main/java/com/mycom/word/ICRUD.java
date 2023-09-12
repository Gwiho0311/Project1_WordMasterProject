package com.mycom.word;

public interface ICRUD { // interface of CRUD
    public Object add(); // for adding words
    public int update(Object obj); // for updating words
    public int delete(Object obj); // for deleting words
    public void selectOne(int id); // for selecting words
}

