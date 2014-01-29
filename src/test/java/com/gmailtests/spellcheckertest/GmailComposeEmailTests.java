package com.gmailtests.spellcheckertest;

import com.gmailtests.pageobjects.ComposeEmailPage;
import com.gmailtests.pageobjects.InboxPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GmailComposeEmailTests extends GmailLoggedInTests {
    @Test(description = "Compose basic email")
    public void ComposeBasicEmail()
    {
        InboxPage inboxPage = PageFactory.initElements(_webDriver,InboxPage.class);
        ComposeEmailPage composeEmailPage = inboxPage.ComposeNewEmail();
        composeEmailPage.To("jhinojosa@nearsoft.com").WithSubject("Testing").WithBody("This is a testss");
    }
}
