package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		System.out.println(userName);
		System.out.println(userId);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {

		RedirectView redirectView = new RedirectView();

		if (query.isEmpty()) {
			redirectView.setUrl("home");
			return redirectView;
		}

		String url = "https://google.com/search?q=" + query;
		redirectView.setUrl(url);
		return redirectView;
	}
}
