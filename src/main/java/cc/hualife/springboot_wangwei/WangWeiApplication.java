package cc.hualife.springboot_wangwei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "cc.hualife.springboot_wangwei" })
@MapperScan("cc.hualife.springboot_wangwei.dao.*.mapper")
public class WangWeiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WangWeiApplication.class, args);
	}
}
