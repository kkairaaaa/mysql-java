package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/websocket")
public class MainController {
	@Autowired

	private LogRepository LogRepository;

	@PostMapping(path="/addLog")
	public @ResponseBody String addNewLog (@RequestParam String content) {

		Log n = new Log();
		n.setContent(content);
		LogRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/logs")
	public @ResponseBody Iterable<Log> getAllUsers() {
		return LogRepository.findAll();
	}
}
