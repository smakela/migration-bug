package migration.bug

import fi.smakela.Foo

class BootStrap {

    def init = { servletContext ->
        new Foo(
            code: "foo",
            subFoos: [new Foo(code: "sub1"), new Foo(code: "sub2")]
        ).save(flush:true, failOnError:true)
    }
    def destroy = {
    }
}
