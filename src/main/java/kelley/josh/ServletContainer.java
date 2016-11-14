package kelley.josh;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * Created by joshuakelley on 11/14/16.
 */
    @Configuration
public class ServletContainer {
	@Bean
	public EmbeddedServletContainerCustomizer customizer() {
        return container -> {
            container.addErrorPages(
                    new ErrorPage(HttpStatus.UNAUTHORIZED, "/unauthenticated"));
        };
    }
}
