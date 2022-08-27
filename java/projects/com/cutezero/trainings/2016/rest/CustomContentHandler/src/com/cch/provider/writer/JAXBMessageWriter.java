package com.cch.provider.writer;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

@Provider
@Produces(MediaType.APPLICATION_XML)
public class JAXBMessageWriter implements MessageBodyWriter<Object>{

	@Override
	public long getSize(Object arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		//if we return -1 JAX-RS runtime automatically calculates the length of the data
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> classType, Type classOrEnum, Annotation[] annotations, MediaType responseMediaType) {
		if(classType.isAnnotationPresent(XmlRootElement.class)) {
			return true;
		}
		return false;
	}

	@Override
	public void writeTo(Object object, Class<?> classType, Type classOrEnum, Annotation[] methodLevelAnnotations, MediaType responseMediaType,
			MultivaluedMap<String, Object> map, OutputStream os) throws IOException, WebApplicationException {

		JAXBContext context= null;
		Marshaller marshaller= null;
		
		try {
		System.out.println("writeTo");
		context= JAXBContext.newInstance(classType);
		marshaller=context.createMarshaller();
		marshaller.marshal(object, os);
		} catch (JAXBException e) {
			throw new WebApplicationException(e);
		}
	}
}
