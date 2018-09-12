package com.mj.designmode.state_mode;

/**
 * Created by kim on 2018/9/8.
 * 抽象类状态
 */

public interface VoteState {

    public void vote(String user,String voteItem,VoteManager voteManager);
}
