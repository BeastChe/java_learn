package ru.stqa.pfl.addressbook.tests;


import org.testng.annotations.*;


public class GroupDeleteTests  extends TestBase {

  @Test
  public void testGroupDelete() throws Exception {

    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnGroupPage();
  }

}



