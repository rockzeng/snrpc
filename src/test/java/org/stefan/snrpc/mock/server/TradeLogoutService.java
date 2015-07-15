package org.stefan.snrpc.mock.server;

import com.xx.xxx.jcproto.TRADE_REQ_LOGOUT;
import com.xx.xxx.jcproto.TRADE_RSP_LOGOUT;

/**
 * snrpc
 *
 * @author rock
 */
public interface TradeLogoutService {

    TRADE_RSP_LOGOUT logout(TRADE_REQ_LOGOUT request);
}
