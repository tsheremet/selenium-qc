package functional;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChildDressPage;
import pages.ChildPage;
import pages.HomePage;

/**
 * Created by c246T on 23.02.2015.
 */
public class FilteringTest extends AbstractTest{

    @Test
    public void visualFilterTest()
    {
        openDetskiyMir();
        openDetskayaOdezhda();
    }

    @Test
    public void priceFilterTest()
    {
        openDetskiyMir();
        openDetskayaOdezhda();
        sortByNew();
    }

    public void stateFilterTest ()
    {

    }

    public void sortByNew()
    {
        ChildDressPage childDressPage = new ChildDressPage(browser);
        Assert.assertTrue(childDressPage.sortByNew(), "Sorted by new ");
    }

    public void openDetskiyMir()
    {
        HomePage homePage = new HomePage(browser);
        homePage.open();
        homePage.openDetskiyMir();
        ChildPage childPage = new ChildPage(browser);
        Assert.assertTrue(childPage.isOpened());
    }

    public void openDetskayaOdezhda()
    {
        ChildPage childPage = new ChildPage(browser);
        childPage.openOdezhda();
        ChildDressPage childDressPage = new ChildDressPage(browser);
        Assert.assertTrue(childDressPage.isOpened());
    }



}
