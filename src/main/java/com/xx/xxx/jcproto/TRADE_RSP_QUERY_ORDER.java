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

public final class TRADE_RSP_QUERY_ORDER implements Externalizable, Message<TRADE_RSP_QUERY_ORDER>
{

    public static Schema<TRADE_RSP_QUERY_ORDER> getSchema()
    {
        return SCHEMA;
    }

    public static TRADE_RSP_QUERY_ORDER getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final TRADE_RSP_QUERY_ORDER DEFAULT_INSTANCE = new TRADE_RSP_QUERY_ORDER();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String brokerID;
    String investorID;
    String instrumentID;
    String orderRef;
    String userID;
    Integer orderPriceType;
    Integer direction;
    String combOffsetFlag;
    String combHedgeFlag;
    Double limitPrice;
    Integer volumeTotalOriginal;
    Integer timeCondition;
    String gTDDate;
    Integer volumeCondition;
    Integer minVolume;
    Integer contingentCondition;
    Double stopPrice;
    Integer forceCloseReason;
    Integer isAutoSuspend;
    String businessUnit;
    Integer requestID;
    String orderLocalID;
    String exchangeID;
    String participantID;
    String clientID;
    String exchangeInstID;
    String traderID;
    Integer installID;
    Integer orderSubmitStatus;
    Integer notifySequence;
    String tradingDay;
    Integer settlementID;
    String orderSysID;
    Integer orderSource;
    Integer orderStatus;
    Integer orderType;
    Integer volumeTraded;
    Integer volumeTotal;
    String insertDate;
    String insertTime;
    String activeTime;
    String suspendTime;
    String updateTime;
    String cancelTime;
    String activeTraderID;
    String clearingPartID;
    Integer sequenceNo;
    Integer frontID;
    Integer sessionID;
    String userProductInfo;
    String statusMsg;
    Integer userForceClose;
    String activeUserID;
    Integer brokerOrderSeq;
    String relativeOrderSysID;
    Integer zCETotalTradedVolume;
    Integer isSwapOrder;
    String rspcode;
    ByteString rspmsg;
    Integer bLast;

    public TRADE_RSP_QUERY_ORDER()
    {
        
    }

    public TRADE_RSP_QUERY_ORDER(
        String brokerID,
        String investorID,
        String instrumentID,
        String orderRef,
        String userID,
        Integer direction,
        String combOffsetFlag,
        Integer requestID,
        String orderLocalID,
        String exchangeID,
        Integer orderSubmitStatus,
        Integer notifySequence,
        String tradingDay,
        String orderSysID,
        String rspcode,
        ByteString rspmsg,
        Integer bLast
    )
    {
        this.brokerID = brokerID;
        this.investorID = investorID;
        this.instrumentID = instrumentID;
        this.orderRef = orderRef;
        this.userID = userID;
        this.direction = direction;
        this.combOffsetFlag = combOffsetFlag;
        this.requestID = requestID;
        this.orderLocalID = orderLocalID;
        this.exchangeID = exchangeID;
        this.orderSubmitStatus = orderSubmitStatus;
        this.notifySequence = notifySequence;
        this.tradingDay = tradingDay;
        this.orderSysID = orderSysID;
        this.rspcode = rspcode;
        this.rspmsg = rspmsg;
        this.bLast = bLast;
    }

    // getters and setters

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

    // instrumentID

    public String getInstrumentID()
    {
        return instrumentID;
    }

    public void setInstrumentID(String instrumentID)
    {
        this.instrumentID = instrumentID;
    }

    // orderRef

    public String getOrderRef()
    {
        return orderRef;
    }

    public void setOrderRef(String orderRef)
    {
        this.orderRef = orderRef;
    }

    // userID

    public String getUserID()
    {
        return userID;
    }

    public void setUserID(String userID)
    {
        this.userID = userID;
    }

    // orderPriceType

    public Integer getOrderPriceType()
    {
        return orderPriceType;
    }

    public void setOrderPriceType(Integer orderPriceType)
    {
        this.orderPriceType = orderPriceType;
    }

    // direction

    public Integer getDirection()
    {
        return direction;
    }

    public void setDirection(Integer direction)
    {
        this.direction = direction;
    }

    // combOffsetFlag

    public String getCombOffsetFlag()
    {
        return combOffsetFlag;
    }

