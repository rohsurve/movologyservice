/**
 * 
 */
package com.services;

import javax.ws.rs.FormParam;
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


	@POST
	public Response testPost(@FormParam("q") String q, @FormParam("puzzle") String puzzle) {
		String out = "HELLO" + q + puzzle;
		return Response.status(200).entity("OK").build();
	}

	@GET
	public Response answerQns(@QueryParam("q") String question) {
		String ans = "No answer for this question!!";

		if ("What is your full name?".equalsIgnoreCase(question)) {
			ans = "Rohit Surve";
		}
		if ("What is you email address?".equalsIgnoreCase(question)) {
			ans = "rohsurve@iu.edu";
		}
		if ("Please provide a phone number we can use to reach you?".equalsIgnoreCase(question)) {
			ans = "8123498667";
		}
		if ("Which position at Mov-ology are you applying for?".equalsIgnoreCase(question)) {
			ans = "Sr.Software Engineer";

		}
		if ("How many years of software development experience do you have?".equalsIgnoreCase(question)) {
			ans = "7 years";

		}
		if ("Please provide a URL where we can download your resume and cover letter.".equalsIgnoreCase(question)) {
			ans = "rohitsurve.strikingly.com";

		}
		if ("Which position at Mov-ology are you applying for?".equalsIgnoreCase(question)) {
			ans = "Sr.Software Engineer";

		}
		if ("How many years of software development experience do you have?".equalsIgnoreCase(question)) {
			ans = "7 years";

		}
		if ("Please provide a URL where we can download the source code of your resume submission web service."
				.equalsIgnoreCase(question)) {
			ans = "https://github.com/rohsurve/movologyservice";
		}
		if ("Can you provide proof of eligibility to work in the US?".equalsIgnoreCase(question)) {
			ans = "Yes";

		}
		if ("Please solve this puzzle: 588+169/966".equalsIgnoreCase(question)) {
			ans = "0.783";
		}

		return Response.status(200).entity(ans).build();

	}

}
