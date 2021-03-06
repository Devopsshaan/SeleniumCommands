package auto.testcases;

import auto.pages.InfiniteScrollPage;
import auto.pages.WelcomePage;
import auto.utility.Init;
import org.testng.annotations.Test;


public class TestInfiniteScroll extends Init {

    @Test
    public void testFrame() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        InfiniteScrollPage infiniteScrollPage = new InfiniteScrollPage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("Large & Deep DOM");

        //infiniteScrollPage.verifyInfiniteScrollPageHeader();
        infiniteScrollPage.scrollWithinParticularEle();
        Thread.sleep(5000);
        infiniteScrollPage.scrollVerticallyPage();
        infiniteScrollPage.scrollHorizontallyPage();
    }
}
