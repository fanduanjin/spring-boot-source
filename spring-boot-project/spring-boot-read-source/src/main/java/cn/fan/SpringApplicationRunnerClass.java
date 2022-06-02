package cn.fan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author fanduanjin
 * @program spring-boot-2.2.2.RELEASE
 * @Classname
 * @Description
 * @Date 2022/6/2
 * @Created by fanduanjin
 */
@SpringBootApplication
public class SpringApplicationRunnerClass {
	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationRunnerClass.class,args);
		try {
			System.out.println("启动成功");
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
