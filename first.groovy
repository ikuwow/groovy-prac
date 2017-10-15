println "Hello world"

def num = 2 * 3 // Object
println "result is ${2 * 3} (${num})"

class Foo {
    static main(args) {
        println "Hogehoge"
    }

    static echo(message) {
        println message // Object
    }
}

def foo = new Foo()
foo.echo("hogehoge")
