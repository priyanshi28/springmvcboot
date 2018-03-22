package moviedaoimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import controllermovie.Allmovie;

@Repository
@Qualifier("movieDao")

public class movieDImplement implements movieDao {
	@Autowired
	MongoTemplate mongoTemplate;
	final String COLLECTION = "movie";

	public void create(Allmovie movie) {
		mongoTemplate.insert(movie);
	}

	public void update(Allmovie movie) {
		mongoTemplate.save(movie);
	}

	public void delete(Allmovie movie) {
		mongoTemplate.remove(movie);
	}

	@Override
	public Allmovie find(Allmovie movie) {
		Query query = new Query(Criteria.where("_id").is(movie.getId()));
		return mongoTemplate.findOne(query, Allmovie.class, COLLECTION);

	}

	@Override
	public List<Allmovie> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
