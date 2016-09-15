/**
 * 
 */
package com.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * @author rohsurve
 *
 */
@Path("/questionsService")
public class QuestionareService {

	@GET
	public Response answerQns(@QueryParam("q") String question) {

		System.out.println(question);
		String answer = "I dont Know!!!";

		return Response.status(200).entity(answer).build();

	}

}
