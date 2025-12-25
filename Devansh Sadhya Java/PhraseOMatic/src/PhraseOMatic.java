//phraseomatic
import java.util.*;
public class PhraseOMatic{
    public static void main(String[] args) {
        //make three sets of words to choose from.
        String[] worldListOne={"24/7","multi-tier","30,000 foot","B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
        String[] worldListTwo={"empowered","sticky","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
        String[] worldListThree={"process","tipping-point","solution","architectural","core competency","strategy","mindshare","portal","space","vision","paradigm","mission"};
        //find out how many words are in each list using .length()
        int oneLength=worldListOne.length;
        int twoLength=worldListTwo.length;
        int threeLength=worldListThree.length;
        //generate three random numbers
        int rand1=(int)(Math.random()*oneLength);
        int rand2=(int)(Math.random()*twoLength);
        int rand3=(int)(Math.random()*threeLength);
        //now build a phrase
        String phrase=worldListOne[rand1]+" "+worldListTwo[rand2]+" "+worldListThree[rand3];
        //print out the phrase
        System.out.println(phrase);
    }
}