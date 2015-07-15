package org.stefan.snrpc.mock.server;

/**
 * snrpc
 *
 * @author rock
 */
//可继承多其他与交易相关的接口
public interface TradeService extends TradeLoginService,
        TradeLogoutService {
}
