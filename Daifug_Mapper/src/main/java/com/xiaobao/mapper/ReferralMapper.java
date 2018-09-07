package com.xiaobao.mapper;

import com.xiaobao.domian.Referral;

public interface ReferralMapper {
    Referral selectById(int id);

    int insert(Referral referral);



}