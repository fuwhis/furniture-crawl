//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.21 at 08:42:13 PM ICT 
//


package quy.jaxbs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the quy.jaxbs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Room_QNAME = new QName("", "room");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: quy.jaxbs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "room")
    public JAXBElement<RoomType> createRoom(RoomType value) {
        return new JAXBElement<RoomType>(_Room_QNAME, RoomType.class, null, value);
    }

}