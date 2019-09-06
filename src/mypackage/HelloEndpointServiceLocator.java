/**
 * HelloEndpointServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class HelloEndpointServiceLocator extends org.apache.axis.client.Service implements mypackage.HelloEndpointService {

    public HelloEndpointServiceLocator() {
    }


    public HelloEndpointServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloEndpointServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloEndpointPort
    private java.lang.String HelloEndpointPort_address = "http://www.learnwebservices.com/services/hello";

    public java.lang.String getHelloEndpointPortAddress() {
        return HelloEndpointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloEndpointPortWSDDServiceName = "HelloEndpointPort";

    public java.lang.String getHelloEndpointPortWSDDServiceName() {
        return HelloEndpointPortWSDDServiceName;
    }

    public void setHelloEndpointPortWSDDServiceName(java.lang.String name) {
        HelloEndpointPortWSDDServiceName = name;
    }

    public mypackage.HelloEndpoint getHelloEndpointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloEndpointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloEndpointPort(endpoint);
    }

    public mypackage.HelloEndpoint getHelloEndpointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.HelloEndpointServiceSoapBindingStub _stub = new mypackage.HelloEndpointServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloEndpointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloEndpointPortEndpointAddress(java.lang.String address) {
        HelloEndpointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.HelloEndpoint.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.HelloEndpointServiceSoapBindingStub _stub = new mypackage.HelloEndpointServiceSoapBindingStub(new java.net.URL(HelloEndpointPort_address), this);
                _stub.setPortName(getHelloEndpointPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloEndpointPort".equals(inputPortName)) {
            return getHelloEndpointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://learnwebservices.com/services/hello", "HelloEndpointService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://learnwebservices.com/services/hello", "HelloEndpointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloEndpointPort".equals(portName)) {
            setHelloEndpointPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
