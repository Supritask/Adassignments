import org.apache.log4j.Logger;

public class Example
{
	static Logger log=Logger.getLogger(Example.class.getName());
	public static void main(String[] args) throws IOException, SQLException
	{
		log.debug("Debug Message");
		log.info("This is Info);
	}
}