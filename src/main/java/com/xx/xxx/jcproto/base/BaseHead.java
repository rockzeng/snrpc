// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from base.proto

package com.xx.xxx.jcproto.base;

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

public final class BaseHead implements Externalizable, Message<BaseHead>
{

    public static Schema<BaseHead> getSchema()
    {
        return SCHEMA;
    }

    public static BaseHead getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final BaseHead DEFAULT_INSTANCE = new BaseHead();

    static final Integer DEFAULT_PRIORITY = new Integer(8);
    static final Integer DEFAULT_REPLY_MODE = new Integer(0);
    static final Long DEFAULT_REPLY_ID = new Long(0l);
    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    Long reqID;
    Integer priority = DEFAULT_PRIORITY;
    Integer replyMode = DEFAULT_REPLY_MODE;
    Long replyID = DEFAULT_REPLY_ID;
    String sender;
    String replyTo;
    EnumMsgID msgID;
    ByteString msgData;

    public BaseHead()
    {
        
    }

    public BaseHead(
        Long reqID,
        EnumMsgID msgID
    )
    {
        this.reqID = reqID;
        this.msgID = msgID;
    }

    // getters and setters

    // reqID

    public Long getReqID()
    {
        return reqID;
    }

    public void setReqID(Long reqID)
    {
        this.reqID = reqID;
    }

    // priority

    public Integer getPriority()
    {
        return priority;
    }

    public void setPriority(Integer priority)
    {
        this.priority = priority;
    }

    // replyMode

    public Integer getReplyMode()
    {
        return replyMode;
    }

    public void setReplyMode(Integer replyMode)
    {
        this.replyMode = replyMode;
    }

    // replyID

    public Long getReplyID()
    {
        return replyID;
    }

    public void setReplyID(Long replyID)
    {
        this.replyID = replyID;
    }

    // sender

    public String getSender()
    {
        return sender;
    }

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    // replyTo

    public String getReplyTo()
    {
        return replyTo;
    }

    public void setReplyTo(String replyTo)
    {
        this.replyTo = replyTo;
    }

    // msgID

    public EnumMsgID getMsgID()
    {
        return msgID;
    }

    public void setMsgID(EnumMsgID msgID)
    {
        this.msgID = msgID;
    }

    // msgData

    public ByteString getMsgData()
    {
        return msgData;
    }

    public void setMsgData(ByteString msgData)
    {
        this.msgData = msgData;
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

    public Schema<BaseHead> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<BaseHead> SCHEMA = new Schema<BaseHead>()
    {
        // schema methods

        public BaseHead newMessage()
        {
            return new BaseHead();
        }

        public Class<BaseHead> typeClass()
        {
            return BaseHead.class;
        }

        public String messageName()
        {
            return BaseHead.class.getSimpleName();
        }

        public String messageFullName()
        {
            return BaseHead.class.getName();
        }

        public boolean isInitialized(BaseHead message)
        {
            return 
                message.reqID != null 
                && message.msgID != null;
        }

        public void mergeFrom(Input input, BaseHead message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.reqID = input.readUInt64();
                        break;
                    case 2:
                        message.priority = input.readUInt32();
                        break;
                    case 3:
                        message.replyMode = input.readUInt32();
                        break;
                    case 4:
                        message.replyID = input.readUInt64();
                        break;
                    case 5:
                        message.sender = input.readString();
                        break;
                    case 6:
                        message.replyTo = input.readString();
                        break;
                    case 7:
                        message.msgID = EnumMsgID.valueOf(input.readEnum());
                        break;
                    case 8:
                        message.msgData = input.readBytes();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, BaseHead message) throws IOException
        {
            if(message.reqID == null)
                throw new UninitializedMessageException(message);
            output.writeUInt64(1, message.reqID, false);

            if(message.priority != null && message.priority != DEFAULT_PRIORITY)
                output.writeUInt32(2, message.priority, false);

            if(message.replyMode != null && message.replyMode != DEFAULT_REPLY_MODE)
                output.writeUInt32(3, message.replyMode, false);

            if(message.replyID != null && message.replyID != DEFAULT_REPLY_ID)
                output.writeUInt64(4, message.replyID, false);

            if(message.sender != null)
                output.writeString(5, message.sender, false);

            if(message.replyTo != null)
                output.writeString(6, message.replyTo, false);

            if(message.msgID == null)
                throw new UninitializedMessageException(message);
            output.writeEnum(7, message.msgID.number, false);

            if(message.msgData != null)
                output.writeBytes(8, message.msgData, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "reqID";
                case 2: return "priority";
                case 3: return "replyMode";
                case 4: return "replyID";
                case 5: return "sender";
                case 6: return "replyTo";
                case 7: return "msgID";
                case 8: return "msgData";
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
            fieldMap.put("reqID", 1);
            fieldMap.put("priority", 2);
            fieldMap.put("replyMode", 3);
            fieldMap.put("replyID", 4);
            fieldMap.put("sender", 5);
            fieldMap.put("replyTo", 6);
            fieldMap.put("msgID", 7);
            fieldMap.put("msgData", 8);
        }
    };
    
}
