Feature: Filter and Cart Tests on Amazon.com.tr

  Scenario: Adding product to cart on Amazon.com.tr
    Given Go to Amazon
    When Accept cookies
    When Click on the search box
    When Write product name
    When Click on the search button
    When Filter for Shipped by Amazon
    When Filter for Apple
    When Click on the product
    When Add to cart
    When Go to cart
    Then Check the cart