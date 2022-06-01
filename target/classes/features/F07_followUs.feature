@smoke
  Feature:users could open followUs links

    Scenario:user opens facebook link
    When user open facebook link
    Then "https://www.facebook.com/nopCommerce" is opened in new tab



    Scenario:user opens twitter link
      When user open twitter link
      Then "https://www.twitter.com/nopCommerce" is open in new tab



     Scenario:user opens rss link
     When user open rss link
     Then "https://demo.nopcommerce.com/new-online-store-is-open" are open in new tab


    Scenario:user open youtube link
      When user opens youtube link
     Then "https://www.youtube.com/user/nopCommerce" is opened in new Tab













