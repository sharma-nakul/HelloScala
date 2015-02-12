package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation._

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author Nakul Sharma
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class HelloConfig {
@RequestMapping (value = Array("/"), method = Array (RequestMethod.GET))
@ResponseBody
    def home(): String = "Hello World"
  }
