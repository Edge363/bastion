package claims.bastion.bastion

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BastionApplication

fun main(args: Array<String>) {
    runApplication<BastionApplication>(*args)
}
