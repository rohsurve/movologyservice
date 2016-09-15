/**
 * 
 */
package com.services;

import java.util.Base64;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * @author rohsurve
 * 
 * Service is responsible for returning answers for the input questions.
 *
 */
@Path("/questionsService")
public class QuestionareService {

	/**
	 * Default response
	 * 
	 * @return response
	 */
	@GET
	public Response defaultGet() {
		return Response.status(200).entity("Questionare Rest Service works!!").build();
	}

	/**
	 * Api to get answers for the input question.
	 * 
	 * @param q
	 * @param puzzle
	 * @return response
	 */

	@POST
	public Response answerQns(@QueryParam("q") String q, @QueryParam("puzzle") String puzzle) {

		String ans = "";

		if (Constants.PING.equalsIgnoreCase(q)) {
			ans = "OK";
		} else if (Constants.NAME.equalsIgnoreCase(q)) {
			ans = "Rohit Surve";
		} else if (Constants.EMAIL.equalsIgnoreCase(q)) {
			ans = "rohsurve@iu.edu";
		} else if (Constants.PHONE.equalsIgnoreCase(q)) {
			ans = "8123498667";
		} else if (Constants.POSITION.equalsIgnoreCase(q)) {
			ans = "Sr.Software Engineer";
		} else if (Constants.YEARS.equalsIgnoreCase(q)) {
			ans = "7 years";
		} else if (Constants.RESUME.equalsIgnoreCase(q)) {
			ans = "rohitsurve.strikingly.com";
		} else if (Constants.REFERRER.equalsIgnoreCase(q)) {
			ans = "Indeed.com";
		} else if (Constants.SOURCE.equalsIgnoreCase(q)) {
			ans = "https://github.com/rohsurve/movologyservice";
		} else if (Constants.STATUS.equalsIgnoreCase(q)) {
			ans = "Yes";
		} else if (Constants.PUZZLE.equalsIgnoreCase(q)) {

			byte[] decoded = Base64.getDecoder().decode(puzzle);
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");
			Integer result = null;
			try {
				result = (Integer) engine.eval(new String(decoded));
				ans = result.toString();
			} catch (ScriptException e) {
				return Response.status(500).entity(e.getMessage()).build();
			}
		} else {
			ans = "No answer found !!";
		}

		return Response.status(200).entity(ans).build();

	}

}
