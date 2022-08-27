package com.cch.provider.reader;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

@Provider
@Consumes(MediaType.APPLICATION_XML)
public class JAXBMessageReader implements MessageBodyReader<Object>{

	@Override
	public boolean isReadable(Class<?> classType, Type classOrEnum, Annotation[] annotations, MediaType inputMediaType) {
		if(classType.isAnnotationPresent(XmlRootElement.class)){
			return true;
		}
		return false;
	}

	@Override
	public Object readFrom(Class<Object> classType, Type classOrEnum, Annotation[] annotation, MediaType inputMediaType,
			MultivaluedMap<String, String> map, InputStream in) throws IOException, WebApplicationException {
		
		JAXBContext jContext= null;
		Unmarshaller unmarshaller= null;
		Object obj= null;
		
		try {
			System.out.println("readFrom");
			jContext= JAXBContext.newInstance(classType);
			unmarshaller=jContext.createUnmarshaller();
			obj=unmarshaller.unmarshal(in);
			
		} catch (JAXBException e) {
			throw new WebApplicationException(e);
		}
		return obj;
	}
}
