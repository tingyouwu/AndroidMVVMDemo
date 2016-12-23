package com.wty.app.mvvmlib.command;

/**
 * @author wty
 * @Desc  返回的命令
 */
public class ResponseCommand<T,R> {

    private IAction2<R> execute0;

    private IAction3<T,R> execute1;

    public ResponseCommand(IAction2<R> execute0){
        this.execute0 = execute0;
    }

    public ResponseCommand(IAction3<T,R> execute1){
        this.execute1 = execute1;
    }

    public R execute(){
        if(execute0 != null){
            return execute0.call();
        }
        return null;
    }

    public R execute(T parameter){
        if(execute1 != null){
            return execute1.call(parameter);
        }
        return null;
    }
}
