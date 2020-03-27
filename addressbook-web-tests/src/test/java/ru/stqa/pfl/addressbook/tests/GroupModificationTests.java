package ru.stqa.pfl.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pfl.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification (){
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("testGroupName1", "testLogo1", "testComment1"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnGroupPage();

    };
}
