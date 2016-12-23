package com.wty.app.mvvmlib.command;

/**
 * @author wty
 * @Desc  无需返回的命令
 */
public class ReplyCommand<T> {

    private IAction0 execute0;

    private IAction1<T> execute1;

    public ReplyCommand(IAction0 execute0){
        this.execute0 = execute0;
    }

    public ReplyCommand(IAction1<T> execute1){
        this.execute1 = execute1;
    }

    public void execute(){
        if(execute0 != null){
            execute0.call();
        }
    }

    public void execute(T parameter){
        if(execute1 != null){
            execute1.call(parameter);
        }
    }
}
