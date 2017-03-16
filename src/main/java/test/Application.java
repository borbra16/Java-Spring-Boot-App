package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class Application{



	static int counter = 0;

	public static void main(String[] args)
	{

		SpringApplication.run(Application.class, args);
	}



	@RequestMapping("/incrCounter")
	public String incrCount()
	{

		int i=0;
		while(i < 10)
		{

			counter++;
			i++;
		}

		return "Counter: " + counter;
	}



	@RequestMapping("/resetCounter")
	public String resetCount()
	{
		counter = 0;
		return "Counter set to " + counter;

	}



	@RequestMapping("/decrCounter")
	public String decrCount()
	{

		int i = 0;

		while(i<10)
		{
			counter--;
			i++;
		}

		return "Counter: " + counter;

	}

}
