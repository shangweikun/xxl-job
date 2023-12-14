package com.xxl.job.core.share.info;

import java.util.Map;

public class ShareMsg {

    private Map<String, ShareMsg> subMsg;

    public boolean hasMsg(String subLogId) {
        return subMsg.containsKey(subLogId);
    }

    public Map<String, ShareMsg> getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(Map<String, ShareMsg> subMsg) {
        this.subMsg = subMsg;
    }

}
