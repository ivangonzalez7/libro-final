package edu.upc.eetac.dsa.ivangonzalez7.libros.api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import edu.upc.eetac.dsa.ivangonzalez7.libros.api.model.BookError;


public class BookNotFoundException extends WebApplicationException {
	private final static String MESSAGE = "Book not found";

	public BookNotFoundException() {
		super(Response
				.status(Response.Status.NOT_FOUND)
				.entity(new BookError(Response.Status.NOT_FOUND
						.getStatusCode(), MESSAGE))
				.type(MediaType.BOOKS_API_ERROR).build());
	}

}
