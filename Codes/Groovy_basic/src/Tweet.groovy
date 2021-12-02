@groovy.transform.ToString
class Tweet {

    String username
    String text
    Integer retweets
    Integer favorites
    Date createdOn

    public Tweet(String user, String tweet) {
        username = user
        text = tweet
        retweets = 0
        favorites = 0
        createdOn = new Date()
    }

    void addToRetweets(){
        retweets += 1
    }
    void addToFavorites(){
        favorites += 1
    }

}

//def tweet = new Tweet("Rakesh Yadav","Hello,Twitter!")
//println tweet
//Error:(1, 1) Groovyc: Invalid duplicate class definition of class Tweet : The source C:\Users\rkyadav\D\Learning\Groovy\src\Tweet.groovy contains at least two definitions of the class Tweet.
//One of the classes is an explicit generated class using the class statement, the other is a class generated from the script body based on the file name. Solutions are to change the file name or to change the class name.

//Here we have only one class (Tweet) but still we get above duplication error.
/*here we are trying to instantiate Tweet class outside class definition in a groovy class file
    - If we are using class file then we can have same name of class as of file name; but same is not applicable to groovy script.
    So, we cant have groovy class name same as file name in case of groovy script; because groovy will create a containing class as same name of file.
    - Anything outside class definition is known as groovy script; So what happened here -
            - We have created a class same as file name (Tweet)
            - When we tried to instantiate class outside class definition (imp : anything outside class def considered as script); it has tried to create another class with file name (i.e. Tweet) and caused duplication issue.

So, if we try to use it in script and keep class name different than file name; it will work. Please check BonusTweet.groovy
 */
