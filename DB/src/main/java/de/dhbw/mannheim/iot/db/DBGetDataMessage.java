package de.dhbw.mannheim.iot.db;

import de.dhbw.mannheim.iot.communication.Message;

/**
 * This class is a message class for communication between components
 */

public class DBGetDataMessage extends Message
{

    private String requestedData="ERP data";




    /** Default constructor. */
    public DBGetDataMessage(long timeStamp, String requestedData)
    {   super(timeStamp);
        this.requestedData=requestedData;
    }

    /** Get a String representation of this class. */
    public String toString()
    {
        return super.toString()+"\n"+requestedData;
    }
}