package org.example;

import org.openqa.selenium.By;

public class Comments extends Utils{
    By newslink = By.cssSelector("a.news-title");
    By titleText = By.id("AddNewComment_CommentTitle");
    By commentBox = By.id("AddNewComment_CommentText");
    By commentButton = By.xpath("//button[@name='add-comment']");
    By resultSuccess = By.xpath("//div[@class='result']");
    public void addCommentsToPage(){
      clickOnElement(newslink);
      waitFor(commentButton);
      waitFor(titleText);
      enterText(titleText,"Mr Sam");

      enterText(commentBox,"Its good.");
      clickOnElement(commentButton);
    }


    public String getResultText() {
     return getTextFromElement(resultSuccess);
    }
}
