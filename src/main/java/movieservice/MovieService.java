package movieservice;

import controllermovie.Allmovie;

import java.util.List;

public interface MovieService {
	public void create(Allmovie movie);

	public void update(Allmovie movie);

	public void delete(Allmovie movie);

	public void deleteAll();

	public List<Allmovie> findAll();

	public Allmovie find(Allmovie movie);
}