    public void setCombOffsetFlag(String combOffsetFlag)
    {
        this.combOffsetFlag = combOffsetFlag;
    }

    // combHedgeFlag

    public String getCombHedgeFlag()
    {
        return combHedgeFlag;
    }

    public void setCombHedgeFlag(String combHedgeFlag)
    {
        this.combHedgeFlag = combHedgeFlag;
    }

    // limitPrice

    public Double getLimitPrice()
    {
        return limitPrice;
    }

    public void setLimitPrice(Double limitPrice)
    {
        this.limitPrice = limitPrice;
    }

    // volumeTotalOriginal

    public Integer getVolumeTotalOriginal()
    {
        return volumeTotalOriginal;
    }

    public void setVolumeTotalOriginal(Integer volumeTotalOriginal)
    {
        this.volumeTotalOriginal = volumeTotalOriginal;
    }

    // timeCondition

    public Integer getTimeCondition()
    {
        return timeCondition;
    }

    public void setTimeCondition(Integer timeCondition)
    {
        this.timeCondition = timeCondition;
    }

    // gTDDate

    public String getGTDDate()
    {
        return gTDDate;
    }

    public void setGTDDate(String gTDDate)
    {
        this.gTDDate = gTDDate;
    }

    // volumeCondition

    public Integer getVolumeCondition()
    {
        return volumeCondition;
    }

    public void setVolumeCondition(Integer volumeCondition)
    {
        this.volumeCondition = volumeCondition;
    }

    // minVolume

    public Integer getMinVolume()
    {
        return minVolume;
    }

    public void setMinVolume(Integer minVolume)
    {
        this.minVolume = minVolume;
    }

    // contingentCondition

    public Integer getContingentCondition()
    {
        return contingentCondition;
    }

    public void setContingentCondition(Integer contingentCondition)
    {
        this.contingentCondition = contingentCondition;
    }

    // stopPrice

    public Double getStopPrice()
    {
        return stopPrice;
    }

    public void setStopPrice(Double stopPrice)
    {
        this.stopPrice = stopPrice;
    }

    // forceCloseReason

    public Integer getForceCloseReason()
    {
        return forceCloseReason;
    }

    public void setForceCloseReason(Integer forceCloseReason)
    {
        this.forceCloseReason = forceCloseReason;
    }

    // isAutoSuspend

    public Integer getIsAutoSuspend()
    {
        return isAutoSuspend;
    }

    public void setIsAutoSuspend(Integer isAutoSuspend)
    {
        this.isAutoSuspend = isAutoSuspend;
    }

    // businessUnit

    public String getBusinessUnit()
    {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit)
    {
        this.businessUnit = businessUnit;
    }

    // requestID

    public Integer getRequestID()
    {
        return requestID;
    }

    public void setRequestID(Integer requestID)
    {
        this.requestID = requestID;
    }

    // orderLocalID

    public String getOrderLocalID()
    {
        return orderLocalID;
    }

    public void setOrderLocalID(String orderLocalID)
    {
        this.orderLocalID = orderLocalID;
    }

    // exchangeID

    public String getExchangeID()
    {
        return exchangeID;
    }

    public void setExchangeID(String exchangeID)
    {
        this.exchangeID = exchangeID;
    }

    // participantID

    public String getParticipantID()
    {
        return participantID;
    }

    public void setParticipantID(String participantID)
    {
        this.participantID = participantID;
    }

    // clientID

    public String getClientID()
    {
        return clientID;
    }

    public void setClientID(String clientID)
    {
        this.clientID = clientID;
    }

    // exchangeInstID

    public String getExchangeInstID()
    {
        return exchangeInstID;
    }

    public void setExchangeInstID(String exchangeInstID)
    {
        this.exchangeInstID = exchangeInstID;
    }

    // traderID

    public String getTraderID()
    {
        return traderID;
    }

    public void setTraderID(String traderID)
    {
        this.traderID = traderID;
    }

    // installID

    public Integer getInstallID()
    {
        return installID;
    }

    public void setInstallID(Integer installID)
    {
        this.installID = installID;
    }

    // orderSubmitStatus

    public Integer getOrderSubmitStatus()
    {
        return orderSubmitStatus;
    }

    public void setOrderSubmitStatus(Integer orderSubmitStatus)
    {
        this.orderSubmitStatus = orderSubmitStatus;
    }

