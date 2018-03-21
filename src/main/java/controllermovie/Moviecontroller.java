package controllermovie;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Moviecontroller {
	@RequestMapping("/movie")
	public List<Allmovie> getallmovie()
	{
		return Arrays.asList(new Allmovie(1,"gandhi","my fav movie"),
				new Allmovie(2,"avenger","my fav movie"));
	}
}