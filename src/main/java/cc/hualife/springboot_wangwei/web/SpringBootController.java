package cc.hualife.springboot_wangwei.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@GetMapping(value="/app/test")
	public void testController() {
		
	}

}
