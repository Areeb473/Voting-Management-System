/**
 * VoterService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface VoterService extends javax.xml.rpc.Service {
    public java.lang.String getVoterAddress();

    public main.Voter getVoter() throws javax.xml.rpc.ServiceException;

    public main.Voter getVoter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
