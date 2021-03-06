package wildflyswarm.jpa_cdi_arq;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/")
public class DBConnectionController {

  @Resource
  private DataSource ds;

  @GET
  public String get() throws NamingException {
    return ds.toString();
  }

}
