package com.xxl.job.core.share.info;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShareMsgContainer {

    private static final Map<String, ShareMsg> TOP_LOG_ID_2_SSHARE_MSG = new ConcurrentHashMap<>();

}
