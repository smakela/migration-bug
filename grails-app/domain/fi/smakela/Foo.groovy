package fi.smakela

class Foo {

    static hasMany   = [subFoos: Foo]
    static mappedBy  = [subFoos: 'subFoos']

    Foo anotherFoo

    String code

    static constraints = {
        anotherFoo(nullable:true)
        code(nullable: false)
    }
}
