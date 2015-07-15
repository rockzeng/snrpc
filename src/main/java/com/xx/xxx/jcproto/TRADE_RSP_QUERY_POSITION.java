// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from trade.proto

package com.xx.xxx.jcproto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.ByteString;
import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class TRADE_RSP_QUERY_POSITION implements Externalizable, Message<TRADE_RSP_QUERY_POSITION>
{

    public static Schema<TRADE_RSP_QUERY_POSITION> getSchema()
    {
        return SCHEMA;
    }

    public static TRADE_RSP_QUERY_POSITION getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final TRADE_RSP_QUERY_POSITION DEFAULT_INSTANCE = new TRADE_RSP_QUERY_POSITION();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String instrumentID;
    String brokerID;
    String investorID;
    Integer posiDirection;
    Integer hedgeFlag;
    Integer positionDate;
    Integer ydPosition;
    Integer position;
    Integer longFrozen;
    Integer shortFrozen;
    Double longFrozenAmount;
    Double shortFrozenAmount;
    Integer openVolume;
    Integer closeVolume;
    Double openAmount;
    Double closeAmount;
    Double positionCost;
    Double useMargin;
    Double frozenMargin;
    Double frozenCash;
    Double frozenCommission;
    Double cashIn;
    Double commission;
    Double closeProfit;
    Double positionProfit;
    Double preSettlementPrice;
    Double settlementPrice;
    String tradingDay;
    Integer settlementID;
    Double openCost;
    Double exchangeMargin;
    Integer combPosition;
    Integer combLongFrozen;
    Integer combShortFrozen;
    Double closeProfitByDate;
    Double closeProfitByTrade;
    Integer todayPosition;
    Double marginRateByMoney;
    Double marginRateByVolume;
    Integer strikeFrozen;
    Double strikeFrozenAmount;
    Integer abandonFrozen;
    Double preMargin;
    String rspcode;
    ByteString rspmsg;
    Integer bLast;

    public TRADE_RSP_QUERY_POSITION()
    {
        
    }

    public TRADE_RSP_QUERY_POSITION(
        String instrumentID,
        String brokerID,
        String investorID,
        Integer posiDirection,
        Integer hedgeFlag,
        Integer ydPosition,
        Integer position,
        Integer longFrozen,
        Integer shortFrozen,
        Double longFrozenAmount,
        Double shortFrozenAmount,
        Integer openVolume,
        Integer closeVolume,
        String rspcode,
        ByteString rspmsg,
        Integer bLast
    )
    {
        this.instrumentID = instrumentID;
        this.brokerID = brokerID;
        this.investorID = investorID;
        this.posiDirection = posiDirection;
        this.hedgeFlag = hedgeFlag;
        this.ydPosition = ydPosition;
        this.position = position;
        this.longFrozen = longFrozen;
        this.shortFrozen = shortFrozen;
        this.longFrozenAmount = longFrozenAmount;
        this.shortFrozenAmount = shortFrozenAmount;
        this.openVolume = openVolume;
        this.closeVolume = closeVolume;
        this.rspcode = rspcode;
        this.rspmsg = rspmsg;
        this.bLast = bLast;
    }

    // getters and setters

    // instrumentID

    public String getInstrumentID()
    {
        return instrumentID;
    }

    public void setInstrumentID(String instrumentID)
    {
        this.instrumentID = instrumentID;
    }

    // brokerID

    public String getBrokerID()
    {
        return brokerID;
    }

    public void setBrokerID(String brokerID)
    {
        this.brokerID = brokerID;
    }

    // investorID

    public String getInvestorID()
    {
        return investorID;
    }

    public void setInvestorID(String investorID)
    {
        this.investorID = investorID;
    }

    // posiDirection

    public Integer getPosiDirection()
    {
        return posiDirection;
    }

    public void setPosiDirection(Integer posiDirection)
    {
        this.posiDirection = posiDirection;
    }

    // hedgeFlag

    public Integer getHedgeFlag()
    {
        return hedgeFlag;
    }

    public void setHedgeFlag(Integer hedgeFlag)
    {
        this.hedgeFlag = hedgeFlag;
    }

    // positionDate

    public Integer getPositionDate()
    {
        return positionDate;
    }

    public void setPositionDate(Integer positionDate)
    {
        this.positionDate = positionDate;
    }

    // ydPosition

    public Integer getYdPosition()
    {
        return ydPosition;
    }

    public void setYdPosition(Integer ydPosition)
    {
        this.ydPosition = ydPosition;
    }

    // position

    public Integer getPosition()
    {
        return position;
    }

    public void setPosition(Integer position)
    {
        this.position = position;
    }

    // longFrozen

    public Integer getLongFrozen()
    {
        return longFrozen;
    }

    public void setLongFrozen(Integer longFrozen)
    {
        this.longFrozen = longFrozen;
    }

    // shortFrozen

    public Integer getShortFrozen()
    {
        return shortFrozen;
    }

    public void setShortFrozen(Integer shortFrozen)
    {
        this.shortFrozen = shortFrozen;
    }

    // longFrozenAmount

    public Double getLongFrozenAmount()
    {
        return longFrozenAmount;
    }

    public void setLongFrozenAmount(Double longFrozenAmount)
    {
        this.longFrozenAmount = longFrozenAmount;
    }

    // shortFrozenAmount

    public Double getShortFrozenAmount()
    {
        return shortFrozenAmount;
    }

    public void setShortFrozenAmount(Double shortFrozenAmount)
    {
        this.shortFrozenAmount = shortFrozenAmount;
    }

    // openVolume

    public Integer getOpenVolume()
    {
        return openVolume;
    }

    public void setOpenVolume(Integer openVolume)
    {
        this.openVolume = openVolume;
    }

    // closeVolume

    public Integer getCloseVolume()
    {
        return closeVolume;
    }

    public void setCloseVolume(Integer closeVolume)
    {
        this.closeVolume = closeVolume;
    }

    // openAmount

    public Double getOpenAmount()
    {
        return openAmount;
    }

    public void setOpenAmount(Double openAmount)
    {
        this.openAmount = openAmount;
    }

    // closeAmount

    public Double getCloseAmount()
    {
        return closeAmount;
    }

    public void setCloseAmount(Double closeAmount)
    {
        this.closeAmount = closeAmount;
    }

    // positionCost

    public Double getPositionCost()
    {
        return positionCost;
    }

    public void setPositionCost(Double positionCost)
    {
        this.positionCost = positionCost;
    }

    // useMargin

    public Double getUseMargin()
    {
        return useMargin;
    }

    public void setUseMargin(Double useMargin)
    {
        this.useMargin = useMargin;
    }

    // frozenMargin

    public Double getFrozenMargin()
    {
        return frozenMargin;
    }

    public void setFrozenMargin(Double frozenMargin)
    {
        this.frozenMargin = frozenMargin;
    }

    // frozenCash

    public Double getFrozenCash()
    {
        return frozenCash;
    }

    public void setFrozenCash(Double frozenCash)
    {
        this.frozenCash = frozenCash;
    }

    // frozenCommission

    public Double getFrozenCommission()
    {
        return frozenCommission;
    }

    public void setFrozenCommission(Double frozenCommission)
    {
        this.frozenCommission = frozenCommission;
    }

    // cashIn

    public Double getCashIn()
    {
        return cashIn;
    }

    public void setCashIn(Double cashIn)
    {
        this.cashIn = cashIn;
    }

    // commission

    public Double getCommission()
    {
        return commission;
    }

    public void setCommission(Double commission)
    {
        this.commission = commission;
    }

    // closeProfit

    public Double getCloseProfit()
    {
        return closeProfit;
    }

    public void setCloseProfit(Double closeProfit)
    {
        this.closeProfit = closeProfit;
    }

    // positionProfit

    public Double getPositionProfit()
    {
        return positionProfit;
    }

    public void setPositionProfit(Double positionProfit)
    {
        this.positionProfit = positionProfit;
    }

    // preSettlementPrice

    public Double getPreSettlementPrice()
    {
        return preSettlementPrice;
    }

    public void setPreSettlementPrice(Double preSettlementPrice)
    {
        this.preSettlementPrice = preSettlementPrice;
    }

    // settlementPrice

    public Double getSettlementPrice()
    {
        return settlementPrice;
    }

    public void setSettlementPrice(Double settlementPrice)
    {
        this.settlementPrice = settlementPrice;
    }

    // tradingDay

    public String getTradingDay()
    {
        return tradingDay;
    }

    public void setTradingDay(String tradingDay)
    {
        this.tradingDay = tradingDay;
    }

    // settlementID

    public Integer getSettlementID()
    {
        return settlementID;
    }

    public void setSettlementID(Integer settlementID)
    {
        this.settlementID = settlementID;
    }

    // openCost

    public Double getOpenCost()
    {
        return openCost;
    }

    public void setOpenCost(Double openCost)
    {
        this.openCost = openCost;
    }

    // exchangeMargin

    public Double getExchangeMargin()
    {
        return exchangeMargin;
    }

    public void setExchangeMargin(Double exchangeMargin)
    {
        this.exchangeMargin = exchangeMargin;
    }

    // combPosition

    public Integer getCombPosition()
    {
        return combPosition;
    }

    public void setCombPosition(Integer combPosition)
    {
        this.combPosition = combPosition;
    }

    // combLongFrozen

    public Integer getCombLongFrozen()
    {
        return combLongFrozen;
    }

    public void setCombLongFrozen(Integer combLongFrozen)
    {
        this.combLongFrozen = combLongFrozen;
    }

    // combShortFrozen

    public Integer getCombShortFrozen()
    {
        return combShortFrozen;
    }

    public void setCombShortFrozen(Integer combShortFrozen)
    {
        this.combShortFrozen = combShortFrozen;
    }

    // closeProfitByDate

    public Double getCloseProfitByDate()
    {
        return closeProfitByDate;
    }

    public void setCloseProfitByDate(Double closeProfitByDate)
    {
        this.closeProfitByDate = closeProfitByDate;
    }

    // closeProfitByTrade

    public Double getCloseProfitByTrade()
    {
        return closeProfitByTrade;
    }

    public void setCloseProfitByTrade(Double closeProfitByTrade)
    {
        this.closeProfitByTrade = closeProfitByTrade;
    }

    // todayPosition

    public Integer getTodayPosition()
    {
        return todayPosition;
    }

    public void setTodayPosition(Integer todayPosition)
    {
        this.todayPosition = todayPosition;
    }

    // marginRateByMoney

    public Double getMarginRateByMoney()
    {
        return marginRateByMoney;
    }

    public void setMarginRateByMoney(Double marginRateByMoney)
    {
        this.marginRateByMoney = marginRateByMoney;
    }

    // marginRateByVolume

    public Double getMarginRateByVolume()
    {
        return marginRateByVolume;
    }

    public void setMarginRateByVolume(Double marginRateByVolume)
    {
        this.marginRateByVolume = marginRateByVolume;
    }

    // strikeFrozen

    public Integer getStrikeFrozen()
    {
        return strikeFrozen;
    }

    public void setStrikeFrozen(Integer strikeFrozen)
    {
        this.strikeFrozen = strikeFrozen;
    }

    // strikeFrozenAmount

    public Double getStrikeFrozenAmount()
    {
        return strikeFrozenAmount;
    }

    public void setStrikeFrozenAmount(Double strikeFrozenAmount)
    {
        this.strikeFrozenAmount = strikeFrozenAmount;
    }

    // abandonFrozen

    public Integer getAbandonFrozen()
    {
        return abandonFrozen;
    }

    public void setAbandonFrozen(Integer abandonFrozen)
    {
        this.abandonFrozen = abandonFrozen;
    }

    // preMargin

    public Double getPreMargin()
    {
        return preMargin;
    }

    public void setPreMargin(Double preMargin)
    {
        this.preMargin = preMargin;
    }

    // rspcode

    public String getRspcode()
    {
        return rspcode;
    }

    public void setRspcode(String rspcode)
    {
        this.rspcode = rspcode;
    }

    // rspmsg

    public ByteString getRspmsg()
    {
        return rspmsg;
    }

    public void setRspmsg(ByteString rspmsg)
    {
        this.rspmsg = rspmsg;
    }

    // bLast

    public Integer getBLast()
    {
        return bLast;
    }

    public void setBLast(Integer bLast)
    {
        this.bLast = bLast;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, SCHEMA);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, SCHEMA);
    }

    // message method

    public Schema<TRADE_RSP_QUERY_POSITION> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<TRADE_RSP_QUERY_POSITION> SCHEMA = new Schema<TRADE_RSP_QUERY_POSITION>()
    {
        // schema methods

        public TRADE_RSP_QUERY_POSITION newMessage()
        {
            return new TRADE_RSP_QUERY_POSITION();
        }

        public Class<TRADE_RSP_QUERY_POSITION> typeClass()
        {
            return TRADE_RSP_QUERY_POSITION.class;
        }

        public String messageName()
        {
            return TRADE_RSP_QUERY_POSITION.class.getSimpleName();
        }

        public String messageFullName()
        {
            return TRADE_RSP_QUERY_POSITION.class.getName();
        }

        public boolean isInitialized(TRADE_RSP_QUERY_POSITION message)
        {
            return 
                message.instrumentID != null 
                && message.brokerID != null 
                && message.investorID != null 
                && message.posiDirection != null 
                && message.hedgeFlag != null 
                && message.ydPosition != null 
                && message.position != null 
                && message.longFrozen != null 
                && message.shortFrozen != null 
                && message.longFrozenAmount != null 
                && message.shortFrozenAmount != null 
                && message.openVolume != null 
                && message.closeVolume != null 
                && message.rspcode != null 
                && message.rspmsg != null 
                && message.bLast != null;
        }

        public void mergeFrom(Input input, TRADE_RSP_QUERY_POSITION message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.instrumentID = input.readString();
                        break;
                    case 2:
                        message.brokerID = input.readString();
                        break;
                    case 3:
                        message.investorID = input.readString();
                        break;
                    case 4:
                        message.posiDirection = input.readInt32();
                        break;
                    case 5:
                        message.hedgeFlag = input.readInt32();
                        break;
                    case 6:
                        message.positionDate = input.readInt32();
                        break;
                    case 7:
                        message.ydPosition = input.readInt32();
                        break;
                    case 8:
                        message.position = input.readInt32();
                        break;
                    case 9:
                        message.longFrozen = input.readInt32();
                        break;
                    case 10:
                        message.shortFrozen = input.readInt32();
                        break;
                    case 11:
                        message.longFrozenAmount = input.readDouble();
                        break;
                    case 12:
                        message.shortFrozenAmount = input.readDouble();
                        break;
                    case 13:
                        message.openVolume = input.readInt32();
                        break;
                    case 14:
                        message.closeVolume = input.readInt32();
                        break;
                    case 15:
                        message.openAmount = input.readDouble();
                        break;
                    case 16:
                        message.closeAmount = input.readDouble();
                        break;
                    case 17:
                        message.positionCost = input.readDouble();
                        break;
                    case 18:
                        message.useMargin = input.readDouble();
                        break;
                    case 19:
                        message.frozenMargin = input.readDouble();
                        break;
                    case 20:
                        message.frozenCash = input.readDouble();
                        break;
                    case 21:
                        message.frozenCommission = input.readDouble();
                        break;
                    case 22:
                        message.cashIn = input.readDouble();
                        break;
                    case 23:
                        message.commission = input.readDouble();
                        break;
                    case 24:
                        message.closeProfit = input.readDouble();
                        break;
                    case 25:
                        message.positionProfit = input.readDouble();
                        break;
                    case 26:
                        message.preSettlementPrice = input.readDouble();
                        break;
                    case 27:
                        message.settlementPrice = input.readDouble();
                        break;
                    case 28:
                        message.tradingDay = input.readString();
                        break;
                    case 29:
                        message.settlementID = input.readInt32();
                        break;
                    case 30:
                        message.openCost = input.readDouble();
                        break;
                    case 31:
                        message.exchangeMargin = input.readDouble();
                        break;
                    case 32:
                        message.combPosition = input.readInt32();
                        break;
                    case 33:
                        message.combLongFrozen = input.readInt32();
                        break;
                    case 34:
                        message.combShortFrozen = input.readInt32();
                        break;
                    case 35:
                        message.closeProfitByDate = input.readDouble();
                        break;
                    case 36:
                        message.closeProfitByTrade = input.readDouble();
                        break;
                    case 37:
                        message.todayPosition = input.readInt32();
                        break;
                    case 38:
                        message.marginRateByMoney = input.readDouble();
                        break;
                    case 39:
                        message.marginRateByVolume = input.readDouble();
                        break;
                    case 40:
                        message.strikeFrozen = input.readInt32();
                        break;
                    case 41:
                        message.strikeFrozenAmount = input.readDouble();
                        break;
                    case 42:
                        message.abandonFrozen = input.readInt32();
                        break;
                    case 43:
                        message.preMargin = input.readDouble();
                        break;
                    case 44:
                        message.rspcode = input.readString();
                        break;
                    case 45:
                        message.rspmsg = input.readBytes();
                        break;
                    case 46:
                        message.bLast = input.readInt32();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, TRADE_RSP_QUERY_POSITION message) throws IOException
        {
            if(message.instrumentID == null)
                throw new UninitializedMessageException(message);
            output.writeString(1, message.instrumentID, false);

            if(message.brokerID == null)
                throw new UninitializedMessageException(message);
            output.writeString(2, message.brokerID, false);

            if(message.investorID == null)
                throw new UninitializedMessageException(message);
            output.writeString(3, message.investorID, false);

            if(message.posiDirection == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(4, message.posiDirection, false);

            if(message.hedgeFlag == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(5, message.hedgeFlag, false);

            if(message.positionDate != null)
                output.writeInt32(6, message.positionDate, false);

            if(message.ydPosition == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(7, message.ydPosition, false);

            if(message.position == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(8, message.position, false);

            if(message.longFrozen == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(9, message.longFrozen, false);

            if(message.shortFrozen == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(10, message.shortFrozen, false);

            if(message.longFrozenAmount == null)
                throw new UninitializedMessageException(message);
            output.writeDouble(11, message.longFrozenAmount, false);

            if(message.shortFrozenAmount == null)
                throw new UninitializedMessageException(message);
            output.writeDouble(12, message.shortFrozenAmount, false);

            if(message.openVolume == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(13, message.openVolume, false);

            if(message.closeVolume == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(14, message.closeVolume, false);

            if(message.openAmount != null)
                output.writeDouble(15, message.openAmount, false);

            if(message.closeAmount != null)
                output.writeDouble(16, message.closeAmount, false);

            if(message.positionCost != null)
                output.writeDouble(17, message.positionCost, false);

            if(message.useMargin != null)
                output.writeDouble(18, message.useMargin, false);

            if(message.frozenMargin != null)
                output.writeDouble(19, message.frozenMargin, false);

            if(message.frozenCash != null)
                output.writeDouble(20, message.frozenCash, false);

            if(message.frozenCommission != null)
                output.writeDouble(21, message.frozenCommission, false);

            if(message.cashIn != null)
                output.writeDouble(22, message.cashIn, false);

            if(message.commission != null)
                output.writeDouble(23, message.commission, false);

            if(message.closeProfit != null)
                output.writeDouble(24, message.closeProfit, false);

            if(message.positionProfit != null)
                output.writeDouble(25, message.positionProfit, false);

            if(message.preSettlementPrice != null)
                output.writeDouble(26, message.preSettlementPrice, false);

            if(message.settlementPrice != null)
                output.writeDouble(27, message.settlementPrice, false);

            if(message.tradingDay != null)
                output.writeString(28, message.tradingDay, false);

            if(message.settlementID != null)
                output.writeInt32(29, message.settlementID, false);

            if(message.openCost != null)
                output.writeDouble(30, message.openCost, false);

            if(message.exchangeMargin != null)
                output.writeDouble(31, message.exchangeMargin, false);

            if(message.combPosition != null)
                output.writeInt32(32, message.combPosition, false);

            if(message.combLongFrozen != null)
                output.writeInt32(33, message.combLongFrozen, false);

            if(message.combShortFrozen != null)
                output.writeInt32(34, message.combShortFrozen, false);

            if(message.closeProfitByDate != null)
                output.writeDouble(35, message.closeProfitByDate, false);

            if(message.closeProfitByTrade != null)
                output.writeDouble(36, message.closeProfitByTrade, false);

            if(message.todayPosition != null)
                output.writeInt32(37, message.todayPosition, false);

            if(message.marginRateByMoney != null)
                output.writeDouble(38, message.marginRateByMoney, false);

            if(message.marginRateByVolume != null)
                output.writeDouble(39, message.marginRateByVolume, false);

            if(message.strikeFrozen != null)
                output.writeInt32(40, message.strikeFrozen, false);

            if(message.strikeFrozenAmount != null)
                output.writeDouble(41, message.strikeFrozenAmount, false);

            if(message.abandonFrozen != null)
                output.writeInt32(42, message.abandonFrozen, false);

            if(message.preMargin != null)
                output.writeDouble(43, message.preMargin, false);

            if(message.rspcode == null)
                throw new UninitializedMessageException(message);
            output.writeString(44, message.rspcode, false);

            if(message.rspmsg == null)
                throw new UninitializedMessageException(message);
            output.writeBytes(45, message.rspmsg, false);

            if(message.bLast == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(46, message.bLast, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "instrumentID";
                case 2: return "brokerID";
                case 3: return "investorID";
                case 4: return "posiDirection";
                case 5: return "hedgeFlag";
                case 6: return "positionDate";
                case 7: return "ydPosition";
                case 8: return "position";
                case 9: return "longFrozen";
                case 10: return "shortFrozen";
                case 11: return "longFrozenAmount";
                case 12: return "shortFrozenAmount";
                case 13: return "openVolume";
                case 14: return "closeVolume";
                case 15: return "openAmount";
                case 16: return "closeAmount";
                case 17: return "positionCost";
                case 18: return "useMargin";
                case 19: return "frozenMargin";
                case 20: return "frozenCash";
                case 21: return "frozenCommission";
                case 22: return "cashIn";
                case 23: return "commission";
                case 24: return "closeProfit";
                case 25: return "positionProfit";
                case 26: return "preSettlementPrice";
                case 27: return "settlementPrice";
                case 28: return "tradingDay";
                case 29: return "settlementID";
                case 30: return "openCost";
                case 31: return "exchangeMargin";
                case 32: return "combPosition";
                case 33: return "combLongFrozen";
                case 34: return "combShortFrozen";
                case 35: return "closeProfitByDate";
                case 36: return "closeProfitByTrade";
                case 37: return "todayPosition";
                case 38: return "marginRateByMoney";
                case 39: return "marginRateByVolume";
                case 40: return "strikeFrozen";
                case 41: return "strikeFrozenAmount";
                case 42: return "abandonFrozen";
                case 43: return "preMargin";
                case 44: return "rspcode";
                case 45: return "rspmsg";
                case 46: return "bLast";
                default: return null;
            }
        }

        public int getFieldNumber(String name)
        {
            final Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }

        final java.util.HashMap<String,Integer> fieldMap = new java.util.HashMap<String,Integer>();
        {
            fieldMap.put("instrumentID", 1);
            fieldMap.put("brokerID", 2);
            fieldMap.put("investorID", 3);
            fieldMap.put("posiDirection", 4);
            fieldMap.put("hedgeFlag", 5);
            fieldMap.put("positionDate", 6);
            fieldMap.put("ydPosition", 7);
            fieldMap.put("position", 8);
            fieldMap.put("longFrozen", 9);
            fieldMap.put("shortFrozen", 10);
            fieldMap.put("longFrozenAmount", 11);
            fieldMap.put("shortFrozenAmount", 12);
            fieldMap.put("openVolume", 13);
            fieldMap.put("closeVolume", 14);
            fieldMap.put("openAmount", 15);
            fieldMap.put("closeAmount", 16);
            fieldMap.put("positionCost", 17);
            fieldMap.put("useMargin", 18);
            fieldMap.put("frozenMargin", 19);
            fieldMap.put("frozenCash", 20);
            fieldMap.put("frozenCommission", 21);
            fieldMap.put("cashIn", 22);
            fieldMap.put("commission", 23);
            fieldMap.put("closeProfit", 24);
            fieldMap.put("positionProfit", 25);
            fieldMap.put("preSettlementPrice", 26);
            fieldMap.put("settlementPrice", 27);
            fieldMap.put("tradingDay", 28);
            fieldMap.put("settlementID", 29);
            fieldMap.put("openCost", 30);
            fieldMap.put("exchangeMargin", 31);
            fieldMap.put("combPosition", 32);
            fieldMap.put("combLongFrozen", 33);
            fieldMap.put("combShortFrozen", 34);
            fieldMap.put("closeProfitByDate", 35);
            fieldMap.put("closeProfitByTrade", 36);
            fieldMap.put("todayPosition", 37);
            fieldMap.put("marginRateByMoney", 38);
            fieldMap.put("marginRateByVolume", 39);
            fieldMap.put("strikeFrozen", 40);
            fieldMap.put("strikeFrozenAmount", 41);
            fieldMap.put("abandonFrozen", 42);
            fieldMap.put("preMargin", 43);
            fieldMap.put("rspcode", 44);
            fieldMap.put("rspmsg", 45);
            fieldMap.put("bLast", 46);
        }
    };
    
}
