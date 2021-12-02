/*http://groovy-lang.org/closures.html#closure-owner
3. Delegation strategy
3.1. Groovy closures vs lambda expressions
Groovy defines closures as instances of the Closure class. It makes it very different from lambda expressions in Java 8. Delegation is a key concept in Groovy closures which has no equivalent in lambdas. The ability to change the delegate or change the delegation strategy of closures make it possible to design beautiful domain specific languages (DSLs) in Groovy.

3.2. Owner, delegate and this
To understand the concept of delegate, we must first explain the meaning of this inside a closure. A closure actually defines 3 distinct things:

this corresponds to the enclosing class where the closure is defined

owner corresponds to the enclosing object where the closure is defined, which may be either a class or a closure

delegate corresponds to a third party object where methods calls or properties are resolved whenever the receiver of the message is not defined
*/

/*
to understand the concept of delegate, we must first understand the scopes that are available to us inside the closure. Below are those three scopes:
1) this : corresponds to enclosing class where the closure is defined. If we have class myclass and inside of myclass we had a closure then this would corresponds to myclass
2) owner : corresponds to enclosing object where the closure is defined, which may be either a class or a closure
3) delegate : corresponds to a third party object where merthods calls or properties are resolved whenever the received of the message is not defined
*/

/*
  this corresponds to the enclosing class where the closure is defined
  owner corresponds to the enclosing object where the closure is defined, which may be either a class or a closure
  delegate corresponds to a third party object where methods calls or properties are resolved whenever the receiver of the message is not defined
*/

class ScopeDemo {

    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }

}

def demo = new ScopeDemo()
demo.outerClosure()