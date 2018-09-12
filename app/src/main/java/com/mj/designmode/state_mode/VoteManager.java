package com.mj.designmode.state_mode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kim on 2018/9/8.
 */

public class VoteManager {

    private VoteState state=null;

    //记录用户投票的结果，Map<String,String>对应Map<用户名称，投票的选项>
   private Map<String,String> mapVote=new HashMap<String, String>();

   //记录用户投票的次数
   private Map<String,Integer> mapVoteCount=new HashMap<String, Integer>();

    /**
     * 获取用户投票结果的map
     * @return
     */
   public Map<String,String> getMapVote(){
       return mapVote;
   }

   public void vote(String user,String voteItem){

       Integer oldVoteCount=mapVoteCount.get(user);

       if(oldVoteCount==null){

           oldVoteCount=0;
       }

       oldVoteCount+=1;
       mapVoteCount.put(user,oldVoteCount);
       //判断投票类型
       if(oldVoteCount==1){
           state=new NormalVoteState();

       }else if(oldVoteCount>1&&oldVoteCount<5){

           //state=new Re
       }


   }


}
