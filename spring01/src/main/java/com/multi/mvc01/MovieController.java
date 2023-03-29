package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
@RequestMapping("movie")
public String movie(String movie) {
	System.out.println("브라우저로부터 잔달받은 값은 "+ movie);
	
	if (movie.equals("drama")) {
		return "drama";
	}
	else if (movie.equals("comic")) {
		return "comic";
	}
	else {
		return "action";
	}
}
}