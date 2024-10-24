import static ratpack.groovy.Groovy.ratpack
import io.swagger.v3.oas.models.*
import io.swagger.v3.oas.models.info.Info

ratpack {
  handlers {
//    def myService = new MyService()

    // OpenAPI Specification
    get("openapi") {
      def openAPI = new io.swagger.v3.oas.models.OpenAPI()
              .info(new io.swagger.v3.oas.models.info.Info()
                      .title("Groovy Script API")
                      .version("1.0")
                      .description("An API to expose Groovy script services"))

      render openAPI.toString()
    }

    // Service execution endpoint
    get("execute") {
//      def result = myService.executeService()
      render "result"
    }
  }
}