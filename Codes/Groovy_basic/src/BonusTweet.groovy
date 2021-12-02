@groovy.transform.ToString
class BTweet {

    String username
    String text
    Integer retweets
    Integer favorites
    Date createdOn

    public BTweet(String user, String tweet) {
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

def btweet = new BTweet("Rakesh Yadav","Hello,Twitter!")
btweet.addToRetweets()
btweet.addToFavorites()
btweet.addToFavorites()
println btweet


//this should be consider as script because it has code outside class definition. So in this case class can not have same name as file name because for scripts groovy by default uses same name at run time for using run method
//This is why here file name is BonusTweet.groovy and class name is Btweet