package SauceDemoKeyword;

public class keywordSauceExecutor {

    keyword_saucedemo k = new keyword_saucedemo();

    public void executors(String keyword) {

        if (keyword.equals("LAUNCH_BROWSER")) {

            k.launchBrowser();

        } else if (keyword.equals("OPEN_URL")) {

            k.openurl();

        } else if (keyword.equals("USERNAME")) {

            k.username();

        } else if (keyword.equals("PASSWORD")) {

            k.password();

        } else if (keyword.equals("LOGIN")) {

            k.login();

        } else if (keyword.equals("CLOSE_BROWSER")) {

            k.closeBrowser();

        } else {

            System.out.println("Invalid keyword: " + keyword);
        }
    }
}