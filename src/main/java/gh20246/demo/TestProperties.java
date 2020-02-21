package gh20246.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author Stephane Nicoll
 */
@ConfigurationProperties("test")
public class TestProperties {

	private Map<String, String> map = new HashMap<>();

	public Map<String, String> getMap() {
		return this.map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

}
