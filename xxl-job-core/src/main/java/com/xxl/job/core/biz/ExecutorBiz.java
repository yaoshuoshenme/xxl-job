package com.xxl.job.core.biz;

import com.xxl.job.core.biz.model.*;

/**
 * 业务执行器接口
 * Created by xuxueli on 17/3/1.
 */
public interface ExecutorBiz {

    /**
     * 心跳
     * beat
     *
     * @return
     */
    public ReturnT<String> beat();

    /**
     * 忙碌检测
     * idle beat
     *
     * @param idleBeatParam
     * @return
     */
    public ReturnT<String> idleBeat(IdleBeatParam idleBeatParam);

    /**
     * 任务触发
     * run
     *
     * @param triggerParam
     * @return
     */
    public ReturnT<String> run(TriggerParam triggerParam);

    /**
     * 终止任务
     * kill
     *
     * @param killParam
     * @return
     */
    public ReturnT<String> kill(KillParam killParam);

    /**
     * 查看执行日志，滚动加载
     * log
     *
     * @param logParam
     * @return
     */
    public ReturnT<LogResult> log(LogParam logParam);

}
