package com.imooc.seckill.rabbitmq;

import com.imooc.seckill.domain.MiaoshaUser;

/**
 * Created by Kylin_Su on 2018/6/23.
 */
public class MiaoshaMessage {
    private MiaoshaUser user;
    private long goodsId;
    public MiaoshaUser getUser() {
        return user;
    }
    public void setUser(MiaoshaUser user) {
        this.user = user;
    }
    public long getGoodsId() {
        return goodsId;
    }
    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }
}