package grails4saml

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import groovy.transform.CompileStatic


import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration


@EnableAutoConfiguration(exclude = [SecurityFilterAutoConfiguration])
@CompileStatic
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}