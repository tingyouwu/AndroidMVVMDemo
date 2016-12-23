package com.wty.app.mvvmlib.command;

/**
 * @author wty
 * 有参数有返回的动作
 */
public interface IAction3<T,R> extends IAction{
    R call(T t);
}
