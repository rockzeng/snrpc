package org.stefan.snrpc.mock.server;

import com.xx.xxx.jcproto.TRADE_REQ_LOGIN;
import com.xx.xxx.jcproto.TRADE_RSP_LOGIN;

/**
 * snrpc
 *
 * @author rock
 */
public interface TradeLoginService {

    TRADE_RSP_LOGIN login(TRADE_REQ_LOGIN request);
}
