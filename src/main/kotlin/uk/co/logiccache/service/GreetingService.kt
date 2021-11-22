package uk.co.logiccache.service

import org.slf4j.LoggerFactory
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    fun greeting(name: String): String {
        LOG.info("Generating greeting especially for {}", name)
        return "hello $name"
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(GreetingService::class.java)
    }
}
