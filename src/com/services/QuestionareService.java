/**
 * 
 */
package com.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	public Response testService() {
		String s = "kjkljkljk";
		return Response.status(200).entity(s).build();
	}

	@POST
	public Response testPost(@QueryParam("q") String q, @QueryParam("Ping") String Ping,
			@QueryParam("puzzle") String puzzle) {
		String out = q + Ping + puzzle;
		return Response.status(200).entity(out).build();
	}

	/*
	 * @POST public Response
	 * answerQns(@QueryParam("q") @DefaultValue("No answer")String question) {
	 * String ans = "Please provide Correct question!!";
	 * 
	 * if ("What is your full name?".equalsIgnoreCase(question)) { ans =
	 * "Rohit Surve"; } else if
	 * ("What is you email address?".equalsIgnoreCase(question)) { ans =
	 * "rohsurve@iu.edu"; } else if
	 * ("Please provide a phone number we can use to reach you?"
	 * .equalsIgnoreCase(question)) { ans = "8123498667"; } else if
	 * ("Which position at Mov-ology are you applying for?".equalsIgnoreCase(
	 * question)) { ans = "Sr.Software Engineer";
	 * 
	 * } else if
	 * ("How many years of software development experience do you have?"
	 * .equalsIgnoreCase(question)) { ans = "7 years";
	 * 
	 * } else if
	 * ("Please provide a URL where we can download your resume and cover letter."
	 * .equalsIgnoreCase(question)) { ans = "rohitsurve.strikingly.com";
	 * 
	 * } else if
	 * ("Which position at Mov-ology are you applying for?".equalsIgnoreCase(
	 * question)) { ans = "Sr.Software Engineer";
	 * 
	 * } else if
	 * ("How many years of software development experience do you have?"
	 * .equalsIgnoreCase(question)) { ans = "7 years";
	 * 
	 * } else if
	 * ("Please provide a URL where we can download the source code of your resume submission web service."
	 * .equalsIgnoreCase(question)) { ans =
	 * "https://github.com/rohsurve/movologyservice"; } else if
	 * ("Can you provide proof of eligibility to work in the US?"
	 * .equalsIgnoreCase(question)) { ans = "Yes";
	 * 
	 * } else if ("Please solve this puzzle:".equalsIgnoreCase(question)) { ans
	 * = "Can't answer this as question .Dont know what is the puzzle"; }
	 * 
	 * return Response.status(200).entity(ans).build();
	 * 
	 * }
	 */
}