    // notifySequence

    public Integer getNotifySequence()
    {
        return notifySequence;
    }

    public void setNotifySequence(Integer notifySequence)
    {
        this.notifySequence = notifySequence;
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

    // orderSysID

    public String getOrderSysID()
    {
        return orderSysID;
    }

    public void setOrderSysID(String orderSysID)
    {
        this.orderSysID = orderSysID;
    }

    // orderSource

    public Integer getOrderSource()
    {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource)
    {
        this.orderSource = orderSource;
    }

    // orderStatus

    public Integer getOrderStatus()
    {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus)
    {
        this.orderStatus = orderStatus;
    }

    // orderType

    public Integer getOrderType()
    {
        return orderType;
    }

    public void setOrderType(Integer orderType)
    {
        this.orderType = orderType;
    }

    // volumeTraded

    public Integer getVolumeTraded()
    {
        return volumeTraded;
    }

    public void setVolumeTraded(Integer volumeTraded)
    {
        this.volumeTraded = volumeTraded;
    }

    // volumeTotal

    public Integer getVolumeTotal()
    {
        return volumeTotal;
    }

    public void setVolumeTotal(Integer volumeTotal)
    {
        this.volumeTotal = volumeTotal;
    }

    // insertDate

    public String getInsertDate()
    {
        return insertDate;
    }

    public void setInsertDate(String insertDate)
    {
        this.insertDate = insertDate;
    }

    // insertTime

    public String getInsertTime()
    {
        return insertTime;
    }

    public void setInsertTime(String insertTime)
    {
        this.insertTime = insertTime;
    }

    // activeTime

    public String getActiveTime()
    {
        return activeTime;
    }

    public void setActiveTime(String activeTime)
    {
        this.activeTime = activeTime;
    }

    // suspendTime

    public String getSuspendTime()
    {
        return suspendTime;
    }

    public void setSuspendTime(String suspendTime)
    {
        this.suspendTime = suspendTime;
    }

    // updateTime

    public String getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(String updateTime)
    {
        this.updateTime = updateTime;
    }

    // cancelTime

    public String getCancelTime()
    {
        return cancelTime;
    }

    public void setCancelTime(String cancelTime)
    {
        this.cancelTime = cancelTime;
    }

    // activeTraderID

    public String getActiveTraderID()
    {
        return activeTraderID;
    }

    public void setActiveTraderID(String activeTraderID)
    {
        this.activeTraderID = activeTraderID;
    }

    // clearingPartID

    public String getClearingPartID()
    {
        return clearingPartID;
    }

    public void setClearingPartID(String clearingPartID)
    {
        this.clearingPartID = clearingPartID;
    }

    // sequenceNo

    public Integer getSequenceNo()
    {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo)
    {
        this.sequenceNo = sequenceNo;
    }

    // frontID

    public Integer getFrontID()
    {
        return frontID;
    }

    public void setFrontID(Integer frontID)
    {
        this.frontID = frontID;
    }

    // sessionID

    public Integer getSessionID()
    {
        return sessionID;
    }

    public void setSessionID(Integer sessionID)
    {
        this.sessionID = sessionID;
    }

    // userProductInfo

    public String getUserProductInfo()
    {
        return userProductInfo;
    }

    public void setUserProductInfo(String userProductInfo)
    {
        this.userProductInfo = userProductInfo;
    }

    // statusMsg

    public String getStatusMsg()
    {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg)
    {
        this.statusMsg = statusMsg;
    }

    // userForceClose

    public Integer getUserForceClose()
    {
        return userForceClose;
    }

    public void setUserForceClose(Integer userForceClose)
    {
        this.userForceClose = userForceClose;
    }

    // activeUserID

    public String getActiveUserID()
    {
        return activeUserID;
    }

    public void setActiveUserID(String activeUserID)
    {
        this.activeUserID = activeUserID;
    }

    // brokerOrderSeq

    public Integer getBrokerOrderSeq()
    {
        return brokerOrderSeq;
    }

    public void setBrokerOrderSeq(Integer brokerOrderSeq)
    {
        this.brokerOrderSeq = brokerOrderSeq;
    }

    // relativeOrderSysID

    public String getRelativeOrderSysID()
    {
        return relativeOrderSysID;
    }

    public void setRelativeOrderSysID(String relativeOrderSysID)
    {
        this.relativeOrderSysID = relativeOrderSysID;
    }

    // zCETotalTradedVolume

    public Integer getZCETotalTradedVolume()
    {
        return zCETotalTradedVolume;
    }

    public void setZCETotalTradedVolume(Integer zCETotalTradedVolume)
    {
        this.zCETotalTradedVolume = zCETotalTradedVolume;
    }

    // isSwapOrder

    public Integer getIsSwapOrder()
    {
        return isSwapOrder;
    }

    public void setIsSwapOrder(Integer isSwapOrder)
    {
        this.isSwapOrder = isSwapOrder;
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

    public Schema<TRADE_RSP_QUERY_ORDER> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<TRADE_RSP_QUERY_ORDER> SCHEMA = new Schema<TRADE_RSP_QUERY_ORDER>()
    {
        // schema methods

        public TRADE_RSP_QUERY_ORDER newMessage()
        {
            return new TRADE_RSP_QUERY_ORDER();
        }

        public Class<TRADE_RSP_QUERY_ORDER> typeClass()
        {
            return TRADE_RSP_QUERY_ORDER.class;
        }

        public String messageName()
        {
            return TRADE_RSP_QUERY_ORDER.class.getSimpleName();
        }

        public String messageFullName()
        {
            return TRADE_RSP_QUERY_ORDER.class.getName();
        }

        public boolean isInitialized(TRADE_RSP_QUERY_ORDER message)
        {
            return 
                message.brokerID != null 
                && message.investorID != null 
                && message.instrumentID != null 
                && message.orderRef != null 
                && message.userID != null 
                && message.direction != null 
                && message.combOffsetFlag != null 
                && message.requestID != null 
                && message.orderLocalID != null 
                && message.exchangeID != null 
                && message.orderSubmitStatus != null 
                && message.notifySequence != null 
                && message.tradingDay != null 
                && message.orderSysID != null 
                && message.rspcode != null 
                && message.rspmsg != null 
                && message.bLast != null;
        }

        public void mergeFrom(Input input, TRADE_RSP_QUERY_ORDER message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.brokerID = input.readString();
                        break;
                    case 2:
                        message.investorID = input.readString();
                        break;
                    case 3:
                        message.instrumentID = input.readString();
                        break;
                    case 4:
                        message.orderRef = input.readString();
                        break;
                    case 5:
                        message.userID = input.readString();
                        break;
                    case 6:
                        message.orderPriceType = input.readInt32();
                        break;
                    case 7:
                        message.direction = input.readInt32();
                        break;
                    case 8:
                        message.combOffsetFlag = input.readString();
                        break;
                    case 9:
                        message.combHedgeFlag = input.readString();
                        break;
                    case 10:
                        message.limitPrice = input.readDouble();
                        break;
                    case 11:
                        message.volumeTotalOriginal = input.readInt32();
                        break;
                    case 12:
                        message.timeCondition = input.readInt32();
                        break;
                    case 13:
                        message.gTDDate = input.readString();
                        break;
                    case 14:
                        message.volumeCondition = input.readInt32();
                        break;
                    case 15:
                        message.minVolume = input.readInt32();
                        break;
                    case 16:
                        message.contingentCondition = input.readInt32();
                        break;
                    case 17:
                        message.stopPrice = input.readDouble();
                        break;
                    case 18:
                        message.forceCloseReason = input.readInt32();
                        break;
                    case 19:
                        message.isAutoSuspend = input.readInt32();
                        break;
                    case 20:
                        message.businessUnit = input.readString();
                        break;
                    case 21:
                        message.requestID = input.readInt32();
                        break;
                    case 22:
                        message.orderLocalID = input.readString();
                        break;
                    case 23:
                        message.exchangeID = input.readString();
                        break;
                    case 24:
                        message.participantID = input.readString();
                        break;
                    case 25:
                        message.clientID = input.readString();
                        break;
                    case 26:
                        message.exchangeInstID = input.readString();
                        break;
                    case 27:
                        message.traderID = input.readString();
                        break;
                    case 28:
                        message.installID = input.readInt32();
                        break;
                    case 29:
                        message.orderSubmitStatus = input.readInt32();
                        break;
                    case 30:
                        message.notifySequence = input.readInt32();
                        break;
                    case 31:
                        message.tradingDay = input.readString();
                        break;
                    case 32:
                        message.settlementID = input.readInt32();
                        break;
                    case 33:
                        message.orderSysID = input.readString();
                        break;
                    case 34:
                        message.orderSource = input.readInt32();
                        break;
                    case 35:
                        message.orderStatus = input.readInt32();
                        break;
                    case 36:
                        message.orderType = input.readInt32();
                        break;
                    case 37:
                        message.volumeTraded = input.readInt32();
                        break;
                    case 38:
                        message.volumeTotal = input.readInt32();
                        break;
                    case 39:
                        message.insertDate = input.readString();
                        break;
                    case 40:
                        message.insertTime = input.readString();
                        break;
                    case 41:
                        message.activeTime = input.readString();
                        break;
                    case 42:
                        message.suspendTime = input.readString();
                        break;
                    case 43:
                        message.updateTime = input.readString();
                        break;
                    case 44:
                        message.cancelTime = input.readString();
                        break;
                    case 45:
                        message.activeTraderID = input.readString();
                        break;
                    case 46:
                        message.clearingPartID = input.readString();
                        break;
                    case 47:
                        message.sequenceNo = input.readInt32();
                        break;
                    case 48:
                        message.frontID = input.readInt32();
                        break;
                    case 49:
                        message.sessionID = input.readInt32();
                        break;
                    case 50:
                        message.userProductInfo = input.readString();
                        break;
                    case 51:
                        message.statusMsg = input.readString();
                        break;
                    case 52:
                        message.userForceClose = input.readInt32();
                        break;
                    case 53:
                        message.activeUserID = input.readString();
                        break;
                    case 54:
                        message.brokerOrderSeq = input.readInt32();
                        break;
                    case 55:
                        message.relativeOrderSysID = input.readString();
                        break;
                    case 56:
                        message.zCETotalTradedVolume = input.readInt32();
                        break;
                    case 57:
                        message.isSwapOrder = input.readInt32();
                        break;
                    case 58:
                        message.rspcode = input.readString();
                        break;
                    case 59:
                        message.rspmsg = input.readBytes();
                        break;
                    case 60:
                        message.bLast = input.readInt32();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, TRADE_RSP_QUERY_ORDER message) throws IOException
        {
            if(message.brokerID == null)
                throw new UninitializedMessageException(message);
            output.writeString(1, message.brokerID, false);

            if(message.investorID == null)
                throw new UninitializedMessageException(message);
            output.writeString(2, message.investorID, false);

            if(message.instrumentID == null)
                throw new UninitializedMessageException(message);
            output.writeString(3, message.instrumentID, false);

            if(message.orderRef == null)
                throw new UninitializedMessageException(message);
            output.writeString(4, message.orderRef, false);

            if(message.userID == null)
                throw new UninitializedMessageException(message);
            output.writeString(5, message.userID, false);

            if(message.orderPriceType != null)
                output.writeInt32(6, message.orderPriceType, false);

            if(message.direction == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(7, message.direction, false);

            if(message.combOffsetFlag == null)
                throw new UninitializedMessageException(message);
            output.writeString(8, message.combOffsetFlag, false);

            if(message.combHedgeFlag != null)
                output.writeString(9, message.combHedgeFlag, false);

            if(message.limitPrice != null)
                output.writeDouble(10, message.limitPrice, false);

            if(message.volumeTotalOriginal != null)
                output.writeInt32(11, message.volumeTotalOriginal, false);

            if(message.timeCondition != null)
                output.writeInt32(12, message.timeCondition, false);

            if(message.gTDDate != null)
                output.writeString(13, message.gTDDate, false);

            if(message.volumeCondition != null)
                output.writeInt32(14, message.volumeCondition, false);

            if(message.minVolume != null)
                output.writeInt32(15, message.minVolume, false);

            if(message.contingentCondition != null)
                output.writeInt32(16, message.contingentCondition, false);

            if(message.stopPrice != null)
                output.writeDouble(17, message.stopPrice, false);

            if(message.forceCloseReason != null)
                output.writeInt32(18, message.forceCloseReason, false);

            if(message.isAutoSuspend != null)
                output.writeInt32(19, message.isAutoSuspend, false);

            if(message.businessUnit != null)
                output.writeString(20, message.businessUnit, false);

            if(message.requestID == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(21, message.requestID, false);

            if(message.orderLocalID == null)
                throw new UninitializedMessageException(message);
            output.writeString(22, message.orderLocalID, false);

            if(message.exchangeID == null)
                throw new UninitializedMessageException(message);
            output.writeString(23, message.exchangeID, false);

            if(message.participantID != null)
                output.writeString(24, message.participantID, false);

            if(message.clientID != null)
                output.writeString(25, message.clientID, false);

            if(message.exchangeInstID != null)
                output.writeString(26, message.exchangeInstID, false);

            if(message.traderID != null)
                output.writeString(27, message.traderID, false);

            if(message.installID != null)
                output.writeInt32(28, message.installID, false);

            if(message.orderSubmitStatus == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(29, message.orderSubmitStatus, false);

            if(message.notifySequence == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(30, message.notifySequence, false);

            if(message.tradingDay == null)
                throw new UninitializedMessageException(message);
            output.writeString(31, message.tradingDay, false);

            if(message.settlementID != null)
                output.writeInt32(32, message.settlementID, false);

            if(message.orderSysID == null)
                throw new UninitializedMessageException(message);
            output.writeString(33, message.orderSysID, false);

            if(message.orderSource != null)
                output.writeInt32(34, message.orderSource, false);

            if(message.orderStatus != null)
                output.writeInt32(35, message.orderStatus, false);

            if(message.orderType != null)
                output.writeInt32(36, message.orderType, false);

            if(message.volumeTraded != null)
                output.writeInt32(37, message.volumeTraded, false);

            if(message.volumeTotal != null)
                output.writeInt32(38, message.volumeTotal, false);

            if(message.insertDate != null)
                output.writeString(39, message.insertDate, false);

            if(message.insertTime != null)
                output.writeString(40, message.insertTime, false);

            if(message.activeTime != null)
                output.writeString(41, message.activeTime, false);

            if(message.suspendTime != null)
                output.writeString(42, message.suspendTime, false);

            if(message.updateTime != null)
                output.writeString(43, message.updateTime, false);

            if(message.cancelTime != null)
                output.writeString(44, message.cancelTime, false);

            if(message.activeTraderID != null)
                output.writeString(45, message.activeTraderID, false);

            if(message.clearingPartID != null)
                output.writeString(46, message.clearingPartID, false);

            if(message.sequenceNo != null)
                output.writeInt32(47, message.sequenceNo, false);

            if(message.frontID != null)
                output.writeInt32(48, message.frontID, false);

            if(message.sessionID != null)
                output.writeInt32(49, message.sessionID, false);

            if(message.userProductInfo != null)
                output.writeString(50, message.userProductInfo, false);

            if(message.statusMsg != null)
                output.writeString(51, message.statusMsg, false);

            if(message.userForceClose != null)
                output.writeInt32(52, message.userForceClose, false);

            if(message.activeUserID != null)
                output.writeString(53, message.activeUserID, false);

            if(message.brokerOrderSeq != null)
                output.writeInt32(54, message.brokerOrderSeq, false);

            if(message.relativeOrderSysID != null)
                output.writeString(55, message.relativeOrderSysID, false);

            if(message.zCETotalTradedVolume != null)
                output.writeInt32(56, message.zCETotalTradedVolume, false);

            if(message.isSwapOrder != null)
                output.writeInt32(57, message.isSwapOrder, false);

            if(message.rspcode == null)
                throw new UninitializedMessageException(message);
            output.writeString(58, message.rspcode, false);

            if(message.rspmsg == null)
                throw new UninitializedMessageException(message);
            output.writeBytes(59, message.rspmsg, false);

            if(message.bLast == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(60, message.bLast, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "brokerID";
                case 2: return "investorID";
                case 3: return "instrumentID";
                case 4: return "orderRef";
                case 5: return "userID";
                case 6: return "orderPriceType";
                case 7: return "direction";
                case 8: return "combOffsetFlag";
                case 9: return "combHedgeFlag";
                case 10: return "limitPrice";
                case 11: return "volumeTotalOriginal";
                case 12: return "timeCondition";
                case 13: return "gTDDate";
                case 14: return "volumeCondition";
                case 15: return "minVolume";
                case 16: return "contingentCondition";
                case 17: return "stopPrice";
                case 18: return "forceCloseReason";
                case 19: return "isAutoSuspend";
                case 20: return "businessUnit";
                case 21: return "requestID";
                case 22: return "orderLocalID";
                case 23: return "exchangeID";
                case 24: return "participantID";
                case 25: return "clientID";
                case 26: return "exchangeInstID";
                case 27: return "traderID";
                case 28: return "installID";
                case 29: return "orderSubmitStatus";
                case 30: return "notifySequence";
                case 31: return "tradingDay";
                case 32: return "settlementID";
                case 33: return "orderSysID";
                case 34: return "orderSource";
                case 35: return "orderStatus";
                case 36: return "orderType";
                case 37: return "volumeTraded";
                case 38: return "volumeTotal";
                case 39: return "insertDate";
                case 40: return "insertTime";
                case 41: return "activeTime";
                case 42: return "suspendTime";
                case 43: return "updateTime";
                case 44: return "cancelTime";
                case 45: return "activeTraderID";
                case 46: return "clearingPartID";
                case 47: return "sequenceNo";
                case 48: return "frontID";
                case 49: return "sessionID";
                case 50: return "userProductInfo";
                case 51: return "statusMsg";
                case 52: return "userForceClose";
                case 53: return "activeUserID";
                case 54: return "brokerOrderSeq";
                case 55: return "relativeOrderSysID";
                case 56: return "zCETotalTradedVolume";
                case 57: return "isSwapOrder";
                case 58: return "rspcode";
                case 59: return "rspmsg";
                case 60: return "bLast";
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
            fieldMap.put("brokerID", 1);
            fieldMap.put("investorID", 2);
            fieldMap.put("instrumentID", 3);
            fieldMap.put("orderRef", 4);
            fieldMap.put("userID", 5);
            fieldMap.put("orderPriceType", 6);
            fieldMap.put("direction", 7);
            fieldMap.put("combOffsetFlag", 8);
            fieldMap.put("combHedgeFlag", 9);
            fieldMap.put("limitPrice", 10);
            fieldMap.put("volumeTotalOriginal", 11);
            fieldMap.put("timeCondition", 12);
            fieldMap.put("gTDDate", 13);
            fieldMap.put("volumeCondition", 14);
            fieldMap.put("minVolume", 15);
            fieldMap.put("contingentCondition", 16);
            fieldMap.put("stopPrice", 17);
            fieldMap.put("forceCloseReason", 18);
            fieldMap.put("isAutoSuspend", 19);
            fieldMap.put("businessUnit", 20);
            fieldMap.put("requestID", 21);
            fieldMap.put("orderLocalID", 22);
            fieldMap.put("exchangeID", 23);
            fieldMap.put("participantID", 24);
            fieldMap.put("clientID", 25);
            fieldMap.put("exchangeInstID", 26);
            fieldMap.put("traderID", 27);
            fieldMap.put("installID", 28);
            fieldMap.put("orderSubmitStatus", 29);
            fieldMap.put("notifySequence", 30);
            fieldMap.put("tradingDay", 31);
            fieldMap.put("settlementID", 32);
            fieldMap.put("orderSysID", 33);
            fieldMap.put("orderSource", 34);
            fieldMap.put("orderStatus", 35);
            fieldMap.put("orderType", 36);
            fieldMap.put("volumeTraded", 37);
            fieldMap.put("volumeTotal", 38);
            fieldMap.put("insertDate", 39);
            fieldMap.put("insertTime", 40);
            fieldMap.put("activeTime", 41);
            fieldMap.put("suspendTime", 42);
            fieldMap.put("updateTime", 43);
            fieldMap.put("cancelTime", 44);
            fieldMap.put("activeTraderID", 45);
            fieldMap.put("clearingPartID", 46);
            fieldMap.put("sequenceNo", 47);
            fieldMap.put("frontID", 48);
            fieldMap.put("sessionID", 49);
            fieldMap.put("userProductInfo", 50);
            fieldMap.put("statusMsg", 51);
            fieldMap.put("userForceClose", 52);
            fieldMap.put("activeUserID", 53);
            fieldMap.put("brokerOrderSeq", 54);
            fieldMap.put("relativeOrderSysID", 55);
            fieldMap.put("zCETotalTradedVolume", 56);
            fieldMap.put("isSwapOrder", 57);
            fieldMap.put("rspcode", 58);
            fieldMap.put("rspmsg", 59);
            fieldMap.put("bLast", 60);
        }
    };
    
}
