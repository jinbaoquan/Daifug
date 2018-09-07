package com.xiaobao.uitls;

import com.xiaobao.result.R;

public class ResultUtil {
    public static R createResult(int res){
        if(res>0){
            return R.setOK();
        }else {
            return R.setERROR();
        }
    }
}
