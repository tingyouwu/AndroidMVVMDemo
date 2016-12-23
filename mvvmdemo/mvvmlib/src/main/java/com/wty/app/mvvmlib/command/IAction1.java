package com.wty.app.mvvmlib.command;

/**
 * @author wty
 * 有参数的动作
 */
public interface IAction1<T> extends IAction{
    void call(T t);
}
