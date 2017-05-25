package com.ggr.dao;

/**
 * Created by GuiRunning on 2017/5/23.
 * 主要用于定义公共部分的规范
 */
public interface IcommonDao<T> {
    void save(T entity);
}
