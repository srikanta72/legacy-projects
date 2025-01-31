// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package in.co.irctc.web.provider;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class Ticket_SOAPBuilder implements SOAPInstanceBuilder {
    private in.co.irctc.web.provider.Ticket _instance;
    private long pnr;
    private java.lang.String seatNo;
    private int trainNumber;
    private static final int myPNR_INDEX = 0;
    private static final int mySEATNO_INDEX = 1;
    private static final int myTRAINNUMBER_INDEX = 2;
    
    public Ticket_SOAPBuilder() {
    }
    
    public void setPnr(long pnr) {
        this.pnr = pnr;
    }
    
    public void setSeatNo(java.lang.String seatNo) {
        this.seatNo = seatNo;
    }
    
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case mySEATNO_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public void construct() {
    }
    
    public void setMember(int index, java.lang.Object memberValue) {
        try {
            switch(index) {
                case mySEATNO_INDEX:
                    _instance.setSeatNo((java.lang.String)memberValue);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        catch (java.lang.RuntimeException e) {
            throw e;
        }
        catch (java.lang.Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        }
    }
    
    public void initialize() {
    }
    
    public void setInstance(java.lang.Object instance) {
        _instance = (in.co.irctc.web.provider.Ticket)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
