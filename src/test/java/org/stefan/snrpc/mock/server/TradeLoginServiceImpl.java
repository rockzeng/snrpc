package org.stefan.snrpc.mock.server;

import com.dyuproject.protostuff.ByteString;
import com.xx.xxx.jcproto.TRADE_REQ_LOGIN;
import com.xx.xxx.jcproto.TRADE_RSP_LOGIN;

/**
 * snrpc
 *
 * @author rock
 */
public class TradeLoginServiceImpl implements TradeLoginService {

    @Override
    public TRADE_RSP_LOGIN login(TRADE_REQ_LOGIN request) {
        TRADE_RSP_LOGIN loginRsp = new TRADE_RSP_LOGIN();
        loginRsp.setBrokerID("rs-brokerID");
        loginRsp.setCZCETime("rs-CZCETime");
        loginRsp.setDCETime("rs-DCETime");
        loginRsp.setFFEXTime("rs-FFEXTime");
        loginRsp.setFrontID(1);
        loginRsp.setINETime("rs-INETime");
        loginRsp.setLoginTime("rs-LoginTime");
        loginRsp.setMaxOrderRef("rs-MaxOrderRef");
        loginRsp.setRspcode("rs-Rspcode");
        loginRsp.setRspmsg(ByteString.copyFromUtf8("ok"));
        loginRsp.setSessionID(2);
        loginRsp.setSHFETime("rs-SHFETime");
        loginRsp.setSystemName(ByteString.copyFromUtf8("aa"));
        loginRsp.setTradingDay("rs-TradingDay");
        loginRsp.setUserID("rs-UserID");
        return loginRsp;
    }
}
