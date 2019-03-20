package com.spring.boot.demo.Util;

import com.spring.boot.demo.domain.toolsmodel.BPResult;

/**
 * @Author: JerryLiang
 * @Date: 2019/3/20 11:28
 **/
public class CommonLogic {

    public static String jsonAssembly(String code, String message, Object content) {//原有单个参数

        BPResult bpResult = new BPResult();
        bpResult.setCode(code);
        bpResult.setContents(content);
        bpResult.setMessage(message);
        return JsonUtils.getInstance().objec2JsonStr(bpResult);
    }

}
