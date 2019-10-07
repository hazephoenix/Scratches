package tests.uiTests;

import BaseClasses.uii.pageModel.*;
import BaseClasses.uii.uiTestBase.UiTestBase;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class PotolkoffEnd2EndTest extends UiTestBase {

    @Test
    public void fullTest() {
        open("/");
        MainPage.checkAllMenus();
        MainPage.openGalleryPage();
        GalleryPage.checkHeaderAndItems();
        GalleryPage.openRoomsTypeList();
        GalleryPage.checkRoomTypes();
        GalleryPage.openChandelierPicturesList();
        GalleryPage.checkAndGetPictures();
        GalleryPage.openColorCataloguePicturesList();
        GalleryPage.checkAndGetColorsPictures();
        MainPage.openPriceListPage();
        PriceListPage.checkHeader();
        PriceListPage.checkTableValues();
        PriceListPage.openCalcForm();
        CalcForm.calculateAndCheck();
        MainPage.openContactsPage();
        ContactsPage.checkHeader();
        ContactsPage.proceedContactUsForm();
    }
}
