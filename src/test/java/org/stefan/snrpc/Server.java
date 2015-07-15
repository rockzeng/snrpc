package org.stefan.snrpc;

import org.stefan.snrpc.mock.server.*;

/**
 * @author zhaoliangang 2014-11-14
 */
public class Server {

    public static void main(String[] args) throws Throwable {
        TradeLoginService tradeLoginService = new TradeLoginServiceImpl();
        SnRpcServer server = new SnNettyRpcServer(tradeLoginService);
        server.start();
    }
}
