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
 */
@Path("/questionsService")
public class QuestionareService {


	@POST
	public Response testPost(@QueryParam("q") String q, @QueryParam("puzzle") String puzzle) {
		
		String ans = "No answer for this q!!";

		if("['q']['Ping']".equalsIgnoreCase(q)){
			ans = "OK";
		}
		else if ("['q']['Name']".equalsIgnoreCase(q)) {
			ans = "Rohit Surve";
		}
		else if ("['q']['Email']".equalsIgnoreCase(q)) {
			ans = "rohsurve@iu.edu";
		}
		else if ("['q']['Phone']".equalsIgnoreCase(q)) {
			ans = "8123498667";
		}
		else if ("['q']['Position']".equalsIgnoreCase(q)) {
			ans = "Sr.Software Engineer";

		}
		else if ("['q']['Years']".equalsIgnoreCase(q)) {
			ans = "7 years";

		}
		else if ("['q']['Resume']".equalsIgnoreCase(q)) {
			ans = "rohitsurve.strikingly.com";

		}
		else if ("['q']['Referrer']".equalsIgnoreCase(q)) {
			ans = "Indeed.com";

		}
		else if ("['q']['Name']".equalsIgnoreCase(q)) {
			ans = "7 years";

		}
		else if ("['q']['Source']"
				.equalsIgnoreCase(q)) {
			ans = "https://github.com/rohsurve/movologyservice";
		}
		else if ("['q']['Status']".equalsIgnoreCase(q)) {
			ans = "Yes";

		}
		else if ("['q']['Puzzle']".equalsIgnoreCase(q)) {
			
			byte[] decoded = Base64.getDecoder().decode(puzzle);
			System.out.println(new String(decoded));
			
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");  
			Integer result=null;
			try {
				 result = (Integer)engine.eval(new String(decoded));
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ans = result.toString();
		}

		return Response.status(200).entity(ans).build();
		
	}

	@GET
	public Response answerQns() {
		return Response.status(200).entity("Rest Service Works").build();

	}

}
