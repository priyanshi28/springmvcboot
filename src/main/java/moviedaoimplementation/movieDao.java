package moviedaoimplementation;
import controllermovie.Allmovie;
import java.util.List;
public interface movieDao {
	public void create (Allmovie movie);
	public void update(Allmovie movie);
	public void delete (Allmovie movie);
	 public Allmovie find( Allmovie movie);
    public List <Allmovie  > findAll();



}
