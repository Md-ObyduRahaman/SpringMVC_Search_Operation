package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		System.out.println(userName);
		System.out.println(userId);
		Integer.parseInt(userName);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		String str = null;
		System.out.println(str.length());
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

	// Handling exception in our MVC
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandelerNull(Model model) {
		model.addAttribute("msg", "null pointer exception occour");
		return "null_page";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandelerFormat(Model model) {
		model.addAttribute("msg", "Number format exception occour");
		return "null_page";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandelerGenric(Model model) {
		model.addAttribute("msg", "Exception occour");
		return "null_page";
	}

}
