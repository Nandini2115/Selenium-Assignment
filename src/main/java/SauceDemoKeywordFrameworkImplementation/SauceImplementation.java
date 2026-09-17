package SauceDemoKeywordFrameworkImplementation;

import SauceDemoKeyword.keywordSauceExecutor;

public class SauceImplementation {

    public static void main(String[] args) throws InterruptedException {

        keywordSauceExecutor e = new keywordSauceExecutor();

        e.executors("LAUNCH_BROWSER");
        Thread.sleep(1000);

        e.executors("OPEN_URL");
        Thread.sleep(1000);

        e.executors("USERNAME");
        Thread.sleep(1000);

        e.executors("PASSWORD");
        Thread.sleep(1000);

        e.executors("LOGIN");
        Thread.sleep(1000);

        e.executors("CLOSE_BROWSER");
    }
}