package com.capgemini.lionsii.general.common.base;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import com.capgemini.lionsii.general.common.DbTestHelper;
import com.capgemini.lionsii.general.common.RestTestClientBuilder;
import com.capgemini.lionsii.general.common.SecurityTestHelper;
import com.capgemini.lionsii.general.service.impl.config.RestaurantTestConfig;
import io.oasp.module.basic.common.api.config.SpringProfileConstants;
import io.oasp.module.test.common.base.SubsystemTest;

/**
 * Abstract base class for {@link SubsystemTest}s which runs the tests within a local server. <br/>
 * <br/>
 * The local server's port is randomly assigned.
 *
 */
@SpringApplicationConfiguration(classes = RestaurantTestConfig.class)
@WebIntegrationTest
@ActiveProfiles(profiles = { SpringProfileConstants.JUNIT })
public abstract class AbstractRestServiceTest extends SubsystemTest {

  /**
   * The port of the web server during the test.
   */
  @Value("${local.server.port}")
  protected int port;

  /**
   * The {@code RestaurantTestHelper}.
   */
  @Inject
  private SecurityTestHelper securityTestHelper;

  @Inject
  private DbTestHelper dbTestHelper;

  /**
   * The {@code RestTestClientBuilder}.
   */
  @Inject
  private RestTestClientBuilder restTestClientBuilder;

  /**
   * The {@code JacksonJsonProvider}
   */
  @Inject
  private JacksonJsonProvider jacksonJsonProvider;

  /**
   * Sets up the test.
   */
  @Override
  protected void doSetUp() {

    super.doSetUp();
    this.restTestClientBuilder.setLocalServerPort(this.port);
    this.restTestClientBuilder.setJacksonJsonProvider(this.jacksonJsonProvider);

  }

  /**
   * Cleans up the test.
   */
  @Override
  protected void doTearDown() {

    super.doTearDown();
  }

  /**
   * @return the {@link SecurityTestHelper}
   */
  public SecurityTestHelper getSecurityTestHelper() {

    return this.securityTestHelper;
  }

  /**
   * @return the {@link DbTestHelper}
   */
  public DbTestHelper getDbTestHelper() {

    return this.dbTestHelper;
  }

  /**
   * @return the {@link RestTestClientBuilder}
   */
  public RestTestClientBuilder getRestTestClientBuilder() {

    return this.restTestClientBuilder;
  }

}
