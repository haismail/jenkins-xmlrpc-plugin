package org.jenkins.plugins.xmlrpcplugin;

import org.apache.ws.commons.util.NamespaceContextImpl;
import org.apache.xmlrpc.common.TypeFactoryImpl;
import org.apache.xmlrpc.common.XmlRpcController;
import org.apache.xmlrpc.common.XmlRpcStreamConfig;
import org.apache.xmlrpc.parser.NullParser;
import org.apache.xmlrpc.parser.TypeParser;
import org.apache.xmlrpc.serializer.NullSerializer;

public class JenkinsXmlRpcTypeFactory extends TypeFactoryImpl {

    public JenkinsXmlRpcTypeFactory(XmlRpcController pController) {
        super(pController);
    }

    @Override
    public TypeParser getParser(XmlRpcStreamConfig pConfig,
            NamespaceContextImpl pContext, String pURI, String pLocalName) {
        if ("".equals(pURI) && NullSerializer.NIL_TAG.equals(pLocalName)) {
            return new NullParser();
        } else {
            return super.getParser(pConfig, pContext, pURI, pLocalName);
        }
    }


}
