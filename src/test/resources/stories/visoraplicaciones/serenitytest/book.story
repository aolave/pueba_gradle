Meta:
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: add book in my cart to shi training Site
GivenStories: stories\visoraplicaciones\serenitytest\login.story
When enter the amount:
|bookOne|bookTwo|bookThree|
|2|5|8|
Then add book in my cart