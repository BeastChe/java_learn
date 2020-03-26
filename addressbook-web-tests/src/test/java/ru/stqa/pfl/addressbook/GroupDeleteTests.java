package ru.stqa.pfl.addressbook;


import org.testng.annotations.*;


public class GroupDeleteTests  extends TestBase {

  @Test
  public void testGroupDelete() throws Exception {

    goToGroupPage();
    selectGroup();
    deleteSelectedGroup();
    returnGroupPage();
  }

}



