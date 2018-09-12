package com.mj.designmode.state_mode;

/**
 * Created by kim on 2018/9/8.
 */

public class RepeatVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}
