package org.stefan.snrpc.mock.server;

import com.xx.xxx.jcproto.TRADE_REQ_LOGIN;
import com.xx.xxx.jcproto.TRADE_REQ_LOGOUT;
import com.xx.xxx.jcproto.TRADE_RSP_LOGIN;
import com.xx.xxx.jcproto.TRADE_RSP_LOGOUT;

/**
 * snrpc
 *
 * @author rock
 */
public class TradeServiceImpl implements TradeService {

    private TradeLoginService tradeLoginService;
    private TradeLogoutService tradeLogoutService;

    @Override
    public TRADE_RSP_LOGIN login(TRADE_REQ_LOGIN request) {
        assert tradeLoginService != null;
        return tradeLoginService.login(request);
    }

    @Override
    public TRADE_RSP_LOGOUT logout(TRADE_REQ_LOGOUT request) {
        assert tradeLogoutService != null;
        return tradeLogoutService.logout(request);
    }

    public void setTradeLoginService(TradeLoginService tradeLoginService) {
        this.tradeLoginService = tradeLoginService;
    }

    public void setTradeLogoutService(TradeLogoutService tradeLogoutService) {
        this.tradeLogoutService = tradeLogoutService;
    }
}
