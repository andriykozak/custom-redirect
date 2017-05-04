package utility.env;

/**
 * Created by Andriy on 4/20/2017.
 */

// TODO: 4/20/2017 Create ENUM for URLs
public enum Environment {

    QA("http://www.andriy.motorboxx.goxloo.com/"), STAGE("http://www.stage123.dxloo.com/"), PROD("http://www.andrijk.ixloo.com/"), DEV("http://www.julia2.dxloo.com/");

    private final String url;

    //String type for url
    Environment(String url) {
        this.url = url;
    }

    //url to String
    public String toString(){
        return url;
    }

    public String getEnvironment() {
        return url;
    }
}
