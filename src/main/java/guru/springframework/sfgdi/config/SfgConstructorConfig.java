package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * @author Yuriy Tsarkov (yurait6@gmail.com) on 31.10.2022
 */
@ConstructorBinding
@ConfigurationProperties("guru")
public class SfgConstructorConfig {

  private final String username;
  private final String password;
  private final String jdbcUrl;

  public SfgConstructorConfig(String username, String password, String jdbcUrl) {
    this.username = username;
    this.password = password;
    this.jdbcUrl = jdbcUrl;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getJdbcUrl() {
    return jdbcUrl;
  }
}
