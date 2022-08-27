package com.ch.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.StreamingOutput;

@Path("/safari")
public class SafariBookStore {

	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/book-info")
	public String addBookInfo(InputStream in) throws IOException {
		int c;
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		while ((c = in.read()) != -1) {
			buffer.append((char) c);
		}
		return buffer.toString();
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@Path("author-info/{name}")
	public byte[] addAuthorInfo(@PathParam("name") String name, @QueryParam("contact-info") String cintactInfo,
			byte[] description) {
		StringBuilder builder = null;

		builder = new StringBuilder();
		for (byte b : description) {
			builder.append((char) b);
		}
		builder.append("\n").append("\t").append("<name>").append(name).append("</name>").append("<contact-info>")
				.append(cintactInfo).append("</contact-info>");

		return builder.toString().getBytes();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@Path("/book/description/{isbn}")
	public StreamingOutput updateBookDescription(@PathParam("isbn") String isbn, Reader newDescription)
			throws IOException {
		int c;
		StringBuffer buffer = null;
		buffer = new StringBuffer();

		while ((c = newDescription.read()) != -1) {
			buffer.append((char) c);
		}
		buffer.append("isbn : ").append(isbn);
		return new BookStreamingOutput(buffer.toString());
	}

	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/book/uload-mine")
	public StreamingOutput uploadBook(File bookAsFile) throws IOException {
		try (InputStream input = new FileInputStream(bookAsFile)) {
			int c;
			StringBuffer buffer= null;
			
			buffer= new StringBuffer();
			while((c=input.read())!=-1) {
				buffer.append((char)c);
			}
			buffer.append("Uploaded file");
			return new BookStreamingOutput(buffer.toString());
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces("text/plain")
	@Path("/book/form")
	public String addBookData(MultivaluedMap<String, String> formData) {
		StringBuffer buffer= null;
		buffer= new StringBuffer();
		for(String key : formData.keySet()) {
			buffer.append(key).append(" : ").append(formData.get(key));
		}
		return buffer.toString();
	}
	
	@GET
	@Produces(MediaType.MULTIPART_FORM_DATA)
	@Path("/book/download/{isbn}")
	public File downloadBook(@PathParam("isbn") String isbn) {
		File file= new File("G:\\Archive\\bju.docx");
		return file;
	}
	
	private class BookStreamingOutput implements StreamingOutput {
		String buffer = null;

		public BookStreamingOutput(String buffer) {
			this.buffer = buffer;
		}

		@Override
		public void write(OutputStream os) throws IOException, WebApplicationException {
			os.write(buffer.toString().getBytes());
		}
	}

}
