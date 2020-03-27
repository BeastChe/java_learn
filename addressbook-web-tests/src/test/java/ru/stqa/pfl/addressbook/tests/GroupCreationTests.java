package ru.stqa.pfl.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pfl.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreations();
    app.getGroupHelper().fillGroupForm(new GroupData("testGroupName", "testLogo", "testComment"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnGroupPage();
  }


}
