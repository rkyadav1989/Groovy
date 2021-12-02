//MetaClass

//every single class has associated metaclass and it has information related to class

//to understand groovy meta class, lets try to understand Expando class (predefined by groovy). So expando class is nothing but a bean where we can add property and methods
/*Expando e = new Expando()
e.name = 'Rakesh'
e.writecode = { -> println "$name love to write code"}
e.writecode()
*/

//meta class is actually an expando (i.e. acts like an expando class)
//Same way each class has metaclass and when a method/property calls happens it goes through with it
class Developer {

}

Developer d = new Developer()

//d.name = 'Rakesh'
//d.writecode = { -> println "$name love to write code"}
//d.writecode()

//so here we have tried to access undefined property and methods and program fails with undefined property, because class Developer is not an class like Expando
// but meta class is. So, below should work

d.metaClass.name = 'Rakesh'
d.metaClass.writecode = { -> println "$name love to write code"}
d.writecode()
