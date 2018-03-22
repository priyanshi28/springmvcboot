package controllermovie;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "movie")
public class Allmovie {
	@Id
	/*@Autowired
	MovieService movieService ;*/
	private String id;
	private String name;
	private String description;
	public Allmovie(){
		
	}
	public Allmovie(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id:- " + getId() + ", Name:- " + getName() + ", Description:- " + getDescription());
        return str.toString();
    }
}
