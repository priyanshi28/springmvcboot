package movieservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import controllermovie.Allmovie;
import moviedaoimplementation.movieDao;

@Service("movieService")
class movieImplementationService implements MovieService {
	@Autowired
	movieDao MovieDao;

	public void create(Allmovie movie) {
		MovieDao.create(movie);
	}

	public void update(Allmovie movie) {
		MovieDao.update(movie);
	}

	public void delete(Allmovie movie) {
		MovieDao.delete(movie);
	}

	@Override
	public Allmovie find(Allmovie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Allmovie> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
