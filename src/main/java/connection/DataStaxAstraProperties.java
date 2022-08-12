package connection;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author nanobyter
 */

@ConfigurationProperties(prefix = "datastax.astra")
public class DataStaxAstraProperties {

	private File secureConnectBundle;

}
