//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.24 at 04:39:37 PM CEST 
//


package xpadro.spring.integration.ws.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xpadro.spring.ws.courses.types package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xpadro.spring.ws.courses.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link GetCourseListResponse }
     * 
     */
    public GetCourseListResponse createGetCourseListResponse() {
        return new GetCourseListResponse();
    }

    /**
     * Create an instance of {@link GetCourseListRequest }
     * 
     */
    public GetCourseListRequest createGetCourseListRequest() {
        return new GetCourseListRequest();
    }

    /**
     * Create an instance of {@link GetCourseResponse }
     * 
     */
    public GetCourseResponse createGetCourseResponse() {
        return new GetCourseResponse();
    }

    /**
     * Create an instance of {@link GetCourseRequest }
     * 
     */
    public GetCourseRequest createGetCourseRequest() {
        return new GetCourseRequest();
    }

}
