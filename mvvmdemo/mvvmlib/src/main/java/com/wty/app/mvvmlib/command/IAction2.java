package com.wty.app.mvvmlib.command;

/**
 * @author wty
 * 无参数有返回的任何动作
 */
public interface IAction2<R> extends IAction{
    R call();
}
