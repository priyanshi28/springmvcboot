package moviepack;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import  configuration.applicationconfig;
import controllermovie.Allmovie;
import moviedaoimplementation.movieDImplement;
@SpringBootApplication
@ComponentScan 

class CourseApiApp {
	

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(applicationconfig.class);
		//MovieService movieService = (MovieService) context.getBean("movieService");
		movieDImplement movieDao = (movieDImplement) context.getBean("movieDao");
		Allmovie movie1= new Allmovie("avenger " ,"thriller", null);
	//	movieService.create(movie1);
		movieDao.create(movie1);
		
		context.close();

	}


}
