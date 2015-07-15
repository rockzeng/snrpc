package org.stefan.snrpc;

import com.xx.xxx.jcproto.TRADE_REQ_LOGIN;
import com.xx.xxx.jcproto.TRADE_RSP_LOGIN;
import org.stefan.snrpc.client.CommonSnRpcClient;
import org.stefan.snrpc.client.PoolableRpcConnectionFactory;
import org.stefan.snrpc.client.SnNettyRpcConnectionFactory;
import org.stefan.snrpc.mock.server.TradeService;

/**
 * @author zhaoliangang 2014-11-14
 */
public class Client {

    public static void main(String[] args) throws Throwable {
        SnRpcConnectionFactory factory = new SnNettyRpcConnectionFactory("localhost", 8080);
        factory = new PoolableRpcConnectionFactory(factory);
        SnRpcClient client = new CommonSnRpcClient(factory);

        TradeService tradeService = client.proxy(TradeService.class);
        TRADE_RSP_LOGIN rsp_login = tradeService.login(createTradeLoginRequest());
        System.out.println("login response:");
        System.out.println("BrokerID:" + rsp_login.getBrokerID());
        System.out.println("CZCETime:" + rsp_login.getCZCETime());

    }

    private static TRADE_REQ_LOGIN createTradeLoginRequest() {
        TRADE_REQ_LOGIN loginRequest = new TRADE_REQ_LOGIN();
        loginRequest.setBrokerID("BrokerID");
        loginRequest.setClientIPAddress("localhost");
        loginRequest.setInterfaceProductInfo("ProductInfo");
        loginRequest.setMacAddress("macAddress");
        loginRequest.setOneTimePassword("password");
        loginRequest.setPassword("password");
        loginRequest.setProtocolInfo("protoinfo");
        loginRequest.setTradingDay("");
        loginRequest.setUserID("");
        loginRequest.setUserProductInfo("");
        return loginRequest;
    }
}
