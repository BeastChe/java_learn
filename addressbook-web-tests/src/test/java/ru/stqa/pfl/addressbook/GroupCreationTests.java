package ru.stqa.pfl.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupPage();
    initGroupCreations();
    fillGroupForm(new GroupData("testGroupName", "testLogo", "testComment"));
    submitGroupCreation();
    returnGroupPage();
  }


}
